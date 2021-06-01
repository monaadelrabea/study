package lettuce.examples;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisFuture;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.async.RedisAsyncCommands;
import io.lettuce.core.api.sync.RedisCommands;
import io.lettuce.core.pubsub.api.sync.RedisPubSubCommands;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/**
 * Name : LettuceExamples
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class LettuceExamples {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        //Connect to redis server
        RedisClient redisClient = RedisClient.create("redis://localhost:6379");
        StatefulRedisConnection<String, String> connection = redisClient.connect();

        // Synchronous Commands
        RedisCommands<String, String> syncCommands = connection.sync();
        syncCommands.set("key", "Hello Redis with sync command");
        String value = syncCommands.get("key");
        System.out.println("Value with sync command " + value);

        syncCommands.hset("hashKey", "field1", "John");
        syncCommands.hset("hashKey", "field2", "Smith");

        Map<String, String> record = syncCommands.hgetall("hashKey");
        System.out.println("hash with sync command " + record);

        //Asynchronous Commands
        RedisAsyncCommands<String, String> asyncCommands = connection.async();

        RedisFuture<String> result = asyncCommands.get("key");
        System.out.println("Value with async command " + result.get());

        RedisFuture<Map<String, String>> hResult = asyncCommands.hgetall("hashKey");
        System.out.println("hash with async command " + hResult.get());

        //List
        asyncCommands.lpush("listKey", "first");
        asyncCommands.lpush("listKey", "second");
        RedisFuture<String> lResult = asyncCommands.rpop("listKey");

        System.out.println("list with rpop command " + lResult.get());

        asyncCommands.del("tasks");
        asyncCommands.lpush("tasks", "first");
        asyncCommands.lpush("tasks", "second");
        lResult = asyncCommands.lpop("tasks");
        System.out.println("list with lpop command " + lResult.get());

        // Sets
        asyncCommands.sadd("setKey", "first");
        asyncCommands.sadd("setKey", "second");
        // not accept duplicate key
        asyncCommands.sadd("setKey", "second");

        RedisFuture<Set<String>> pets = asyncCommands.smembers("setKey");
        System.out.println("set with smembers command " + pets.get());

        RedisFuture<Boolean> exists = asyncCommands.sismember("setKey", "first");
        System.out.println("set with sismember command " + exists.get());

        //Hashes
        asyncCommands.hset("Name", "First", "Mona");
        asyncCommands.hset("Name", "Last", "Adel");

        RedisFuture<String> lastName = asyncCommands.hget("Name", "Last");
        System.out.println("hash with hget command " + lastName.get());

        RedisFuture<Map<String, String>> hRecord = asyncCommands.hgetall("Name");
        System.out.println("hash with hgetall command " + hRecord.get());

        //Sorted Sets
        asyncCommands.zadd("sortedset", 1, "one");
        asyncCommands.zadd("sortedset", 4, "zero");
        asyncCommands.zadd("sortedset", 2, "two");

        RedisFuture<List<String>> sSet = asyncCommands.zrange("sortedset", 0, 3);
        System.out.println("sorted set  with zrange command " + sSet.get());

        RedisFuture<List<String>> sSetReverse = asyncCommands.zrevrange("sortedset", 0, 3);
        System.out.println("sorted set  with zrevrange command " + sSetReverse.get());

        // sub
        RedisPubSubCommands<String, String> connectionSub = redisClient.connectPubSub().sync();
        connectionSub.getStatefulConnection().addListener(new Subscriber());
        connectionSub.subscribe("channel");

        RedisClient redisClientPub = RedisClient.create("redis://localhost:6379");
        // pub
        RedisPubSubCommands<String, String> connectionPub = redisClientPub.connectPubSub().sync();
        connectionPub.publish("channel", "Hello, Redis!");
    }

}

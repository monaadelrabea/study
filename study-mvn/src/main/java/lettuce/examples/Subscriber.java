package lettuce.examples;

import io.lettuce.core.pubsub.RedisPubSubAdapter;

/**
 * Name : Subscriber
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class Subscriber extends RedisPubSubAdapter<String, String> {

    @Override
    public void message(String channel, String message) {
        System.out.println("hello from Subscriber I get message : " + message);
    }

}

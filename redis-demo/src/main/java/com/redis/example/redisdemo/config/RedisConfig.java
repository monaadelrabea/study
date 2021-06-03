package com.redis.example.redisdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Name : RedisConfig
 * <br>
 * Description :
 * <br>
 * Date : 01/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
@Configuration
@EnableRedisRepositories(basePackages = {"com.redis.example.redisdemo.repository"})
public class RedisConfig {

}

package com.ryo.service.cache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author houbinbin
 * @since 16/10/23
 */
@Configuration
@EnableCaching
public class RedisCacheConfig {

  private JedisConnectionFactory jedisConnectionFactory;

  private RedisTemplate redisTemplate;

  private RedisCacheManager redisCacheManager;

  public RedisCacheConfig(JedisConnectionFactory jedisConnectionFactory, RedisTemplate redisTemplate, RedisCacheManager redisCacheManager) {
    this.jedisConnectionFactory = jedisConnectionFactory;
    this.redisTemplate = redisTemplate;
    this.redisCacheManager = redisCacheManager;
  }

}

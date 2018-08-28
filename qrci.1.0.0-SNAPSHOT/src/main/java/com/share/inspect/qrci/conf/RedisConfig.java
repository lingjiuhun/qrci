package com.share.inspect.qrci.conf;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * Redis 配置
 *
 * @author
 * @since 2017/11/7
 */
@Configuration
@EnableCaching
public class RedisConfig {

//    @Bean
//    public KeyGenerator keyGenerator() {
//        return (target, method, params) -> new StringJoiner(target.getClass().getName())
//            .add(method.getName())
//            .add(Stream.of(params)
//                    .map(String::valueOf)
//                    .collect(Collectors.joining(EMPTY))
//            )
//            .toString();
//    }
//
//    @SuppressWarnings("rawtypes")
//    @Bean
//    public CacheManager cacheManager(RedisTemplate redisTemplate) {
//        RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
//        // 设置缓存过期时间(秒)
//        //rcm.setDefaultExpiration(60);
//        return rcm;
//    }
//
//    @Bean("redisTemplate")
//    public RedisTemplate<String, ?> redisTemplate(RedisConnectionFactory factory) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//
//        Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<>(Object.class);
//        serializer.setObjectMapper(objectMapper);
//
//        RedisTemplate<String, ?> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(factory);
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(serializer);
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(serializer);
//        redisTemplate.afterPropertiesSet();
//
//        return redisTemplate;
//    }
//
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//
//        Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<>(Object.class);
//        serializer.setObjectMapper(objectMapper);
//
//        StringRedisTemplate template = new StringRedisTemplate(factory);
//        template.setValueSerializer(serializer);
//        template.afterPropertiesSet();
//
//        return template;
//    }
}

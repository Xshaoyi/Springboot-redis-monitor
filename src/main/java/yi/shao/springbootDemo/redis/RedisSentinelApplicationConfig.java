package yi.shao.springbootDemo.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

//@Configuration
public class RedisSentinelApplicationConfig {
	static final RedisSentinelConfiguration SENTINEL_CONFIG = new RedisSentinelConfiguration().master("mymaster") //
            .sentinel("localhost", 26379) //
            .sentinel("localhost", 26380);

    @Bean
    public RedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory(sentinelConfig());
    }

    @Bean
    public RedisSentinelConfiguration sentinelConfig() {
        return SENTINEL_CONFIG;
    }
    public @Bean StringRedisTemplate redisTemplate() {
		return new StringRedisTemplate(connectionFactory());
	}
}

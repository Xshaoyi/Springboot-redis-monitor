package yi.shao.springbootDemo.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisServer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Component;

import yi.shao.springbootDemo.modal.RedisSentinelClient;

//@Component
public class MyBean {

    private StringRedisTemplate template;

    @Autowired
    public MyBean(StringRedisTemplate template) {
        this.template = template;
    }
    public void save(){
    	ValueOperations<String, String> s = template.opsForValue();
    	template.randomKey();
    	s.set("test", "value");
    }
    public String get(){
    	ValueOperations<String, String> s = template.opsForValue();
    	return s.get("test");
    }
    public List<RedisSentinelClient> getInfo(){
    	List<RedisClientInfo> infoList = template.getClientList();
    	Collection<RedisServer> rs = template.getConnectionFactory().getSentinelConnection().masters();
    	List<RedisSentinelClient> ls = rs.stream().map(r->{
    		RedisSentinelClient t =new RedisSentinelClient(r);
    		return t;
    	}).collect(Collectors.toList());
    	return ls;
    }
    // ...

}

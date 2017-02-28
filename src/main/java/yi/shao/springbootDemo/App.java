package yi.shao.springbootDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yi.shao.springbootDemo.modal.RedisSentinelClient;
import yi.shao.springbootDemo.service.MyBean;
import yi.shao.springbootDemo.service.TestService;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class App 
{
	@RequestMapping("/")
    String home() {
		ts.info();
		//mb.save();
        return "Hello World!";
    }
	@RequestMapping("/get")
    String get() {
		//ts.info();
       // return mb.get();
		return "working";
    }
	@RequestMapping("/getInfo")
	List<RedisSentinelClient> getInfo() {
		//ts.info();
        //return mb.getInfo();
		return null;
    }
	@Autowired
	private TestService ts;
//	@Autowired
//	private MyBean mb;
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
    @Bean
    TestService run(){
    	return new TestService();
    }
	public TestService getTs() {
		return ts;
	}
	public void setTs(TestService ts) {
		this.ts = ts;
	}
//	public MyBean getMb() {
//		return mb;
//	}
//	public void setMb(MyBean mb) {
//		this.mb = mb;
//	}
}

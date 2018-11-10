package ribbonDemoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 这里需要添加@EnableConfigServer  去启动Spring cloud config server
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {

	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/home")
    public String home() {
        return "welcome to home! am server 02";
    }
	
	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/hello")
    public String hello() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return "Hello World! am server 02";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

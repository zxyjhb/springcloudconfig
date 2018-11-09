package ribbonDemoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * 这里需要添加@EnableDiscoveryClient  去注册中心发现服务
 * 配置LoadBalanced注解，支持负载调用
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
	
	@Bean
    @LoadBalanced
    public RestTemplate initBean() {
        return new RestTemplate();
    }
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package ribbonServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 这里需要添加@EnableConfigServer  去启动Spring cloud config server
 * @author jihaibo
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

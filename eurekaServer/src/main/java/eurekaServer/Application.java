package eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 这里需要添加@EnableEurekaServer  将项目作为注册中心去去启动
 * @author jihaibo
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

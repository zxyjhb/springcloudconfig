package feignDemoClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="ribbon-demo-server", fallback = FeignDemoServiceFailback.class)
public interface FeignDemoService {
	
	@RequestMapping("/home")
	public String home();
	
	
	@RequestMapping("/hello")
	public String hello();

}

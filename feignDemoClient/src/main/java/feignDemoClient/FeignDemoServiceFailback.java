package feignDemoClient;

import org.springframework.stereotype.Component;

@Component
public class FeignDemoServiceFailback implements FeignDemoService{
	
	public String home() {
		return "home failback return default";
	}
	
	public String hello() {
		return "hello failback return default";
	}
	

}

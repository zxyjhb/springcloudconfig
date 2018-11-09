package ribbonDemoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	/**
	 * 这里是接口的调用，通过restTemplate进行接口调用
	 * 
	 * url呢http://ribbon-demo-server使用的是注册中心的服务名称，加上接口的资源路径
	 * @return
	 */
	public String home() {
		return restTemplate.getForObject("http://ribbon-demo-server/home", String.class);
	 } 
	
	public String hello() {
		return restTemplate.getForObject("http://ribbon-demo-server/hello", String.class);
	}


}

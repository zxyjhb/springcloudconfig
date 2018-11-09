package ribbonDemoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public String home() {
		return restTemplate.getForObject("http://ribbon-demo-server/home", String.class);
	 } 
	
	public String hello() {
		return restTemplate.getForObject("http://ribbon-demo-server/hello", String.class);
	}


}

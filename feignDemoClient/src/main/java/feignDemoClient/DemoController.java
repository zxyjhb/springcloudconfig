package feignDemoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@Autowired
	FeignDemoService feignDemoService;
	
	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/home")
    public String home() {
        return feignDemoService.home();
    }

	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/hello")
    public String hello() {
        return feignDemoService.hello();
    }

}

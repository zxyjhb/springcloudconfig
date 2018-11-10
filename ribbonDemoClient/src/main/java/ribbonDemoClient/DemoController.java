package ribbonDemoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@Autowired
	DemoService demoService;
	
	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/home")
    public String home() {
        return demoService.home();
    }

	/**
	 * 礼貌性的给一个主页吧
	 * @return
	 */
	@RequestMapping("/hello")
    public String hello() {
        return demoService.hello();
    }

}

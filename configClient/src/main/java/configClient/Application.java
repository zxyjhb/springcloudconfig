package configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	
	@Value("${version}")
	private String version;
	
	@Value("${group}")
	private String group;
	
	@Value("${tag}")
	private String tag;
	
	
	
    @RequestMapping("/version")
    public String getVersion() {
        return version;
    }
    
    @RequestMapping("/tag")
    public String getTag() {
        return tag;
    }
    
    @RequestMapping("/group")
    public String getGroup() {
        return group;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

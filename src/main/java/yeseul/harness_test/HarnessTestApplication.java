package yeseul.harness_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HarnessTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarnessTestApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
}

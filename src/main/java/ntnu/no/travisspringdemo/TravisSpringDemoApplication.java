package ntnu.no.travisspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravisSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravisSpringDemoApplication.class, args);
	}


	public int f1() {
		return 3;
	}

	public int f2() {
		return 4;
	}

	public int f3() {
		return 5;
	}
}

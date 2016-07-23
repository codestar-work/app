package web;
import org.springframework.boot.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.context.web.*;
import org.springframework.boot
		.autoconfigure.*;

@SpringBootApplication
public class App extends 
	SpringBootServletInitializer {

	public static void main(String[] s) {
		SpringApplication.run(App.class, s);
	}

	@Override
	protected SpringApplicationBuilder 
	configure(SpringApplicationBuilder a) {
		return a.sources(App.class);
	}
}

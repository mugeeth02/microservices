package springboot_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  //http://localhost:8888/<properties filename>/<profile name>>
public class ConfigserverApplication { //http://localhost:8888/application/default

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}

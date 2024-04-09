package pl.edu.pbs.profile_lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileLab6Application
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(ProfileLab6Application.class, args);
		MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
	}
}


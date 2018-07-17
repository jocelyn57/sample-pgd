package lu.cgi.pgd.sample.samplepgd;

import org.hibernate.validator.HibernateValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PreDestroy;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.security.PublicKey;

import static org.reflections.util.ConfigurationBuilder.build;

@SpringBootApplication
@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class SamplePgdApplication {

	private final static Logger LOG = LoggerFactory.getLogger(SamplePgdApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SamplePgdApplication.class, args);
	}



	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				//.tags(new Tag("Employee", "Repository for Employee"))
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}


	public ExitCodeGenerator exitCodeGenerator(){
		LOG.info("------------> SIGTERM Exit");
		return ()->42;

	}

	@Bean
	public SigTermListener SigTermListener() {
		return new SigTermListener();
	}

	private class SigTermListener {



		@PreDestroy
		public void init() {
			LOG.info("------------> SIGTERM");
		}

	}
}

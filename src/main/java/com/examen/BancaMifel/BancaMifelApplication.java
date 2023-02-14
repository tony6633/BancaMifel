package com.examen.BancaMifel;

import com.examen.BancaMifel.security.JWTAuthorizationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@SpringBootApplication
public class BancaMifelApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancaMifelApplication.class, args);
	}


	@Configuration
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable();
			http.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
			http.authorizeRequests()
					.antMatchers(HttpMethod.POST, "/oauth/user").permitAll()
					.anyRequest().authenticated();
		}
	}

}

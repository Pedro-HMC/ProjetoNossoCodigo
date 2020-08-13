package com.undefined.projetoNossoCodigo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ImplementsUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/").permitAll()
        .antMatchers(HttpMethod.GET, "/inicial").permitAll()
        .antMatchers(HttpMethod.GET, "/nossoCodigo/codigos5").permitAll()
        .antMatchers(HttpMethod.GET, "/nossoCodigo/codigos1").permitAll()
        .antMatchers(HttpMethod.GET, "/nossoCodigo/codigos2").permitAll()
        .antMatchers(HttpMethod.GET, "/nossoCodigo/codigos3").permitAll()
        .antMatchers(HttpMethod.GET, "/nossoCodigo/codigos4").permitAll()
        .antMatchers(HttpMethod.GET, "/guia").permitAll()
        .antMatchers(HttpMethod.GET, "/feedback/").permitAll()
        .antMatchers(HttpMethod.POST, "/feedback/insere").permitAll()
        .anyRequest().authenticated()
        .and().formLogin().loginPage("/paginalogin").permitAll().usernameParameter("username").passwordParameter("password")
        .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/img/**","/css/**");
    }

        
   
}
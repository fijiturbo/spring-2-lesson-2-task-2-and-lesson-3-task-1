package uz.pdp.spring2lesson2task2andlesson3task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.pdp.spring2lesson2task2andlesson3task1.constants.Privilege;
import uz.pdp.spring2lesson2task2andlesson3task1.constants.Role;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .inMemoryAuthentication()

                .withUser("super_admin").password(passwordEncoder().encode("super_admin"))
                .roles(Role.SUPER_ADMIN)
                .authorities(Privilege.ADD_PRODUCT, Privilege.READ_ALL_PRODUCTS, Privilege.READ_ONE_PRODUCT,
                        Privilege.EDIT_PRODUCT, Privilege.DELETE_PRODUCT, Privilege.ORDER_OPERATIONS)

                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator"))
                .roles(Role.MODERATOR).authorities(Privilege.ADD_PRODUCT, Privilege.READ_ALL_PRODUCTS,
                Privilege.READ_ONE_PRODUCT, Privilege.EDIT_PRODUCT)

                .and()
                .withUser("operator").password(passwordEncoder().encode("operator"))
                .roles(Role.OPERATOR).authorities(Privilege.READ_ALL_PRODUCTS, Privilege.READ_ONE_PRODUCT,
                Privilege.ORDER_OPERATIONS);

    }
    //Privilege.ADD_PRODUCT, operatordan olib tashlandi

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/product").hasAuthority(Privilege.ADD_PRODUCT)
                .antMatchers(HttpMethod.GET, "/api/product").hasAuthority(Privilege.READ_ALL_PRODUCTS)
                .antMatchers(HttpMethod.GET, "/api/product/*").hasAuthority(Privilege.READ_ONE_PRODUCT)
                .antMatchers(HttpMethod.PUT, "/api/product/*").hasAuthority(Privilege.EDIT_PRODUCT)
                .antMatchers(HttpMethod.DELETE, "/api/product/*").hasAuthority(Privilege.DELETE_PRODUCT)
                .antMatchers("/api/order").hasAuthority(Privilege.ORDER_OPERATIONS)
                .antMatchers("/api/order/**").hasAuthority(Privilege.ORDER_OPERATIONS)
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

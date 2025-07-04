/**
 * 
 */
package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author nages
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.spring.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

}

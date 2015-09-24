package com.fvc.erp.gestion.be.contract.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fvc.erp.gestion.be.service.config.ServiceConfig;

@Configuration
@EnableWebMvc
@Import(ServiceConfig.class)
@ComponentScan(basePackages = {
		"com.fvc.erp.gestion.be.contract.ventas.rescontroller"		
	})
public class ContractConfig /*extends WebMvcConfigurerAdapter*/ {
	/*
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer){
		configurer.ignoreAcceptHeader(true)
		.defaultContentType(MediaType.TEXT_HTML);
	}
	
	@Bean
	public ViewResolver contenteNegotiationViewResolver(ContentNegotiationManager manager){
		List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
		
		InternalResourceViewResolver  internal = new InternalResourceViewResolver();
		internal.setOrder(1);
		internal.setPrefix("WEB-INF/views/");
		internal.setSuffix(".jsp");
		
		resolvers.add(internal);
		List<View> views = new ArrayList<View>();
		
		MappingJackson2JsonView viewJackson = new MappingJackson2JsonView();
		views.add(viewJackson);
		
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setViewResolvers(resolvers);
		resolver.setContentNegotiationManager(manager);
		resolver.setDefaultViews(views);
		return resolver;
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
		source.setBasename("classpath:texts");
		source.setDefaultEncoding("UTF-8");
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}
*/
}


package com.newlecture.springweb.config;

import org.springframework.context.annotation.Bean;

public class TilesConfig {
	
	   @Bean
	     public TilesConfigurer tilesConfigurer(){
	      TilesConfigurer tilesConfigurer = new TilesConfigurer();
	      tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/tiles.xml"} );
	      tilesConfigurer.setCheckRefresh(true);
	      return tilesConfigurer;
	    }

	    @Bean
	    public TilesViewResolver tilesViewResolver(){
	       TilesViewResolver  viewResolver = new TilesViewResolver();
	       viewResolver.setViewClass(TilesView.class);
	       viewResolver.setOrder(1);
	       return viewResolver;
	   }    
	
}

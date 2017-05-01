package com.autentia.car;

import java.util.Hashtable;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import liquibase.integration.spring.SpringLiquibase;

/**
 * @author Enrique R.S
 */

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

	
 
 
	@Primary
	@Bean(name="carDataSource")
	@ConfigurationProperties(prefix="datasource.cars")
	public DataSource carDataSource() {
		  return DataSourceBuilder.create().type(HikariDataSource.class)
		            .build();
	     
	}

	@Bean("liquibase")
	public SpringLiquibase liquibase(@Qualifier("carDataSource") DataSource carDataSource) {
		SpringLiquibase liquibase = new SpringLiquibase();
		liquibase.setDataSource(carDataSource());
		liquibase.setChangeLog("classpath:db/concesionario-changelog.xml");
		liquibase.setShouldRun(true);
		return liquibase;
	}

	@Primary
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(carDataSource());
	}
	
}
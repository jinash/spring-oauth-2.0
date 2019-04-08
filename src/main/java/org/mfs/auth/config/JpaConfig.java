package org.mfs.auth.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "org.mfs.auth.repository" })
@EnableTransactionManagement
@EntityScan(basePackages = { "org.mfs.auth.entity" })
public class JpaConfig {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactory);
	    return txManager;
	}
}

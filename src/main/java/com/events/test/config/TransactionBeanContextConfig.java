package com.events.test.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Spring's configuration for beans that are related to ORM and data access
 **/
@Configuration
@EnableTransactionManagement
public class TransactionBeanContextConfig {

    @Bean(destroyMethod = "close", name = "dataSource")
    public DataSource setupDatasource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/event_pledger");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory setupSessionFactory(DataSource datasource) {
        LocalSessionFactoryBuilder sessionFactory = new LocalSessionFactoryBuilder(datasource);
        sessionFactory.scanPackages("com.events.test.**");
        sessionFactory.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        sessionFactory.setProperty("hibernate.show_sql", "true");
        sessionFactory.setProperty("current_session_context_class", "thread");
        return sessionFactory.buildSessionFactory();
    }

    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager setupTransactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}

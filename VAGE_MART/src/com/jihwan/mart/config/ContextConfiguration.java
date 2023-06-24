package com.jihwan.mart.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ComponentScan("com.jihwan.mart")
@PropertySource("connection-info.properties")
public class ContextConfiguration{

    @Value("${oracle.dev.driver}")
    public String drier;
    @Value("${oracle.dev.url}")
    public String url;
    @Value("${oracle.dev.username}")
    public String nsername;
    @Value("${oracle.dev.password}")
    public  String password;


    @Bean(destroyMethod = "close")
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(drier);
        dataSource.setUrl(url);
        dataSource.setUsername(nsername);
        dataSource.setPassword(password);
        dataSource.setDefaultAutoCommit(false);

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(ApplicationContext context) throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());

        factoryBean.setConfigLocation(context.getResource("com/jihwan/mart/config/mybatis-config.xml"));

        return factoryBean.getObject();
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(ApplicationContext context) throws  Exception {
        return new SqlSessionTemplate(sqlSessionFactory(context));

    }


}

package com.okayokya.userService.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/***
 * @ClassName: DataSourceConfig
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/25 17:57
 * @version : V1.0
 */
    @Configuration
    public class DataSourceConfig implements EnvironmentAware {

        private static final String MYBATIS_MAPPER_LOCATION = "classpath:mybatis/mapper/*Mapper.xml";
        private static final String MYBATIS_CONFIG_LOCATION = "classpath:mybatis/MybatisConfig.xml";

        private Environment env;

        @Override
        public void setEnvironment(Environment env) {
            this.env = env;
        }

        @Bean(name = "druidDataSource")
        public DataSource createMasterDataSource() throws Exception {
            DruidDataSource dataSource = new DruidDataSource();
            dataSource.setDriverClassName(env.getProperty("druid.datasource.driverClassName"));
            dataSource.setUrl(env.getProperty("druid.datasource.url"));
            dataSource.setUsername(env.getProperty("druid.datasource.username"));
            dataSource.setPassword(env.getProperty("druid.datasource.password"));
            dataSource.setTestWhileIdle(true);
            return dataSource;
        }

        @Bean(name = "transactionManager")
        public DataSourceTransactionManager createTransactionManager(@Qualifier("druidDataSource") DataSource druidDataSource) throws Exception {
            return new DataSourceTransactionManager(druidDataSource);
        }

        @Bean(name = "sqlSessionFactory")
        public SqlSessionFactory masterSqlSessionFactory(@Qualifier("druidDataSource") DataSource druidDataSource)
                throws Exception {
            final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(druidDataSource);
            ResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
            sessionFactory.setConfigLocation(pathResolver.getResource(MYBATIS_CONFIG_LOCATION));
            sessionFactory.setMapperLocations(pathResolver.getResources(MYBATIS_MAPPER_LOCATION));
            return sessionFactory.getObject();
        }


        @Bean
        public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
            return new SqlSessionTemplate(sqlSessionFactory);
        }

        @Bean
        public JdbcTemplate jdbcTemplate(@Qualifier("druidDataSource") DataSource druidDataSource){
            return new JdbcTemplate(druidDataSource);
        }

        @Bean
        public TransactionTemplate transactionTemplate(@Qualifier("druidDataSource") DataSource druidDataSource){
            PlatformTransactionManager transactionManager = new DataSourceTransactionManager(druidDataSource);
            TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
            return transactionTemplate;
        }
    }


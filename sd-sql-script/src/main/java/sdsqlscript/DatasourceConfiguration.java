package sdsqlscript;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.account")
    public DataSource accountDatasource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.order")
    public DataSource orderDatasource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.storage")
    public DataSource storageDatasource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.seata-server")
    public DataSource seataDatasource() {
        return DataSourceBuilder.create().build();
    }
}

package sdsqlscript;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InitDB {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ctx = SpringApplication.run(InitDB.class, args);

        try {
            DataSource accountDatasource = (DataSource) ctx.getBean("accountDatasource");
            DataSource storageDatasource = (DataSource) ctx.getBean("storageDatasource");
            DataSource orderDatasource = (DataSource) ctx.getBean("orderDatasource");
            DataSource seataDatasource = (DataSource) ctx.getBean("seataDatasource");


            exec(accountDatasource, "account.sql");
            exec(storageDatasource, "storage.sql");
            exec(orderDatasource, "order.sql");

            exec(accountDatasource, "undo_log.sql");
            exec(storageDatasource, "undo_log.sql");
            exec(orderDatasource, "undo_log.sql");


            exec(seataDatasource, "seata-server.sql");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static void exec(DataSource accountDatasource, String script) throws SQLException {
        ClassPathResource rc = new ClassPathResource(script, InitDB.class.getClassLoader());
        EncodedResource er = new EncodedResource(rc, "utf-8");
        ScriptUtils.executeSqlScript(accountDatasource.getConnection(), er);
    }
}

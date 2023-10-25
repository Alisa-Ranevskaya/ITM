package jm.task.core.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Util {
    // реализуйте настройку соеденения с БД

    private static Properties getAplication(){
        Properties properties =new Properties();
        try(InputStream in = Util.class.getClassLoader().getResourceAsStream("application.properties")){
            properties.load(in);

        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }

    public static Connection getconnect() {
        Properties properties = getAplication();
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(properties.getProperty("jdbc:postgresql://localhost:5432/postgres"),
                    properties.getProperty("postgres"),
                    properties.getProperty("admin"));
            if (connect != null) {
                System.out.println("Connect");

            } else {
                System.out.println("Disconnect");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return  connect;
    }
}



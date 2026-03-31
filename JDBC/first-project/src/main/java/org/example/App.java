package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App
{

    public static String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/studentDB";
    public static String PASSWORD = "Dey@2004";
    public static String USERNAME = "root";

    public static void main( String[] args )
    {
        try {
            // load driver
            Class.forName(LOAD_DRIVER);

            //making connection
            Connection connection = DriverManager.getConnection(URL , USERNAME , PASSWORD);

            // create statement
            Statement statement = connection.createStatement();

            //creat query
            String query = "select * from students";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String course = resultSet.getString("course");
                System.out.println( "id:"+ id+", "+"name:"+ name+", " +"course:"+ course);

            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

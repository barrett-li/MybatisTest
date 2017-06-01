package com.connext.MybatisTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Success loading driver!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Error loading driver!");
            e.printStackTrace();
        }
        //2）建立与mysql连接
                //getConnection的三个参数，url：只能连接协议，连接主机，和端口号，以及要连接的数据库；user：连接到数据库中的用户名；password：连接密码
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.180:3306/test?useUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=false","test","test");
            System.out.println("connect to world!");
                        //3）通过connection，创建statement
            Statement stm = connection.createStatement();
            //4）resultset中存放查询之后的结果
            ResultSet rSet = stm.executeQuery("select * from test1");
            //ResultSet中的next方法是判断下一个是否为空
            while(rSet.next()){
                System.out.println("the City " + rSet.getString("ID")+" is " + rSet.getString("key2"));
                //System.out.println(rSet.getString("ID","Name"));
            
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error get data!");
            e.printStackTrace();
        }
        
	}

}

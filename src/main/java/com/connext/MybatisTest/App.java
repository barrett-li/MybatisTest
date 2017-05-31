package com.connext.MybatisTest;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.connext.bean.Employee;
import com.connext.bean.Test1Bean;
import com.connext.bean.User;
import com.connext.dao.Test1Mapper;
import com.connext.dao.UserMapper;

/**
 * Hello world!
 *# Global JDBC configuration for mysql
jdbc.driverClassName=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://192.168.1.180:3306/test
jdbc.username=test
jdbc.password=test
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        UserMapper um  = new UserMapper();
//        um.getOneUser(1);
        
        
        Test1Mapper tm  = new Test1Mapper();
        Test1Bean tb = tm.getOneUser(7);
        
        Test1Bean tb2 = new Test1Bean();
        
        tb2.setKey2(tb.getKey2());
        tb2.setValue2(tb.getValue2());
        tb2.setTest1col(tb.getTest1col());
        tb2.setTest1col2(tb.getTest1col2());
        tb2.setTest1col3(tb.getTest1col3());
        tb2.setTest1col4(tb.getTest1col4());
        tb2.setTest1col5(tb.getTest1col5());
        
        tm.insertBYPam(tb2);
        
        
    }
}

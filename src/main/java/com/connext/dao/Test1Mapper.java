package com.connext.dao;

import org.apache.ibatis.session.SqlSession;

import com.connext.bean.Test1Bean;
import com.connext.bean.User;

public class Test1Mapper {
	
public final SqlSession session = DBUtil.getSqlSession();
	

	
	public Test1Bean getOneUser(int num){
		/**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.connext.dao.Test1Mapper.getUserById";
       
        Test1Bean test1 = this.session.selectOne(statement, num);
        
       
        
        System.out.println(test1);
        
        return test1;
	}
	
	
	public int insertBYPam(Test1Bean tb){
		/**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.connext.dao.Test1Mapper.insertBYPam";
       
        int num = this.session.insert(statement, tb);
        
        this.session.commit();
        
        System.out.println(num);
        
        return num;
	}

}

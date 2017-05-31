package com.connext.dao;

import org.apache.ibatis.session.SqlSession;

import com.connext.bean.User;

public class UserMapper {
	
	public final SqlSession session = DBUtil.getSqlSession();
	

	
	public User getOneUser(int num){
		/**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.connext.dao.UserMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        User user = this.session.selectOne(statement, num);
        //UserMapper userMapper=session.getMapper(UserMapper.class);
       
        
        System.out.println(user);
        
        return user;
	}

}

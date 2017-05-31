package com.connext.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * Blob类型默认未处理，手工处理该类
 * @author LIBA002
 *
 * @param <T>
 */
public class BlobTypeHandler<T> implements TypeHandler<T> {

	@Override
	public T getResult(ResultSet arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, T arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		
	}


}

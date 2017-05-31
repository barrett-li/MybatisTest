package com.connext.bean;


import java.util.Date;

import com.mysql.jdbc.Blob;

public class Test1Bean {
	
	private int id;
	private String key2;
	private String value2;
	private int test1col;
	private Date test1col1;
	private double test1col2;
	private double test1col3;
	private float test1col4;
	private String test1col5;
	private Blob test1col6;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public int getTest1col() {
		return test1col;
	}
	public void setTest1col(int test1col) {
		this.test1col = test1col;
	}
	public Date getTest1col1() {
		return test1col1;
	}
	public void setTest1col1(Date test1col1) {
		this.test1col1 = test1col1;
	}
	public double getTest1col2() {
		return test1col2;
	}
	public void setTest1col2(double test1col2) {
		this.test1col2 = test1col2;
	}
	public double getTest1col3() {
		return test1col3;
	}
	public void setTest1col3(double test1col3) {
		this.test1col3 = test1col3;
	}
	public float getTest1col4() {
		return test1col4;
	}
	public void setTest1col4(float test1col4) {
		this.test1col4 = test1col4;
	}
	public String getTest1col5() {
		return test1col5;
	}
	public void setTest1col5(String test1col5) {
		this.test1col5 = test1col5;
	}
	public Blob getTest1col6() {
		return test1col6;
	}
	public void setTest1col6(Blob test1col6) {
		this.test1col6 = test1col6;
	}

	
	public String toString(){
		return this.id+";"+this.key2+";"+this.value2+";"+this.test1col+";"+this.test1col1+";"+this.test1col2+";"+this.getTest1col3()+";"+this.getTest1col4()+";"+this.getTest1col5();
	}
}

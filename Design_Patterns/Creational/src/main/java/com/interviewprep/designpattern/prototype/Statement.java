/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.prototype;

import java.util.List;

/**
 * Shallow copy example
 * @author raghavdutta
 *
 */
public class Statement implements Cloneable {
	
	private String sql;
	private List<String> parameters;
	private Record record;
	
	public Statement(String sql, List<String> parameters, Record record) {
		this.sql=sql;
		this.parameters=parameters;
		this.record=record;
	}
	/**
	 * Shallow copy
	 */
	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public List<String> getParameters() {
		return parameters;
	}
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}

}

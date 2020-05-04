/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 16, 2020
 */
package com.learnswagger.demo;

import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

/**
 * @author raghavdutta
 *
 */
public class Employee {
	@Id
	private Long id;
	private String name;
	private String title;
	private String email;
	
	private int age;
	@NonNull
	private String department;

	protected Employee() {

	}
	public Employee(String name, String title, String department) {
		this.setName(name);
		this.setTitle(title);
		this.setDepartment(department);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


}

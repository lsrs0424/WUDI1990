package com.student.bean;
/**
 * student のBean　class
 * @author FIRSTDEVELOP
 *
 */
public class Student {

	private Integer id;//学生id
	private String name;//学生姓名
	private String birthday;//学生生年月日
	private int age;//学生年齢
	private double score;//学生成績
	private String telephone;
	private String poslnumber;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPoslnumber() {
		return poslnumber;
	}

	public void setPoslnumber(String poslnumber) {
		this.poslnumber = poslnumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}

package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Entity
public class Student {

	@Id
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="marks")
	private int marks;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
    public String toString() {
        return "Student [id=" + id + ", Name=" + name + "marks =" + marks + "]";
    }
}
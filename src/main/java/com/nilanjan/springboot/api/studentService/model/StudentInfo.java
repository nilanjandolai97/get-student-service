package com.nilanjan.springboot.api.studentService.model;

import javax.persistence.*;

@Entity
@Table(name = "student_info")
public class StudentInfo {
	@Id
	private Long student_id;
	private String name;
	@Column(name = "class")
	private int classId;
	private String section;
	private int rollNumber;
	
	/*public StudentInfo(Long student_id, String name, int classId, String section, int rollNumber) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.classId = classId;
		this.section = section;
		this.rollNumber = rollNumber;
	}*/
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	/*@Override
	public String toString() {
		return "StudentInfo [student_id=" + student_id + ", name=" + name + ", classId=" + classId + ", section="
				+ section + ", rollNumber=" + rollNumber + "]";
	}*/
	
}

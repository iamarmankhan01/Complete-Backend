package com.hw.arman;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private int sid;
private String sname;
private List<Integer> marks;
private Set<String> Subject;
private Map<String,String> grades;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<Integer> getMarks() {
	return marks;
}
public void setMarks(List<Integer> marks) {
	this.marks = marks;
}
public Set<String> getSubject() {
	return Subject;
}
public void setSubject(Set<String> subject) {
	Subject = subject;
}
public Map<String, String> getGrades() {
	return grades;
}
public void setGrades(Map<String, String> grades) {
	this.grades = grades;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", Subject=" + Subject + ", grades="
			+ grades + "]";
}


}


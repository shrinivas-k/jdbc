package com.te.jdbc;

public class student {
int rollno;
String name;
int marks;
@Override
public String toString() {
	return "student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}
public student(int rollno, String name, int marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}
public student() {
	// TODO Auto-generated constructor stub
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
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

}

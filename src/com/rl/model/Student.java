package com.rl.model;

public class Student implements Comparable<Student> {
  private String name;
  private int age;
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
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	int num=o.getAge()-this.age;
	if(num==0)
	{
		num=this.name.compareTo(o.getName());
	}
	return num;
}

}

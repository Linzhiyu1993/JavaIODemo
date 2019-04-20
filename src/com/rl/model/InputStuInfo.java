package com.rl.model;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputStuInfo {
  public static void main(String[] args)
  {
	  //创建键盘输入的对象
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请录入几个学生");
	  //获得要输入的学生数量
	  int count=sc.nextInt();
	  for(int i=0;i<count;i++)
	  {
		  sc=new Scanner(System.in);
		  System.out.print("请输入学生姓名");
		  //获得学生的姓名
		  String name=sc.nextLine();
	  }
	  inputStu();
	  System.out.println("done");
  }
  public static void inputStu()
  {
	  List<Student> stu=new ArrayList<Student>();
	  stu.add(new Student("林同学",20));
	  stu.add(new Student("李同学",24));
	  stu.add(new Student("张同学",34));
	  try {
		OutputStream output=new BufferedOutputStream(new FileOutputStream("d.txt"));
		byte[] bs=new byte[1024];
		int len=bs.length;
		try {
			output.write(bs, 0, len);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

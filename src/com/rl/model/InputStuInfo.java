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
	  //������������Ķ���
	  Scanner sc=new Scanner(System.in);
	  System.out.println("��¼�뼸��ѧ��");
	  //���Ҫ�����ѧ������
	  int count=sc.nextInt();
	  for(int i=0;i<count;i++)
	  {
		  sc=new Scanner(System.in);
		  System.out.print("������ѧ������");
		  //���ѧ��������
		  String name=sc.nextLine();
	  }
	  inputStu();
	  System.out.println("done");
  }
  public static void inputStu()
  {
	  List<Student> stu=new ArrayList<Student>();
	  stu.add(new Student("��ͬѧ",20));
	  stu.add(new Student("��ͬѧ",24));
	  stu.add(new Student("��ͬѧ",34));
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

package com.rl.byt.out;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class bufferedCopyFileDemo {
  public static void main(String[] args)
  {
	  long startTime=System.currentTimeMillis();
	  copyFile2();
	  long endTime=System.currentTimeMillis();
	  System.out.println("��ʱ��"+(endTime-startTime)+"ms");
  }
  /**
   * ���ֽ�����ķ�ʽ�����ļ�
   */
  public static void copyFile()
  {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		input=new FileInputStream("d:/1.jpg");
		output=new FileOutputStream("d:/Web/1.jpg");
		byte[] bs=new byte[1024];
		//���巵�صĶ�ȡ�ĳ���
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//���ֽ������е�����д�뵽�ļ���
			output.write(bs, 0, length);
		}
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	     catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	   finally 
	   {
		  try {
			  if(output!=null) 
				  output.close();
			  if(input!=null)
				  input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
  }
 
  public static void copyFile1()
  {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		input=new FileInputStream("d:/1.jpg");
		output=new FileOutputStream("d:/Web/1.jpg");
		byte[] bs=new byte[1024];
		//���巵�صĶ�ȡ�ĳ���
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//���ֽ������е�����д�뵽�ļ���
			output.write(length);
		}
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	     catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	   finally 
	   {
		  try {
			  if(output!=null) 
				  output.close();
			  if(input!=null)
				  input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
  }
  /**
   * ʹ�ø�Ч������
   */
  public static void copyFile2()
  {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		//�����ļ���У�������������Ķ���
		input=new BufferedInputStream(new FileInputStream("d:/1.jpg"));
		output=new BufferedOutputStream(new FileOutputStream("d:/Web/1.jpg"));
		byte[] bs=new byte[1024];
		//���巵�صĶ�ȡ�ĳ���
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//���ֽ������е�����д�뵽�ļ���
			output.write(length);
		}
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	     catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	   finally 
	   {
		  try {
			  if(output!=null) 
				  output.close();
			  if(input!=null)
				  input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   }
  }

}

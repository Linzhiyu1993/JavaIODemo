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
	  System.out.println("耗时："+(endTime-startTime)+"ms");
  }
  /**
   * 以字节数组的方式拷贝文件
   */
  public static void copyFile()
  {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		input=new FileInputStream("d:/1.jpg");
		output=new FileOutputStream("d:/Web/1.jpg");
		byte[] bs=new byte[1024];
		//定义返回的读取的长度
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//把字节数组中的数据写入到文件中
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
		//定义返回的读取的长度
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//把字节数组中的数据写入到文件中
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
   * 使用高效缓冲区
   */
  public static void copyFile2()
  {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		//创建文件高校缓冲区输入流的对象
		input=new BufferedInputStream(new FileInputStream("d:/1.jpg"));
		output=new BufferedOutputStream(new FileOutputStream("d:/Web/1.jpg"));
		byte[] bs=new byte[1024];
		//定义返回的读取的长度
		int length=-1;
		while((length=input.read(bs))!=-1)
		{
			//把字节数组中的数据写入到文件中
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

package com.rl.byt.out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamDemo {
   public static void main(String[] args)
   {
//	   writeFile();
//	   writeFile1();
	   writeFile2();
   }
   public static void writeFile()  
   {
	   OutputStream out=null;
	   //创建字节流输出对象
	   try {
	    out=new FileOutputStream("a.txt");
		String str="hello world";
		byte[] bs=str.getBytes();
		for(byte b: bs)
		{
			out.write(b);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   catch( IOException e) {
		   e.printStackTrace(); 
	   }
	   finally {
		   if(out!=null)
		   {
			   try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
   public static void writeFile1()  
   {
	   OutputStream out=null;
	   //创建字节流输出对象
	   try {
	    out=new FileOutputStream("a.txt");
		String str="hello world test";
		byte[] bs=str.getBytes();
		out.write(bs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   catch( IOException e) {
		   e.printStackTrace(); 
	   }
	   finally {
		   if(out!=null)
		   {
			   try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
   public static void writeFile2()  
   {
	   OutputStream out=null;
	   //创建字节流输出对象
	   try {
	    out=new FileOutputStream("a.txt",true);
		String str="hello world test";
		byte[] bs=str.getBytes();
		out.write(bs, 0, 5);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   catch( IOException e) {
		   e.printStackTrace(); 
	   }
	   finally {
		   if(out!=null)
		   {
			   try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }

}

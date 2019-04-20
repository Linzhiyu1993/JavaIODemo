package com.rl.byt.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStreamDemo {
   public static void main(String[] args)
   {
	   readFile1();
   }
   public static void readFile()  
   {
	   InputStream input=null;
	   //创建字节流输入对象
	   try {
	    input=new FileInputStream("a.txt");
	    int num=input.read();
	    
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   catch( IOException e) {
		   e.printStackTrace(); 
	   }
	   finally {
		   if(input!=null)
		   {
			   try {
				   input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
   /**
    * 向整个数组中存储数据 
    */
   public static void readFile1()  
   {
	   InputStream input=null;
	   //创建字节流输入对象
	   try {
	    input=new FileInputStream("a.txt");
	    byte[] bs=new byte[1024];
	    int length=input.read(bs);//返回读取的长度
	    System.out.println(new String(bs,0,length));
	    
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   catch( IOException e) {
		   e.printStackTrace(); 
	   }
	   finally {
		   if(input!=null)
		   {
			   try {
				   input.close();
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

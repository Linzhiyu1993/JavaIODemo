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
	   //�����ֽ����������
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
    * �����������д洢���� 
    */
   public static void readFile1()  
   {
	   InputStream input=null;
	   //�����ֽ����������
	   try {
	    input=new FileInputStream("a.txt");
	    byte[] bs=new byte[1024];
	    int length=input.read(bs);//���ض�ȡ�ĳ���
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
	   //�����ֽ����������
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

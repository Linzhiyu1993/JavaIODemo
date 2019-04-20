package com.rl.byt.out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
   public static void main(String[] args)
   {
	   copyFile();
   }
   /**
    * 1:���������ֽ����Ķ��󣬴�������ֽ����Ķ���
    * 2����ȡ���ݲ�д������
    * 3���ر���Դ
    */
   public static void copyFile()
   {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		input=new FileInputStream("src/com/rl/byt/out/InPutStreamDemo.java");
		output=new FileOutputStream("outPutStream.java");
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
}

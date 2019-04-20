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
    * 1:创建输入字节流的对象，创建输出字节流的对象
    * 2：读取数据并写入数据
    * 3：关闭资源
    */
   public static void copyFile()
   {
	   InputStream input=null;
	   OutputStream output=null;
	   try {
		input=new FileInputStream("src/com/rl/byt/out/InPutStreamDemo.java");
		output=new FileOutputStream("outPutStream.java");
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
}

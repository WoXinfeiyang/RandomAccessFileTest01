import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件名称：RandomAccessFile测试例程RandomAccessFileTest01
 * 时间：2016-4-9 16:25
 * 说明：1、RandomAccessFile测试例程RandomAccessFileTest01
 * */
public class RandomAccessFileTest01 {


	public static void main(String[] args) {
		try {
			RandomAccessFile raf=new RandomAccessFile("F:/WorkSpace/Java WorkSpace/RandomAccessFileTest01/src/RandomAccessFileTest01.java","r");
			
			/*获取RandomAccessFile对象文件指针位置*/
			System.out.println("当前RandomAccessFile对象文件指针的初始位置:"+raf.getFilePointer());
			raf.seek(10);/*将RandomAccessFile对象文件指针移动到指定位置*/
			System.out.println("当前RandomAccessFile对象文件指针的初始位置:"+raf.getFilePointer()+"\n");
			
			/*用于存储读取内容的字节数组*/
			byte[] buffer=new byte[1024];
			
			/*用于保存读取到的字节数目*/
			int hasRead;
			
			while((hasRead=raf.read(buffer))>0){
				/*将字节数组转换成字符串输出*/
				System.out.println(new String(buffer,0,hasRead));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �ļ����ƣ�RandomAccessFile��������RandomAccessFileTest01
 * ʱ�䣺2016-4-9 16:25
 * ˵����1��RandomAccessFile��������RandomAccessFileTest01
 * */
public class RandomAccessFileTest01 {


	public static void main(String[] args) {
		try {
			RandomAccessFile raf=new RandomAccessFile("F:/WorkSpace/Java WorkSpace/RandomAccessFileTest01/src/RandomAccessFileTest01.java","r");
			
			/*��ȡRandomAccessFile�����ļ�ָ��λ��*/
			System.out.println("��ǰRandomAccessFile�����ļ�ָ��ĳ�ʼλ��:"+raf.getFilePointer());
			raf.seek(10);/*��RandomAccessFile�����ļ�ָ���ƶ���ָ��λ��*/
			System.out.println("��ǰRandomAccessFile�����ļ�ָ��ĳ�ʼλ��:"+raf.getFilePointer()+"\n");
			
			/*���ڴ洢��ȡ���ݵ��ֽ�����*/
			byte[] buffer=new byte[1024];
			
			/*���ڱ����ȡ�����ֽ���Ŀ*/
			int hasRead;
			
			while((hasRead=raf.read(buffer))>0){
				/*���ֽ�����ת�����ַ������*/
				System.out.println(new String(buffer,0,hasRead));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

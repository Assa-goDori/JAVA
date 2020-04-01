import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * src/chap15 ������ .java ���� �� InputStream ���� ��� �ҽ���  
    InputStream����.txt  ���Ϸ� �����ϱ�
     
     InputStream ���� ��� �ҽ� : XXXInputStreamXXX.java
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/chap15");
		FileInputStream fis;
		FileOutputStream fos;
		String[] files = f.list();
		for(int i = 0; i<files.length; i++) {
			if(files[i].contains("InputStream")) {
				fis = new FileInputStream("src/chap15/" + files[i]);
				fos = new FileOutputStream("InputStream����.txt", true);
				byte[] buf = new byte[8096];
				int data = 0;
				String header = "\n============="+files[i]+"=============\n";
				fos.write(header.getBytes());
				while((data = fis.read(buf)) != -1) {
					fos.write(buf, 0, data);
				}
				fos.flush();
			}
		}
		System.out.println("InputStream����.txt ���� ���� �Ϸ�");
	}
}
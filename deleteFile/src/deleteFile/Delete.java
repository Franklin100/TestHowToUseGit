package deleteFile;

import java.io.File;
import java.io.IOException;

public class Delete {

	public static void main(String[] args) {
		String path="/C:\\Users\\fyj\\Desktop\\WorkSpaces/tomcat7072/webapps/caManage\\pfxs\\2017-07-17 17-35-45\\9121030066457965X3.pfx";
		
		//����·��
		String path2=tidy(path);
		//����
		//createFile(path2);
		
		//ɾ��
		delete(path2);
		
		
		

	}
	
	/**
	 * ����·���ķ���
	 * @param path
	 * @return
	 */
	public static String tidy(String path){
		// --- /D:/WorkSpaces/tomcat7072/webapps/caManage\pfxs\2017-07-17 17-35-45\9121030066457965X3.pfx
		String path2 = path.substring(1);
		System.out.println("path2" + path2);

		String path3 = path2.replaceAll("/", "\\\\");
		System.out.println("������·����path3:" + path3);
		return path3;
	}
	
	
	
	
	//D:/WorkSpaces/tomcat7072/webapps/caManage\\pfxs\\2017-07-17 17-35-45\\9121030066457965X3.pfx
	//C:\Users\fyj\Desktop\SQL���ѧϰ��
	/**
	 * 
	 * @param path
	 * @return
	 */
	public static String createFile(String path){
		//File file =new File("C:\\Users\\fyj\\Desktop\\test\\a.txt");
		File file =new File(path);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
			System.out.println("�����ļ��гɹ�");
			try {
				file.createNewFile();
				System.out.println("�����ļ��ɹ�");
			} catch (IOException e) {
				System.out.println("�����ļ�ʧ��");
				e.printStackTrace();
			}
			
		}
		return file.getPath();
	}
	
	
	/**
	 * ɾ���ļ����ļ���
	 * @param path
	 */
	public static void delete(String path3) {
		//String path = FileOperation.getAbsoPath(resOld.getFilepath());// �����ļ�·��,��þ���·��
		//System.out.println("resOld path" + path);
		
		
		// --- /D:/WorkSpaces/tomcat7072/webapps/caManage\pfxs\2017-07-17 17-35-45\9121030066457965X3.pfx
		// ��ʽת��,ȥ���̷�ǰ��/,����/ת��Ϊpath.separtor
		//String path2 = path.substring(1);
		//System.out.println("path2" + path2);

		//String path3 = path2.replaceAll("/", "\\\\");
		//System.out.println("path3:" + path3);

		File oldFile = new File(path3);
		if (oldFile.exists()) {
			oldFile.delete();
			System.out.println("ɾ���ļ��ɹ�");
		} else {
			System.out.println("�ļ�������");
		}
		if (oldFile.getParentFile().exists()) {
			oldFile.getParentFile().delete();
			System.out.println("ɾ���ļ��ĸ�Ŀ¼�ɹ�");
		} else {
			System.out.println("Ŀ¼������");
		}
	}

}

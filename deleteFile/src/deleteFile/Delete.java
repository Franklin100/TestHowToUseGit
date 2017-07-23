package deleteFile;

import java.io.File;
import java.io.IOException;

public class Delete {

	public static void main(String[] args) {
		String path="/C:\\Users\\fyj\\Desktop\\WorkSpaces/tomcat7072/webapps/caManage\\pfxs\\2017-07-17 17-35-45\\9121030066457965X3.pfx";
		
		//整理路径
		String path2=tidy(path);
		//创建
		//createFile(path2);
		
		//删除
		delete(path2);
		
		
		

	}
	
	/**
	 * 整理路径的方法
	 * @param path
	 * @return
	 */
	public static String tidy(String path){
		// --- /D:/WorkSpaces/tomcat7072/webapps/caManage\pfxs\2017-07-17 17-35-45\9121030066457965X3.pfx
		String path2 = path.substring(1);
		System.out.println("path2" + path2);

		String path3 = path2.replaceAll("/", "\\\\");
		System.out.println("整理后的路径：path3:" + path3);
		return path3;
	}
	
	
	
	
	//D:/WorkSpaces/tomcat7072/webapps/caManage\\pfxs\\2017-07-17 17-35-45\\9121030066457965X3.pfx
	//C:\Users\fyj\Desktop\SQL语句学习器
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
			System.out.println("创建文件夹成功");
			try {
				file.createNewFile();
				System.out.println("创建文件成功");
			} catch (IOException e) {
				System.out.println("创建文件失败");
				e.printStackTrace();
			}
			
		}
		return file.getPath();
	}
	
	
	/**
	 * 删除文件和文件夹
	 * @param path
	 */
	public static void delete(String path3) {
		//String path = FileOperation.getAbsoPath(resOld.getFilepath());// 输入文件路径,获得绝对路径
		//System.out.println("resOld path" + path);
		
		
		// --- /D:/WorkSpaces/tomcat7072/webapps/caManage\pfxs\2017-07-17 17-35-45\9121030066457965X3.pfx
		// 格式转换,去掉盘符前的/,并将/转换为path.separtor
		//String path2 = path.substring(1);
		//System.out.println("path2" + path2);

		//String path3 = path2.replaceAll("/", "\\\\");
		//System.out.println("path3:" + path3);

		File oldFile = new File(path3);
		if (oldFile.exists()) {
			oldFile.delete();
			System.out.println("删除文件成功");
		} else {
			System.out.println("文件不存在");
		}
		if (oldFile.getParentFile().exists()) {
			oldFile.getParentFile().delete();
			System.out.println("删除文件的父目录成功");
		} else {
			System.out.println("目录不存在");
		}
	}

}

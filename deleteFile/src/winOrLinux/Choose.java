package winOrLinux;

public class Choose {

	public static void main(String[] args) {
		try {
			if(System.getProperty("os.name").toLowerCase().startsWith("win")){
				System.out.println("winϵͳ");
			}else{
				System.out.println("����ϵͳ");
			}
				
			String path="/D:/WorkSpaces/tomcat7072/webapps/caManage\\pfxs\\2017-07-17 17-35-45\\9121030066457965X3.pfx";
			String path3=path.replaceAll("\\","/");
			System.out.println(path3);
		} catch (Exception e) {
			System.out.println("ִ��ʧ��");
			e.printStackTrace();
		}
		
		System.out.println(1111111111);
		
	}

}

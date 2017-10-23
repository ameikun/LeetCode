package map1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class modle {
	//public Socket socket;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = null;
		//boolean isConnection = socket.isConnected()&&!socket.isClosed();
		//System.out.println("//////"+isConnection);
		//创建socket对象
		socket = new Socket("192.168.1.110",3456);
		socket.setSoTimeout(30000);
		System.out.println("跳过测试！！");
		//获取socket的输出流，用来发送数据到服务器端
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		boolean flag = true;
		while (flag) {
		byte[] data=new byte[18];
			data[0]=-1;
			data[1]=-86;
			for(int i=1;i<10;i++)
				data[i]=0;
			data[10]=1;
			data[11]=1;
			data[12]=1;
			data[13]=0;
			data[14]=1;
			data[15]=1;
			data[16]=-1;
			data[17]=85;

			//String str = "ffaa12344578a1df45230321010001a0ff55";
			//发送数据到服务器
			out.println(data);
			if ("bye".equals(data )) {
				flag = false;
			}else {
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		if (socket!=null) {
			socket.close();
		}
	}
}

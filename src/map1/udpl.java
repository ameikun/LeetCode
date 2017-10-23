package map1;
import java.net.*;
import java.io.*;

public class udpl {
	public static byte convert(String a)
	{
		return (byte)Integer.parseInt(a, 16);
	}
	
	public static void main(String[] args){
		
		
	  try{
		InetAddress address=InetAddress.getByName("192.168.1.110");
		int port=3456;
		byte data[];
		data=new byte[18];
		data[0]=convert("ff");
		data[1]=convert("aa");
		data[2]=convert("12");
		data[3]=convert("34");
		data[4]=convert("45");
		data[5]=convert("78");
		data[6]=convert("a1");
		data[7]=convert("df");
		data[8]=convert("45");
		data[9]=convert("23");
		data[10]=convert("03");
		data[11]=convert("21");
		data[12]=convert("01");
		data[13]=convert("00");
		data[14]=convert("03");
		data[15]=convert("a0");
		data[16]=convert("ff");
		data[17]=convert("55");
		
		DatagramPacket packet=new DatagramPacket(data,data.length,address,port);
		DatagramSocket socket=new DatagramSocket();
		socket.send(packet);
		System.out.println("running..");
		byte[] data1=new byte[18];
		DatagramPacket packet1=new DatagramPacket(data1,data1.length);
		socket.receive(packet1);
		for(int i=0;i<18;i++)
			System.out.println(data1[i]);
		int port_local=packet1.getPort();
		System.out.println(port_local);
		InetAddress address1=packet1.getAddress();
		System.out.println(address1.toString());
		socket.close();
		
		System.out.println(convert("ff"));
	  }catch (Exception e){e.printStackTrace();}
	}
		
}
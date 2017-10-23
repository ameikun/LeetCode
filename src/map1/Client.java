package map1;
import java.net.*;
import java.io.*;

public class Client {
	public byte data[];
	public byte data1[];
	public int port1;
	public InetAddress address1;
	public String getAddress() throws IOException
	{
		InetAddress address=InetAddress.getByName("255.255.255.255");
		int port=3456;
		data=new byte[18];
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
		DatagramPacket packet=new DatagramPacket(data,data.length,address,port);
		DatagramSocket socket=new DatagramSocket();
		socket.send(packet);
		data1=new byte[18];
		
		DatagramPacket packet1=new DatagramPacket(data1,data1.length);
		System.out.println("running....");
		socket.receive(packet1);
		for(int i=0;i<18;i++)
			System.out.println(data1[i]);
		port1 = packet1.getPort();
		System.out.println("...."+port);
		
		address1=packet1.getAddress();
		System.out.println(address1.toString());
		
		socket.close();
		return address1.toString();
		}
}
package javabase.network_program;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendAndReceive {
	public static void main(String[] args) {
		new Receive().start();
		
		new Send().start();
	}
}

class Receive extends Thread {

	@Override
	public void run() {
		
			try {
				DatagramSocket socket = new DatagramSocket(6667);
				DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
				
				while(true) {
					socket.receive(packet);
					byte[] data = packet.getData();
					int len = packet.getLength();
					String ip = packet.getAddress().getHostAddress();
					int port = packet.getPort();
					System.out.println(ip + ":" + port + ":" + new String(data,0,len));
				}
				
	
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
	
}

class Send extends Thread {
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			DatagramSocket socket = new DatagramSocket();
			while(true) {
				String data = sc.nextLine();
				if("quit".equals(data))
					break;
				DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length
						,InetAddress.getByName("127.0.0.1"),6667);
				socket.send(packet);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		/*catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
				
	}
	
}
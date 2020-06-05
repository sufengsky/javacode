package j2se.chapter17.d17_07;

import java.io.*;
import java.net.*;
import java.util.*;
public class ChatServer {
	public static void main(String args[]) {
		Hashtable<String,DataOutputStream> userList = new Hashtable<String,DataOutputStream>(); 
		String name;
		DataInputStream dis;
		DataOutputStream dos;
		try{
			ServerSocket ss = new ServerSocket(9999);
			while(true){
				Socket s = ss.accept();	
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
				name = dis.readUTF();
				userList.put(name,dos);
				new MyServerReader(name,dis,userList).start();
			}
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
}

class MyServerReader extends Thread{
	private String name;
	private DataInputStream dis;
	private Hashtable<String,DataOutputStream> userList;
	public MyServerReader(String name,DataInputStream dis,Hashtable<String,DataOutputStream> userList ){
		this.name = name;
		this.dis = dis;	
		this.userList = userList;
	}
	public void run(){
		String info;
		try{
			transmitMessage(name + " in!","--Server Info--");	
			while(true){
				info = dis.readUTF();
				if(info.equals("bye")){
					DataOutputStream dos = (DataOutputStream)(userList.get(name));
					Thread.sleep(1000);
					dos.close();
					dis.close();
					userList.remove(name);
					transmitMessage(name + " out!","--Server Info--");	
					break;
				}else if(info.length()>0){
					transmitMessage(info,name);	
				}
			}		
		}catch (Exception e) {
		}
	} 
	public void transmitMessage(String msg,String name){
		Collection doses = userList.values();
		DataOutputStream dos;
		for(Object o: doses){
			dos = (DataOutputStream)o;
			try{
				dos.writeUTF(name + ":" + msg);
			}catch(Exception e){
			}
		}			
	}		
}
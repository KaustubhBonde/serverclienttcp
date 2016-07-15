package dockerMe;

import java.lang.*;
import java.io.*;
import java.net.*;

class ServerOne {
	public static void main(String args[]) {
		String data = "Bala";
		String data1 = "Male";
		String data2 = "October";
		try {
			ServerSocket srvr = new ServerSocket(3335);
			Socket skt = srvr.accept();
			System.out.print("Server has connected!\n");
			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
			System.out.print("Name: '" + data + "'\n");
			System.out.print("Sex: '" + data1 + "'\n");
			System.out.print("Date of Month: '" + data2 + "'\n");
			out.print(data);
			out.close();
			skt.close();
			srvr.close();
		} catch (Exception e) {
			System.out.print("Whoops! It didn't work!\n");
		}
	}
}

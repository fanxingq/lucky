package com.ct.test1;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String[] args) throws IOException {

		// 创建接收端Socket对象
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("启动服务器!");
		while (true) {
			// 监听
			Socket sk = ss.accept();
			// 获取输入流对象
			InputStream is = sk.getInputStream();
			Thread readThread = new Thread() {
				public void run() {
					// 获取数据
					byte[] bys = new byte[1048576];
					int len;
					try {
						String str = null;
						while ((len = is.read(bys)) != -1) {
							str = new String(bys, 0, len);
							System.out.println(str.length() + str);
						}
						List<String> sqls = new ArrayList<String>();
						String[] arr = str.split(";");
						for (int i = 0; i < arr.length; i++) {
							sqls.add(arr[i]);
						}
						// 输出数据
						InetAddress address = sk.getInetAddress();
						System.out.println("sender-->" + address.getHostName());
						ProcessSqls(sqls);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							sk.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};

			readThread.start();
			// 释放资源

		}
	}

	public static void ProcessSqls(List<String> sqls) {

		System.out.println("hello world");
	}
}

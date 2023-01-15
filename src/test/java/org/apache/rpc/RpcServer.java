package org.apache.rpc;

import org.apache.conf.Configuration;
import org.apache.ipc.RPC;
import org.apache.ipc.Server;

public class RpcServer {

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		conf.set("server.ip.name","localhost");
		conf.set("name.port","8888");
		// 设置rpc代理的实现server类
		Server server = RPC.getServer(new DemoServiceImpl(), conf.get("server.ip.name"),
				conf.getInt("name.port", 8888),
				new Configuration());
		server.start();
	}
}

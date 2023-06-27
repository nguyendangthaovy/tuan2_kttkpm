package app;

import redis.clients.jedis.Jedis;

public class demo2 {
	public static void main(String[] args) throws Exception {
		try {
			Jedis jedis = new Jedis("localhost");
			System.out.print("kết nối thành công");
			System.out.print("Sever Ping: "+jedis.ping());
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}

}

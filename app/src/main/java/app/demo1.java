package app;

import redis.clients.jedis.Jedis;

public class demo1 {
	public static void main(String[] args) {
		try {
			Jedis jedis = new Jedis("localhost");
			System.out.print("kết nối thành công");
			System.out.print("List push one two:"+jedis.lpop("one"));
			System.out.print("List push one two:"+jedis.lpush("one", "two"));
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}

}

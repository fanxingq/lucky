package com.ct.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		String str = "";
		List<String> sqls = new ArrayList<String>();
		/* 之后考虑从数据库中直接读取，然后存在数组中 */
		sqls.add("select  test1.id1,name, passwd, city , addr from test1 join test2 on test1.id1=test2.id2");
		sqls.add("select * from test1 where test1.id1='9998'");
		// sqls.add("select * from test1 group by id1 order by time1");
		sqls.add("select * from test1  order by time1 ");
		sqls.add("SELECT id1 FROM  test1 ORDER  BY time1 desc LIMIT  88888,1000");
		sqls.add("SELECT * FROM  test2 ORDER  BY time2 desc");
		sqls.add(" select  test1.id1,name, passwd, city , addr from test1 join test2 on test1.id1=test2.id2");
		sqls.add("select * from test1 where test1.id1='9998' ");
		// sqls.add(" select * from test1 group by id1 order by time1");
		sqls.add("select * from test1  order by time1 ");
		sqls.add("SELECT id1 FROM  test1 ORDER  BY time1 desc LIMIT  88888,1000 ");
		sqls.add("SELECT * FROM  test2 ORDER  BY time2 desc ");
		sqls.add("select  test1.id1,name, passwd, city , addr from test1 join test2 on test1.id1=test2.id2");
		sqls.add("select * from test1 where test1.id1='9998'  ");
		// sqls.add("select * from test1 group by id1 order by time1");
		sqls.add("select * from test1  order by time1");
		sqls.add("SELECT id1 FROM  test1 ORDER  BY time1 desc LIMIT  88888,1000");
		sqls.add("SELECT * FROM  test2 ORDER  BY time2 desc");

		// 新增数据
		sqls.add("SELECT * FROM test1 WHERE id1 LIKE '1%' ");
		sqls.add("SELECT * FROM test1 WHERE id1 LIKE '_1%1' ");
		sqls.add("SELECT * FROM test1 WHERE time1 LIKE '_1%4' ");
		sqls.add("SELECT * FROM test1 WHERE time1 LIKE '_4%4' ");
		sqls.add("SELECT * FROM test1 WHERE passwd LIKE '1%' ");
		sqls.add("SELECT * FROM test1 WHERE passwd LIKE '%m%' ");
		sqls.add("SELECT * FROM test1 WHERE name LIKE '1%' ");
		sqls.add("SELECT * FROM test1 WHERE name LIKE '%m%' ");
		sqls.add("SELECT * FROM test2 WHERE id2 LIKE '2%' ");
		sqls.add("SELECT * FROM test2 WHERE id2 LIKE '_2%2' ");
		sqls.add("SELECT * FROM test2 WHERE time2 LIKE '_1%3' ");
		sqls.add("SELECT * FROM test2 WHERE time2 LIKE '_3%4' ");
		sqls.add("SELECT * FROM test2 WHERE addr LIKE '_2%m%G%' ");
		sqls.add("SELECT * FROM test2 WHERE addr LIKE '_5%M%t%' ");
		sqls.add("SELECT * FROM test1 ORDER BY id1 ASC limit 66666,1000");
		sqls.add("SELECT * FROM test1 ORDER BY id1 DESC limit 55555,5050");
		sqls.add("SELECT * FROM test1 ORDER BY id1 ASC limit 88888,1000");
		sqls.add("SELECT * FROM test1 ORDER BY id1 DESC limit 77777,100");
		sqls.add("SELECT * FROM test2 ORDER BY id2 ASC limit 66666,1000");
		sqls.add("sqls.add(“SELECT * FROM test2 ORDER BY id2 DESC limit 55555,5050");
		sqls.add("SELECT * FROM test2 ORDER BY id2 ASC limit 88888,1000");
		sqls.add("SELECT * FROM test2 ORDER BY id2 DESC limit 77777,100");
		sqls.add("SELECT * FROM test1 ORDER BY time1 ASC limit 66666,1000");
		sqls.add("SELECT * FROM test1 ORDER BY time1 DESC limit 55555,5050");
		sqls.add("SELECT * FROM test1 ORDER BY time1 ASC limit 88888,1000");
		sqls.add("SELECT * FROM test1 ORDER BY time1 DESC limit 77777,100");
		sqls.add("SELECT * FROM test2 ORDER BY time2 ASC limit 66666,1000");
		sqls.add("SELECT * FROM test2 ORDER BY time2 DESC limit 55555,5050");
		sqls.add("SELECT * FROM test2 ORDER BY time2 ASC limit 88888,1000");
		sqls.add("SELECT * FROM test2 ORDER BY time2 DESC limit 77777,100");

		sqls.add("select count(*) from test1 where id1 LIKE '_5%5' ");
		sqls.add("select count(*) from test1 where id1 LIKE '_55%' ");
		sqls.add("select count(*) from test2 where id2 LIKE '_68%' ");
		sqls.add("select count(*) from test2 where addr LIKE '_2%m%G%' ");
		sqls.add("select count(*) from test2 where addr LIKE '_5%J%K%' ");
		sqls.add("select count(*) from test1");
		sqls.add("select count(*) from test2");

		sqls.add("select count(distinct name) from test1");
		sqls.add("select count(distinct time1) from test1");
		sqls.add("select count(distinct passwd) from test1");
		sqls.add("select count(distinct city) from test2");
		sqls.add("select count(distinct addr) from test2");
		sqls.add("select count(distinct time2) from test2");

		sqls.add("select max(id1) from test1");
		sqls.add("select min(id1) from test1");
		sqls.add("select max(id2) from test2");
		sqls.add("select min(id2) from test2");
		sqls.add("select max(time1) from test1");
		sqls.add("select min(time1) from test1");
		sqls.add("select max(time2) from test2");
		sqls.add("select min(time2) from test2");
		sqls.add("select max(name) from test1");
		sqls.add("select min(name) from test1");
		sqls.add("select max(passwd) from test1");
		sqls.add("select min(passwd) from test1");
		sqls.add("select max(city) from test2");
		sqls.add("select min(city) from test2");
		sqls.add("select max(addr) from test2");
		sqls.add("select min(addr) from test2");

		sqls.add("select avg(id1) from test1 group by id1");
		sqls.add("select avg(id2) from test2 group by id2");

		sqls.add("select sum(id1) from test1 group by id1");
		sqls.add("select sum(id2) from test2 group by id2");

		sqls.add("select id1,count(*) from test1 where id1>2000 group by id1");
		sqls.add("select id2,count(*) from test2 where id2>8000 group by id2");
		sqls.add("select time1,count(*) from test1 where id1>9000 group by time1");
		sqls.add("select time2,count(*) from test2 where id1>12000 group by time2");

		sqls.add("select id1,time1,count(*) from test1 group by time1,id1 order by id1 desc");
		sqls.add("select id2,time2,count(*) from test2 group by time2,id2 order by id2 desc");

		sqls.add("select time1,group_concat(id1) from test1 group by time1");

		sqls.add("select time2,group_concat(id2) from test2 group by time2");

		sqls.add("select time1,count(*) from test1 where id1>=8000 group by time1 having count(*)>=2");
		sqls.add("select time2,count(*) from test2 where id2>=10000 group by time2 having count(*)>=2");

		for (int i = 0; i < sqls.size(); i++) {
			str = str + sqls.get(i) + ";";
		}

		System.out.println(str + "\n byte--" + str.length());
		// 创建发送端Socket对象
		Socket s = new Socket("127.0.0.1", 5000);
		// 获取输出流对象
		OutputStream os = s.getOutputStream();
		// 发送数据
		os.write(str.getBytes());
		os.flush();
		// 释放资源
		// os.close();
		s.close();

	}

}

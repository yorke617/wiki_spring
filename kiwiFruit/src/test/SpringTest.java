package test;

import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import test.utilTest.QueueUtil;
import test.utilTest.StackUtil;

import com.kiwi.beans.User;
import com.kiwi.registUser.BS.RegistUserBS;
import com.kiwi.registUser.action.RegistUserAction;
import com.sun.jmx.remote.internal.ArrayQueue;

public class SpringTest {
	
	
	public void testSpring() throws SQLException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:resources/AllSpringApplication.xml");

		DataSourceTransactionManager dstm = (DataSourceTransactionManager)ctx.getBean("tx");
		int time = dstm.getDefaultTimeout();
		System.out.println(time+"-----------------------");
		JdbcTemplate jdbc = (JdbcTemplate)ctx.getBean("jdbc");
		String sql = "select * from sys003";
		List list = jdbc.queryForList(sql);
		System.out.println(list);
	}
	
	public void testSpring1() throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:resources/AllSpringApplication.xml");
		RegistUserBS bs = (RegistUserBS) ctx.getBean("registUserBSImpl");
		User user = new User();
		user.setIsvalid(1l);
		user.setLoginname("ccc");
		user.setPassword("111111");
		user.setUsertype(2l);

		boolean isSave = bs.registUser(user);
		System.out.println(isSave);
	}
	//@Test
	public void testAction() throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:resources/AllSpringApplication.xml");
		RegistUserAction action = (RegistUserAction) ctx.getBean("registUserAction");
		//boolean isOk = action.registUser();
		//System.out.println(isOk);
		
	}
	//@Test
	public void testSf(){
		System.out.println("第1个月兔子的对数：1");
		System.out.println("第2个月兔子的对数：1");
		int f1 = 1, f2 = 1, m = 12;
		int f = 0;
		for (int i = 3; i <= m; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第"+i+"个月兔子的对数："+f2);
		}
	}
	
	//@Test
	public void testQueueUtil(){
		int capacity = 1000;
		QueueUtil queue = new QueueUtil(capacity);
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("D:/test.txt");
			for (int i = 0; i < capacity*3+5; i++) {
				if (queue.queueFull()) {
					//如果队列满了，则将队列的数据据写到文件中
					file.write((queue.ObtainQueue() + ",").getBytes());
					//break;
					if ((i+1)%10 == 0) {
						file.write("\r\n".getBytes());
					}
				}
				boolean bool = queue.addQueue(i);
				
				//System.out.println(bool);
			}
			file.write("\r\n----------------------------\r\n".getBytes());
			System.out.println(queue);
			System.out.println(queue.queueLength());
			int cs = queue.queueLength();
			for (int i = 0; i < cs; i++) {
				file.write((queue.ObtainQueue() + ",").getBytes());
				if ((i+1)%10 == 0) {
					file.write("\r\n".getBytes());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				file.close();
			} catch (Exception e2) {
				
			}
		}
		System.out.println(queue.ObtainQueue());
		System.out.println(queue.ObtainQueue());
		System.out.println(queue.queueLength());
	}
	@Test
	public void testStackUtil() throws Exception{
		int size = 200;
		StackUtil stack = new StackUtil(size);
		for (int i = 0; i < size; i++) {
			stack.pushStack(i);
		}
		System.out.println(stack);
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
	}
	//@Test
	public void radixZh() throws Exception{
		int num = 13481231;
		int size = 50;
		StackUtil stack = new StackUtil(size);
		while(num != 0){
			stack.pushStack(num%2);
			num = num/2;
		}
		int count = stack.stackLength();
		for (int i = 0; i < count; i++) {
			System.out.print(stack.popStack());
		}
		Map map = new HashMap();
		Queue queue = new LinkedList();
		
		//Stack<int> stack = new 
		
		
	}
	
	
}

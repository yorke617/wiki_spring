package test;

import java.util.ArrayList;

import org.junit.Test;

import test.javaModel.SingletonModel;
import test.javaModel.bridge.AbstractMessage;
import test.javaModel.bridge.CommonMessage;
import test.javaModel.bridge.MessageEmail;
import test.javaModel.bridge.MessageImplementor;
import test.javaModel.bridge.UrgencyMessage1;
import test.javaModel.builder.Builder;
import test.javaModel.builder.Director;
import test.javaModel.builder.GoodByeBuilder;
import test.javaModel.builder.WelcomeBuilder;
import test.javaModel.composite.Component;
import test.javaModel.composite.Composite;
import test.javaModel.composite.Leaf;
import test.javaModel.decorator.Brid;
import test.javaModel.decorator.Fish;
import test.javaModel.decorator.Monkey;
import test.javaModel.decorator.TheGreatestSage;
import test.javaModel.factory.ExportFactory;
import test.javaModel.factory.ExportFile;
import test.javaModel.factory.ExportHtmlFactory;
import test.javaModel.flyweight.Flyweight;
import test.javaModel.flyweight.FlyweightFactory;
import test.javaModel.iterator.Aggregate;
import test.javaModel.iterator.ConcreteAggregate;
import test.javaModel.iterator.Iterator;
import test.javaModel.observer.ConcreteObserver;
import test.javaModel.observer.ConcreteSubject;
import test.javaModel.observer.Observer;
import test.javaModel.prototype.ConcretePrototype1;
import test.javaModel.prototype.Prototype;
import test.javaModel.prototype.PrototypeManager;
import test.javaModel.simpleFactory.LoginManager;
import test.javaModel.simpleFactory.SimpleFactory;
import test.javaModel.templateMethod.Account;
import test.javaModel.templateMethod.CDAccount;
import test.javaModel.templateMethod.MoneyMarketAccount;

public class ModelTest {
	
	//@Test
	public void singletonTest(){
		SingletonModel model = SingletonModel.getInstance();
		model.setName("yangyk");
		System.out.println(model.getName());//13bd574
		model = SingletonModel.getInstance();
		System.out.println(model.getName());
	}
	//@Test
	public void simpleFactoryTest() throws Exception{
		String loginType = "password";
		String name = "yangyk";
		String password = "111111";
		SimpleFactory factory = LoginManager.factory(loginType);
		boolean loginResult = factory.verify(name, password);
		System.out.println(loginResult);
		loginType = "domain";
		factory = LoginManager.factory(loginType);
		loginResult = factory.verify(name, password);
		System.out.println(loginResult);
	}
	//@Test
	public void factoryTest(){
		String data = "";
		ExportFactory factory = new ExportHtmlFactory();
		ExportFile file = factory.factory("financial");
		file.exportFile(data);
		file = factory.factory("standard");
		file.exportFile(data);
	}
	//@Test
	public void builderTest(){
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("toAddress@qq.com", "fromAddress@qq.com");
		builder = new GoodByeBuilder();
		director = new Director(builder);
		director.construct("toAddress@qq.com", "fromAddress@qq.com");
	}
	//@Test
	public void prototypeTest() throws Exception{
		Prototype prototype1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("p1", prototype1);
//		Prototype prototype2 = PrototypeManager.getPrototype("p1").clone();
		Prototype prototype2 = prototype1.clone();
		prototype2.setName("科");
		System.out.println(prototype1);
		System.out.println(prototype2);
		System.out.println(prototype1.getName());
		System.out.println(prototype2.getName());
		
		
		PrototypeManager.rmPrototype("p1");
        //再次获取原型来创建对象
        Prototype p5 = PrototypeManager.getPrototype("p1").clone();
        p5.setName("王五");
        System.out.println("第三个实例：" + p5);
	}
	//@Test
	public void compositeTest(){
		Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        
        Component leaf1 = new Leaf("衬衫");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");
        
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        
        root.printStruct("");
        c1.printStruct("");
	}
	//@Test
	public void decoratorTest(){
		TheGreatestSage sage = new Monkey();
		TheGreatestSage fish = new Fish(sage);
		TheGreatestSage brid = new Brid(fish);
		System.out.println(brid.getClass());
		brid.move();
		fish.move();
	}
	//@Test
	public void flyweightTest(){
		Flyweight flyweight1 = FlyweightFactory.factory('a');
		flyweight1.operation("aaaaaa");
		Flyweight flyweight2 = FlyweightFactory.factory('a');
		flyweight2.operation("bbbbb");
		System.out.println(flyweight1==flyweight2);
	}
	//@Test 
	public void bridgeTest(){
		MessageImplementor impl = new MessageEmail();
		AbstractMessage message = new UrgencyMessage1(impl);
		message.sendMsg("yangyk@qq.com", "快点给我答案！");
		message = new CommonMessage(impl);
		message.sendMsg("yangyk@qq.com", "快点给我答案！");
	}
	//@Test
	public void templateMethodTest(){
		Account account = new MoneyMarketAccount();
		System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
		account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
	}
//	@Test
	public void observerTest(){
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("new State");
	}
	@Test
	public void iteratorTest(){
		Object[] objArray = {"One","Two","Three","Four","Five","Six"};
		Aggregate agg = new ConcreteAggregate(objArray);
		Iterator it = agg.createIterator();
		while (it.isDone()) {
			System.out.println(it.currentItem());
            it.next();
		}
		
	}
}

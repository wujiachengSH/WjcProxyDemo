package com.wjc.proxy;

import java.io.FileOutputStream;

import sun.misc.ProxyGenerator;
public class Test2 {
	public static void main(String[] args) {

		try {
			Wjc wjc = new Wjc();
			People instance = (People) new MatchMaker().getInstance(wjc);
			System.out.println(wjc.getClass());
			System.out.println(instance.getClass());
			
			//1.拿到被代理对象的引用，然后获取它的接口
			//2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			//3.把被代理对象的引用也拿到了
			//4.重新动态生成一个class字节码
			//5.然后编译
			
			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});
			FileOutputStream os = new FileOutputStream("E:/$Proxy0.class");
			os.write(data);
			os.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

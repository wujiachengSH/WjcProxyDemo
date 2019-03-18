package com.wjc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MatchMaker implements InvocationHandler {
	// 拿到被代理的对象
	private People target;

	// 获取被代理对象
	public Object getInstance(People target) throws Exception {
		this.target = target;
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-------这是一位"+this.target.getSex()+"性-------");
		
		method.invoke(this.target, args);
		System.out.println("找富婆是要付出代价的");

		return null;
	}

	@Override
	public String toString() {
		return "MatchMaker [target=" + target + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

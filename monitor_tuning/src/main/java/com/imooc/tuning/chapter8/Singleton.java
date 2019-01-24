package com.imooc.tuning.chapter8;

public class Singleton {
	private Singleton() {}
	private static class SingletonHolder{
		private static Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}

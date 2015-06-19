package net.hfutonline.pattern.singleton;

/**
 * 饿汉式单例
 * 不能延迟加载
 * @author zlb
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();//类初始化时，立即加载这个对象！
	/**
	 * 私有构造器，核心
	 */
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return instance;
	}
}

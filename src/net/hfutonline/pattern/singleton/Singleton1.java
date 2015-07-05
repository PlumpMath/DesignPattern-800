package net.hfutonline.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式单例 不能延迟加载
 * 
 * @author zlb
 *
 */
public class Singleton1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6620081335698377491L;
	private static Singleton1 instance = new Singleton1();// 类初始化时，立即加载这个对象！

	/**
	 * 私有构造器，核心
	 */
	private Singleton1() {
		if (instance == null) {
			throw new RuntimeException("不能破解单例");
		}
	}

	public static Singleton1 getInstance() {
		return instance;
	}

	// 防止反序列化破解单例
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}

package net.hfutonline.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例，能够延迟加载 所谓延迟加载，其实就是使用时再实例化
 * 
 * @author zlb
 *
 */
public class Singleton2 implements Serializable {

	private static final long serialVersionUID = 1348353138377497495L;

	private static Singleton2 instance;

	private Singleton2() {
		if (instance == null) {
			throw new RuntimeException("不能破解单例");
		}
	}

	/**
	 * 并发效率比较低
	 * 
	 * @return
	 */
	public static synchronized Singleton2 getInstance() {
		if (null == instance) {
			instance = new Singleton2();
		}
		return instance;
	}

	// 防止反序列化破解单例
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}

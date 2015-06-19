package net.hfutonline.pattern.singleton;

/**
 * 懒汉式单例，能够延迟加载 所谓延迟加载，其实就是使用时再实例化
 * 
 * @author zlb
 *
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
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
}

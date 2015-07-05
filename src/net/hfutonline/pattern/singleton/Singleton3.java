package net.hfutonline.pattern.singleton;

/**
 * 静态内部类实现单例模式 类加载时天然线程安全，在调用getInstance时才会初始化instance，性能很高
 * 
 * @author zlb 这里不再考虑反序列化和反射的方式
 *
 */
public class Singleton3 {
	private Singleton3() {
	}

	private static class SingletonHolder {
		private static final Singleton3 instance = new Singleton3();

	}

	public static Singleton3 getInstance() {
		return SingletonHolder.instance;
	}
}

package net.hfutonline.pattern.singleton;

/**
 * ����ʽ�������ܹ��ӳټ��� ��ν�ӳټ��أ���ʵ����ʹ��ʱ��ʵ����
 * 
 * @author zlb
 *
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
	}

	/**
	 * ����Ч�ʱȽϵ�
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

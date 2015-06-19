package net.hfutonline.pattern.singleton;

/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * �����ʱ��Ȼ�̰߳�ȫ���ڵ���getInstanceʱ�Ż��ʼ��instance�����ܸܺ�
 * @author zlb
 *
 */
public class Singleton3 {
	private Singleton3(){}
	
	private static class SingletonHolder{
		private static final Singleton3 instance = new Singleton3();
		
	}
	
	public static Singleton3 getInstance(){
		return SingletonHolder.instance;
	}
}

package net.hfutonline.pattern.singleton;

/**
 * ����ʽ����
 * �����ӳټ���
 * @author zlb
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance = new Singleton1();//���ʼ��ʱ�����������������
	/**
	 * ˽�й�����������
	 */
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return instance;
	}
}

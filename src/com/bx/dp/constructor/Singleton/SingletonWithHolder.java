package com.bx.dp.constructor.Singleton;
/**
 * 登记式/静态内部类 - 线程安全
 *
 */
public class SingletonWithHolder {
	private static class SingletonHolder {  
	    private static final SingletonWithHolder INSTANCE = new SingletonWithHolder();  
	}  
	private SingletonWithHolder (){}  
    public static final SingletonWithHolder getInstance() {  
    	return SingletonHolder.INSTANCE;  
    }  
}

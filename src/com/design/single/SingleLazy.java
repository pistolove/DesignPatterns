package com.design.single;

/**
 *lazy
 */
public class SingleLazy {//使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化
	private volatile static SingleLazy single;

	private SingleLazy() {}

	public static SingleLazy getSingle() {
		if (single == null) {
			//maybe same threads went into at the same time
			synchronized (SingleLazy.class) {
				if (single == null) {
					single = new SingleLazy();
				}
			}
		}
		return single;
	}
}

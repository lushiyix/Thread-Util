package com.hhlin.util;

/**
 * 线程工具类，继承Thread实现线程
 *
 * @author HuangHonglin
 * @date 2023/10/30 18:40
 */
public class ByExtendThreadUtil extends Thread {

    public ByExtendThreadUtil(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了" + i);
        }
    }

}

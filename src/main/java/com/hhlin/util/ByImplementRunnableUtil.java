package com.hhlin.util;

/**
 * 线程工具类，实现Runnable接口
 *
 * @author HuangHonglin
 * @date 2023/10/30 18:45
 */
public class ByImplementRunnableUtil implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了" + i);
        }
    }
}



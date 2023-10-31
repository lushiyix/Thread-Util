package com.hhlin.util;

import java.util.concurrent.Callable;

/**
 * 线程工具类，通过实现callable接口
 *
 * @author HuangHonglin
 * @date 2023/10/31 10:02
 */
public class ByImplementCallableUtil implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了" + i);
        }
        return "Callable线程执行完毕";
    }
}

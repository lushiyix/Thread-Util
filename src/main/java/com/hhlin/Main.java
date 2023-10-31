package com.hhlin;

import com.hhlin.util.ByExtendThreadUtil;
import com.hhlin.util.ByImplementCallableUtil;
import com.hhlin.util.ByImplementRunnableUtil;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author HuangHonglin
 * @date 2023/10/30 17:04
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 方式一：通过继承Thread实现多线程
        ByExtendThreadUtil thread_1 = new ByExtendThreadUtil("Thread-1");
        thread_1.start();

        // 方式二：通过实现Callable接口实现多线程
        ByImplementCallableUtil byImplementCallableUtil = new ByImplementCallableUtil();
        FutureTask task = new FutureTask(byImplementCallableUtil);
        Thread thread_2 = new Thread(task, "Thread-2");
        thread_2.start();

        // 方式三：通过实现Runnable接口实现多线程
        ByImplementRunnableUtil byImplementRunnableUtil = new ByImplementRunnableUtil();
        Thread thread_3 = new Thread(byImplementRunnableUtil, "Thread-3");
        thread_3.start();

        // FutureTask获取线程执行结束返回值
        System.out.println(task.get());
    }
}
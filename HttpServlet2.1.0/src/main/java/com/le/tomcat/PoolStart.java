package com.le.tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class PoolStart {
//    ExecutorService pool = Executors.newFixedThreadPool(10);
    ThreadPoolExecutor pool = new ThreadPoolExecutor(
        4,//corePoolSize:核心线程数
        10,//maximumPoolSize:最大线程数(核心线程+临时线程)
        60,//keepAliveTime:空闲时间数(临时线程可空闲的最长时间，超过该时间临时线程就会被销毁)
        TimeUnit.SECONDS,//unit:时间单位
        new ArrayBlockingQueue<Runnable>(100),//workQueue:阻塞队列(存放线程的容器)
        new ThreadFactory(){//threadFactory:匿名内部类
            @Override
            public Thread newThread(Runnable r){
                //线程的工厂类
                return new Thread(r);
            }
        },
        new ThreadPoolExecutor.DiscardPolicy());//handler:拒绝策略


    public void processing(ServerSocket serverSocket) throws IOException {
        int i = 0;
        while (i < 1000){
            Socket socket = serverSocket.accept();
            Runnable task = new RequestResponseTask(socket);
            pool.execute(task);
            i++;
        }
        pool.shutdown();
    }
}

package org.fitz.threadpool;

import java.util.concurrent.*;

/**
 * @author: Fitz
 * @date 2022/2/21 9:10 PM
 * @since 1.0.0
 **/
public class ThreadPoolBuilder {

    private String threadPoolName = "defaultThreadPool";

    private int corePoolSize = 1;

    private int maximumPoolSize = Runtime.getRuntime().availableProcessors() * 2;

    private long keepAliveTime = 30L;

    private TimeUnit unit = TimeUnit.SECONDS;

    private BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(1024);

    private RejectedExecutionHandler rejectedExecutionHandler;

    private ThreadFactory threadFactory;

    private ThreadPoolBuilder(){}

    public static ThreadPoolBuilder newBuilder(){
        return new ThreadPoolBuilder();
    }

    public ThreadPoolBuilder threadPoolName(String threadPoolName){
        this.threadPoolName = threadPoolName;
        return this;
    }

    public ThreadPoolBuilder corePoolSize(int corePoolSize){
        this.corePoolSize = corePoolSize;
        return this;
    }

    public ThreadPoolBuilder maximumPoolSize(int maximumPoolSize){
        this.maximumPoolSize = maximumPoolSize;
        return this;
    }

    public ThreadPoolBuilder keepAliveTime(long keepAliveTime){
        this.keepAliveTime = keepAliveTime;
        return this;
    }

    public ThreadPoolBuilder timeUnit(TimeUnit unit) {
        if (unit != null) {
            this.unit = unit;
        }
        return this;
    }

    public ThreadPoolBuilder build(){

    }
}



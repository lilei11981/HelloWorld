package com.company.thread;

/**
 * Created by lilei on 2017/9/6 下午4:23.
 */
public class GetThreadId implements Runnable {
    private ThreadID variable;

    private GetThreadId(ThreadID variable) {
        this.variable = variable;
    }

    private static void print(String message) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + message);
    }

    public static void main(String[] args) {
        ThreadID threadID = new ThreadID();
        GetThreadId getThreadId = new GetThreadId(threadID);
        try {
            Thread threadA = new Thread(getThreadId, "threadA");
            threadA.start();
            Thread.sleep(500);
            Thread threadB = new Thread(getThreadId, "threadB");
            threadB.start();
            Thread.sleep(500);
            Thread threadC = new Thread(getThreadId, "threadC");
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            print("Variable getThreadID = " + variable.getThreadID());
            Thread.sleep(2000);
            print("Variable getThreadID = " + variable.getThreadID());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadID extends ThreadLocal {
    private int nextID;

    ThreadID() {
        nextID = 10001;
    }

    private static void print(String message) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + message);
    }

    private synchronized Integer getNewID() {
        Integer id = nextID;
        nextID++;
        return id;
    }

    @Override
    protected Object initialValue() {
        print("in initialValue()");
        return getNewID();
    }

    int getThreadID() {
        return (Integer) get();
    }
}


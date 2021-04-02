package com.leozhi.topic1114;

/**
 * @author leozhi
 * volatile
 * 通过
 * 17ms
 */
class Foo1 {
    private volatile int flag = 0;

    public Foo1() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag != 1) {
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag != 2) {
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}

package com.example.day4.ex1;


public class Ex1 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        doA();
    }

    public void doA() {
        for(int i = 0;i<100;i++) {
            System.out.println(this+":"+Thread.currentThread().getName()+":"+i);
        }
    }
    public static void main(String[] args) {
        Ex1 obj1 = new Ex1();
		Ex1 obj2 = new Ex1();
		Ex1 obj3 = new Ex1();
        new Thread(obj1).start();
        new Thread(obj2).start();
        new Thread(obj3).start();
//		obj1.start();
//		obj2.start();
//		obj3.start();
    }

}

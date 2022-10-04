package com.example.day4.ex1;

public class Ex2 {
    public static void main(String[] args) {
        final StringBuffer str= new StringBuffer();

        new Thread(()->{
            for( int i =0; i<100;i++) {
                System.out.println("A: "+i);
                str.append(""+i);
            }
        }).start();

        for( int i =0; i<100;i++) {
            System.out.println("B: "+i);
            str.append(""+i);
        }
    }
}

package com;

public class Singleton1 {

    private  static Singleton1 instance;
    private  static  Singleton1 getInstance(){

        if(instance==null){
            synchronized (Singleton1.class){
                if(instance==null){
                    instance=new Singleton1();
                }
            }
        }
    return instance;
    }
}

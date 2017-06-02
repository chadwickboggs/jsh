#!/usr/bin/env jsh

String var1 = "Hello";
System.out.println(var1);

public int getInt1(){
    return 2;
}

public int getInt2(){
    return 4;
}

getInt1() + getInt2();

public class MyClass{
    public void sayHelloWorld(){
        System.out.println("HelloWorld");
    }
}

new MyClass().sayHelloWorld()

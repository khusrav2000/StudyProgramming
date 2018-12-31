package org.stepic.java.example;
public final class Main{
    public static void main(String[] args){
        System.out.println(getClassAndMethodName());
        firstMethod();
    }
    public static void firstMethod(){
        System.out.println(getClassAndMethodName());
        secondMethod();
    }
    public static void secondMethod(){
        System.out.println(getClassAndMethodName());
    }
    public static String getClassAndMethodName(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        try {
            return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
        }catch (Exception e) {
            return "null";
        }
    }
}
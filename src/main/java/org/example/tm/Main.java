package org.example.tm;

public class Main {
    public static void main(String[] args) {
        TemplateClass t1=new Implementation1();
        System.out.println("Implementation 1 :");
        System.out.println(t1.operationTemplate());
        t1=new Implementation2();
        System.out.println("Implementation 2 :");
        System.out.println(t1.operationTemplate());
    }
}
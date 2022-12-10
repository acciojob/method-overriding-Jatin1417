package com.driver;

public class Main {
    public static class A{
       public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
       public String methA(){
        return super.meth();
       }
       public String meth(){
            return "Method is overridden in Extendend class B";
        }
        
    }
    
}
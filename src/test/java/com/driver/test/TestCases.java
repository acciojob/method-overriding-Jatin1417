package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.Main;
import com.driver.Main.A;
import com.driver.Main.B;

public class TestCases {
    public static void main(String args[]){
        B bobj = new B();
        System.out.println(bobj.methA());
        System.out.println(bobj.meth());
    }
}

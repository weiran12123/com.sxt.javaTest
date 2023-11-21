package com.sxt.java.week01;

import java.util.Random;
/*
* 打印0-100的随机数，当随机到88时，跳出循环
* */
public class suiJiShu {
    public static void main(String[] args) {
        Random random = new Random();
        while (true){
            Integer result = random.nextInt(101);
            System.out.println(result);
            if (result==88) break;
        }
    }
}

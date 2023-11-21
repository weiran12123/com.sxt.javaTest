package com.sxt.java.week01;

/*
* 用while和for分别计算出100以内的奇数和偶数的和并输出
* */
public class forWhileJiOuHe {
    Integer whileTotal1 = 0;    // while循环奇数和变量
    Integer whileTotal2 = 0;    // while循环偶数和变量
    Integer forTotal1 = 0;      // for循环奇数和变量
    Integer forTotal2 = 0;      // for循环偶数值变量

    // 使用while计算100以内的奇数和偶数和
    public void whileTest(){
        Integer num = 1;
        while(num <= 101){
            if (num % 2 == 1){
                this.whileTotal1 = this.whileTotal1 + num;
            }else if (num%2 == 0){
                this.whileTotal2 = this.whileTotal2 + num;
            }else {
                System.out.println("异常");
            }
            num++;
        }
    }

    // 使用for计算100以内的奇数和偶数和
    public void forTest(){
        for(int i = 1;i <= 101; i++){
            if (i%2 == 1){
                this.forTotal1 = this.forTotal1 + i;
            }else if (i%2 == 0){
                this.forTotal2 = this.forTotal2 + i;
            }else {
                System.out.println("异常");
            }
        }
    }


    public static void main(String[] args) {
        // Test类实例化
        forWhileJiOuHe test = new forWhileJiOuHe();
        // 调用方法whileTest()
        test.whileTest();
        System.out.println("while循环100奇数和:"+test.whileTotal1);
        System.out.println("while循环100偶数和:"+test.whileTotal2);

        // 调用方法forTest()
        test.forTest();
        System.out.println("for循环100奇数和:"+test.forTotal1);
        System.out.println("for循环100奇数和:"+test.forTotal2);
    }
}

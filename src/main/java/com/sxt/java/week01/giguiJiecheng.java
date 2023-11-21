package com.sxt.java.week01;

/*
* 使用递归来计算以下问题
* 1!+2!+3!+4!+5!
* */
public class giguiJiecheng {
    public static void main(String[] args) {
        giguiJiecheng test1 = new giguiJiecheng();        // 1的阶乘
        test1.run(1);
        giguiJiecheng test2 = new giguiJiecheng();        // 2的阶乘
        test2.run(2);
        giguiJiecheng test3 = new giguiJiecheng();        // 3的阶乘
        test3.run(3);
        giguiJiecheng test4 = new giguiJiecheng();        // 4的阶乘
        test4.run(4);
        giguiJiecheng test5 = new giguiJiecheng();        // 5的阶乘
        test5.run(5);
        Integer result = test1.result+test2.result+ test3.result+ test4.result+ test5.result;
        System.out.println(result);
    }

    // 定义每次要乘的数
    Integer num = 1;

    // 定义每次乘一个数的结果
    Integer result = 1;

    // 阶乘递归函数
    public Integer run(Integer num){
        if(num >= 1) {
            this.result = this.result * num;
            this.num = num - 1;
            return run(num - 1);
        }
        return 1;
    }
}

package com.sakula;
import java.util.Scanner;/*导入scanner类，注意大写*/
import java.util.Random;/*导入Random类，注意大写*/
public class Demo {
    public static void main(String[] args){
        /*系统阶段*/
        System.out.println("############欢迎进入随机猜数字小游戏！##################");
        System.out.println("############请输入字符串begin或shutdown进行游戏#########");
        for(;;) /*系统开始，并且可循环判断*/{
            String str=null;/*初始化字符串*/
            Scanner scan1=new Scanner(System.in);/*创建名为scan1的类来进行输入的操作*/
            str=scan1.next();/*将字符串指向这个类*/
            if (str.indexOf("begin") != -1)/*检测输入的字符串是否带有begin*/ {
                /*游戏阶段*/
                Scanner scan2 = new Scanner(System.in);/*创建名为scan2的类来进行输入的操作*/
                Random ran = new Random();/*创建一个随机数*/

                int b = 0;/*初始化b为随机数存放*/
                b = ran.nextInt(64);/*导入随机数并限定范围*/
                int i = 0;/*初始化i为记录次数*/
                System.out.println("请输入猜的数字：(正整数)");
                do {
                    int a = 0;/*输入*/
                    a = scan1.nextInt();/*输入*/

                    /*大小判断*/
                    if (a > b) {
                        System.out.println("猜大了哟！");
                    } else if (a < 0) {
                        System.out.println("请输入正数！");
                    } else if (a < b) {
                        System.out.println("猜小了哟！");
                    } else {
                        System.out.println("猜对了！");
                        break;/*跳出do while循环*/
                    }
                    i = i + 1;/*循环记录次数*/
                } while (i < 64);/*完成循环*/
                System.out.println("这次您猜了" + i + "次");
                System.out.println("############请输入字符串begin或shutdown进行游戏#########");
            } else if (str.indexOf("shutdown") != -1)/*检测输入的字符串是否带有shutdown*/ {
                System.out.println("游戏结束");break;/*跳出程序阶段的循环*/
            }
            else {
                System.out.println("输入错误,请重新输入。");
            }
        }
}
}
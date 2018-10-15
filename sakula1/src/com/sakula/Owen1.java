package com.sakula;
import java.util.Scanner;/*导入scanner类，注意大写*/
import java.util.Random;/*导入Random类，注意大写*/

public class Owen1 {
    public static void game(){
    /*游戏阶段*/
     Scanner scan1=new Scanner(System.in);/*创建名为scan1的类来进行输入的操作*/
     Random ran = new Random();/*创建一个随机数*/
     int targetNum = 0;/*初始化targetNum为随机数存放*/
    targetNum = ran.nextInt(64);/*导入随机数并限定范围*/
    int i = 0;/*初始化i为记录次数*/
    System.out.println("请输入猜的数字：(正整数)");
    do {
        int count  = 0;/*输入*/
        count  = scan1.nextInt();/*输入*/

        /*大小判断*/
        if (count > targetNum) {
            System.out.println("猜大了哟！");
        } else if (count < 0) {
            System.out.println("请输入正数！");
        } else if (count < targetNum) {
            System.out.println("猜小了哟！");
        } else {
            System.out.println("猜对了！");
            break;/*跳出do while循环*/
        }
        i = i + 1;/*循环记录次数*/
    } while (i < 64);/*完成循环*/
    System.out.println("这次您猜了" + i + "次");
    System.out.println("############请输入字符串begin或shutdown进行游戏#########");

    };
    public static void main(String[] args){
        /*系统阶段*/
        System.out.println("############欢迎进入随机猜数字小游戏！##################");
        System.out.println("############请输入字符串begin或shutdown进行游戏#########");
        Scanner scan2 = new Scanner(System.in);/*创建名为scan2的类来进行输入的操作*/
        while(true) /*系统开始，并且可循环判断*/{
            String str=null;/*初始化字符串*/
            str=scan2.next();/*将字符串指向这个类*/
            String str2="begin";/*创建字符串begin*/
            String str3="shutdown";/*创建字符串shutdown*/
            if (str2.equals(str))/*检测输入的字符串是begin*/ {
                game();/*游戏阶段*/
            } else if (str3.equals(str) )/*检测输入的字符串是shutdown*/ {
                System.out.println("游戏结束");break;/*跳出程序阶段的循环*/
            }
            else {
                System.out.println("输入错误,请重新输入。");
            }
        }
}
}
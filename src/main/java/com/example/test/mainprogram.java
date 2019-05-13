package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 */
public class mainprogram {
    /**
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {


    /*    Scanner scanner=new Scanner(System.in);
        String comm=scanner.next();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //1.看到菜单
            caidan();

            String comman = br.readLine();

            if ("1".equals(comman)) {

            }else if ("2".equals(comman)) {

            }else if ("3".equals(comman)) {

            }else if ("4".equals(comman)) {

            }else if ("q".equals(comman)) {
                       break;
            }else{
                System.out.println("shuruyouwu");
            }
        }
    }

    private static void caidan() {
        System.out.println("==========");
        System.out.println("[1]添加联系人");
        System.out.println("[2]修改联系人");
        System.out.println("[3]删除联系人");
        System.out.println("[4]查询联系人");
        System.out.println("[q]退出系统");
        System.out.println("==========");
    }
}


package com.wangp.ribborn_application.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static String reverseStr(String s, int k) {
        StringBuffer resultStr = new StringBuffer();
        StringBuffer insertStr = new StringBuffer(s);

        for (int i = 0; i < s.length(); i=i+2*k) {
            insertStr.append(";");
        }

        String[] split = insertStr.toString().split(";");

        for(int i=0;i<split.length;i=i+k) {
            if (split.length-i>k){
                resultStr.append(new StringBuffer(split[i].substring(i, i + k)).reverse()).append(split[i].substring(i + k));
            }
            if (split.length-i<k) {
                resultStr.append(new StringBuffer(split[i].substring(i, split.length-i)).reverse());
            }
        }
        return resultStr.toString();
    }


    public static String reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }


//        StringBuffer sb = new StringBuffer(s.toString());
//        sb.reverse().toString().toCharArray();
        return s.toString();
    }

    public static void main(String[] args) {
        String s="abcdef";
        String x = reverseString(s.toCharArray());
        System.out.println(x);

        List<String> list = new ArrayList();
        list.add("AAA");
        list.add("BBB");
        list.add("CCCC");
        Collections.swap(list,0,1);
        for (String str :
                list) {
            System.out.println(str);
        }
    }
}

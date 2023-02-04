package com.subidha.custom;

import org.springframework.util.StringUtils;

public class TEst {

    public static void main(String[] args) {
        String p = "  ";

        if(StringUtils.hasText(p)){
            System.out.println("it has text");
        }else
            System.out.println("it is blanck");

    }
}

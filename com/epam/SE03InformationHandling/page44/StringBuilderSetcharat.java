package com.epam.SE03InformationHandling.page44;

public class StringBuilderSetcharat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java stringBuilder");
        sb.setCharAt(5, 'S');
        System.out.println("StringBuilder: "+sb);
    }
}

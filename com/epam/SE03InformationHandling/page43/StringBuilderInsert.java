package com.epam.SE03InformationHandling.page43;

public class StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java StringBuilder");
        sb.insert(5, "insert ");
        System.out.println("StringBuilder: " + sb);
    }
}

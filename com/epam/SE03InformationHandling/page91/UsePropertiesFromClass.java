package com.epam.SE03InformationHandling.page91;

public class UsePropertiesFromClass {
    public static void main(String[] args){
        ResourcesBundle myBundle = new ResourcesBundle();
        System.out.println(myBundle.getValue("my.key1"));
    }
}

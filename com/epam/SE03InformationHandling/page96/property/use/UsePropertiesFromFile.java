package com.epam.SE03InformationHandling.page96.property.use;

import java.util.Locale;
import com.epam.SE03InformationHandling.page96.property.bundle.ResourceProperty;

public class UsePropertiesFromFile {
    public static void main(String[] args){
        ResourceProperty myBundle = new ResourceProperty(new Locale("en","US"));
        System.out.println(myBundle.getValue("my.key1"));
        myBundle = new ResourceProperty(new Locale("en","UK"));
        System.out.println(myBundle.getValue("my.key2"));
        myBundle = new ResourceProperty(new Locale("ru","BY"));
        System.out.println(myBundle.getValue("my.key1"));
        myBundle = new ResourceProperty(new Locale("ru","RU"));
        System.out.println(myBundle.getValue("my.key2"));
    }
}


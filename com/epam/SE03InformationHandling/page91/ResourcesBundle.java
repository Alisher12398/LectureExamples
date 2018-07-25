package com.epam.SE03InformationHandling.page91;

import java.util.ResourceBundle;

public class ResourcesBundle {
    ResourceBundle bundle;
    public ResourcesBundle() {
        bundle = ResourceBundle.getBundle("com.epam.SE03InformationHandling.page91.ResourcesExample");
    }
    public String getValue(String key) {
        return bundle.getString(key);
    }
}

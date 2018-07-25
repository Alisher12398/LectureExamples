package com.epam.SE03InformationHandling.page96.property.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {
    ResourceBundle bundle;
    public ResourceProperty(Locale locale) {
        bundle = ResourceBundle.getBundle("com.epam.SE03InformationHandling.page96..property.property.prop", locale);
    }
    public String getValue(String key) {
        return bundle.getString(key);
    }
}

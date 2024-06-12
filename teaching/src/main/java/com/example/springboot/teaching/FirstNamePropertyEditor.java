package com.example.springboot.teaching;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.util.Objects;

public class FirstNamePropertyEditor extends PropertiesEditor {
    @Override
    public void setAsText(String text){
        setValue(Objects.requireNonNull(text).trim().toLowerCase());
    }
}

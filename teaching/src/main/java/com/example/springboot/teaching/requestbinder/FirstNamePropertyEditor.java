package com.example.springboot.teaching.requestbinder;


import java.beans.PropertyEditorSupport;
import java.util.Objects;

public class FirstNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text){
        System.out.println("Formatted text: ");
        setValue(Objects.requireNonNull(text).trim().toLowerCase());
    }
}

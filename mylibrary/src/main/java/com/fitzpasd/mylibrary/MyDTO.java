package com.fitzpasd.mylibrary;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MyDTO {
    public abstract String myString();

    public static MyDTO with(String s) {
        return new AutoValue_MyDTO(s);
    }
}

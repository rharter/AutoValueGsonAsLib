package com.fitzpasd.mylibrary;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class MyDTO {
    public abstract String myString();

    public static MyDTO with(String s) {
        return new AutoValue_MyDTO(s);
    }

    // The public static method returning a TypeAdapter<MyDTO> is what
	// tells auto-value-gson to create a TypeAdapter for MyDTO.
	public static TypeAdapter<MyDTO> typeAdapter(Gson gson) {
		return new AutoValue_MyDTO.GsonTypeAdapter(gson);
	}
}

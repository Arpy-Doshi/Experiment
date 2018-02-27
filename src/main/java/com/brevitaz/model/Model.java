package com.brevitaz.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Model
{
    private String id;
    private String name;
    private String string1;
    private Date fromDate = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH).parse(string1);

    public Model() throws ParseException {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

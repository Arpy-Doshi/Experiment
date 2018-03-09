package com.brevitaz.model;

import java.text.*;
import java.util.*;

public class Model
{
    private String id;
    private String name;
    private String string1;
    private Date fromDate ;
    /*= new SimpleDateFormat("dd-mm-yyyy"*//*, Locale.ENGLISH*//*).parse(string1);
*/
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

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", string1='" + string1 + '\'' +
                ", fromDate=" + fromDate +
                '}';
    }
}

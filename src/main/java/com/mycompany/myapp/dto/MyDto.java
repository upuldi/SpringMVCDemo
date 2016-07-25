package com.mycompany.myapp.dto;

/**
 * Created by udoluweera on 6/7/16.
 */
public class MyDto {

    private String myFiled;
    private String myAnotherField;

    public String getMyFiled() {
        return myFiled;
    }

    public void setMyFiled(String myFiled) {
        this.myFiled = myFiled;
    }

    public String getMyAnotherField() {
        return myAnotherField;
    }

    public void setMyAnotherField(String myAnotherField) {
        this.myAnotherField = myAnotherField;
    }

    public MyDto(String myFiled, String myAnotherField) {
        this.myFiled = myFiled;
        this.myAnotherField = myAnotherField;
    }
}

package com.abhishek.item2;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public class App2 {
    public static void main(String[] args) {
        Request.Builder requestBuilder = new Request.Builder("requiredParameter1","requiredParameter2" )
                .optionalParameter1("optionalParameter1").optionalParameter2("optionalParameter2").optionalParameter3("optionalParameter3")
                .optionalParameter4("optionalParameter4");

        Request request = requestBuilder.build();
        System.out.println("Request :" + request.toString());
    }
}

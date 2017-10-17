package com.abhishek._08_exceptions.item58;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionMethod {
    public static void main(String[] args) {
        try {
            throwChecked();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void throwChecked() throws IOException {
        File f = new File("/unknown/path");
        throw new IOException("IO exception");
    }
}

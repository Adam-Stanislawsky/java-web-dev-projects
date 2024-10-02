package org.launchcode;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
    Divide(10, 3);
    Divide(2,0);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        // Write code here!
        try {
            int result = x/y;
            System.out.println("Result:" + result);

        } catch (ArithmeticException e) {
            System.out.println("ERROR!!!! Cannot divide by zero");
        }

    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//    }
}
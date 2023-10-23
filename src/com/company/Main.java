package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File ("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit (1);

        }

        PrintWriter output = new PrintWriter(file);
        output.print ("John Smith");
        output.println (90);
        output.print ("Erik Jones");
        output.println (85);
        output.close ();

        Scanner sc = new Scanner (System.in);


    }
}

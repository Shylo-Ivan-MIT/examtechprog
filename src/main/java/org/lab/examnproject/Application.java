/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.examnproject;
import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        out.print("Enter a");
        long a = in.nextLong();
        out.print("Enter d");
        long d = in.nextLong();
        out.print("Enter n-element");
        long n = in.nextLong();
        long N;
        N = a + d*(n-1);
        out.print("The value of n-element" + n);
        out.flush();
        
        
        int[] list = {16,26,30,31,11,9,11};
        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i]<min)
                min = list[i];
        }
        out.print("Minimal value in list is " + min);
        out.flush();
    }
}

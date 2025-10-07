package dev.desktop;

import dev.desktop.AutoScript.*;
public class test {
    public static void main(String[] args) {
        Variables.createVariable("x", 0);
        IO.println(Variables.getInt("x"));
        IO.println("Hello, World!");
    }
}

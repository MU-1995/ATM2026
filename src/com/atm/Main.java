package com.atm;

import java.util.Scanner;

public class Main {
    private static final String CMD_QUIT = "q";

    static void main() {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while(!quit) {
            String input = scanner.nextLine();
            if(input.equals("q")) return;
        }
    }
}

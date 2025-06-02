package com.heytony;

import java.util.Scanner;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        Scanner input = new Scanner(System.in);

        // collects user input word to diplay on display screen
        System.out.print("Type a word: ");
        String word = input.nextLine();
        String[] letters = word.split("");

        for (String l : letters) {
            int[] array = PatternCreator.getPatternForSymbol(l);
            bird.setDisplay(array);
            bird.pause(1);
        }


        input.close();
        
        bird.stopAll();
        bird.disconnect();
    }
}

package com.heytony;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PatternCreator {
    private static ArrayList<String> characters = readFile("characters.txt");

    /**
     * Returns the int array to display a given symbol on the LED
     * display screen
     * @param symbol the symbol to be displayed on the screen.
     * Only use A-Z, a-z, 0-9, and comon keyboard symbols
     * @return a 1D array of 1's and 0's representing the symbol
     */
    public static int[] getPatternForSymbol(String symbol) {
        String list = findBinaryList(symbol);
        
        if (list != null) {
            String[] stringList = list.split(",");
            int listSize = stringList.length;
            int[] numsList = new int[listSize];
            for (int i = 0; i < stringList.length; i++) {
                numsList[i] = Integer.parseInt(stringList[i]);
            }
            return numsList;
        }
        return null;
    }

    /**
     * Parses the characters ArrayList to find the String representation
     * of the 1D array of ints for the given str
     * @param str the symbol to display on the LED screen
     * @return a String of 1s and 0s corresponding to the str symbol
     */
    private static String findBinaryList(String str) {
        for (int i = 0; i < characters.size(); i++) {
            int lineIndex = characters.get(i).indexOf(str+": ");
            if (lineIndex != -1) {
                return characters.get(i).substring(lineIndex + 3);
            }
        }
        return null;
    }

    /**
     * Reads the a txt file to story the memory.
     * @param fileName the file parsed
     * @return ArrayList of the individual lines from the txt file
     */
    private static ArrayList<String> readFile(String fileName) {
        ArrayList<String> characters = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                characters.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return characters;
    }

}

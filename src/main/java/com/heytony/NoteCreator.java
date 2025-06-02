package com.heytony;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NoteCreator {
    private static ArrayList<String> midiMap = readFile("midi_to_musical_notes.txt");
    private static ArrayList<String> chordMap = readFile("chord_mapping.txt");

    public static void main(String[] args) {
        
    }

    public int findNote(String note) {
        return findNote(note, "mid");
    }

    public int findNote(String note, String register) {
        ArrayList<Integer> notes = new ArrayList<Integer>();

        for (String line : midiMap) {
            String[] splitLine = line.split(" ");
            if (splitLine[1].indexOf(note) != -1) {
                notes.add(Integer.parseInt(splitLine[0]));
            }
        }

        if (register.toLowerCase().equals("low")) {

        } else if (register.toLowerCase().equals("mid")) {

        } else if (register.toLowerCase().equals("high")) {

        } else {

        }

        return -1;
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

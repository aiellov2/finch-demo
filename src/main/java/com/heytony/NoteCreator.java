package com.heytony;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NoteCreator {
    private static ArrayList<String> midiMap = readFile("midi_to_musical_notes.txt");

    public static int[] getMajorChord(String rootNote) {
        int note = findNote(rootNote);
        return new int[] {note, note + 4, note + 7, note + 12};
    }

    public static int[] getMinorChord(String rootNote) {
        int note = findNote(rootNote);
        return new int[] {note, note + 3, note + 7, note + 12};
    }

    /**
     * Returns the int for the given note around middle C
     * @param note the string letter of the note (use # and b for sharp and flat) 
     * @return the int value of the note
     */
    public static int findNote(String note) {
        return findNote(note, 60);
    }

    /**
     * Returns the int for the given note provided a lower bound
     * @param note the string letter of the note (use # and b for sharp and flat)
     * @param range the lowest int value for the given note
     * @return the int value of the note
     */
    public static int findNote(String note, int range) {
        ArrayList<Integer> notes = new ArrayList<Integer>();
        for (String line : midiMap) {
            String[] splitLine = line.split(" ");
            if (splitLine[1].indexOf(note) != -1) {
                notes.add(Integer.parseInt(splitLine[0]));
            }
        }
        return findFirstNote(notes, range);
    }

    /**
     * Finds the first note in the given range
     * @param notes all ints of the same musical note
     * @param range lower bound of musical note
     * @return the int representing the musical note
     */
    private static int findFirstNote(ArrayList<Integer> notes, int range) {
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i) >= range) {
                return notes.get(i);
            }
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

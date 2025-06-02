package com.heytony;

import java.util.Scanner;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        Scanner input = new Scanner(System.in);

        System.out.print("What chord do you want to play?: ");
        String rootNote = input.nextLine();
        System.out.print("Major or Minor?: ");
        String chordType = input.nextLine();

        if (chordType.toLowerCase().equals("major")) {
            for (int note : NoteCreator.getMajorChord(rootNote)) {
                bird.playNote(note, 16);
                bird.pause(0.5);
            }
        } else if (chordType.toLowerCase().equals("minor")) {
            for (int note : NoteCreator.getMinorChord(rootNote)) {
                bird.playNote(note, 16);
                bird.pause(0.5);
            }
        } else {
            System.out.println("Sorry, not a valid option. Run this program again.");
        }

        input.close();
        bird.stopAll();
        bird.disconnect();
    }
}

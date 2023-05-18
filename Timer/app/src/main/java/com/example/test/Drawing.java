package com.example.test;

import java.util.Random;

public class Drawing {

    private final Random random = new Random();
    private final int[] numberScramble1 = new int[10];
    private final int[] numberScramble2 = new int[8];
    private String fullScramble1 = "";
    private String fullScramble2 = "";

    public String drawingFirst() {
        for (int i = 0; i < 10; i++) numberScramble1[i] = random.nextInt(18) + 1;
        for (int scramble : numberScramble1) {
            switch (scramble) {
                case 1:
                    fullScramble1 += "L ";
                    break;
                case 2:
                    fullScramble1 += "R ";
                    break;
                case 3:
                    fullScramble1 += "U ";
                    break;
                case 4:
                    fullScramble1 += "D ";
                    break;
                case 5:
                    fullScramble1 += "B ";
                    break;
                case 6:
                    fullScramble1 += "F ";
                    break;
                case 7:
                    fullScramble1 += "L' ";
                    break;
                case 8:
                    fullScramble1 += "R' ";
                    break;
                case 9:
                    fullScramble1 += "U' ";
                    break;
                case 10:
                    fullScramble1 += "D' ";
                    break;
                case 11:
                    fullScramble1 += "B' ";
                    break;
                case 12:
                    fullScramble1 += "F' ";
                    break;
                case 13:
                    fullScramble1 += "L2 ";
                    break;
                case 14:
                    fullScramble1 += "R2 ";
                    break;
                case 15:
                    fullScramble1 += "U2 ";
                    break;
                case 16:
                    fullScramble1 += "D2 ";
                    break;
                case 17:
                    fullScramble1 += "B2 ";
                    break;
                case 18:
                    fullScramble1 += "F2 ";
                    break;
            }
        }
        return fullScramble1;
    }

    public String drawingSecond() {
        for (int i = 0; i < 8; i++) numberScramble2[i] = random.nextInt(18) + 1;
        for (int scramble : numberScramble2) {
            switch (scramble) {
                case 1:
                    fullScramble2 += "L ";
                    break;
                case 2:
                    fullScramble2 += "R ";
                    break;
                case 3:
                    fullScramble2 += "U ";
                    break;
                case 4:
                    fullScramble2 += "D ";
                    break;
                case 5:
                    fullScramble2 += "B ";
                    break;
                case 6:
                    fullScramble2 += "F ";
                    break;
                case 7:
                    fullScramble2 += "L' ";
                    break;
                case 8:
                    fullScramble2 += "R' ";
                    break;
                case 9:
                    fullScramble2 += "U' ";
                    break;
                case 10:
                    fullScramble2 += "D' ";
                    break;
                case 11:
                    fullScramble2 += "B' ";
                    break;
                case 12:
                    fullScramble2 += "F' ";
                    break;
                case 13:
                    fullScramble2 += "L2 ";
                    break;
                case 14:
                    fullScramble2 += "R2 ";
                    break;
                case 15:
                    fullScramble2 += "U2 ";
                    break;
                case 16:
                    fullScramble2 += "D2 ";
                    break;
                case 17:
                    fullScramble2 += "B2 ";
                    break;
                case 18:
                    fullScramble2 += "F2 ";
                    break;
            }
        }
        return fullScramble2;
    }
}

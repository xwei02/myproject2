package com.sylvie.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Hank", "Jack", "Karen", "Elva", "Benny"};
        int[] englishs = {90, 80, 60, 50, 40};
        int[] maths = {88, 75, 64, 56, 48};
        for (int i = 0; i < 5; i++) {
            if (i != 3) {
                System.out.println(names[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i] + maths[i]) / 2);
            }
        }
    }
}

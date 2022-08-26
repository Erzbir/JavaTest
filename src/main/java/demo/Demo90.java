package demo;

import java.util.Scanner;

class Demo90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            guess();
            System.out.print("Do you want to guss another word? Enter y or n:");
        } while (!scan.next().equals("n"));
    }

    public static void guess() {
        Scanner scan = new Scanner(System.in);
        String str = chooseWord();
        char s = 0;
        int count = 0;
        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp[i] = '*';
        }
        for (int m = 0; m < str.length(); ) {
            System.out.print("Enter a letter in word " + String.valueOf(temp) + " > ");
            s = scan.next().charAt(0);
            boolean flag = true;
            boolean flag2 = true;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < temp.length; j++) {
                    if (s == temp[i] && flag) {
                        System.out.print(s + " is already in the word\n");
                        flag2 = false;
                        flag = false;
                        break;
                    }
                }
                if (str.charAt(i) == s && flag2) {
                    temp[i] = s;
                    m++;
                    flag = false;
                }
            }
            if (flag) {
                count++;
                System.out.print(s + " is not in the word\n");

            }
        }
        System.out.println("The word in " + str + " you missed " + count + " time");
    }

    public static String chooseWord() {
        String[] words = {"write", "apple", "that", "program", "stream"};
        int index = (int) Math.floor(Math.random() * 5);
        return words[index];
    }
}
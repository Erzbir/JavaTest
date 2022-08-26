package demo;

import java.util.Random;
import java.util.Scanner;

public class Demo48 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int comCount = 0;
        int usrCount = 0;
        while (comCount != 2 && usrCount != 2) {
            System.out.print("scissor(0), rock(1), paper(2):");
            int usr = input.nextInt();
            int com = random.nextInt(3);
            String s = "";
            switch (com) {
                case 0:
                    s += "The computer is scissor.";
                    break;
                case 1:
                    s += "The computer is rock.";
                    break;
                case 2:
                    s += "The computer is paper.";
                    break;
            }
            switch (usr) {
                case 0:
                    s += "You are scissor.";
                    break;
                case 1:
                    s += "You are rock.";
                    break;
                case 2:
                    s += "You are paper.";
                    break;
            }
            if (usr == com) {
                s += "It is a draw.";
            } else if (usr - com == 1 || usr - com == -2) {
                s += "You won";
                usrCount++;
            } else {
                s += "You lose";
                comCount++;
            }
            System.out.println(s);
        }
        if (comCount == 2) {
            System.out.println("Finally Computer win!");
        } else {
            System.out.println("Finally User win!");
        }
    }
}
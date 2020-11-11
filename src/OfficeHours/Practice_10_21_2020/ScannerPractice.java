package OfficeHours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        String grade = " ";

        if (score >+ 0 && score <= 100){
            if(score >90){
                grade = "A";
            }else if(score <90 && score >= 80){
                grade = "B";
            }else if(score < 80 && score >= 70){
               grade = "C";
            }else if(score >= 60){
                grade = "D";
            }else{
                grade = "F";
            }

        }else{
            grade = "Invalid";
        }

        System.out.println(grade);


    }
}

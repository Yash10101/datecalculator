

import java.util.Scanner;

class DateCalculator {
    int day;
    int year;
    
    DateCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        day = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    void calculateDate() {
        int[] NoOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            NoOfDays[1] = 29;
        }

        int dd = day;
        int mm = 1;

        for (int i = 0; i < 12; i++) {
            if (dd <= NoOfDays[i]) {
                break;
            } 
            else {
                dd = dd - NoOfDays[i];
                mm++;
            }
        }
        System.out.println("Date: " + dd + "/" + mm + "/" + year);
    }

    void weekOfTheDay() {
        int week = day / 7 ;
        System.out.println("The week of the year is: " + week);
    }

    void isLeapYear() {
        boolean b;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
         b=true;   
        }
        else {
            b=false;
        }
        System.out.println("Leap year: " + b);
        
    }
}

public class Main {
    public static void main(String[] args) {
        DateCalculator d = new DateCalculator();
        d.calculateDate();
        d.weekOfTheDay();
        d.isLeapYear();
    }
}
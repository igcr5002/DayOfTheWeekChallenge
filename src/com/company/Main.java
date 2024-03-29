package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(5);
        printDayOfTheWeek2(5);
        getDaysInMonth(3,2020);

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {

            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }

    }
    public static boolean isLeapYear (int year) {

        if (year<1 || year>9999) {
            return false;
        } else {

            if ((year%4==0  && year%100!=0) || year%400==0) {
                return true;
            } else return false;

        }

    }

    public static int getDaysInMonth (int month, int year) {

        if (month<1 || month>12) return -1;
        else if (year<1||year>9999) return -1;
        else {

            if (isLeapYear(year)&&month==2) return 29;
            else {

                switch (month) {

                    case 1:case 3:case 5:case 7:case 8:case 10:case 12: return 31;
                    case 4:case 6:case 9:case 11: return 30;
                    case 2: return 28;
                    default: return -1;


                }
            }
        }

    }

    public static void printDayOfTheWeek2 (int day) {

        if (day==0) System.out.println("Monday");
        else if (day==1) System.out.println("Tuesday");
        else if (day==2) System.out.println("Wednesday");
        else if (day==3) System.out.println("Thursday");
        else if (day==4) System.out.println("Friday");
        else if (day==5) System.out.println("Saturday");
        else if (day==6) System.out.println("Sunday");
        else System.out.println("Invalid day");

    }
}

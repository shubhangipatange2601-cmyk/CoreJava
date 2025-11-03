package TestPackage;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Question5 {
    public static void main(String[] args) {
        //Weekday Name from Number
        int Week = 3;
        String WeekName;
        switch (Week){

            case 1:
                WeekName = "Monday";
                break;

            case 2:
                WeekName = "Tuesday";
                break;

            case 3:
                WeekName = "Wednesday";
                break;

            case 4:
                WeekName = "Thursday";
                break;

            case 5:
                WeekName = "Friday";
                break;

            case 6:
                WeekName = "Saturday";
                break;

            case 7:
                WeekName = "Sunday";
                break;

            default:
                WeekName = "Invalid Week";
        }
        System.out.println(3 + WeekName);
        }
    }


package TestPackage;

public class Question7 {
    public static void main(String[] args) {
        int Monthdays = 29;
        String MonthName ;

        //Switch case
        switch (Monthdays){

            case 1:
                MonthName= "jan";
                Monthdays = 31;
                break;
            case 2:
                MonthName = "Feb";
                if(2016 %400 == 0 ){
                    Monthdays = 28;
                }else {
                    Monthdays = 29;
                }
                break;
            case 3:
                MonthName = "Mar";
                Monthdays = 31;
                break;
            case 4:
                MonthName = "April";
                Monthdays = 30;
                break;
            case 5:
                MonthName = "May";
                Monthdays = 31;
                break;
            case 6:
                MonthName = "June";
                Monthdays = 30;
                break;
            case 7:
                MonthName = "July";
                Monthdays = 31;
                break;
            case 8:
                MonthName = "Aug";
                Monthdays = 31;
                break;
            case 9:
                MonthName = "Sep";
                Monthdays = 30;
                break;
            case 10:
                MonthName = "Oct";
                Monthdays = 31;
                break;
            case 11:
                MonthName = "Nov";
                Monthdays = 30;
                break;
            case 12:
                MonthName = "Dec";
                Monthdays = 31;
                break;
        }        System.out.println( "February" + 2016 + " has " + Monthdays + " days");
    }

    }


package FlowControlStatements;

public class SwitchCase1 {
    public static void main(String[] args) {

        int Month = 9;
        String MonthName;

        //Switch case
        switch (Month){
            case 1:
                MonthName= "january";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "july";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                MonthName = "Invalid Month";

        }
        System.out.println("This Month is" + MonthName);
    }
}

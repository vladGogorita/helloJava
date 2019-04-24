public class MonthPicker {

    public static int pickMonth(String month){
        int noOfDays;

        switch(month) {
            case "January": noOfDays = 31;
            break;
            case "February": noOfDays = 28;
            break;
            case "March": noOfDays = 31;
            break;
            case "April": noOfDays = 30;
            break;
            case "May": noOfDays = 31;
            break;
            case "June": noOfDays = 30;
            break;
            case "July": noOfDays = 31;
            break;
            case "August": noOfDays = 31;
            break;
            case "September": noOfDays = 30;
            break;
            case "October": noOfDays = 31;
            break;
            case "November": noOfDays = 30;
            break;
            case "December": noOfDays = 31;
            break;
            default: noOfDays = 0;
            break;
        }

        return noOfDays;
    }
}

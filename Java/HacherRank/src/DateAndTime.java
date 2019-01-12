import java.util.Scanner;

public class DateAndTime {
    Scanner scanner = new Scanner(System.in);
    public String run(){
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        int months[] = {0 , 31 , 28 , 31 , 30 , 31  , 30 , 31 , 31 , 30 , 31 , 30 , 31};
        String days[] = {"MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY" , "SUNDAY" };
        int todayDay = 1 , todayMonth = 1 , todayYear = 2000;
        int week = 5 ;
        /*while(todayDay + todayMonth * 100 + todayYear * 10000 > day + month * 100 + year * 10000){
            if((todayYear % 4 == 0 && todayYear % 100 != 0) || (todayDay % 400 == 0))
                months[1] = 29;
            else
                months[1] = 28;

            if (todayYear == 2016){
                System.out.println(months[1]);
                return "Ywa";
            }
            todayDay -- ;
            if(todayDay == 0){
                todayMonth -- ;
                if(todayMonth == 0){
                    todayYear -- ;
                    todayMonth = 12 ;
                }
                todayDay = months[todayMonth];
            }
            week -- ;
            if(week == -1)
                week = 6 ;
        }*/
        //todayDay + todayMonth * 100 + todayYear * 10000 < day + month * 100 + year * 10000
        while(todayDay != day || todayMonth != month || todayYear != year){
            if((todayYear % 4 == 0 && todayYear % 100 != 0) || (todayYear % 400 == 0))
                months[2] = 29;
            else
                months[2] = 28;
            todayDay ++ ;
            if(todayDay > months[todayMonth]){
                todayMonth ++ ;
                if(todayMonth > 12){
                    todayYear ++ ;
                    todayMonth = 1 ;
                }
                todayDay = 1;
            }
            week ++ ;
            if(week > 6)
                week = 0 ;
        }
        return days[week];
    }
}

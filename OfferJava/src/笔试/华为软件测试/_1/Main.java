package 笔试.华为软件测试._1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        //System.out.println(month+" "+day);
        Date date = new Date();
        date.setYear(2018);
        date.setMonth(month-1);
        date.setDate(day-1);
        //System.out.println(date);
        System.out.println(getWeek(date));
    }

    //根据日期取得星期几
    public static String getWeek(Date date){
        String[] weeks = {"7","1","2","3","4","5","6"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;

        if(week_index<0){
            week_index = 0;
        }
        return weeks[week_index];
    }


}

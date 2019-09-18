/**
 *  Outputs the range of dates for KYC form in format  dd-mm-yyyy dd-mm-yyyy
 *  Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
 *  When filling it up you cannot use a future date for the form date.
 *
 * Author : Gautam Meena
 * Date : 19 September 2019
 * Time Complexity : O(nlog(n))
 **/


package com.java.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYCform {


    private void printRange(Date regDate, Date currDate, Date beforeDate, Date afterDate, Calendar cal, int nyear){

        /**
         * this method checks whether range of dates is correct for corresponding registration date.
         *
         */

        String res = null;
        String res1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


        // this condition is for when current date is falling before 30 days before registration date anniversary.
        if(currDate.before(beforeDate) || currDate.equals(beforeDate)){
            if(regDate.getYear() == (beforeDate.getYear() - 1) || regDate.getYear() == currDate.getYear()){
                System.out.println("No Range");
                return;
            }
            cal.set(Calendar.YEAR, nyear - 1);
            res = sdf.format(beforeDate);
            res1 = sdf.format(afterDate);
            System.out.println(res + " " + res1);
        }

        // this condition if for when current date is falling after registration but before 30 days after
        // registration date anniversary.
        else if(currDate.before(afterDate)){
            res = sdf.format(beforeDate);
            res1 = sdf.format(currDate);
            System.out.println(res + " " + res1);
        }

        // this is for when current date is falling after 30 days of registration day anniversary.
        else{
            res = sdf.format(beforeDate);
            res1 = sdf.format(afterDate);
            System.out.println(res + " " + res1);
        }

    }




    private void dateFormat(String rd, String cd) throws ParseException {

        /**
         * i parsed registration date(rd) and current date(cd) using SimpleDateFormat API and
         * set the time of Calendar object which stores time
         * after that range date is calculated using set function,
         */

        String[] ds = cd.split("-");
        int nyear = Integer.parseInt(ds[2]);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();

        cal.setTime(sdf.parse(rd));
        Date regDate = cal.getTime();

        cal1.setTime(sdf.parse(cd));
        Date currDate = cal1.getTime();


        //Base Case : when current date is before 1st anniversary or within same year of sign up.
        if(currDate.getYear() == regDate.getYear()){
            System.out.println("No Range");
            return;
        }

        cal.set(Calendar.YEAR, nyear);

        // before registration date
        cal.add(Calendar.DATE, -30);
        Date beforeDate = cal.getTime();


        // after registration date +30 days
        cal.add(Calendar.DATE, 60);
        Date afterDate = cal.getTime();

        printRange(regDate, currDate, beforeDate, afterDate, cal, nyear);


    }



    public static void main(String[] args) throws ParseException {
        KYCform obj = new KYCform();

        // taking input from user
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        String s;
        for(int i = 0; i < t; i++){
            s = inp.nextLine();

            String[] dates = s.split(" ");

            String regDate = dates[0];
            String currDate = dates[1];

            obj.dateFormat(regDate, currDate);


        }
    }
}

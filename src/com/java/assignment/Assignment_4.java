package com.java.assignment;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment_4 {


    private void dateFormat(String rd, String cd) throws ParseException {


        String[] ds = cd.split("-");
        int nyear = Integer.parseInt(ds[2]);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();

        cal.setTime(sdf.parse(rd));
        Date regDate = cal.getTime();

        cal1.setTime(sdf.parse(cd));
        Date currDate = cal1.getTime();


        //Base Case
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

        String res = null;
        String res1 = null;


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

        else if(currDate.before(afterDate)){
            res = sdf.format(beforeDate);
            res1 = sdf.format(currDate);
            System.out.println(res + " " + res1);
        }

        else{
            res = sdf.format(beforeDate);
            res1 = sdf.format(afterDate);
            System.out.println(res + " " + res1);
        }

    }



    public static void main(String[] args) throws ParseException {
        Assignment_4 obj = new Assignment_4();

        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String s = inp.nextLine();
        for(int i = 0; i < t; i++){
            s = inp.nextLine();

            String[] dates = s.split(" ");

            String regDate = dates[0];
            String currDate = dates[1];

            obj.dateFormat(regDate, currDate);


        }
    }
}

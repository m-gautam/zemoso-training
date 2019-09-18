package gautam.assignment.singleton;

import java.awt.*;

public class Assignment_5b {

    //private String str;
    private static String str;
    /**
     *    Error : non-static member variable can't be referenced through static variable.
     *    as static members of a class are connected with class itself not with instances.
     */
    public static Assignment_5b print(String s){
        str = s;

        return new Assignment_5b();
    }

    public void printField(){
        System.out.println(str);
    }

}

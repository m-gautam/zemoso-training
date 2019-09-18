package com.java.assignment.inheritance;


class Base {
    Base() {
        System.out.println("Base Class");
    }

    public void group() {
        //System.out.println("they are mammals");
    }

    public void characterstics() {
        //System.out.println("they have incissors");
    }
}

class Rat extends Base {

    Rat(){
        System.out.println("Rat class");
    }

    @Override
    public void group(){
        System.out.println("Rat is mammal");
    }

    @Override
    public void characterstics(){
        System.out.println("Rat have incissors");
    }

}

class Gerbil extends Base {

    Gerbil(){
        System.out.println("Gerbil Class");
    }

    @Override
    public void group(){
        System.out.println("Gerbil is mammal");
    }

    @Override
    public void characterstics(){
        System.out.println("Gerbil have incissors");
    }

}

class  Hamster extends Base {

    Hamster(){
        System.out.println("Hamster Class");
    }

    @Override
    public void group(){
        System.out.println("Hamster is mammal");
    }

    @Override
    public void characterstics(){
        System.out.println("Hamster have incissors");
    }

}


public class Rodent {

    public static void main(String[] args){
        Base[] obj = new Base[3];
        obj[0] = new Rat();
        obj[0].group();
        obj[1] = new Gerbil();
        obj[2] = new Hamster();


    }


}



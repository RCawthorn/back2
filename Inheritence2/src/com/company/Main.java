package com.company;

public class Main {

    public static void main(String[] args) {
	Nationwide x =new Nationwide();
        Wow y =new Wow();

	x.message();
	x.hello();
	y.shout();
	x.a=15;
    }
}

class Bank{
    int a;
     public void message(){
         System.out.println("Welcome");

     }

}

class Nationwide extends Bank{

    public void hello(){
        System.out.println("To");
        a=20;
    }


}

class Wow extends Nationwide{
    public void shout(){
        System.out.println("Nationwide");

    }

}
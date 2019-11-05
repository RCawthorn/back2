package com.company;
class invalid{

    public static void main(String[] args) {
        int Physics = 135;int Chemistry = 51;int Maths = 100;
        double Total,percentage;
        int phy = Physics/100*60;
        int chem = Chemistry/100*60;
        int math = Maths/100*60;

        Total = Physics + Chemistry + Maths;
        percentage = Total*100/450;

        System.out.println("Physics results are: "+Physics);
        System.out.println("Chemistry results are: "+ Chemistry);
        System.out.println("Maths results are: "+Maths);
        System.out.println("Total marks overall are: "+Total);
        System.out.println("Overall percentage: " + percentage+"%");

        if(percentage>=60) {
            System.out.println("You would of passed ");

            if (phy >= 60) {
                System.out.println("Physics passed");
                if(phy<=60){
                    System.out.println("No");
                }
            }
            if (chem >= 60) {
                System.out.println("Chemsitry passed");
                if(chem<=60){
                    System.out.println("");
                }
            }

            if (math >= 60) {
                System.out.println("Maths passed");
            }

        }
        else if(chem<=60){
            System.out.println("You have failed overall");
        }
    }
}
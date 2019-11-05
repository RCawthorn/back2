package com.company;
class Accounts{
    public static void main(String[] args) {
        Account ac = new Account();
        ac.Tax();
        ac.Tax(2000);
        ac.Tax(3000,15);

        Exam school = new Exam(400);
        Exam college = new Exam(600);
        school.showResults(300);
        college.showResults(400);
    }
}


class Account{
    public void Tax() {
        System.out.println("Tax rate is " + 21);
    }

    public void Tax(int salary) {
        float t = (float) salary *21 / 100;
        System.out.println("Your tax is " + t);
    }

    public void Tax(int sal, int rate) {
        float t = (float) sal * rate / 100;
        System.out.println("Your tax is " + t);

    }

}


class Exam{
    private int totalmarks;
      public Exam(int marks){
        totalmarks = marks;
    }

    public void showResults(int markstot){
          float per =(float) markstot*100/totalmarks;
             if (per<=60) {

                 System.out.println("Fail");
             }
                  else
                      System.out.println("You have passed");

      }

}




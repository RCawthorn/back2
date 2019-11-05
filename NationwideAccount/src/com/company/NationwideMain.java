package com.company;


class NationwideMain {

    public static void main(String[] args) {
        // write your code here

        NationwideAccounts ref = new NationwideAccounts();
        try {
            ref.NetSalary(2000, 2);

        } catch (AbstainException e) {

            System.out.println("Something");
        }
    }
}
class NationwideAccounts{

    public void NetSalary(int Salary, int Abstain) throws AbstainException{

        float Tax=0;
            float    Net=0;
          if (Abstain>5){
              AbstainException E1 = new AbstainException();
              throw E1;
          }
          Tax = Salary*21/100;
          Net=Salary-Tax;
          System.out.println("Your salary before Tax is " + Salary);
          System.out.println("Net salary "+Net);
       }
}


class AbstainException extends Exception{

}

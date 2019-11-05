package com.company;

public class Bank {
    int x;

    static int Dollar;

    public void setDollar(int a) {
        Dollar = a;
    }

    public void Amount(int B) {
        System.out.println(B * Dollar);
    }
}

    class TestBank {
        public static void main(String[] args) {

          /*  Bank hsbc, barclays, nbs;
            hsbc = new Bank();
            barclays = new Bank();
            nbs = new Bank();
            Bank.Dollar = 100;
            hsbc.Amount(2);
            nbs.Amount(3);
            barclays.setDollar(200); */
            String no1,no2;
            float Result;
            no1 = "rekt";
            no2 = "m9";

            try {
                Result = (float)Integer.parseInt(no1)/Integer.parseInt(no2);
                System.out.println("Result" + Result);
            }
            catch (ArithmeticException x){
                System.out.println("What are you doing? You cannot divide by zero!!");
            }
            catch (NumberFormatException e){
                System.out.println("This can only be digits you Fool!");
            }

            catch(Exception e){
                System.out.println("Something went horribly wrong");
            }
 /*           StaticTest ref2=new StaticTest();
             StaticTest ref=new StaticTest();
             ref.A =15;
             ref.Boom(); */
        }
    }

/*class StaticTest{
    int A;
     public  void Boom(){
         A=15;
         System.out.println(A);
     }
}

*/

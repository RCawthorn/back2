package com.company;

public class Main {
    public static void main(String[] args) {
        stringProcessing str = new stringProcessing();
       //str.Printvertical("Hello my friends, i hate you","");
      //Find str = new Find();
       str.Find("hello,hello,how are you,hellomet", "hello");
      //  Reverse Str = new Reverse();
       // System.out.println("Reverse of the given string is : " + Str);
       // wow x; x = new wow();
     //   x.Marks();


    }
}



  class stringProcessing {

      public void Find(String msg, String lookfor){
          String Word = "", Beta;
          int i = 0; int count = 0;
          String changeCase = msg;

            for (i=0;i<msg.length();i++) {
                Beta=msg.substring(i,i+1);
                   if(Beta.equals(lookfor.substring(0,1))) {


                       if (msg.substring(i, i + lookfor.length()).equals(lookfor)) {
                           count++;
                           i += lookfor.length() - 1;
                       }
                   }
             }
            System.out.println(count);
      }





     public void Printvertical (String msg,String lookfor){

              String word = "", Alpha;
              int i = 0; int mark =55;


         for (; i < msg.length(); i++) {
                  Alpha = msg.substring(i, i + 1);
                  if (Alpha.equals(" ")) {

                      System.out.println(word);
                      word = "";
                  } else word += Alpha;

              }

              System.out.println(word);
          }

      }

    class Reverse {
        public String reverse(String str) {
            String Str = "Hello Friends";

            if (Str == null || Str.equals(" "))
                return Str;

            return Str.charAt(str.length() - 1) +
                    reverse(Str.substring(0, Str.length() - 1));
        }
    }
/*class parent{
    int mark =55;
}

class wow extends parent {
    public void Marks() {

System.out.println(mark);
        System.out.println("Help me");
    }
}

*/
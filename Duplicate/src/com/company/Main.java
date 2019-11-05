package com.company;


public class Main {

    public static void main(String[] args) {
        String msg = "Hello, hello How are you";
        stringProcessing str = new stringProcessing();


    }
}

class stringProcessing{


    public void Find (String msg, String lookfor){
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
        System.out.println(word);
    }

}
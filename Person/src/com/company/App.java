package com.company;

class App{


    public static void main(String[] args) {
       Greeting g = new Greeting();
      //  g.greeting (new Friend());
      // g.greeting(new Enemy());
       Person Friend = new Friend();
       Person Enemy = new Enemy();
       g.greeting(Friend);
        g.greeting(Enemy);
    }
}

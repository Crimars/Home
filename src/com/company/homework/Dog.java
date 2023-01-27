package com.company.homework;


public class Dog extends Animals {
    public Dog(int run, int swim) {
        super(run, swim);
    }

    public void run(int a) {
      if(a<=500){
            System.out.println("собака пробежала " + a + " м" );
      }
      else{
          System.out.println("столько не бежит");
        }
    }
    public void swim(int b){
        if(b<=10){
            System.out.println("собака проплыла: " + b + " м");
                    } else{
            System.out.println("столько не плывет");}
        }


}


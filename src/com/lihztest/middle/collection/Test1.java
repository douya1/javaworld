package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        //fun1();
        //fun2();
        //fun3();
        //fun4();
        searchHero();
    }

    static  void searchHero(){
        ArrayList<Hero> heroes = initList();
        for (Hero h: heroes){
            if(h.toString().equals("hero1")){
                System.out.println("Have hero Hero1!");
                break;
            }
        }
    }

    static void fun4(){
        ArrayList heroes = initList();
        System.out.println(heroes);

        ArrayList<Hero> h2 = new ArrayList();
        h2.add(new Hero("Bde Hero1"));
        h2.add(new Hero("Bde Hero2"));
        h2.add(new Hero("Bde Hero3"));

        heroes.addAll(3,h2);
        System.out.println(heroes);
    }

    static void fun3(){
        ArrayList heroes = initList();
        System.out.println(heroes);

        Hero[] hs = (Hero[]) heroes.toArray(new Hero[]{});

        for(int i=0;i<hs.length; i++){
            System.out.println(hs[i]);
        }
    }

    static void  fun1(){
        ArrayList<Hero> heroList = new ArrayList<>();
        for(int i=0; i<5; i++){
            Hero hero = new Hero("hero"+i);
            heroList.add(hero);
        }
        System.out.println(heroList);

        Hero newHero =  new Hero("special Hero");
        heroList.add(2,newHero);
        System.out.println(heroList);

        /*for(Hero hero:heroList){
            System.out.println(hero);
        }*/
    }

    static void fun2(){

        ArrayList<Hero> heroes = initList();
        System.out.println();

        System.out.println(heroes.get(4));
        System.out.println(heroes.get(5));
        System.out.println(heroes.get(6));


    }

    static ArrayList<Hero> initList()
    {
        ArrayList<Hero> heroList = new ArrayList<>();
        for(int i=0; i<5; i++){
            Hero hero = new Hero("hero"+i);
            heroList.add(hero);
        }
        Hero newHero =  new Hero("special Hero");
        heroList.add(2,newHero);
        return heroList;
    }
}

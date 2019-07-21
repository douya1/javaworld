package com.lihztest.middle.Lambda;

import com.lihztest.oot.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnonymousTest {
    public static void main(String[] args) {

        Random r = new Random();
        List<Hero> as = new ArrayList<Hero>();
        for(int i=0;i<10;i++){
            as.add(new Hero("hero-"+i, r.nextInt(1000)));
        }
        System.out.println(as);

//        HeroCheck hCheck = new HeroCheck() {
//            @Override
//            public boolean test(Hero h) {
//                return h.getHp()>500;
//            }
//        };
//        filter(as,hCheck);
        //filter(as,s->s.getHp()>500);
        //filter(as,h->testHero(h));
        //filter(as, AnonymousTest::testHero);

        //AnonymousTest anonymousTest = new AnonymousTest();
       // filter(as, anonymousTest:: testHero2);
        //filter(as, h->h.macthed());
        filter(as, Hero::macthed);

    }

    public static boolean testHero(Hero h){
        return h.getHp()>500;
    }

    public  boolean testHero2(Hero h){
        return h.getHp()>500;
    }

    private static void filter(List<Hero> heros, HeroCheck hcheck){
        for(Hero h:heros){
            if(hcheck.test(h)){
                System.out.println(h);
            }
        }
    }
}

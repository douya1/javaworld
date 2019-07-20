package com.lihztest.middle.collection;

import com.lihztest.oot.Hero;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {

//        reverse();
//        shuffle();
      //  sort();
//        swap();
//        rotate();
        //test();;
        //listDoTimeTest();
        sortHero1();
        //treeSetSort();
    }

    static void treeSetSort(){
        Random r = new Random();
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        TreeSet<Integer> ti= new TreeSet<>(c);
        for(int i=0;i<10;i++){
            ti.add(r.nextInt(100));
        }
        System.out.println(ti);
    }

    static void sortHero2(){


        Random r = new Random();
        ArrayList<Hero> hs = new ArrayList<>();
        for(int i = 0; i< 10;i++) {
            hs.add(new Hero("hero-" + i, r.nextInt(100)));
        }
        System.out.println(hs);
        Collections.sort(hs);
        System.out.println(hs);
    }

    static void sortHero1(){
        Random r = new Random();
        ArrayList<Hero> hs = new ArrayList<>();
        for(int i = 0; i< 10;i++) {
            hs.add(new Hero("hero-" + i, r.nextInt(100)));
        }
      /*  Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getHp()>o2.getHp()?1:-1;
            }
        };*/
        System.out.println(hs);
        //Collections.sort(hs,c);
        Collections.sort(hs,((o1,o2)->o1.getHp()>o2.getHp()?1:-1));
        System.out.println(hs);
    }

    static void listDoTimeTest(){

        ArrayList<Hero> list =  new ArrayList<Hero>();
        for(int i=0; i<200*100*100;i++){

            list.add(new Hero("hero-"+i));
        }
        for(int i=0; i<10; i++){
            long start = System.currentTimeMillis();
            Collections.shuffle(list);
            String temp = "hero-1000000";
            for(Hero h:list)
                if(temp.equals(h.getName()))
                    break;
            long end = System.currentTimeMillis();
            System.out.printf("the %d excute times is %d ms\n", i,end-start);
        }
    }

    static void test(){
        ArrayList<Integer> list = getList();

        System.out.println(list);
        int number = 0;
        for(int i=0;i<1000000;i++){
            Collections.shuffle(list);

            if(list.get(0).equals(Integer.valueOf("3"))
                && list.get(1).equals(Integer.valueOf("1"))
                && list.get(2).equals(Integer.valueOf("2")))
                number++;
        }
        System.out.println("3-1-2 has been appear for "+ number +"number of times");
    }

    static void rotate(){
        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.rotate(list,1);
        System.out.println(list);
        Collections.synchronizedList(list);
    }

    static  void swap(){
        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.swap(list,0,8);
        System.out.println(list);
    }

    static void sort(){
        ArrayList<Integer> list ;
        list = shuffle();

        Collections.sort(list);
        System.out.println(list);

    }

    static ArrayList<Integer> shuffle(){

        ArrayList<Integer> list = getList();
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        return list;
    }

    static void reverse(){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){

            list.add(Integer.valueOf((int)(Math.random()*10)));
        }
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

    static ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++){

            list.add(Integer.valueOf(i));
        }
        return list;
    }
}

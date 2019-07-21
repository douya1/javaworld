package com.lihztest.oot;

public class Hero implements Col,Comparable<Hero>{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name; //名字
    float hp;  //血量

    public Hero(String name){
        this.name = name;
    }

    public Hero(){
        super();
    }

    public float getHp() {
        return hp;
    }

    public  Hero(String name , int hp){
        this.name =name;
        this.hp =hp;
    }

    public void attackHero(Hero hero) throws EnemyHeroIdDeadException {
        if(hero.hp == 0)
        {
            throw new EnemyHeroIdDeadException(hero.name + "is die");
        }
    }


    @Override
    public int compareTo(Hero o) {
        if(hp>= o.getHp())
            return 1;
        else
            return -1;
    }

    class EnemyHeroIdDeadException extends Exception{
        public EnemyHeroIdDeadException(){

        }
        public EnemyHeroIdDeadException(String msg){
            super(msg);
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "ganren";
        garen.hp = 616;

        Hero teemo = new Hero();
        teemo.name = "teemo";
        teemo.hp = 0;

        try {
            garen.attackHero(teemo);
        } catch (Exception e) {
            System.out.println("异常的原因是: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public boolean  macthed(){
        return this.hp >500;
    }
}

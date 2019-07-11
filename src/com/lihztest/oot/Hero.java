package com.lihztest.oot;

public class Hero implements Col{

    String name; //名字
    float hp;  //血量

    public Hero(String name){
        this.name = name;
    }

    public Hero(){
        super();
    }

    public void attackHero(Hero hero) throws EnemyHeroIdDeadException {
        if(hero.hp == 0)
        {
            throw new EnemyHeroIdDeadException(hero.name + "is die");
        }
    }
    public String toString(){
        return name;
    }

    class EnemyHeroIdDeadException extends Exception{
        public EnemyHeroIdDeadException(){

        }
        public EnemyHeroIdDeadException(String msg){
            super(msg);
        }
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
}

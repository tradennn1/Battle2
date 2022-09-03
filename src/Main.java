public class Main {

    private static Boss boss;
    public static void main(String[] args) {
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println("Heroes :" + createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroHealth() + " "
                    +  createHeroes()[i].getHeroesAttackType());

        }

        System.out.println("Boss");
        boss = new Boss(400, 30, "Магическая защита");
        System.out.println("Health :" + boss.getBossHealth() + " \nDamage :" + boss.getBossDamage()
                + " \nDefense type :" + boss.getBossDefenseType());
    }

    public static Hero[] createHeroes(){
        Hero simba = new Hero(200,25,"freaz shoot");
        Hero timon = new Hero(250,30,"fire shoot");
        Hero pumba = new Hero(250,20,"foot shoot");
        Hero[] array = {simba,timon,pumba};
        return array;
    }
}
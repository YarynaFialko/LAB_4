package lotr;

public class GameManager {

    public void fight(Character c1, Character c2){
        String c1_name = c1.getClass().getSimpleName();
        String c2_name = c2.getClass().getSimpleName();
        System.out.println("START OF THE FIGHT");
        System.out.println(c1_name + " VS " + c2_name);
        System.out.println(c1_name + "  Health: "+ c1.getHp() + " Power : " + c1.getPower());
        System.out.println(c2_name + "  Health: "+ c2.getHp() + " Power : " + c2.getPower());

        while (c1.isAlive() && c2.isAlive()){
            System.out.println("  ");

            System.out.println(c1_name + "  Health: "+ c1.getHp() + " Power : " + c1.getPower());
            System.out.println(c2_name + "  Health: "+ c2.getHp() + " Power : " + c2.getPower());
            System.out.println(c1_name + " kicks " + c2_name);
            c1.kick(c2);
            System.out.println(c1_name + "  Health: "+ c1.getHp() + " Power : " + c1.getPower());
            System.out.println(c2_name + "  Health: "+ c2.getHp() + " Power : " + c2.getPower());
            System.out.println(" ");

            if (!c2.isAlive()){break;}
            System.out.println(c2_name + " kicks " + c1_name);
            System.out.println(c1_name + "  Health: "+ c1.getHp() + " Power : " + c1.getPower());
            System.out.println(c2_name + "  Health: "+ c2.getHp() + " Power : " + c2.getPower());
            c2.kick(c1);
            System.out.println(" ");
            System.out.println(c1_name + "  Health: "+ c1.getHp() + " Power : " + c1.getPower());
            System.out.println(c2_name + "  Health: "+ c2.getHp() + " Power : " + c2.getPower());

        }
        System.out.println("Game over");
    }
}

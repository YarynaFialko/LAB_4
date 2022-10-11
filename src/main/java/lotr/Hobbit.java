package lotr;


import kick.BasicKick;
import kick.CryKick;

public class Hobbit extends Character {

    public Hobbit(){
        super(3, 0);
    }

    @Override
    public void kick(Character c){
        toCry();
    }

    public void toCry(){
        System.out.println("Crying... :(");
    }


}

package lotr;

import lombok.Getter;

import java.util.Random;

@Getter
public class Character {
    private int power;
    private int hp;
    private final Random randomGenerator = new Random();

    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }
    public void kick(Character c){
        c.setHp(0);
    }

    public void  setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
    public void  setPower(int power){
        this.power = power;
    }

    public boolean isAlive(){
        return hp>0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

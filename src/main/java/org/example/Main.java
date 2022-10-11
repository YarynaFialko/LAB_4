package org.example;

import lotr.*;
import lotr.Character;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Character kk = CharacterFactory.createCharacter();
        System.out.println(kk.getClass());
        System.out.println(kk.getHp() + " "+  kk.getPower());
    }
}
package lotr;

import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;


public class CharacterFactory {

    public static Character createCharacter() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Random randomGenerator = new Random();
        Set<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class);
        Class cl = null;

        int j = 0;
        while (j != 1){
            j = new Random().nextInt(characters.size() - 1);
        }
        int i = 0;
        System.out.println(characters);
        for (Class character: characters) {
            if (i == j) {cl = character;}
            i++;
        }

        return (Character) cl.newInstance();

    }
}

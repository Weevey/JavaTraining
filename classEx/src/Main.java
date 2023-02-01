import superheroes.Abilities;
import superheroes.SuperBeing;

public class Main {
    public static void main(String[] args){
        //superBeing();
        superArray();
        //arrays();
        //wrapperClasses();
    }
    public static void superBeing() {
        SuperBeing ironMan = new SuperBeing();
        ironMan.setName("Tony Stark");
        ironMan.setAlias("IronMan");
        ironMan.setAge(53);
        ironMan.setLocation("Miami");
        ironMan.setAbility(Abilities.Flight);
        ironMan.setRace("Human");
        SuperBeing hulk = new SuperBeing("Bruce Banner", Abilities.Strength, 54);
        hulk.setLocation("Miami");
        hulk.setAlias("Hulk");
        hulk.setRace("Human");
        System.out.println(ironMan.getAge() + " " + ironMan.getAbility());
        SuperBeing spiderMan = new SuperBeing("Peter Parker", Abilities.Web_Spinning);
        System.out.println(spiderMan.getAbility());
        System.out.println("Name: " + ironMan.getName() + " - Alias: " + ironMan.getAlias() + " - Part of: " + ironMan.getSpecies());
        System.out.println(spiderMan.getSpecies());
        SuperBeing.heroList(ironMan);
        SuperBeing.heroList(hulk);
        SuperBeing.heroList(spiderMan);
        }

    public static void superArray() {
        SuperBeing[] newBeings = {new SuperBeing("Groot", Abilities.Strength,300), new SuperBeing("Rocket", Abilities.Creativity,12)};
        for (int i=0; i< newBeings.length; i++) {
            System.out.println("Name: " + newBeings[i].getName() + " - Ability: " + newBeings[i].getAbility() + " - Age: " + newBeings[i].getAge());
        }
        StringBuilder hero = new StringBuilder();
        for (SuperBeing being : newBeings) {
            hero.append("Name - ");
            hero.append(being.getName());
            hero.append(" | Ability - ");
            hero.append(being.getAbility());
            hero.append(" | Age - ");
            hero.append(being.getAge());
            hero.append("\n");
        }
        System.out.println(hero);

    }

    public static void arrays() {
        int[] anArray = {1, 2, 3, 4, 5, 6};
        System.out.println(anArray[1]);
        String[] words = { "Hi", "big", "Dog", "Pig"};
        System.out.println(words[0 + 1]);
        int[] oneToTen = new int[10];
        System.out.println(oneToTen[3]);
        String[] testing = new String[6];
        System.out.println(testing[4]);
        int[] nums = new int[10];
        for(int i=0; i < nums.length; i++) {
            nums[i] = i * 6;
//            System.out.println(oneToTen[i]);
        }
        for (int num : nums) {
            System.out.println(num/6 + " * 6 = " + num);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        SuperBeing[] being = {new SuperBeing("Steve", Abilities.Telekinesis, 42), new SuperBeing("Misty", Abilities.Speed, 1)};
        for (int i = 0; i < being.length; i++) {
            System.out.println(i + " " + being[i].getName());
        }
        for (SuperBeing s : being) {
            s.setAge(s.getAge() + 1);
            System.out.println(s.getAge());
        }
        String steve = "Steve";
        int lenSteve = steve.length();
        System.out.println(lenSteve);
        for (int i=0; i<lenSteve; i++) {
            System.out.println(steve.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Steve");
        sb.append(" Ayres");
        System.out.println(sb.reverse());

        System.out.println("String comparison: ");
        System.out.println("Steve" == "Steve");
        String s1 = "Steve".toUpperCase();
        String s2 = "STEVE";
        System.out.println(s1 == s2); // False
        System.out.println(s1.equals(s2)); // True
        String notParsed = "123";
        System.out.println(notParsed + 2); // String not as an int
        int parsed = Integer.parseInt("123"); // String as an int
        System.out.println(parsed + 2);
    }
    public static void wrapperClasses() {
        Integer num = 12; // object - can be null
        int prim = 12; // Primitive
        System.out.println(num);
        Integer test = null;
        System.out.println(test);
    }

    }



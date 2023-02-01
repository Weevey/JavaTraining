package superheroes;

public class SuperBeing {
    private String name;
    private String alias;
    private String race;
    private String status;
    private int age;
    private Abilities ability;
    private static String species = "Humanoid";
    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        SuperBeing.species = species;
    }

    public SuperBeing(String name, Abilities ability) {
        this.name = name;
        this.ability = ability;
    }
    public SuperBeing(String name, Abilities ability, int age) {
        this.name = name;
        this.ability = ability;
        this.age = age;
    }

    public SuperBeing() {
        this("Jeff", Abilities.Strength, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Not valid");
        }
        this.name = name;
    }
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Abilities getAbility() {
        return ability;
    }

    public void setAbility(Abilities ability) {
        this.ability = ability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    public static void heroList(SuperBeing hero) {
        System.out.println("Name: " + hero.getName() + " - Alias: " + hero.getAlias() + " - Ability: " + hero.getAbility());
    }
}

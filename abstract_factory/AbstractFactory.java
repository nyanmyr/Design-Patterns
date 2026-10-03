package abstract_factory;

// product families
interface Soldier {

    void describe();
}

interface Weapon {

    void describe();
}

interface Armor {

    void describe();
}

// concrete product family products
class Swordsman implements Soldier {

    public void describe() {
        System.out.println("The swordsman wields a sword and wears heavy armor.");
    }
}

class Sword implements Weapon {

    public void describe() {
        System.out.println("A sword is used for slashing and cutting down foes.");
    }
}

class HeavyArmor implements Armor {

    public void describe() {
        System.out.println("A heavy armor deflects strong blows.");
    }
}

class Archer implements Soldier {

    public void describe() {
        System.out.println("The archer wields a bow and wears light armor armor.");
    }
}

class Bow implements Weapon {

    public void describe() {
        System.out.println("A bow is used for striking foes from far away.");
    }
}

class LightArmor implements Armor {

    public void describe() {
        System.out.println("A light armor increases agility.");
    }
}

// abstract factory interface
interface Barracks {

    Soldier createSoldier();
    Weapon createWeapon();
    Armor createArmor();
}

// concrete abstract factories
class SwordsmanBarracks implements Barracks {

    public Soldier createSoldier() {
        return new Swordsman();
    }

    public Weapon createWeapon() {
        return new Sword();
    }

    public Armor createArmor() {
        return new HeavyArmor();
    }
}

class ArcherBarracks implements Barracks {

    public Soldier createSoldier() {
        return new Archer();
    }

    public Weapon createWeapon() {
        return new Bow();
    }

    public Armor createArmor() {
        return new LightArmor();
    }
}

// implementation
public class AbstractFactory {

    public static void main(String[] args) {

        Barracks swordsmanBarracks = new SwordsmanBarracks();
        Barracks archerBarracks = new ArcherBarracks();

        Soldier swordsman = swordsmanBarracks.createSoldier();
        Weapon sword = swordsmanBarracks.createWeapon();
        Armor heavyArmor = swordsmanBarracks.createArmor();

        Soldier archer = archerBarracks.createSoldier();
        Weapon bow = archerBarracks.createWeapon();
        Armor lightArmor = archerBarracks.createArmor();
        
        swordsman.describe();
        sword.describe();
        heavyArmor.describe();
        
        System.out.println();
        
        archer.describe();
        bow.describe();
        lightArmor.describe();
    }
}

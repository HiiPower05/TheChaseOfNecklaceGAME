public class Player {
    //these are my properties
    String name;
    int health;
    int xp;
    int attackPower;

    public Player(String name, int health, int xp, int attackPower) { // my constructor
        this.name = name;
        this.health = health;
        this.xp = xp;
        this.attackPower = attackPower;
        }
        // attack is a method
        public void attack(Enemy target) { // takes one parameter, an Enemy object which is named target
        target.takeDamage(attackPower); // we call takeDamage on the target
            System.out.println(name + " attacks " + target.nameE + " for " + attackPower + " damage!");
        }
        public void gainXP(int amount) {
        xp += amount;
            System.out.println(name + " gained " + amount + " XP. Total XP. Total XP: " + xp);
        }
    }

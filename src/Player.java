public class Player {
    String name;
    int health;
    int xp;
    int attackPower;

    public Player(String name, int health, int xp, int attackPower) {
        this.name = name;
        this.health = health;
        this.xp = xp;
        this.attackPower = attackPower;
        }
        public void attack(Enemy target) {
        attackPower -= target.healthE;
            System.out.println("Blade takes damage for " + attackPower);
        }
    }

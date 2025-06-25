public class Enemy {
    String nameE;
    int healthE;
    int attackPowerE;


    public Enemy(String nameE, int healthE, int attackPowerE) {
        this.nameE = nameE;
        this.attackPowerE = attackPowerE;
        this.healthE = healthE;
    }
    public void takeDamage(int damage) {
        healthE -= damage;
        if(healthE < 0) healthE = 0;
        System.out.println(nameE + " now has " + healthE + " HP.");
    }
    public boolean isAlive() {
        return healthE > 0;
    }
}
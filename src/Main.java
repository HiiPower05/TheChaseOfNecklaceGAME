public class Main {
    public static void main(String[] args) {
        Player player = new Player("Blade", 100, 56, 4);
        Enemy enemy = new Enemy("Goblin", 90, 4);

        player.attack(enemy);
        enemy.takeDamage(player.attackPower);
    }
}
/* Step 1.
 method for player to take damage. 1. Minus health
 method for enemy to take damage from player. 1. minus Health */

/*
Step 2.
method to randomize attack damage between the two characters.
but there is a set amount of attack power, so we use loop instead, while loop
 */
/*
Step 3.
After each kill of a goblin we would get an Exp.
 */
/*
sTEP 4.
An Exp cap, where you can level up once cap is full: SO add cap, different levels for character,
 */

public class GameCharacter
{
    private String name;
    private int health;
    private int attackPower;
    
    public GameCharacter(String name, int health, int attackPower)
    {
        this.name = name;
        this.health = health;
        this.attackPower;
    }
    
    public int takeDamage(int damage)
    {
        this.health - damage;
        return this.health;
    }
    
    public String getName(String name)
    {
        this.name = name;
        return this.name;
    }
    
    public int getAttackPower(int attackPower)
    {
        this.attackPower = attackPower;
        return this.attackPower;
    }
    
    public int getHealth(int health)
    {
        this.health = health;
        return this.health;
    }
    
    public String toString()
}
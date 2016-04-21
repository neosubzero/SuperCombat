public class Monster extends GameCharacter
{
    private int xp;
    
    public Monster(String name, int health, int attackPower, int xp)
    {
        super(name, health, attackPower);
        this.xp = xp;
    }
    
    public attack(player thePlayer)
    {
        
    }
    
    public takeTurn(player thePlayer)
    {
        
    }
    
    public int getXp()
    {
        return this.xp;
    }
    
    public String toSring()
    {
        
    }
}
public class Player extends GameCharacter
{
    private int mana;
    
    public class Player(String name, int health, int attackPower, int mana)
    {
        super(name, health, attackPower);
        this.mana = mana;
    }
    
    public attack(monster theMonster)
    {
        
    }
    
    public castSpell(monster theMonster)
    {
        
    }
    
    public chargeMana()
    {
        this.mana++;
        
    }
    
    public takeTurn(monster theMonster)
    {
        
    }
    
    public int getMana()
    {
        return this.mana;
    }
    
    public String toString()
    {
        
    }
}
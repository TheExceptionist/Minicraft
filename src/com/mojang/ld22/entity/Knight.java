class Knight extends Mob{
  private int lvl;
  private int armorValue;
  
  public Knight(int lvl, Material m){
    this.lvl = lvl;
    //static method in Armor.java
    armorValue = Armor.getArmorValue(m);
  }
  
  public void tick(){
    super.tick();
  }
  
  public int getArmorValue(Material armor){
	    if(armor == Material.steel){
	      return 10; 
	    }
	    if(armor == Material.reinforced_steel){
	      return 20; 
	    }
	    if(armor == Material.reinforced_iron){
	      return 15; 
	    }    
	    if(armor == Material.iron){
	      return 5; 
	    }
	}
}

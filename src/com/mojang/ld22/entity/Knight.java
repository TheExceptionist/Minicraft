class Knight extends Mob{
  private int lvl;
  private int armorValue;
  private boolean hasArmor;
  
  public Knight(int lvl, Material m){
    this.lvl = lvl;
    //static method in Armor.java
    armorValue = Armor.getArmorValue(m);
    
    if(armorValue > 0){
      hasArmor = true;
    }
  }
  
  public void tick(){
    super.tick();
  }
  
  public boolean isArmor(){
    return hasArmor;
  }
}

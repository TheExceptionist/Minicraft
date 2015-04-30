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
}

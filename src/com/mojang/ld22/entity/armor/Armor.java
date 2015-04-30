import com.mojang.ld22.item.Material;

class Armor{
  private Material Type;
  
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

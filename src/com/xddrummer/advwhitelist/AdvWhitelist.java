public class AdvWhitelist extends JavaPlugin {
  
  public static void onEnable(){
    getLogger().info("Enabling Advanced Whitelist by XDdrummer.");
    getLogger().info("If you downloaded this plugin from a source outside of PlanetMinecraft or Bukkit.org, please remove and download from XDdrummer's sources.");
    
    saveDefaultConfig();
    
    getServer().getPluginManager().registerEvents(new LoginListener, this);
    
  }
  
  public static void onDisable(){
    getLogger().info("Disabling Advanced Whitelist by XDdrummer.");
    getLogger().info("If you downloaded this plugin from a source outside of PlanetMinecraft or Bukkit.org, please remove and download from XDdrummer's sources.");
  }
  
  
  
}

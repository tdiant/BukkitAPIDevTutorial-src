package tdiant.helloplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tdiant.helloplugin.listener.DemoListener;

public class HelloPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new DemoListener(),this);
    }

}

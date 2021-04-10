package me.krymz0n.join;

import me.krymz0n.join.listeners.Join;
import me.krymz0n.join.listeners.Leave;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin implements Listener {
    private Logger log;

    @Override
    public void onEnable() {
        log = getLogger();
        PluginManager pm = getServer().getPluginManager();
        saveDefaultConfig();
        log.info("Setting up Player Join Messages by: KRYMZ0N");

        pm.registerEvents(this, this);
        pm.registerEvents(new Join(this), this);
        pm.registerEvents(new Leave(this), this);
    }
    @Override
    public void onDisable() {
        log.info("disabling Player Join Messages by: KRYMZ0N");
    }
}

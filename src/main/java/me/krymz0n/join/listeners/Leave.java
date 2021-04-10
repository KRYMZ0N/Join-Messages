package me.krymz0n.join.listeners;

import me.krymz0n.join.Main;
import me.krymz0n.join.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave implements Listener {
    private final Main plugin;

    public Leave(Main plugin) {
        this.plugin = plugin;
        FileConfiguration config = plugin.getConfig();
    }
    @EventHandler
    private void onPlayerQuit(PlayerQuitEvent evt) {
        Player p = evt.getPlayer();
        evt.setQuitMessage(Utils.chat(plugin.getConfig().getString("Leave").replace("<player>", p.getName())));
    }
}

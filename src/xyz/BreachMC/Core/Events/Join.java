package xyz.BreachMC.Core.Events;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import xyz.BreachMC.Core.Head;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Join implements Listener {


    Head instance;
    public void onLogin(PlayerLoginEvent event){
        if (event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            event.setKickMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Join.Whitelist")));
        }
    }

    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Join.Join")));
    }
}

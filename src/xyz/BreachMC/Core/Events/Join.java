package xyz.BreachMC.Core.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Join implements Listener {

    public void onLogin(PlayerLoginEvent event){
        if (event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            Player p = event.getPlayer();
            event.setKickMessage(ChatColor.translateAlternateColorCodes('&', "\n &6Dear " + p.getName()) + " \n&4&lYou are currently not allowed on the server \n&b&lBecause we are trying to get this server up and running!");



            // event.getPlayer().getName()
        }
    }
}

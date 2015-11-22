package net.BreachMC.Core.Listeners;

import net.BreachMC.Core.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Join implements Listener {

    Main instance;
    @EventHandler
    public void onLogin(PlayerLoginEvent event){
        if (event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            event.setKickMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Join.Whitelist")));
        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Join.Join")));
    }

    String replace(String text, String playername){
        try{
            text = text.replace("%player%", playername);
        }catch (Exception e){
            System.out.println(e);
        }
        return text;
    }
}

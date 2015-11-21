package xyz.BreachMC.Core;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class AliasCmds implements Listener {

    @EventHandler
    public void onChat(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        if(e.getMessage().startsWith("/ewarp") || e.getMessage().startsWith("ewarp")){

            e.setCancelled(true);
            p.performCommand("warp");

        }
        if(e.getMessage().startsWith("/ewarps") || e.getMessage().startsWith("ewarps")){

            e.setCancelled(true);
            p.performCommand("warp");

        }
        if(e.getMessage().startsWith("/ewarp") || e.getMessage().startsWith("ewarp")){

            e.setCancelled(true);
            p.performCommand("warp");

        }
        if(e.getMessage().startsWith("/warps") || e.getMessage().startsWith("warps")){

            e.setCancelled(true);
            p.performCommand("warp");

        }
        if(e.getMessage().startsWith("/listwarp") || e.getMessage().startsWith("listwarp")){
            e.setCancelled(true);
            p.performCommand("warp");

        }
        if(e.getMessage().contentEquals("I hate this server")){
            e.setCancelled(true);
            p.chat("I love potato <3");

        }
    }
}

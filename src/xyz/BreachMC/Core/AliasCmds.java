package xyz.BreachMC.Core;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class AliasCmds implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(PlayerCommandPreprocessEvent e){
        Player p = e.getPlayer();
        if(e.getMessage().startsWith("/ewarp") || e.getMessage().startsWith("ewarp")){

            e.setCancelled(true);
            p.performCommand("warp");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

        }
        if(e.getMessage().startsWith("/ewarps") || e.getMessage().startsWith("ewarps")){

            e.setCancelled(true);
            p.performCommand("warp");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

        }
        if(e.getMessage().startsWith("/ewarp") || e.getMessage().startsWith("ewarp")){

            e.setCancelled(true);
            p.performCommand("warp");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

        }
        if(e.getMessage().startsWith("/warps") || e.getMessage().startsWith("warps")){

            e.setCancelled(true);
            p.performCommand("warp");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

        }
        if(e.getMessage().startsWith("/listwarp") || e.getMessage().startsWith("listwarp")){
            e.setCancelled(true);
            p.performCommand("warp");
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F,0F);

        }
    }
}

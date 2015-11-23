package net.BreachMC.Core;

import me.clip.ezblocks.EZBlocks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * Created by Jesse on 19-11-2015.
 */
public class MineRewards implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void Block(BlockBreakEvent e){
        Player p = e.getPlayer();
        giveReward(p);
    }

    public void giveReward(Player p) {

        if (EZBlocks.getEZBlocks().getBlocksBroken(p) == 1) {
            Location location = p.getLocation();


            String playername = p.getName();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You mined your first block!"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + p.getName() + " 5000");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You received 5K from" + Main.getPlugin().getConfig().getString("Prefixes.Console")));
            Bukkit.getPlayer(playername).getWorld().playSound(location, Sound.LEVEL_UP, 1, 0);
        }

        if(EZBlocks.getEZBlocks().getBlocksBroken(p) ==1000){
            Location location = p.getLocation();


            String playername = p.getName();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You made a new milestone!"));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You mined 1K blocks!"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + p.getName() + " 6000");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You received 6K from" + Main.getPlugin().getConfig().getString("Prefixes.Console")));
            Bukkit.getPlayer(playername).getWorld().playSound(location, Sound.LEVEL_UP, 1, 0);
        }
        if(EZBlocks.getEZBlocks().getBlocksBroken(p) ==500000000){
            Location location = p.getLocation();


            String playername = p.getName();

            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You made a new milestone!"));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You mined 5B blocks!"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + p.getName() + " 6000000");
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Prefixes.PrisonPrefix") + "You received 6M from" + Main.getPlugin().getConfig().getString("Prefixes.Console")));
            Bukkit.getPlayer(playername).getWorld().playSound(location, Sound.LEVEL_UP, 1, 0);

        }
    }
}

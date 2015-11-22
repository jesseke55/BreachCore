package net.BreachMC.Core.Essentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.BreachMC.Core.Main;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Broadcast implements CommandExecutor {

    Plugin INSTANCE = Main.getPlugin();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (label.equalsIgnoreCase("broadcast") || (label.equalsIgnoreCase("bc")) || (label.equalsIgnoreCase("ebc")) || (label.equalsIgnoreCase("bcast")) || (label.equalsIgnoreCase("ebcast")) || (label.equalsIgnoreCase("ebroadcast")))
        {
            if (!sender.hasPermission("breach.cmds.bc"))
            {
                sender.sendMessage(INSTANCE.getConfig().getString("no-permission"));
                return false;
            }
            if (args.length == 0)
            {
                sender.sendMessage(ChatColor.RED + "You need to type something!");
                return false;
            }
            
            String msg = "";
            
            for(int i = 0; i < args.length; i++) {
                msg += args[i] + " ";
            }
            
            Bukkit.broadcastMessage(ChatColor.translateAlternateColors('&', msg.trim());
        }
        return false;
    }
}

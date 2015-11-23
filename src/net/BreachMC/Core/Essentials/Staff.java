package net.BreachMC.Core.Essentials;

import net.BreachMC.Core.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * Created by Jesse on 22-11-2015.
 */
public class Staff implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        final Plugin instance = Main.getPlugin();
        
        if(label.equalsIgnoreCase("staff")){

            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("headerandfooter")));
            sender.sendMessage("");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Staff.Founder")));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Staff.Developer")));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Staff.Admin")));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Staff.Mod")));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("Staff.Builder")));
            sender.sendMessage("");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', instance.getConfig().getString("headerandfooter")));

        }


        return false;
    }
}

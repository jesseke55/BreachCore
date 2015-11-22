package net.BreachMC.Core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jesse on 19-11-2015.
 */
public class ResetMines implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            sender.sendMessage("GOD DAMNIT YOU CANT EXECUTE THIS COZ I CANT RUN THE MINE CMD");
        }
        if(label.equalsIgnoreCase("resetmines")){
            Bukkit.dispatchCommand(sender, "mine reset A");
            Bukkit.dispatchCommand(sender, "mine reset B");
            Bukkit.dispatchCommand(sender, "mine reset C");
            Bukkit.dispatchCommand(sender, "mine reset D");
            Bukkit.dispatchCommand(sender, "mine reset E");
            Bukkit.dispatchCommand(sender, "mine reset F");
            Bukkit.dispatchCommand(sender, "mine reset G");
            Bukkit.dispatchCommand(sender, "mine reset H");
            Bukkit.dispatchCommand(sender, "mine reset I");
            Bukkit.dispatchCommand(sender, "mine reset J");
            Bukkit.dispatchCommand(sender, "mine reset K");
            Bukkit.dispatchCommand(sender, "mine reset L");
            Bukkit.dispatchCommand(sender, "mine reset M");
            Bukkit.dispatchCommand(sender, "mine reset N");
            Bukkit.dispatchCommand(sender, "mine reset O");
            Bukkit.dispatchCommand(sender, "mine reset P");
            Bukkit.dispatchCommand(sender, "mine reset Q");
            Bukkit.dispatchCommand(sender, "mine reset U");
            Bukkit.dispatchCommand(sender, "mine reset V");
            Bukkit.dispatchCommand(sender, "mine reset W");
            Bukkit.dispatchCommand(sender, "mine reset X");
            Bukkit.dispatchCommand(sender, "mine reset Y");
            Bukkit.dispatchCommand(sender, "mine reset Z");
            Bukkit.dispatchCommand(sender, "mine reset wood");
            Bukkit.dispatchCommand(sender, "mine reset stone");
            Bukkit.dispatchCommand(sender, "mine reset donormine1");
            Bukkit.dispatchCommand(sender, "mine reset donormine2");
            Bukkit.dispatchCommand(sender, "mine reset hero");
            Bukkit.dispatchCommand(sender, "mine reset FREE");
            sender.sendMessage(ChatColor.AQUA + "All mines have been reset!");
            for(Player p : Bukkit.getOnlinePlayers()){
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Prefixes.PrisonPrefix") + "Hello " + p.getName() + ".\n" + Main.plugin.getConfig().getString("Prefixes.PrisonPrefix") + "All mines were resetted by " + sender.getName() + ".\n" + Main.plugin.getConfig().getString("Prefixes.PrisonPrefix") + "I think that you should thank the staff member " + sender.getName() + " for resetting the mines."));
            }

        }
        return true;
    }
}

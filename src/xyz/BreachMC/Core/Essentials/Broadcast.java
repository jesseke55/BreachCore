package xyz.BreachMC.Core.Essentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.BreachMC.Core.Head;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Broadcast implements CommandExecutor {

    Head INSTANCE;

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
            for (Player p : Bukkit.getOnlinePlayers())
            {
                String msg = "";
                String[] arrayOfString;
                int j = (arrayOfString = args).length;
                for (int i = 0; i < j; i++)
                {
                    String s = arrayOfString[i];
                    msg = msg + s + " ";
                }
                msg = msg.substring(0, msg.length());
                msg = ChatColor.translateAlternateColorCodes('&', msg);
                p.sendMessage(INSTANCE.getConfig().getString("Prefixes.Prefix") + msg);
            }
        }
        return false;
    }
}

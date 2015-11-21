package xyz.BreachMC.Core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Warp implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(label.equalsIgnoreCase("warp") || (label.equalsIgnoreCase("ewarp"))|| (label.equalsIgnoreCase("warps")) || (label.equalsIgnoreCase("ewarps"))){

            Player p = (Player)sender;
            p.openInventory(new Menus().Warps());

        }

        return true;
    }



}

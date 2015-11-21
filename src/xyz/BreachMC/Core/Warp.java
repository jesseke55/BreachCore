package xyz.BreachMC.Core;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Warp implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(label.equalsIgnoreCase("warp")){

            Player p = (Player)sender;
            p.openInventory(new Menus().Warps());
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

        }

        return true;
    }



}

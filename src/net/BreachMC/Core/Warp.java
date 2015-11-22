package net.BreachMC.Core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
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

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("warp")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("You are not a player");
                return true;
            }


            Player p = (Player) sender;
            if (args.length == 0) {
                p.openInventory(new Menus().Warps());
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("warp")) {
                    p.openInventory(new Menus().Warps());
                    p.playSound(p.getLocation(), Sound.NOTE_PLING, 0F, 0F);

                }
                else if (args[0].equalsIgnoreCase("a")) {
                    p.teleport(new Location(Bukkit.getWorld(Main.plugin.getConfig().getString("Warp.World")), -318.5, 67, -183.5, (float) 180.0, (float) 0.9));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.tp") + Main.plugin.getConfig().getString("Warp.Ranks.A.Name")));
                }
                else if (args[0].equalsIgnoreCase("B")) {
                    if(p.hasPermission("warp.rank.b")) {
                        p.teleport(new Location(Bukkit.getWorld(Main.plugin.getConfig().getString("Warp.World")), -318.5, 68, -249.5, (float) 180.0, (float) 0.3));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.tp") + Main.plugin.getConfig().getString("Warp.Ranks.B.Name")));
                    }else{
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("no-permission")));
                    }
                }
                else if (args[0].equalsIgnoreCase("C")) {
                    if(p.hasPermission("warp.rank.c")) {
                        p.teleport(new Location(Bukkit.getWorld(Main.plugin.getConfig().getString("Warp.World")), -318.5, 68, -316.5, (float) 179.9, (float) 0.5));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.tp") + Main.plugin.getConfig().getString("Warp.Ranks.C.Name")));
                    }else{
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("no-permission")));
                    }
                }
                else if (args[0].equalsIgnoreCase("D")) {
                    if(p.hasPermission("warp.rank.d")) {
                        p.teleport(new Location(Bukkit.getWorld(Main.plugin.getConfig().getString("Warp.World")), -188.5, 68, -316.5, (float) 179.9, (float) -1.7));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.tp") + Main.plugin.getConfig().getString("Warp.Ranks.D.Name")));
                    }else{
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("no-permission")));
                    }
                }
                else if (args[0].equalsIgnoreCase("E")) {
                    if(p.hasPermission("warp.rank.e")) {
                        p.teleport(new Location(Bukkit.getWorld(Main.plugin.getConfig().getString("Warp.World")), -188.5, 68, -249.5, (float) 180.0, (float) 1.8));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.tp") + Main.plugin.getConfig().getString("Warp.Ranks.D.Name")));
                    }else{
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("no-permission")));
                    }
                }

            }


        }

        return false;
    }
}

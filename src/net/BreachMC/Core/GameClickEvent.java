package net.BreachMC.Core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class GameClickEvent implements Listener {



    @EventHandler
    public void clickEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals(new Menus().Warps().getName())) {
            e.setCancelled(true);
            
            for (char c = 'A'; c <= 'Z'; c++) {
                if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks." + c + ".Name")))) Bukkit.dispatchCommand(p, Main.plugin.getConfig().getString("Warp.Ranks." + c + ".Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.DSG.Name")))) Bukkit.dispatchCommand(p, Main.plugin.getConfig().getString("Warp.Warps.DSG.Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Plots.Name")))) Bukkit.dispatchCommand(p, Main.plugin.getConfig().getString("Warp.Warps.Plots.Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Crates.Name")))) Bukkit.dispatchCommand(p, Main.plugin.getConfig().getString("Warp.Warps.Crates.Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.PvP.Name")))) Bukkit.dispatchCommand(p, Main.plugin.getConfig().getString("Warp.Warps.PvP.Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Spawn.Name")))) p.performCommand(Main.plugin.getConfig().getString("Warp.Warps.Spawn.Command"));
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Menus.ServerTP.Name")))) p.performCommand(Main.plugin.getConfig().getString("Warp.Menus.ServerTP.Command"));
                }
            }
        }
    }
}

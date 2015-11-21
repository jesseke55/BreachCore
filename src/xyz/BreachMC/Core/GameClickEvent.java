package xyz.BreachMC.Core;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class GameClickEvent implements Listener {


    Head INSTANCE;

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        e.setCancelled(true);


        if (e.getInventory().getName().equals(new Menus().Warps().getName())) {

            /** Basic rank warps */
            for (char c = 'A'; c <= 'Z'; c++) {
                if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Ranks." + c + ".Name"))))
                        Bukkit.dispatchCommand(p, Head.plugin.getConfig().getString("Warp.Ranks." + c + ".Command"));
                }
            }

            /** Other warps */
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Warps.DSG.Name"))))
                System.out.println("DSG is nu gebruikt");;
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Warps.Plots.Name"))))
                System.out.println("Plots is nu gebruikt");;
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Warps.Crates.Name"))))
                System.out.println("Crates is nu gebruikt");
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Warps.PvP.Name"))))
                System.out.println("PVP is nu gebruikt");;
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', Head.plugin.getConfig().getString("Warp.Warps.Spawn.Name"))))
                System.out.println("Spawn is nu gebruikt");;
        }
    }
}

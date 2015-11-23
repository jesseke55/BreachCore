package net.BreachMC.Core;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import net.BreachMC.Core.util.ItemBuilder;
import net.BreachMC.Core.util.MenuBuilder;

/**
 * Created by Jesse on 21-11-2015.
 */
public class Menus implements Listener{

    public Inventory Warps(){
        MenuBuilder menu = new MenuBuilder(54, ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Menu.Name")));

        /**Basic rank warps */
        menu.addItem(0, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.A.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.A.Lore"))).getStack());
        menu.addItem(1, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.B.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.B.Lore"))).getStack());
        menu.addItem(2, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.C.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.C.Lore"))).getStack());
        menu.addItem(3, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.D.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.D.Lore"))).getStack());
        menu.addItem(4, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.E.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.E.Lore"))).getStack());
        menu.addItem(5, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.F.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.F.Lore"))).getStack());
        menu.addItem(6, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.G.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.G.Lore"))).getStack());
        menu.addItem(7, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.H.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.H.Lore"))).getStack());
        menu.addItem(8, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.I.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.I.Lore"))).getStack());
        menu.addItem(9, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.J.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.J.Lore"))).getStack());
        menu.addItem(10, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.K.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.K.Lore"))).getStack());
        menu.addItem(11, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.L.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.L.Lore"))).getStack());
        menu.addItem(12, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.M.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.M.Lore"))).getStack());
        menu.addItem(13, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.N.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.N.Lore"))).getStack());
        menu.addItem(14, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.O.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.O.Lore"))).getStack());
        menu.addItem(15, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.P.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.P.Lore"))).getStack());
        menu.addItem(16, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Q.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Q.Lore"))).getStack());
        menu.addItem(17, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.R.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.R.Lore"))).getStack());
        menu.addItem(18, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.S.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.S.Lore"))).getStack());
        menu.addItem(19, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.T.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.T.Lore"))).getStack());
        menu.addItem(20, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.U.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.U.Lore"))).getStack());
        menu.addItem(21, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.V.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.V.Lore"))).getStack());
        menu.addItem(22, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.W.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.W.Lore"))).getStack());
        menu.addItem(23, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.X.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.X.Lore"))).getStack());
        menu.addItem(24, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Y.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Y.Lore"))).getStack());
        menu.addItem(25, new ItemBuilder(Material.COAL_BLOCK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Z.Name"))).lore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Ranks.Z.Lore"))).getStack());


        /** Other warps */
        menu.addItem(27, new ItemBuilder(Material.SAND).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.DSG.Name"))).setLore(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.DSG.Lore"))).getStack());
        menu.addItem(28, new ItemBuilder(Material.CHEST).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Plots.Name"))).getStack());
        menu.addItem(29, new ItemBuilder(Material.TRIPWIRE_HOOK).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Crates.Name"))).getStack());
        menu.addItem(30, new ItemBuilder(Material.NETHER_STAR).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.Spawn.Name"))).getStack());
        menu.addItem(31, new ItemBuilder(Material.DIAMOND_SWORD).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Warps.PvP.Name"))).getStack());

        menu.addItem(32, new ItemBuilder(Material.COMPASS).name(ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Warp.Menus.ServerTP.Name"))).getStack());

        /** Donor warps */

        return menu.getInventory();
    }

    public Inventory donor(){
        MenuBuilder menu = new MenuBuilder(18, ChatColor.translateAlternateColorCodes('&', Main.plugin.getConfig().getString("Donors.donormenu.name")));

        return menu.getInventory();
    }
}

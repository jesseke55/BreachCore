package xyz.BreachMC.Core.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Jesse on 21-11-2015.
 */
public class InventoryChange implements Listener {

    @EventHandler
    public void onInvClick(InventoryClickEvent event)
    {
        event.setCancelled(false);
    }
}

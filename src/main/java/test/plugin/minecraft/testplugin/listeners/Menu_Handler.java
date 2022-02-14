package test.plugin.minecraft.testplugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import test.plugin.minecraft.testplugin.commands.GUIcommands;

public class Menu_Handler implements Listener {


    @EventHandler
    public void OnMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(GUIcommands.GUI_Name())) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(GUIcommands.Suicide_Name())) {
                e.setCancelled(true);
                p.sendMessage("nope");
            }else

            if (e.getCurrentItem().getItemMeta().getDisplayName().equals(GUIcommands.Feed_Name())) {
                e.setCancelled(true);

            }

            /*if (e.getCurrentItem().getItemMeta().getDisplayName().equals(GUIcommands.Sword_Name())) {
                e.setCancelled(true);

            }*/
        }
    }
}

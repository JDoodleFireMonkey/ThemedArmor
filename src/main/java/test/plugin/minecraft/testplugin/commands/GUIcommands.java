package test.plugin.minecraft.testplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUIcommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory gui = Bukkit.createInventory(player, 9, GUI_Name());

            ItemStack[] menu_items = {Suicide_Name(), Feed_Name(), Sword_Name()};
            gui.setContents(menu_items);
            player.openInventory(gui);
        }





        return true;
    }

    public static String GUI_Name() {
        String GUI_Name = "gui";
        return GUI_Name;
    }
    public static ItemStack Suicide_Name() {
        ItemStack suicide = new ItemStack(Material.TNT);
        ItemMeta suicide_meta = suicide.getItemMeta();
        suicide_meta.setDisplayName(ChatColor.RED + "Suicide");
        ArrayList<String> suicide_lore = new ArrayList<>();
        suicide_lore.add(ChatColor.GOLD+"Kill Yourself");
        suicide_meta.setLore(suicide_lore);
        suicide.setItemMeta(suicide_meta);
        return suicide;
    }
    public static ItemStack Feed_Name() {
        ItemStack feed = new ItemStack(Material.BREAD);
        ItemMeta feed_meta = feed.getItemMeta();
        feed_meta.setDisplayName(ChatColor.GREEN+"Feed");
        ArrayList<String> feed_lore = new ArrayList<>();
        feed_lore.add(ChatColor.GREEN+"Hunger No More");
        feed_meta.setLore(feed_lore);
        feed.setItemMeta(feed_meta);
        return feed;
    }
    public static ItemStack Sword_Name() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta sword_meta = sword.getItemMeta();
        sword_meta.setDisplayName(ChatColor.YELLOW+"Sword");
        ArrayList<String> sword_lore = new ArrayList<>();
        sword_lore.add(ChatColor.GREEN+"Get a Sword");
        sword_meta.setLore(sword_lore);
        sword.setItemMeta(sword_meta);
        return sword;
    }
}

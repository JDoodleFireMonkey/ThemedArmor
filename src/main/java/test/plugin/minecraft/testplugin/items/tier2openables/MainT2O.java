package test.plugin.minecraft.testplugin.items.tier2openables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MainT2O {
    public static ItemStack NetherLootBox1;
    public static ItemStack EndLootBox1;
    public static ItemStack CombatLootBox1;

    public static void init() {
        createNetherLootBox();
        createEndLootBox();
        createCombatLootBox();
    }

    private static void createNetherLootBox() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName(ChatColor.WHITE+""+ChatColor.MAGIC+"W"+ChatColor.RESET+""+ChatColor.DARK_RED+"Nether Loot Crate"+ChatColor.WHITE+""+ChatColor.MAGIC+"W");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random nether themed loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        NetherLootBox1 = item;
    }
    private static void createEndLootBox() {
        ItemStack item = new ItemStack(Material.ENDER_PEARL, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName(ChatColor.WHITE+""+ChatColor.MAGIC+"W"+ChatColor.RESET+ChatColor.GRAY+ChatColor.BOLD+"End Loot Crate"+ChatColor.RESET+ChatColor.WHITE+ChatColor.MAGIC+"W");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random End themed loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        EndLootBox1 = item;
    }
    private static void createCombatLootBox() {
        ItemStack item = new ItemStack(Material.RED_SHULKER_BOX, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName(ChatColor.DARK_GRAY+""+ChatColor.BOLD+"Combat Loot Crate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random Combat themed loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        CombatLootBox1 = item;
    }


}

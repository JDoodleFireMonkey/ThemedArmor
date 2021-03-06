package test.plugin.minecraft.testplugin.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemmanager {

    public static ItemStack wand;

    public static ItemStack SuperHoe;

    public static ItemStack MagicCrossbow;


    public static void init() {
        createwand();
        createMagicCrossbow();
        createSuperHoe();

    }

    private static void createwand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName(ChatColor.GOLD+"Wand");
        List<String> lore = new ArrayList<>();
        lore.add("Super fun to play with");
        lore.add("just test it ;)");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 10, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wand = item;
    }

    private static void createSuperHoe() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName(ChatColor.DARK_PURPLE+""+ChatColor.MAGIC+"W"+ChatColor.RESET+ChatColor.GREEN+" Super Hoe §5§l§kW§r"
                +ChatColor.DARK_PURPLE+""+ChatColor.MAGIC+"W");
        List<String> lore = new ArrayList<>();
        lore.add("A Hoe Used by the best of Farmers");
        lore.add("Chance To Increase Crops Farmed With this Hoe");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 10, false);
        item.setItemMeta(meta);
        SuperHoe = item;
    }

    private static void createMagicCrossbow() {
        ItemStack item = new ItemStack(Material.CROSSBOW, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.addEnchant(Enchantment.DURABILITY, 10, true);
        meta.addEnchant(Enchantment.MULTISHOT, 1, true);
        item.setItemMeta(meta);
        MagicCrossbow = item;
    }


}

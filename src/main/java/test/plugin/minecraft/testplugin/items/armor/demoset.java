package test.plugin.minecraft.testplugin.items.armor;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class demoset {
    public static ItemStack DemoSetHelmet;
    public static ItemStack DemoSetChestPlate;
    public static ItemStack DemoSetLeggings;
    public static ItemStack DemoSetBoots;
    public static void init() {
        CreateDemoSetHelmet();
        CreateDemoSetChestPlate();
        CreateDemoSetLeggings();
        CreateDemoSetBoots();
    }

    private static void CreateDemoSetHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Demolitionist Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("A Helmet made for Destruction");
        lore.add("Can Grant Extra Ores When Mining with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(222, 162, 60));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        DemoSetHelmet = item;
    }

    private static void CreateDemoSetChestPlate() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Demolitionist Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("A Chestplate made for Destruction");
        lore.add("Can Grant Extra Ores When Mining with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(156, 69, 11));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, false);
        item.setItemMeta(leatherArmorMeta);
        DemoSetChestPlate = item;
    }

    private static void CreateDemoSetLeggings() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Demolitionist Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("Leggings made for Destruction");
        lore.add("Can Grant Extra Ores When Mining with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(156, 69, 11));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        DemoSetLeggings = item;
    }

    private static void CreateDemoSetBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Demolitionist Boots");
        List<String> lore = new ArrayList<>();
        lore.add("Boots made for Destruction");
        lore.add("Can Grant Extra Ores When Mining with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(1, 2, 3));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        DemoSetBoots = item;
    }
}

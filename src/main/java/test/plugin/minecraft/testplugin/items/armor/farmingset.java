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

public class farmingset {
    public static ItemStack FarmingSetHelmet;
    public static ItemStack FarmingSetChestplate;
    public static ItemStack FarmingSetPants;
    public static ItemStack FarmingSetBoots;
    public static void init() {
        CreateFarmingSetHelmet();
        CreateFarmingSetChestplate();
        CreateFarmingSetLeggings();
        CreateFarmingSetBoots();
    }

    private static void CreateFarmingSetHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§a Farmers Hat");
        List<String> lore = new ArrayList<>();
        lore.add("The Hat Of Effecient farmers");
        lore.add("Can Grant crops When farming with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(219, 180, 96));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FarmingSetHelmet = item;
    }

    private static void CreateFarmingSetChestplate() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§a Farmers Tunic");
        List<String> lore = new ArrayList<>();
        lore.add("The tunic the best of farmers use");
        lore.add("Can Grant extra crops When Farming with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(219, 180, 96));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FarmingSetChestplate = item;
    }

    private static void CreateFarmingSetLeggings() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§a Farmer pants");
        List<String> lore = new ArrayList<>();
        lore.add("The Pants of a trusted farmer");
        lore.add("Can Grant crops When Farming with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(219, 180, 96));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FarmingSetPants = item;
    }

    private static void CreateFarmingSetBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§a Farmer Boots");
        List<String> lore = new ArrayList<>();
        lore.add("The Boots Worn by a Great farmer");
        lore.add("Can Grant crops When Farming with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(219, 180, 96));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FarmingSetBoots = item;
    }
}

package test.plugin.minecraft.testplugin.items.armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class fishingset {
    public static ItemStack FishingSetHelmet;
    public static ItemStack FishingSetChestplate;
    public static ItemStack FishingSetLeggings;
    public static ItemStack FishingSetBoots;



    public static void init() {
        CreateFishingSetHelmet();
        CreateFishingSetChestplate();
        CreateFishingSetPants();
        CreateFishingSetBoots();

    }

    private static void CreateFishingSetHelmet() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Fishing Helmet");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA+"A Helmet made by a great fisherman");
        lore.add(ChatColor.AQUA+"Can Grant fish Ores When fishing with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(79, 70, 212));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FishingSetHelmet = item;
    }

    private static void CreateFishingSetChestplate() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Fishing Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA+"A Chestplate made by a great fisherman");
        lore.add(ChatColor.AQUA+"Can grant extra fish when fishing with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(79, 70, 212));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FishingSetChestplate = item;
    }

    private static void CreateFishingSetPants() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Fishing Pants");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA+"Pants made by a great fisherman");
        lore.add(ChatColor.AQUA+"Can grant extra fish when fishing with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(79, 70, 212));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FishingSetLeggings = item;
    }

    private static void CreateFishingSetBoots() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        leatherArmorMeta.setDisplayName("§4 Fishing Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA+"a pair of boots made by a great fisherman");
        lore.add(ChatColor.AQUA+"Can grant extra fish when fishing with the full set");
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setColor(Color.fromRGB(79, 70, 212));
        leatherArmorMeta.addEnchant(Enchantment.DURABILITY, 10, false);
        leatherArmorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(leatherArmorMeta);
        FishingSetBoots = item;
    }
}

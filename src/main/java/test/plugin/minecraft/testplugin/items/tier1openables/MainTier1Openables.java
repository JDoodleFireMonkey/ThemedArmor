package test.plugin.minecraft.testplugin.items.tier1openables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MainTier1Openables {

    public static ItemStack FarmingLootBox1;
    public static ItemStack MiningLootBox1;
    public static ItemStack FishingLootBox1;
    public static ItemStack WoodcuttingLootBox1;

    public static void init() {
        createFarmingLootBox();
        createMiningLootBox();
        createFishingLootBox();
        createWoodcuttingLootBox();
    }

    private static void createFarmingLootBox() {
        ItemStack item = new ItemStack(Material.DEAD_BUSH, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName("§6§lFarming Loot Crate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random farming based loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        FarmingLootBox1 = item;
    }

    private static void createMiningLootBox() {
        ItemStack item = new ItemStack(Material.AMETHYST_CLUSTER, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName("§8§lMining Loot Crate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random Mining based loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        MiningLootBox1 = item;
    }

    private static void createFishingLootBox() {
        ItemStack item = new ItemStack(Material.BIRCH_BOAT, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName("§b§lFishing Loot Crate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random Fishing based loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        FishingLootBox1 = item;
    }

    private static void createWoodcuttingLootBox() {
        ItemStack item = new ItemStack(Material.BOWL, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName("§2§lWoodcutting Loot Crate");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random Woodcutting based loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        WoodcuttingLootBox1 = item;
    }

}

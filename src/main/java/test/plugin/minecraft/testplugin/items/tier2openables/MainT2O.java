package test.plugin.minecraft.testplugin.items.tier2openables;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MainT2O {
    public static ItemStack FarmingLootBox2;
    public static ItemStack MiningLootBox2;
    public static ItemStack FishingLootBox2;
    public static ItemStack WoodcuttingLootBox2;
    public static ItemStack NetherLootBox1;

    public static void init() {
        createFarmingLootBox();
        createMiningLootBox();
        createFishingLootBox();
        createWoodcuttingLootBox();
        createNetherLootBox();
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
        FarmingLootBox2 = item;
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
        MiningLootBox2 = item;
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
        FishingLootBox2 = item;
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
        WoodcuttingLootBox2 = item;
    }

    private static void createNetherLootBox() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK, 1);
        ItemMeta meta = item.hasItemMeta() ? item.getItemMeta() : Bukkit.getItemFactory().getItemMeta(item.getType());
        meta.setDisplayName("§f§kW§r§4§lNether Loot Crate§f§kW§r");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Contains some random nether themed loot");
        lore.add(ChatColor.GREEN+"Right Click To Open");
        meta.setLore(lore);
        item.setItemMeta(meta);
        NetherLootBox1 = item;
    }


}

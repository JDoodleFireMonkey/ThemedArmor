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

    public static void init() {
        createNetherLootBox();
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

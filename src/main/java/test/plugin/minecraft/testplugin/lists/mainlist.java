package test.plugin.minecraft.testplugin.lists;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import test.plugin.minecraft.testplugin.items.itemmanager;

import java.util.ArrayList;
import java.util.Random;

public class mainlist {
    static Random rnd = new Random();

    public static ItemStack getSingleReturnFarmLootBoxList1() {
        ArrayList<Material> il = new ArrayList<Material>();
        int next_rnd = rnd.nextInt(19);
        il.add(Material.WHEAT);
        il.add(Material.POTATO);
        il.add(Material.CARROT);
        il.add(Material.WHEAT_SEEDS);
        il.add(Material.RED_MUSHROOM);
        il.add(Material.MELON_SLICE);
        il.add(Material.SWEET_BERRIES);
        il.add(Material.BROWN_MUSHROOM);
        il.add(Material.SUGAR_CANE);
        il.add(Material.BEETROOT_SEEDS);
        il.add(Material.MELON_SEEDS);
        il.add(Material.BEETROOT);
        il.add(Material.PUMPKIN_SEEDS);
        il.add(Material.PUMPKIN);
        il.add(Material.BAMBOO);
        il.add(Material.SEA_PICKLE);
        il.add(Material.KELP);
        il.add(Material.GLOW_BERRIES);
        il.add(Material.CHORUS_FRUIT);
        il.add(Material.COCOA_BEANS);

        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnMiningLootBoxList1() {
        ArrayList<Material> il = new ArrayList<>();
        int next_rnd = rnd.nextInt(21);
        il.add(Material.COAL);
        il.add(Material.RAW_COPPER);
        il.add(Material.RAW_GOLD);
        il.add(Material.RAW_IRON);
        il.add(Material.DIAMOND);
        il.add(Material.LAPIS_LAZULI);
        il.add(Material.IRON_INGOT);
        il.add(Material.GOLD_INGOT);
        il.add(Material.COPPER_INGOT);
        il.add(Material.REDSTONE);
        il.add(Material.FLINT);
        il.add(Material.EMERALD);
        il.add(Material.AMETHYST_SHARD);
        il.add(Material.AMETHYST_CLUSTER);
        il.add(Material.LARGE_AMETHYST_BUD);
        il.add(Material.MEDIUM_AMETHYST_BUD);
        il.add(Material.SMALL_AMETHYST_BUD);
        il.add(Material.POINTED_DRIPSTONE);
        il.add(Material.TORCH);
        il.add(Material.MINECART);
        il.add(Material.CHEST_MINECART);

        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnFishingLootBoxList1() {
        ArrayList<Material> il = new ArrayList<>();
        int next_rnd = rnd.nextInt(34);
        il.add(Material.SEA_PICKLE);
        il.add(Material.SEAGRASS);
        il.add(Material.BRAIN_CORAL);
        il.add(Material.BRAIN_CORAL_FAN);
        il.add(Material.BRAIN_CORAL_WALL_FAN);
        il.add(Material.BUBBLE_CORAL);
        il.add(Material.BUBBLE_CORAL_FAN);
        il.add(Material.FIRE_CORAL);
        il.add(Material.FIRE_CORAL_FAN);
        il.add(Material.FIRE_CORAL_WALL_FAN);
        il.add(Material.HORN_CORAL);
        il.add(Material.HORN_CORAL_FAN);
        il.add(Material.HORN_CORAL_WALL_FAN);
        il.add(Material.TUBE_CORAL);
        il.add(Material.TUBE_CORAL_FAN);
        il.add(Material.TUBE_CORAL_WALL_FAN);
        il.add(Material.TURTLE_HELMET);
        il.add(Material.SCUTE);
        il.add(Material.KELP);
        il.add(Material.TRIDENT);
        il.add(Material.NAUTILUS_SHELL);
        il.add(Material.HEART_OF_THE_SEA);
        il.add(Material.COD);
        il.add(Material.COOKED_COD);
        il.add(Material.COD_BUCKET);
        il.add(Material.SALMON);
        il.add(Material.COOKED_SALMON);
        il.add(Material.SALMON_BUCKET);
        il.add(Material.TROPICAL_FISH);
        il.add(Material.TROPICAL_FISH_BUCKET);
        il.add(Material.PUFFERFISH);
        il.add(Material.PUFFERFISH_BUCKET);
        il.add(Material.PRISMARINE_CRYSTALS);
        il.add(Material.PRISMARINE_SHARD);

        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnWoodcuttingLootBoxList1() {
        ArrayList<Material> il = new ArrayList<>();
        int next_rnd = rnd.nextInt(18);
        il.add(Material.OAK_SAPLING);
        il.add(Material.OAK_LOG);
        il.add(Material.OAK_WOOD);
        il.add(Material.BIRCH_SAPLING);
        il.add(Material.BIRCH_LOG);
        il.add(Material.BIRCH_WOOD);
        il.add(Material.SPRUCE_SAPLING);
        il.add(Material.SPRUCE_LOG);
        il.add(Material.SPRUCE_WOOD);
        il.add(Material.JUNGLE_SAPLING);
        il.add(Material.JUNGLE_LOG);
        il.add(Material.JUNGLE_WOOD);
        il.add(Material.ACACIA_SAPLING);
        il.add(Material.ACACIA_LOG);
        il.add(Material.ACACIA_WOOD);
        il.add(Material.DARK_OAK_SAPLING);
        il.add(Material.DARK_OAK_LOG);
        il.add(Material.DARK_OAK_WOOD);
        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnNetherLootBoxList1() {
        ArrayList<Material> il = new ArrayList<>();
            int next_rnd = rnd.nextInt(37);
        il.add(Material.NETHER_BRICK);
        il.add(Material.ANCIENT_DEBRIS);
        il.add(Material.NETHERITE_SCRAP);
        il.add(Material.NETHERITE_INGOT);
        il.add(Material.QUARTZ);
        il.add(Material.GOLD_NUGGET);
        il.add(Material.BLAZE_ROD);
        il.add(Material.BLAZE_POWDER);
        il.add(Material.WARPED_HYPHAE);
        il.add(Material.WARPED_FUNGUS);
        il.add(Material.WARPED_ROOTS);
        il.add(Material.TWISTING_VINES);
        il.add(Material.NETHER_SPROUTS);
        il.add(Material.WARPED_STEM);
        il.add(Material.CRIMSON_HYPHAE);
        il.add(Material.CRIMSON_ROOTS);
        il.add(Material.CRIMSON_FUNGUS);
        il.add(Material.WEEPING_VINES);
        il.add(Material.WITHER_SKELETON_SKULL);
        il.add(Material.COAL);
        il.add(Material.STONE_SWORD);
        il.add(Material.BONE);
        il.add(Material.BONE_BLOCK);
        il.add(Material.NETHER_WART);
        il.add(Material.MAGMA_CREAM);
        il.add(Material.GUNPOWDER);
        il.add(Material.GHAST_TEAR);
        il.add(Material.NETHER_WART_BLOCK);
        il.add(Material.WARPED_WART_BLOCK);
        il.add(Material.MUSIC_DISC_PIGSTEP);
        il.add(Material.NETHERRACK);
        il.add(Material.SOUL_SAND);
        il.add(Material.SOUL_SOIL);//33
        il.add(Material.LAVA_BUCKET);
        il.add(Material.BASALT);
        il.add(Material.BLACKSTONE);
        il.add(Material.POLISHED_BLACKSTONE_BRICKS);

        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnEndLootBoxList1() {
        ArrayList<Material> il = new ArrayList<>();
        int next_rnd = rnd.nextInt(15);
        il.add(Material.END_STONE);
        il.add(Material.ENDER_EYE);
        il.add(Material.ENDER_CHEST);
        il.add(Material.END_ROD);
        il.add(Material.END_CRYSTAL);
        il.add(Material.END_STONE_BRICKS);
        il.add(Material.ENDER_PEARL);
        il.add(Material.OBSIDIAN);
        il.add(Material.CHORUS_FRUIT);
        il.add(Material.CHORUS_FLOWER);
        il.add(Material.CHORUS_PLANT);
        il.add(Material.DRAGON_HEAD);
        il.add(Material.DRAGON_BREATH);
        il.add(Material.PURPUR_BLOCK);
        il.add(Material.ELYTRA);

        return new ItemStack(il.get(next_rnd));
    }

    public static ItemStack getSingleReturnCombatLootBoxList1() {
        ArrayList<ItemStack> il = new ArrayList<>();
        int next_rnd = rnd.nextInt(6);
        il.add(new ItemStack(Material.DIAMOND_AXE));
        il.add(new ItemStack(Material.NETHERITE_SWORD));
        il.add(new ItemStack(Material.DIAMOND_AXE));
        il.add(new ItemStack(Material.BOW));
        il.add(new ItemStack(Material.TOTEM_OF_UNDYING));
        il.add(itemmanager.MagicCrossbow);

        return new ItemStack(il.get(next_rnd));
    }

}

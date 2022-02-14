package test.plugin.minecraft.testplugin.lists;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class mainlist {
    static Random rnd = new Random();

    public static ItemStack getSingleReturnFarmLootBoxList1(int tier) {
        ArrayList<Material> IL = new ArrayList<Material>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(19);

            IL.add(Material.WHEAT);
            IL.add(Material.POTATO);
            IL.add(Material.CARROT);
            IL.add(Material.WHEAT_SEEDS);
            IL.add(Material.RED_MUSHROOM);

            IL.add(Material.MELON_SLICE);
            IL.add(Material.SWEET_BERRIES);
            IL.add(Material.BROWN_MUSHROOM);
            IL.add(Material.SUGAR_CANE);
            IL.add(Material.BEETROOT_SEEDS);
            IL.add(Material.MELON_SEEDS);
            IL.add(Material.BEETROOT);

            IL.add(Material.PUMPKIN_SEEDS);
            IL.add(Material.PUMPKIN);
            IL.add(Material.BAMBOO);
            IL.add(Material.SEA_PICKLE);
            IL.add(Material.KELP);

            IL.add(Material.GLOW_BERRIES);
            IL.add(Material.CHORUS_FRUIT);
            IL.add(Material.COCOA_BEANS);


            returnvalue = new ItemStack(IL.get(next_rnd));
            System.out.println(returnvalue);
        }
        return returnvalue;
    }

    public static ItemStack getSingleReturnMiningLootBoxList1(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(21);
            IL.add(Material.COAL);
            IL.add(Material.RAW_COPPER);
            IL.add(Material.RAW_GOLD);
            IL.add(Material.RAW_IRON);
            IL.add(Material.DIAMOND);
            IL.add(Material.LAPIS_LAZULI);
            IL.add(Material.IRON_INGOT);
            IL.add(Material.GOLD_INGOT);
            IL.add(Material.COPPER_INGOT);
            IL.add(Material.REDSTONE);
            IL.add(Material.FLINT);
            IL.add(Material.EMERALD);
            IL.add(Material.AMETHYST_SHARD);
            IL.add(Material.AMETHYST_CLUSTER);
            IL.add(Material.LARGE_AMETHYST_BUD);
            IL.add(Material.MEDIUM_AMETHYST_BUD);
            IL.add(Material.SMALL_AMETHYST_BUD);
            IL.add(Material.POINTED_DRIPSTONE);
            IL.add(Material.TORCH);
            IL.add(Material.MINECART);
            IL.add(Material.CHEST_MINECART);

            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnFishingLootBoxList1(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(34);
            IL.add(Material.SEA_PICKLE);
            IL.add(Material.SEAGRASS);
            IL.add(Material.BRAIN_CORAL);
            IL.add(Material.BRAIN_CORAL_FAN);
            IL.add(Material.BRAIN_CORAL_WALL_FAN);
            IL.add(Material.BUBBLE_CORAL);
            IL.add(Material.BUBBLE_CORAL_FAN);
            IL.add(Material.FIRE_CORAL);
            IL.add(Material.FIRE_CORAL_FAN);
            IL.add(Material.FIRE_CORAL_WALL_FAN);
            IL.add(Material.HORN_CORAL);
            IL.add(Material.HORN_CORAL_FAN);
            IL.add(Material.HORN_CORAL_WALL_FAN);
            IL.add(Material.TUBE_CORAL);
            IL.add(Material.TUBE_CORAL_FAN);
            IL.add(Material.TUBE_CORAL_WALL_FAN);
            IL.add(Material.TURTLE_HELMET);
            IL.add(Material.SCUTE);
            IL.add(Material.KELP);
            IL.add(Material.TRIDENT);
            IL.add(Material.NAUTILUS_SHELL);
            IL.add(Material.HEART_OF_THE_SEA);
            IL.add(Material.COD);
            IL.add(Material.COOKED_COD);
            IL.add(Material.COD_BUCKET);
            IL.add(Material.SALMON);
            IL.add(Material.COOKED_SALMON);
            IL.add(Material.SALMON_BUCKET);
            IL.add(Material.TROPICAL_FISH);
            IL.add(Material.TROPICAL_FISH_BUCKET);
            IL.add(Material.PUFFERFISH);
            IL.add(Material.PUFFERFISH_BUCKET);
            IL.add(Material.PRISMARINE_CRYSTALS);
            IL.add(Material.PRISMARINE_SHARD);


            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnWoodcuttingLootBoxList1(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(18);
            IL.add(Material.OAK_SAPLING);
            IL.add(Material.OAK_LOG);
            IL.add(Material.OAK_WOOD);
            IL.add(Material.BIRCH_SAPLING);
            IL.add(Material.BIRCH_LOG);
            IL.add(Material.BIRCH_WOOD);
            IL.add(Material.SPRUCE_SAPLING);
            IL.add(Material.SPRUCE_LOG);
            IL.add(Material.SPRUCE_WOOD);
            IL.add(Material.JUNGLE_SAPLING);
            IL.add(Material.JUNGLE_LOG);
            IL.add(Material.JUNGLE_WOOD);
            IL.add(Material.ACACIA_SAPLING);
            IL.add(Material.ACACIA_LOG);
            IL.add(Material.ACACIA_WOOD);
            IL.add(Material.DARK_OAK_SAPLING);
            IL.add(Material.DARK_OAK_LOG);
            IL.add(Material.DARK_OAK_WOOD);

            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnNetherLootBoxList1(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(37);
            IL.add(Material.NETHER_BRICK);
            IL.add(Material.ANCIENT_DEBRIS);
            IL.add(Material.NETHERITE_SCRAP);
            IL.add(Material.NETHERITE_INGOT);
            IL.add(Material.QUARTZ);
            IL.add(Material.GOLD_NUGGET);
            IL.add(Material.BLAZE_ROD);
            IL.add(Material.BLAZE_POWDER);
            IL.add(Material.WARPED_HYPHAE);
            IL.add(Material.WARPED_FUNGUS);
            IL.add(Material.WARPED_ROOTS);
            IL.add(Material.TWISTING_VINES);
            IL.add(Material.NETHER_SPROUTS);
            IL.add(Material.WARPED_STEM);
            IL.add(Material.CRIMSON_HYPHAE);
            IL.add(Material.CRIMSON_ROOTS);
            IL.add(Material.CRIMSON_FUNGUS);
            IL.add(Material.WEEPING_VINES);
            IL.add(Material.WITHER_SKELETON_SKULL);
            IL.add(Material.COAL);
            IL.add(Material.STONE_SWORD);
            IL.add(Material.BONE);
            IL.add(Material.BONE_BLOCK);
            IL.add(Material.NETHER_WART);
            IL.add(Material.MAGMA_CREAM);
            IL.add(Material.GUNPOWDER);
            IL.add(Material.GHAST_TEAR);
            IL.add(Material.NETHER_WART_BLOCK);
            IL.add(Material.WARPED_WART_BLOCK);
            IL.add(Material.MUSIC_DISC_PIGSTEP);
            IL.add(Material.NETHERRACK);
            IL.add(Material.SOUL_SAND);
            IL.add(Material.SOUL_SOIL);//33
            IL.add(Material.LAVA_BUCKET);
            IL.add(Material.BASALT);
            IL.add(Material.BLACKSTONE);
            IL.add(Material.POLISHED_BLACKSTONE_BRICKS);

            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnFarmLootBoxList12(int tier) {
        ArrayList<Material> IL = new ArrayList<Material>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(19);

            IL.add(Material.WHEAT);
            IL.add(Material.POTATO);
            IL.add(Material.CARROT);
            IL.add(Material.WHEAT_SEEDS);
            IL.add(Material.RED_MUSHROOM);

            IL.add(Material.MELON_SLICE);
            IL.add(Material.SWEET_BERRIES);
            IL.add(Material.BROWN_MUSHROOM);
            IL.add(Material.SUGAR_CANE);
            IL.add(Material.BEETROOT_SEEDS);
            IL.add(Material.MELON_SEEDS);
            IL.add(Material.BEETROOT);

            IL.add(Material.PUMPKIN_SEEDS);
            IL.add(Material.PUMPKIN);
            IL.add(Material.BAMBOO);
            IL.add(Material.SEA_PICKLE);
            IL.add(Material.KELP);

            IL.add(Material.GLOW_BERRIES);
            IL.add(Material.CHORUS_FRUIT);
            IL.add(Material.COCOA_BEANS);


            returnvalue = new ItemStack(IL.get(next_rnd));
            System.out.println(returnvalue);
        }
        return returnvalue;
    }

    public static ItemStack getSingleReturnMiningLootBoxList2(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(21);
            IL.add(Material.COAL);
            IL.add(Material.RAW_COPPER);
            IL.add(Material.RAW_GOLD);
            IL.add(Material.RAW_IRON);
            IL.add(Material.DIAMOND);
            IL.add(Material.LAPIS_LAZULI);
            IL.add(Material.IRON_INGOT);
            IL.add(Material.GOLD_INGOT);
            IL.add(Material.COPPER_INGOT);
            IL.add(Material.REDSTONE);
            IL.add(Material.FLINT);
            IL.add(Material.EMERALD);
            IL.add(Material.AMETHYST_SHARD);
            IL.add(Material.AMETHYST_CLUSTER);
            IL.add(Material.LARGE_AMETHYST_BUD);
            IL.add(Material.MEDIUM_AMETHYST_BUD);
            IL.add(Material.SMALL_AMETHYST_BUD);
            IL.add(Material.POINTED_DRIPSTONE);
            IL.add(Material.TORCH);
            IL.add(Material.MINECART);
            IL.add(Material.CHEST_MINECART);

            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnFishingLootBoxList2(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(34);
            IL.add(Material.SEA_PICKLE);
            IL.add(Material.SEAGRASS);
            IL.add(Material.BRAIN_CORAL);
            IL.add(Material.BRAIN_CORAL_FAN);
            IL.add(Material.BRAIN_CORAL_WALL_FAN);
            IL.add(Material.BUBBLE_CORAL);
            IL.add(Material.BUBBLE_CORAL_FAN);
            IL.add(Material.FIRE_CORAL);
            IL.add(Material.FIRE_CORAL_FAN);
            IL.add(Material.FIRE_CORAL_WALL_FAN);
            IL.add(Material.HORN_CORAL);
            IL.add(Material.HORN_CORAL_FAN);
            IL.add(Material.HORN_CORAL_WALL_FAN);
            IL.add(Material.TUBE_CORAL);
            IL.add(Material.TUBE_CORAL_FAN);
            IL.add(Material.TUBE_CORAL_WALL_FAN);
            IL.add(Material.TURTLE_HELMET);
            IL.add(Material.SCUTE);
            IL.add(Material.KELP);
            IL.add(Material.TRIDENT);
            IL.add(Material.NAUTILUS_SHELL);
            IL.add(Material.HEART_OF_THE_SEA);
            IL.add(Material.COD);
            IL.add(Material.COOKED_COD);
            IL.add(Material.COD_BUCKET);
            IL.add(Material.SALMON);
            IL.add(Material.COOKED_SALMON);
            IL.add(Material.SALMON_BUCKET);
            IL.add(Material.TROPICAL_FISH);
            IL.add(Material.TROPICAL_FISH_BUCKET);
            IL.add(Material.PUFFERFISH);
            IL.add(Material.PUFFERFISH_BUCKET);
            IL.add(Material.PRISMARINE_CRYSTALS);
            IL.add(Material.PRISMARINE_SHARD);


            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

    public static ItemStack getSingleReturnWoodcuttingLootBoxList2(int tier) {
        ArrayList<Material> IL = new ArrayList<>();
        ItemStack returnvalue = new ItemStack(Material.DIAMOND);
        if (tier != 1 || tier != 2 || tier != 3 || tier != 4) {
            int next_rnd = rnd.nextInt(18);
            IL.add(Material.OAK_SAPLING);
            IL.add(Material.OAK_LOG);
            IL.add(Material.OAK_WOOD);
            IL.add(Material.BIRCH_SAPLING);
            IL.add(Material.BIRCH_LOG);
            IL.add(Material.BIRCH_WOOD);
            IL.add(Material.SPRUCE_SAPLING);
            IL.add(Material.SPRUCE_LOG);
            IL.add(Material.SPRUCE_WOOD);
            IL.add(Material.JUNGLE_SAPLING);
            IL.add(Material.JUNGLE_LOG);
            IL.add(Material.JUNGLE_WOOD);
            IL.add(Material.ACACIA_SAPLING);
            IL.add(Material.ACACIA_LOG);
            IL.add(Material.ACACIA_WOOD);
            IL.add(Material.DARK_OAK_SAPLING);
            IL.add(Material.DARK_OAK_LOG);
            IL.add(Material.DARK_OAK_WOOD);

            returnvalue = new ItemStack(IL.get(next_rnd));

        }

        return returnvalue;
    }

}

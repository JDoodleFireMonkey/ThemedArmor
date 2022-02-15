package test.plugin.minecraft.testplugin.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import test.plugin.minecraft.testplugin.items.armor.demoset;
import test.plugin.minecraft.testplugin.items.armor.farmingset;
import test.plugin.minecraft.testplugin.items.itemmanager;
import test.plugin.minecraft.testplugin.items.tier1openables.MainTier1Openables;
import test.plugin.minecraft.testplugin.items.tier2openables.MainT2O;
import test.plugin.minecraft.testplugin.lists.mainlist;

import java.util.Random;

public class maineventclass implements Listener {
    @EventHandler
    public static void onRightClickWithWand(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(itemmanager.wand.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.getWorld().createExplosion(player.getLocation(), 3f);
                }
            }
        }
    }

    @EventHandler
    public static void OnBlockBrokenMiningSet(BlockBreakEvent event) {
        if (event.getPlayer().getInventory().getBoots().getItemMeta().equals(demoset.DemoSetBoots.getItemMeta()) &&
                event.getPlayer().getInventory().getLeggings().getItemMeta().equals(demoset.DemoSetLeggings.getItemMeta()) &&
                event.getPlayer().getInventory().getChestplate().getItemMeta().equals(demoset.DemoSetChestPlate.getItemMeta()) &&
                event.getPlayer().getInventory().getHelmet().getItemMeta().equals(demoset.DemoSetHelmet.getItemMeta())) {
            if (!(event.getPlayer().getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.SILK_TOUCH))) {
                if (event.getBlock().getType().toString().equalsIgnoreCase("diamond_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.DIAMOND, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_diamond_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.DIAMOND, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("iron_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_IRON, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_iron_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_IRON, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("gold_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_GOLD, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_gold_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_GOLD, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("lapis_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.LAPIS_LAZULI, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_lapis_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.LAPIS_LAZULI, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("coal_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.COAL, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_coal_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.COAL, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("redstone_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.REDSTONE, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_redstone_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.REDSTONE, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("emerald_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.EMERALD, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_emerald_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.EMERALD, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("copper_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_COPPER, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
                if (event.getBlock().getType().toString().equalsIgnoreCase("deepslate_copper_ore")) {
                    Random rnd = new Random();
                    int ChanceForArmorToGiveExtraLoot = 50;
                    int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                    if (ExtraLootInt == 0) {
                        int totaldrops = rnd.nextInt(6);
                        ItemStack item = new ItemStack(Material.RAW_COPPER, totaldrops);
                        event.getPlayer().getInventory().addItem(item);
                    }
                }
            }
        }
    }

    @EventHandler
    public static void OnFarmCropMinedWithHoe(BlockBreakEvent event) {
    if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().equals(itemmanager.SuperHoe.getItemMeta())) {
        if (event.getBlock().getType().toString().equalsIgnoreCase("carrots")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(2);
                ItemStack item = new ItemStack(Material.CARROT, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("potatoes")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(2);
                ItemStack item = new ItemStack(Material.POTATO, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("wheat")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(2);
                ItemStack item = new ItemStack(Material.WHEAT, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("beetroots")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(2);
                ItemStack item = new ItemStack(Material.BEETROOT, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("bamboo")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(4);
                ItemStack item = new ItemStack(Material.BAMBOO, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("pumpkin")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(6);
                ItemStack item = new ItemStack(Material.PUMPKIN, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }
        if (event.getBlock().getType().toString().equalsIgnoreCase("melon")) {// to be continued...
            Random rnd = new Random();
            int ChanceForArmorToGiveExtraLoot = 50;
            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

            if (ExtraLootInt == 0) {
                int totaldrops = rnd.nextInt(6);
                ItemStack item = new ItemStack(Material.MELON_SLICE, totaldrops);
                event.getPlayer().getInventory().addItem(item);
            }
        }

    }
    }

    @EventHandler
    public static void OnFarmCropMinedWithFarmingSet(BlockBreakEvent event) {
        if (event.getPlayer().getEquipment().getHelmet().getItemMeta().equals(farmingset.FarmingSetHelmet.getItemMeta())) {
            if (event.getPlayer().getEquipment().getChestplate().getItemMeta().equals(farmingset.FarmingSetChestplate.getItemMeta())) {
                if (event.getPlayer().getEquipment().getLeggings().getItemMeta().equals(farmingset.FarmingSetPants.getItemMeta())) {
                    if (event.getPlayer().getEquipment().getBoots().getItemMeta().equals(farmingset.FarmingSetBoots.getItemMeta())) {
                        if (event.getBlock().getType().toString().equalsIgnoreCase("carrots")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(2);
                                ItemStack item = new ItemStack(Material.CARROT, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("potatoes")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(2);
                                ItemStack item = new ItemStack(Material.POTATO, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("wheat")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(2);
                                ItemStack item = new ItemStack(Material.WHEAT, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("beetroots")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(2);
                                ItemStack item = new ItemStack(Material.BEETROOT, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("bamboo")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(4);
                                ItemStack item = new ItemStack(Material.BAMBOO, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("pumpkin")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(6);
                                ItemStack item = new ItemStack(Material.PUMPKIN, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                        if (event.getBlock().getType().toString().equalsIgnoreCase("melon")) {// to be continued...
                            Random rnd = new Random();
                            int ChanceForArmorToGiveExtraLoot = 50;
                            int ExtraLootInt = rnd.nextInt(ChanceForArmorToGiveExtraLoot);

                            if (ExtraLootInt == 0) {
                                int totaldrops = rnd.nextInt(6);
                                ItemStack item = new ItemStack(Material.MELON_SLICE, totaldrops);
                                event.getPlayer().getInventory().addItem(item);
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithFarmingLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainTier1Openables.FarmingLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue = mainlist.getSingleReturnFarmLootBoxList1();
                    ItemStack item = returnvalue;
                    ItemStack returnvalue2 = mainlist.getSingleReturnFarmLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnFarmLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue != null) {
                        ItemStack lootbox = new ItemStack(MainTier1Openables.FarmingLootBox1);
                        event.getPlayer().getInventory().addItem(item);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithMiningLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainTier1Openables.MiningLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnMiningLootBoxList1();
                    ItemStack item1 = returnvalue1;
                    ItemStack returnvalue2 = mainlist.getSingleReturnMiningLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnMiningLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue1 != null) {
                        ItemStack lootbox = new ItemStack(MainTier1Openables.MiningLootBox1);
                        event.getPlayer().getInventory().addItem(item1);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithFishingLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainTier1Openables.FishingLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnFishingLootBoxList1();
                    ItemStack item1 = returnvalue1;
                    ItemStack returnvalue2 = mainlist.getSingleReturnFishingLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnFishingLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue1 != null) {
                        ItemStack lootbox = new ItemStack(MainTier1Openables.FishingLootBox1);
                        event.getPlayer().getInventory().addItem(item1);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithWoodcuttingLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainTier1Openables.WoodcuttingLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnWoodcuttingLootBoxList1();
                    ItemStack item1 = returnvalue1;
                    ItemStack returnvalue2 = mainlist.getSingleReturnWoodcuttingLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnWoodcuttingLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue1 != null) {
                        ItemStack lootbox = new ItemStack(MainTier1Openables.WoodcuttingLootBox1);
                        event.getPlayer().getInventory().addItem(item1);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithNetherLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainT2O.NetherLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnNetherLootBoxList1();
                    ItemStack item1 = returnvalue1;
                    ItemStack returnvalue2 = mainlist.getSingleReturnNetherLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnNetherLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue1 != null) {
                        ItemStack lootbox = new ItemStack(MainT2O.NetherLootBox1);
                        event.getPlayer().getInventory().addItem(item1);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithEndLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainT2O.EndLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnEndLootBoxList1();
                    ItemStack item1 = returnvalue1;
                    ItemStack returnvalue2 = mainlist.getSingleReturnEndLootBoxList1();
                    ItemStack item2 = returnvalue2;
                    ItemStack returnvalue3 = mainlist.getSingleReturnEndLootBoxList1();
                    ItemStack item3 = returnvalue3;
                    if (returnvalue1 != null) {
                        ItemStack lootbox = new ItemStack(MainT2O.EndLootBox1);
                        event.getPlayer().getInventory().addItem(item1);
                        event.getPlayer().getInventory().addItem(item2);
                        event.getPlayer().getInventory().addItem(item3);
                        event.getPlayer().getInventory().removeItem(lootbox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

    @EventHandler
    public static void onRightClickWithCombatLootBox1(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(MainT2O.CombatLootBox1.getItemMeta())) {
                    event.setCancelled(true);
                    Player player = event.getPlayer();
                    ItemStack returnvalue1 = mainlist.getSingleReturnCombatLootBoxList1();
                    ItemStack returnvalue2 = mainlist.getSingleReturnCombatLootBoxList1();
                    ItemStack returnvalue3 = mainlist.getSingleReturnCombatLootBoxList1();
                    if (returnvalue1 != null) {
                        ItemStack LootBox = MainT2O.CombatLootBox1;
                        event.getPlayer().getInventory().addItem(returnvalue1);
                        event.getPlayer().getInventory().addItem(returnvalue2);
                        event.getPlayer().getInventory().addItem(returnvalue3);
                        event.getPlayer().getInventory().removeItem(LootBox);
                        player.getInventory().addItem();
                    }

                }
            }
        }
    }

}
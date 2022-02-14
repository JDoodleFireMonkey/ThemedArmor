package test.plugin.minecraft.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import test.plugin.minecraft.testplugin.commands.*;
import test.plugin.minecraft.testplugin.events.maineventclass;
import test.plugin.minecraft.testplugin.items.armor.demoset;
import test.plugin.minecraft.testplugin.items.armor.farmingset;
import test.plugin.minecraft.testplugin.items.armor.fishingset;
import test.plugin.minecraft.testplugin.items.itemmanager;
import test.plugin.minecraft.testplugin.items.tier1openables.MainTier1Openables;
import test.plugin.minecraft.testplugin.items.tier2openables.MainT2O;
import test.plugin.minecraft.testplugin.listeners.Menu_Handler;


public final class ThemedArmor extends JavaPlugin implements Listener {
    String pluginname = "ThemedArmor";
    private static ThemedArmor plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        System.out.println(pluginname+"Plugin has started");
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getPluginManager().registerEvents(new maineventclass(), this);
        this.getServer().getPluginManager().registerEvents(new Menu_Handler(), this);
        itemmanager.init();
        fishingset.init();
        demoset.init();
        farmingset.init();
        MainTier1Openables.init();
        MainT2O.init();
        getCommand("givewand").setExecutor(new getitemcommands());
        getCommand("gui").setExecutor(new GUIcommands());
        getCommand("givefishingset").setExecutor(new GetFishingSet());
        getCommand("giveDemolitionistset").setExecutor(new GiveDemolitionistSet());
        getCommand("givefarmingset").setExecutor(new GiveFarmingSet());
    }
    public static ThemedArmor getPlugin() {
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(pluginname+"plugin has stopped");

    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerusername = event.getPlayer().getDisplayName();
        System.out.println("a Player Has Joined the server");
        if (playerusername.equals("Christian32")) {
            event.setJoinMessage("§4"+playerusername+"§e Has Joined this server! bow down feeble peasants");
            System.out.println(playerusername+" Has Joined the game");
        }
        if (playerusername.equals("J_Doodle")) {
            event.setJoinMessage("§4"+playerusername+"§e Has Joined this server! bow down feeble peasants");
            System.out.println(playerusername+" Has Joined the game");
        }

    }
}

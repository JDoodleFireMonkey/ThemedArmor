package test.plugin.minecraft.testplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import test.plugin.minecraft.testplugin.items.itemmanager;
import test.plugin.minecraft.testplugin.items.tier1openables.MainTier1Openables;
import test.plugin.minecraft.testplugin.items.tier2openables.MainT2O;

public class getitemcommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only players can use that command");
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givewand")) {
            player.getInventory().addItem(itemmanager.wand);
            player.getInventory().addItem(itemmanager.SuperHoe);
            player.getInventory().addItem(MainTier1Openables.FarmingLootBox1);
            player.getInventory().addItem(MainTier1Openables.MiningLootBox1);
            player.getInventory().addItem(MainTier1Openables.FishingLootBox1);
            player.getInventory().addItem(MainTier1Openables.WoodcuttingLootBox1);
            player.getInventory().addItem(MainT2O.NetherLootBox1);

        }

            return true;
    }

}

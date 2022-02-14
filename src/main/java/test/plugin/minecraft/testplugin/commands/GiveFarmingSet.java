package test.plugin.minecraft.testplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import test.plugin.minecraft.testplugin.items.armor.farmingset;

public class GiveFarmingSet implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only players can use that command");
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givefarmingset")) {
            player.getInventory().addItem(farmingset.FarmingSetHelmet);
            player.getInventory().addItem(farmingset.FarmingSetChestplate);
            player.getInventory().addItem(farmingset.FarmingSetPants);
            player.getInventory().addItem(farmingset.FarmingSetBoots);


        }

        return true;
    }

}
package test.plugin.minecraft.testplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import test.plugin.minecraft.testplugin.items.armor.fishingset;

public class GetFishingSet implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only players can use that command");
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givefishingset")) {
            player.getInventory().addItem(fishingset.FishingSetHelmet);
            player.getInventory().addItem(fishingset.FishingSetChestplate);
            player.getInventory().addItem(fishingset.FishingSetLeggings);
            player.getInventory().addItem(fishingset.FishingSetBoots);


        }

        return true;
    }

}
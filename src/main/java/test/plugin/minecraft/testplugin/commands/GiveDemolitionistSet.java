package test.plugin.minecraft.testplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import test.plugin.minecraft.testplugin.items.armor.demoset;

public class GiveDemolitionistSet implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("only players can use that command");
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giveDemolitionistset")) {
            player.getInventory().addItem(demoset.DemoSetHelmet);
            player.getInventory().addItem(demoset.DemoSetChestPlate);
            player.getInventory().addItem(demoset.DemoSetLeggings);
            player.getInventory().addItem(demoset.DemoSetBoots);


        }

        return true;
    }

}
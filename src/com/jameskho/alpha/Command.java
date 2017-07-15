package com.jameskho.alpha;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Command implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String arg2, String[] args) {
		if(sender instanceof Player) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lHello World from player!"));	
			return true;
	} else {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&lHello World from console!"));	
		return true;
	  }
		
	}

}

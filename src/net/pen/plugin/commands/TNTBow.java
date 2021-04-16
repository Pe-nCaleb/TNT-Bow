package net.pen.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.pen.plugin.main.tntbow;

public class TNTBow implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(p.getInventory().firstEmpty() != -1) {
				
				p.getInventory().addItem(tntbow.Tele);
				
			}
		}
		return false;
	}
	

}

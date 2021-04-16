package net.pen.plugin.listeners;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class RightClick implements Listener{
	    	

	  @EventHandler
	  public void TnTBow(ProjectileHitEvent e) {
		  
		  
	    if (e.getEntity() instanceof org.bukkit.entity.Arrow) {
	    	
	    	
	      Player player = (Player)e.getEntity().getShooter();
	      
	      Location location = e.getEntity().getLocation();
	      
		  if(player.getItemInHand().getItemMeta().getDisplayName().equals("§aTNT Bow")) {
		    	      e.getEntity()
		    	        .getWorld()
		    	        .spawnEntity(e.getEntity().getLocation(), 
		    	          EntityType.PRIMED_TNT);
		    	      e.getEntity().remove();
	    } 
	    }}}
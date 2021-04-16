package net.pen.plugin.main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import net.pen.plugin.commands.TNTBow;
import net.pen.plugin.listeners.RightClick;
import net.pen.plugin.main.tntbow;

public class tntbow extends JavaPlugin{
	
	public static final ItemStack Tele = new ItemStack(Material.BOW);
	public static final ItemMeta TeleMeta = Tele.getItemMeta();
	
	public void onEnable() {

    ItemStack bow = new ItemStack(Material.BOW);
    bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 666);
    ItemMeta meta = bow.getItemMeta();
	TeleMeta.setDisplayName("§aTNT Bow");
    ArrayList<String> lore = new ArrayList<>();
	lore.add(" ");
	lore.add("§6Item Ability: TNT Bow §l§eSHOOT");
	lore.add("§aExplosive arrow");
	lore.add("");
    meta.setLore(lore);
    bow.setItemMeta(meta);
    TeleMeta.setLore(lore);
    TeleMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
    Tele.setItemMeta(TeleMeta);
	Bukkit.getPluginManager().registerEvents(new RightClick(), this);
	getCommand("tntbow").setExecutor(new TNTBow());
	
	}}

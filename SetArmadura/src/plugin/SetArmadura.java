package plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class SetArmadura extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this); 
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("armorset")){
			Player p = (Player)sender;
		
			
		PlayerInventory inventario =p.getInventory();	
			
		
		ChatColor C1 = ChatColor.GREEN;
		
		
		/////Botas//////
		ItemStack botas = new ItemStack (Material.DIAMOND_BOOTS);
		ItemMeta botasMeta = botas.getItemMeta();
		botasMeta.setDisplayName (C1+"Botinators");
		botasMeta.addEnchant(Enchantment.DURABILITY, 100, true);
		botasMeta.addEnchant(Enchantment.DEPTH_STRIDER,100, true);
		botasMeta.addEnchant(Enchantment.LUCK, 100, true);
		botasMeta.addEnchant(Enchantment.OXYGEN,100, true);
		botasMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,100, true);
		botasMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 100, true);
		botasMeta.addEnchant(Enchantment.PROTECTION_FIRE,100, true);
		botasMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE,100, true);
		botasMeta.addEnchant(Enchantment.SILK_TOUCH, 100, true);
		botasMeta.addEnchant(Enchantment.WATER_WORKER,100, true);
		botasMeta.addEnchant(Enchantment.THORNS,100, true);
		botas.setItemMeta(botasMeta);
		inventario.addItem(botas);
		
		////////Pechera/////
		ItemStack pechera = new ItemStack (Material.DIAMOND_CHESTPLATE);
		
		ChatColor C2 = ChatColor.AQUA;
		
		ItemMeta pecheraMeta = pechera.getItemMeta();
		pecheraMeta.setDisplayName (C2+"Pechotinator");
		pecheraMeta.addEnchant(Enchantment.DURABILITY, 100, true);
		pecheraMeta.addEnchant(Enchantment.DEPTH_STRIDER,100, true);
		pecheraMeta.addEnchant(Enchantment.LUCK, 100, true);
		pecheraMeta.addEnchant(Enchantment.OXYGEN,100, true);
		pecheraMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,100, true);
		pecheraMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 100, true);
		pecheraMeta.addEnchant(Enchantment.PROTECTION_FIRE,100, true);
		pecheraMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE,100, true);
		pecheraMeta.addEnchant(Enchantment.SILK_TOUCH, 100, true);
		pecheraMeta.addEnchant(Enchantment.WATER_WORKER,100, true);
		pecheraMeta.addEnchant(Enchantment.THORNS,100, true);
		pechera.setItemMeta(pecheraMeta);
		inventario.addItem(pechera);
		
		///////Casco/////
		ItemStack casco = new ItemStack (Material.DIAMOND_HELMET);
		ChatColor C3 = ChatColor.RED;
		
		ItemMeta cascoMeta = pechera.getItemMeta();
		cascoMeta.setDisplayName (C3+"Casconator");
		cascoMeta.addEnchant(Enchantment.DURABILITY, 100, true);
		cascoMeta.addEnchant(Enchantment.DEPTH_STRIDER,100, true);
		cascoMeta.addEnchant(Enchantment.LUCK, 100, true);
		cascoMeta.addEnchant(Enchantment.OXYGEN,100, true);
		cascoMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,100, true);
		cascoMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 100, true);
		cascoMeta.addEnchant(Enchantment.PROTECTION_FIRE,100, true);
		cascoMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE,100, true);
		cascoMeta.addEnchant(Enchantment.SILK_TOUCH, 100, true);
		cascoMeta.addEnchant(Enchantment.WATER_WORKER,100, true);
		cascoMeta.addEnchant(Enchantment.THORNS,100, true);
		casco.setItemMeta(cascoMeta);
		inventario.addItem(casco);
		
		//////////Pantalones////////
		ItemStack pantalones = new ItemStack (Material.DIAMOND_LEGGINGS);
		ChatColor C4 = ChatColor.YELLOW;
		
		ItemMeta pantalonesMeta = pantalones.getItemMeta();
		pantalonesMeta.setDisplayName (C4+"Pantaloninator");
		pantalonesMeta.addEnchant(Enchantment.DURABILITY, 100, true);
		pantalonesMeta.addEnchant(Enchantment.DEPTH_STRIDER,100, true);
		pantalonesMeta.addEnchant(Enchantment.LUCK, 100, true);
		pantalonesMeta.addEnchant(Enchantment.OXYGEN,100, true);
		pantalonesMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,100, true);
		pantalonesMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 100, true);
		pantalonesMeta.addEnchant(Enchantment.PROTECTION_FIRE,100, true);
		pantalonesMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE,100, true);
		pantalonesMeta.addEnchant(Enchantment.SILK_TOUCH, 100, true);
		pantalonesMeta.addEnchant(Enchantment.WATER_WORKER,100, true);
		pantalonesMeta.addEnchant(Enchantment.THORNS,100, true);
		pantalones.setItemMeta(pantalonesMeta);
		inventario.addItem(pantalones);
		
		}
		
		return true;
	}


	





}
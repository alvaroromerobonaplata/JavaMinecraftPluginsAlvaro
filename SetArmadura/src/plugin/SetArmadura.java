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
		botasMeta.addEnchant(Enchantment.DURABILITY,17, true);
		botas.setItemMeta(botasMeta);
		inventario.addItem(botas);
		
		////////Pechera/////
		ItemStack pechera = new ItemStack (Material.DIAMOND_CHESTPLATE);
		
		ChatColor C2 = ChatColor.BLUE;
		
		ItemMeta pecheraMeta = pechera.getItemMeta();
		pecheraMeta.setDisplayName (C2+"Pechotinator");
		pecheraMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE,17, true);
		pechera.setItemMeta(pecheraMeta);
		inventario.addItem(pechera);
		
		///////Casco/////
		ItemStack casco = new ItemStack (Material.DIAMOND_HELMET);
		ChatColor C3 = ChatColor.RED;
		
		ItemMeta cascoMeta = pechera.getItemMeta();
		cascoMeta.setDisplayName (C3+"Casconator");
		cascoMeta.addEnchant(Enchantment.LUCK,13, true);
		casco.setItemMeta(cascoMeta);
		inventario.addItem(casco);
		
		//////////Pantalones////////
		ItemStack pantalones = new ItemStack (Material.DIAMOND_LEGGINGS);
		ChatColor C4 = ChatColor.YELLOW;
		
		ItemMeta pantalonesMeta = pantalones.getItemMeta();
		pantalonesMeta.setDisplayName (C4+"Pantaloninator");
		pantalonesMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS,17, true);
		pantalones.setItemMeta(pantalonesMeta);
		inventario.addItem(pantalones);
		
		}
		
		return true;
	}


	





}
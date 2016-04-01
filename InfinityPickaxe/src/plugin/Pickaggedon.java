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
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Pickaggedon extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this); 
		ItemStack pickaxe = new ItemStack (Material.DIAMOND_PICKAXE);
		ItemMeta im = pickaxe.getItemMeta();
		im.setDisplayName(ChatColor.DARK_GREEN + "InfinityPickaxe");
		im.addEnchant(Enchantment.KNOCKBACK, 10,true);
		im.addEnchant(Enchantment.DIG_SPEED, 20,true);
		im.addEnchant (Enchantment.DURABILITY, 100, true);
		pickaxe.setItemMeta(im);
		ShapedRecipe monsterPickaxe = new ShapedRecipe(pickaxe);
		monsterPickaxe.shape("$$$","o*o","o*o");
		monsterPickaxe.setIngredient('$',Material.NETHER_STAR);
		monsterPickaxe.setIngredient('*',Material.BLAZE_ROD);
		getServer().addRecipe(monsterPickaxe);
		
	}

	





}
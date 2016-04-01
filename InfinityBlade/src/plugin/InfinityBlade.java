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

public class InfinityBlade extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this); 
		ItemStack sword = new ItemStack (Material.DIAMOND_SWORD);
		ItemMeta im = sword.getItemMeta();
		im.setDisplayName(ChatColor.BLACK + "Infinity Blade");
		im.addEnchant(Enchantment.KNOCKBACK, 100,true);
		im.addEnchant(Enchantment.FIRE_ASPECT, 100,true);
		im.addEnchant (Enchantment.DURABILITY, 100, true);
		sword.setItemMeta(im);
		ShapedRecipe infinityBlade = new ShapedRecipe(sword);
		infinityBlade.shape("o$o","$*$","$*$");
		infinityBlade.setIngredient('$',Material.DIAMOND);
		infinityBlade.setIngredient('*',Material.BLAZE_ROD);
		getServer().addRecipe(infinityBlade);
		
	}

	





}
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
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InfinityPickaxe extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this); 
		ItemStack pickaxe = new ItemStack (Material.DIAMOND_PICKAXE);
		ItemMeta im = pickaxe.getItemMeta();
		im.setDisplayName(ChatColor.GREEN + "InfinityPickaxe");
		im.addEnchant(Enchantment.KNOCKBACK, 10,true);
		im.addEnchant(Enchantment.DIG_SPEED, 25,true);
		im.addEnchant (Enchantment.DURABILITY, 100, true);
		pickaxe.setItemMeta(im);
		ShapedRecipe monsterPickaxe = new ShapedRecipe(pickaxe);
		monsterPickaxe.shape("$$$","o*o","o*o");
		monsterPickaxe.setIngredient('$',Material.NETHER_STAR);
		monsterPickaxe.setIngredient('*',Material.BLAZE_ROD);
		getServer().addRecipe(monsterPickaxe);
		
	}

	

	@EventHandler
	public void onPlayerInteract(PlayerMoveEvent event){
		Player p = event.getPlayer();
		
		if(p.getItemInHand().getType() == Material.DIAMOND_PICKAXE){
			p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100, 5));
			p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 100, 5));
			p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 100, 5));
		}

	}

 }

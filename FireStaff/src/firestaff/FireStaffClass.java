package firestaff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FireStaffClass extends JavaPlugin implements Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player)sender;

		if(command.getName().equalsIgnoreCase("firestaff")){
			ItemStack varaFuego = new ItemStack(Material.BLAZE_ROD);
			ItemMeta varaMeta = varaFuego.getItemMeta();
			varaMeta.setDisplayName(ChatColor.GOLD + "Vara de fuego de" + p.getName());
			varaFuego.setItemMeta(varaMeta);
			p.setItemInHand(varaFuego);
			return true;
		}

		return false;
	}

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this,this);
		
		
		
		
		
		
		
		
		
		
		
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		if(event.getAction()==(Action.LEFT_CLICK_AIR)|| event.getAction()==(Action.LEFT_CLICK_BLOCK)){
			ItemStack itemEnMano = event.getPlayer().getItemInHand();
			if(itemEnMano != null){
				ItemMeta im = itemEnMano.getItemMeta();
				if(im != null){
					if(im.getDisplayName() != null && im.getDisplayName().contains("fuego")){
						Player p = event.getPlayer();
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());
						p.launchProjectile(SmallFireball.class, p.getEyeLocation().getDirection());


					}
					
					

				}
			}

		}
	}

}
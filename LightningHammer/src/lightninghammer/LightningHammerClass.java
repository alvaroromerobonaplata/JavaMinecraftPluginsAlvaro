package lightninghammer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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

public class LightningHammerClass extends JavaPlugin implements Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player)sender;

		if(command.getName().equalsIgnoreCase("lightning")){
			ItemStack varaRayo = new ItemStack(Material.DIAMOND_AXE);
			ItemMeta varaMeta = varaRayo.getItemMeta();
			varaMeta.setDisplayName(ChatColor.BLUE + "LightningHammer");
			varaRayo.setItemMeta(varaMeta);
			p.setItemInHand(varaRayo);
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
					if(im.getDisplayName() != null && im.getDisplayName().contains("LightningHammer")){
						Player p = event.getPlayer();
						Location l = p.getTargetBlock(null, 225).getLocation();
						l.getWorld().strikeLightning(l);
						
						//X X X
						//X O X
						//X X X
						
						int x = l.getBlockX();
						int y = l.getBlockY();
						int z = l.getBlockZ();
						
						Location l1= new Location(l.getWorld(), x-1, y, z-1);
						Location l2= new Location(l.getWorld(), x-1, y, z);
						Location l3= new Location(l.getWorld(), x-1, y, z+1);
						Location l4= new Location(l.getWorld(), x, y, z-1);
						Location l5= new Location(l.getWorld(), x, y, z+1);
						Location l6= new Location(l.getWorld(), x+1, y, z-1);
						Location l7= new Location(l.getWorld(), x+1, y, z);
						Location l8= new Location(l.getWorld(), x+1, y, z+1);
						
						l.getWorld().strikeLightning(l1);
						l.getWorld().strikeLightning(l2);
						l.getWorld().strikeLightning(l3);
						l.getWorld().strikeLightning(l4);
						l.getWorld().strikeLightning(l5);
						l.getWorld().strikeLightning(l6);
						l.getWorld().strikeLightning(l7);
						l.getWorld().strikeLightning(l8);
						
						
					}
				}
			}
		}

	}
	
	
	@EventHandler
	public void onPlayerInteract(PlayerMoveEvent event){
		Player p = event.getPlayer();
		
		if(p.getItemInHand().getType() == Material.DIAMOND_AXE){
			p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 10));
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 100));
			
		}
	
	}
}
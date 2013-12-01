package com.min3craftdud3.FlyBoots;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FlyBoots extends JavaPlugin implements Listener{
	public void onEnable(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	@EventHandler
	public void onMove(PlayerMoveEvent e){
		try{
		Player p = e.getPlayer();
		if(p != null && p.getInventory().getBoots().getType() == Material.GOLD_BOOTS){
			p.setAllowFlight(true);
		}else{
			p.setAllowFlight(false);
		}
		}catch(Exception ex){ex.printStackTrace();}
	}
}

package io.teamelite.tablist;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
    	TabListChanger.setHeaderAndFooter(e.getPlayer(), ChatColor.DARK_RED + ChatColor.BOLD.toString() + "Team" + ChatColor.GOLD + "Elite" + ChatColor.RED + " Build Server", ChatColor.GOLD + ChatColor.BOLD.toString() + "http://www.mcteamelite.com");
	}
}

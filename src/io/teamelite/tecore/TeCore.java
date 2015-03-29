package io.teamelite.tecore;

import io.teamelite.alert.BlockPlace;
import io.teamelite.alert.ChestCount;
import io.teamelite.alert.Interact;
import io.teamelite.alert.LogFile;
import io.teamelite.tablist.PlayerJoin;
import io.teamelite.tablist.TabListChanger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TeCore extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getLogger().info("Plugin Enabled");
        getConfig().options().copyDefaults(true);
        saveConfig();
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new BlockPlace(), this);
        pm.registerEvents(new Interact(), this);
        pm.registerEvents(new ChestCount(), this);
        pm.registerEvents(new PlayerJoin(), this);
        Commands cmds = new Commands();

        getCommand("setworld").setExecutor(cmds);
        getCommand("showworld").setExecutor(cmds);
        getCommand("countchests").setExecutor(cmds);
        getCommand("reset").setExecutor(cmds);
        getCommand("ignoreworld").setExecutor(cmds);
        getCommand("logworld").setExecutor(cmds);
        getCommand("arrow").setExecutor(cmds);
        getCommand("done").setExecutor(cmds);
        getCommand("stafflist").setExecutor(cmds);
        getCommand("autoflower").setExecutor(cmds);
        getCommand("clearflower").setExecutor(cmds);
        getCommand("autosnow").setExecutor(cmds);
        getCommand("clearsnow").setExecutor(cmds);

        LogFile.logFile("Block place and interactions");
        
        for(Player p : Bukkit.getOnlinePlayers()) {
        	TabListChanger.setHeaderAndFooter(p, ChatColor.DARK_RED + ChatColor.BOLD.toString() + "Team" + ChatColor.GOLD + "Elite" + ChatColor.RED + " Build Server", ChatColor.GOLD + ChatColor.BOLD.toString() + "http://www.mcteamelite.com");
        }
        
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Plugin Disabled");
        getConfig().set("World", "world");
        getConfig().set("World.Chests", 0);
        getConfig().set("World.EnderChests", 0);
        plugin = null;
    }

    public static Plugin getInstance() {
        return plugin;
    }



}

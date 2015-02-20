package alert;

import static alert.ChestCount.count;
import static alert.ChestCount.count2;
import java.io.IOException;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import static tecore.Commands.a;
import static tecore.Commands.p;
import static tecore.Misc.prefix;
import tecore.TeCore;

public class CommandMethods {

    private static final Plugin plugin = TeCore.getInstance();
    private List<String> worldList = plugin.getConfig().getStringList("IgnoreWorlds");
    private String worldname = plugin.getConfig().getString("World");
    int chests = plugin.getConfig().getInt("Chests");
    int echests = plugin.getConfig().getInt("EnderChests");

    public boolean setWorld() {

        if (a.length < 1) {
            return false;
        }
        World world = (Bukkit.getServer().getWorld(a[0]));
        if (world == null) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "The world " + a[0] + " does not exsist.");
            return true;
        } else {
            plugin.getConfig().set("World", a[0]);
            plugin.getConfig().set("Chests", 0);
            plugin.getConfig().set("EnderChests", 0);
            plugin.saveConfig();
            p.sendMessage(prefix + ChatColor.GOLD + "The world has been set to " + a[0]);
            return true;
        }
    }

    public boolean showWorld() {

        if (worldname == null) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "The world is not set.");
            return true;
        } else {
            p.sendMessage(prefix + ChatColor.GOLD + "The selected world is " + worldname);
            return true;
        }
    }

    public boolean countChests() {

        if (chests == 0 && echests == 0) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "There are no chests on the world.");
            return true;
        } else {
            p.sendMessage(prefix + ChatColor.GOLD + "Chests: " + chests);
            p.sendMessage(prefix + ChatColor.GOLD + "Ender Chests: " + echests);
            return true;
        }
    }

    public boolean reset() {

        if (chests == 0 && echests == 0) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "Chests are already 0");
            return true;
        } else {
            plugin.getConfig().set("Chests", 0);
            plugin.getConfig().set("EnderChests", 0);
            count = 0;
            count2 = 0;
            p.sendMessage(prefix + ChatColor.GOLD + "The counter has been reset.");
            return true;
        }
    }

    public boolean ignoreWorld() {
        if (a.length < 1) {
            return false;
        }
        World world = (Bukkit.getServer().getWorld(a[0]));
        if (world == null) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "The world " + a[0] + " does not exsist.");
            return true;
        } else {
            worldList.add(a[0]);
            plugin.getConfig().set("IgnoreWorlds", worldList);
            plugin.saveConfig();
            p.sendMessage(prefix + " " + ChatColor.GOLD + a[0] + " is now Ignored.");
            return true;
        }
    }

    public boolean logWorld() {
        if (a.length < 1) {
            return false;
        }
        World world = (Bukkit.getServer().getWorld(a[0]));
        if (world == null) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "The world " + a[0] + " does not exsist.");
            return true;
        } else {
            worldList.remove(a[0]);
            p.sendMessage(prefix + ChatColor.GOLD + a[0] + " is now logged.");
            return true;
        }

    }
}

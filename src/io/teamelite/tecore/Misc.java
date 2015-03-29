package io.teamelite.tecore;

import static io.teamelite.tecore.Commands.a;
import static io.teamelite.tecore.Commands.p;
import static io.teamelite.tecore.Misc.prefix;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Misc {

    public static String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "] ";

    public void arrow() {
        PlayerInventory pi = p.getInventory();
        pi.addItem(new ItemStack(Material.ARROW, 1));
        p.sendMessage(prefix + ChatColor.GOLD + " You have been given an arrow!");
    }

    public void done() {
        if (a.length == 0) {
            p.kickPlayer(ChatColor.DARK_RED + "UMAD" + ChatColor.GOLD + "BRO?");
            getServer().broadcastMessage(prefix + ChatColor.RED + " " + p.getName() + " rage quit the server!");
        } else {
            if (a.length == 1 && p.isOp()) {
                Player target = getServer().getPlayer(a[0]);
                if (target == null) {
                    p.sendMessage(prefix + ChatColor.RED + "Command was not performed: Player could not be found.");
                } else {
                    target.kickPlayer(ChatColor.DARK_RED + "UMAD" + ChatColor.GOLD + "BRO?");
                    getServer().broadcastMessage(prefix + ChatColor.RED + " " + target.getName() + " rage quit the server thanks to " + p.getName());
                }
            }
        }
    }
}
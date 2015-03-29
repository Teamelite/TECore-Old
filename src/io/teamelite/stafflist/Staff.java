package io.teamelite.stafflist;

import static io.teamelite.tecore.Commands.a;
import static io.teamelite.tecore.Commands.p;
import static io.teamelite.tecore.Misc.prefix;
import org.bukkit.Bukkit;
import static org.bukkit.Bukkit.getServer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Staff {

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
                Player target = Bukkit.getServer().getPlayer(a[0]);
                if (target == null) {
                    p.sendMessage(prefix + ChatColor.RED + "Command was not performed: Player could not be found.");
                } else {
                    target.kickPlayer(ChatColor.DARK_RED + "UMAD" + ChatColor.GOLD + "BRO?");
                    getServer().broadcastMessage(prefix + ChatColor.RED + " " + target.getName() + " rage quit the server thanks to " + p.getName());
                }
            }
        }
    }

    public void staffList() {
        if (a.length >= 2) {
            p.sendMessage(prefix + ChatColor.DARK_RED + " Too many arguments! Correct usage for this command is /stafflist <name>");
        } else {
            if (a.length == 0) {
                p.sendMessage(prefix + ChatColor.GOLD + " Find more information about the staff listed below by using the command: /stafflist <name>!");
                p.sendMessage(prefix + ChatColor.GOLD + " Dave, Jamie, Alex, Kellie, Ben, Deni, Liam, Zach, David, Trey");
            } else {
                if (a.length == 1) {
                    if (a[0].equalsIgnoreCase("Dave")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Dave");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Life855");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Owner");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Head Developer, General Manager, Public Relations, Everything Else");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Owns & maintains all servers related to " + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Jamie")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Jamie");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " AlpakaWhacker");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Admin");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Creations, MCGamer Relations");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Begins and maintains projects within the build team, he also performs other administrative tasks");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Kellie")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Kellie");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " KellieBreanne");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Admin");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Creations, Team Management");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Begins and maintains projects within the build team, he also performs other administrative tasks");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact her via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Alex")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Alex");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " adragonfire9");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Moderator");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Team Management");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Assists owners with issues on the " + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite servers");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Trey")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Trey");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Froggytv");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Moderator");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Head sf Media");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Record Trailers and Videos for the teams Youtube");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Ben")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Ben");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Gimli");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " ServerOP");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Head of Servers, Dept Head of Creations");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Assists Dave with issues on the " + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite servers, performs bug fixes and codes/develops plugins as well as assisting Kellie with builds");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Deni")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Deni");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " MrBestDeni");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Admin");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Community Manager");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Manages General day to day running of team he is also the community manager");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Zach")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Zach");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " PleaseTeamIFan");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Moderator");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Dept Community Manager");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Runs builds and spends most of his time dealing with the community and organising events");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("Liam")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Liam");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " RobloxianFire2");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Developer");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Devloper");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Assists Ben/Dave with issues on the " + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite servers, performs bug fixes and also codes/develops plugins");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else if (a[0].equalsIgnoreCase("David")) {
                        p.sendMessage(ChatColor.DARK_GRAY + "----------" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "----------");
                        p.sendMessage(ChatColor.DARK_RED + "Name" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " David");
                        p.sendMessage(ChatColor.DARK_RED + "IGN" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Optics");
                        p.sendMessage(ChatColor.DARK_RED + "Rank" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Moderator");
                        p.sendMessage(ChatColor.DARK_RED + "Roles" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Head of Forums, Head of Applications");
                        p.sendMessage(ChatColor.DARK_RED + "Description" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Fixes and Updates the teams Forums and manages the application process");
                        p.sendMessage(ChatColor.DARK_RED + "Contact" + ChatColor.DARK_GRAY + ":" + ChatColor.GOLD + " Contact him via the TeamSpeak, teamelite.io");

                    } else {
                        p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Team" + ChatColor.GOLD + "Elite" + ChatColor.DARK_GRAY + "]" + ChatColor.GOLD + " That staff member does not exist - Please try again.");
                    }
                }
            }
        }
    }

}

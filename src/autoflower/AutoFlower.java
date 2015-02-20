package autoflower;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import static tecore.Commands.a;
import static tecore.Commands.p;
import static tecore.Misc.prefix;

public class AutoFlower {

    public FlowerProducer flowerProducer;

    public boolean playerCheck() {
        if (!(p instanceof Player)) {
            p.sendMessage(prefix + ChatColor.DARK_RED + "Must be instance of player!"); //Locations are required
            return true;
        }
        return false;
    }

    Player player = (Player) p;
    double chance = 0.7;
    double flowerChance = 0.003;

    public boolean autoFlower() {
        if (a.length > 0) {

            int radius = -1;
            try {
                radius = Integer.valueOf(a[0]);
                if (a.length > 1) {
                    double in = (double) Math.abs(Integer.valueOf(a[1]));
                    if (in > 100) {
                        in = 100;
                    }
                    chance = in / 100; //Converts to between 0 and 1 for algorithm use
                }
                if (a.length > 2) {
                    double in = (double) Math.abs(Integer.valueOf(a[2]));
                    if (in > 100) {
                        in = 100;
                    }
                    flowerChance = in / 2200; //Ensures value will at most cause all flowers to have an equal chance to spawn
                }
            } catch (NumberFormatException e) {
                if (a.length > 2) {
                    player.sendMessage(prefix + ChatColor.DARK_RED + "All arguments must be an integer! [radius] <Chance 0-100> <flowerChance 0-100>");
                } else if (a.length > 1) {
                    player.sendMessage(prefix + ChatColor.DARK_RED + "Both arguments must be an integer! [radius] <Chance 0-100>");
                } else {
                    player.sendMessage(prefix + ChatColor.DARK_RED + "Argument must be an integer. [radius]");
                }

                return true;
            }

            radius = Math.abs(radius); //Ensure no negatives. Only positives. :)

            flowerProducer.createFlowers(radius, player, chance, flowerChance);

            player.sendMessage(prefix + ChatColor.GOLD + "Complete!");
            return true;
        }
        return false;
    }

    public boolean clearFlower() {
        if (a.length > 0) {

            int radius = -1;
            try {

                radius = Integer.valueOf(a[0]);

            } catch (NumberFormatException e) {

                player.sendMessage(prefix + ChatColor.DARK_RED + "Argument must be an integer. [radius]");
                return true;
            }

            radius = Math.abs(radius);

            flowerProducer.clearFlowers(radius, player);

            player.sendMessage(prefix + ChatColor.GOLD + "Complete!");
            return true;
        }
        return false;
    }

    public boolean autoSnow() {

        if (a.length > 0) {

            int radius = -1;
            try {
                radius = Integer.valueOf(a[0]);
            } catch (NumberFormatException e) {
                player.sendMessage(prefix + ChatColor.DARK_RED + "Argument must be an integer. [radius]");
                return true;
            }

            flowerProducer.snowGenerate(radius, player);
            player.sendMessage(prefix + ChatColor.GOLD + "Complete!");

            return true;

        }
        return false;
    }

    public boolean clearSnow() {

        if (a.length > 0) {

            int radius = -1;
            try {
                radius = Integer.valueOf(a[0]);
            } catch (NumberFormatException e) {
                player.sendMessage(prefix + ChatColor.DARK_RED + "Argument must be an integer. [radius]");
            }

            flowerProducer.snowRemove(radius, player);
            player.sendMessage(prefix + ChatColor.GOLD + "Complete!");

            return true;
        }
        return false;
    }

}

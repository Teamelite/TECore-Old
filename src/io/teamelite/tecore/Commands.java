package io.teamelite.tecore;


import io.teamelite.alert.CommandMethods;
import io.teamelite.autoflower.AutoFlower;
import io.teamelite.stafflist.Staff;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Commands implements CommandExecutor {

    private static final Plugin plugin = TeCore.getInstance();
    public static Player p;
    public static String[] a;
    private Staff staff;
    private CommandMethods cmdm;
    private AutoFlower af;
    private Misc misc;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        this.staff = new Staff();
        this.cmdm = new CommandMethods();
        this.af = new AutoFlower();
        this.misc = new Misc();
        p = (Player) sender;
        a = (String[]) args;

        if (cmd.getName().equalsIgnoreCase("setworld") && p.isOp()) {
            cmdm.setWorld();
            return true;

        }

        if (cmd.getName().equalsIgnoreCase("showworld")) {
            cmdm.showWorld();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("countchests")) {
            cmdm.countChests();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("reset") && p.isOp()) {
            cmdm.reset();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("ignoreworld") && p.isOp()) {
            cmdm.ignoreWorld();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("logworld") && p.isOp()) {
            cmdm.logWorld();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("arrow")) {
            misc.arrow();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("done")) {
            misc.done();
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("stafflist")) {
            staff.staffList();
            return true;
        }
        
        if (cmd.getName().equalsIgnoreCase("autoflower")){
            af.playerCheck();
            af.autoFlower();
            return true;
        }
        
        if (cmd.getName().equalsIgnoreCase("clearflower")){
            af.playerCheck();
            af.clearFlower();
            return true;
        }
        
        if (cmd.getName().equalsIgnoreCase("autosnow")){
            af.playerCheck();
            af.autoSnow();
            return true;
        }
        
        if (cmd.getName().equalsIgnoreCase("clearsnow")){
            af.playerCheck();
            af.clearSnow();
            return true;
        }

        return false;
    }
}

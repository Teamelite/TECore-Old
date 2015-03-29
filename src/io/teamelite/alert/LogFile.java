package io.teamelite.alert;

import io.teamelite.tecore.TeCore;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.bukkit.plugin.Plugin;

public class LogFile {

    public static PrintWriter pw;
    private static Plugin plugin = TeCore.getInstance();

    public static void logFile(String message) {
        try {
            if (plugin != null) {
                File pluginFolder = plugin.getDataFolder();
                File log = new File(plugin.getDataFolder(), "log.txt");
                FileWriter fw = new FileWriter(log, true);
                pw = new PrintWriter(fw);

                if (!pluginFolder.exists()) {
                    pluginFolder.mkdir();
                }

                if (!log.exists()) {
                    log.createNewFile();
                }

                pw.write(message + "\n");
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

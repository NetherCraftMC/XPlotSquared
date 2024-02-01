package de.ghost143.xplotsquared.plotsquared;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class XCredits implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("§8-*-*-*-*-*-*-*-*-*");
            player.sendMessage("§a§lXCredits §7» §aBUILD VERSION§7: §bSNAPSHOT");
            player.sendMessage("§a§lXCredits §7» §aXPlotSquared made by §bGhost143");
            player.sendMessage("§8-*-*-*-*-*-*-*-*-*");

            player.sendMessage("§8-*-*-*-*-*-*-*-*-*");
        } else {
            sender.sendMessage("§a§lKitFFA §7» §4Fehler!§7, §cBeim Ausführen des Commands§b....");
        }
        return true;
    }
}

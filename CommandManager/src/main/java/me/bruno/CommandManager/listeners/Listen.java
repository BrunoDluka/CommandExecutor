package me.bruno.CommandManager.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.bruno.CommandManager.command.Command;
import me.bruno.CommandManager.command.CommandInfo;
import me.bruno.CommandManager.command.CommandRegister;

public class Listen implements Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		for (Command c : new CommandRegister().getCommands())
			c.executor.run(new CommandInfo(c.name, p));
	}

}

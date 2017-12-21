package me.bruno.CommandManager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.bruno.CommandManager.command.Command;
import me.bruno.CommandManager.command.CommandExecutor;
import me.bruno.CommandManager.command.CommandInfo;
import me.bruno.CommandManager.command.CommandRegister;
import me.bruno.CommandManager.listeners.Listen;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerListener(new Listen());
		
		
		Command command = new me.bruno.CommandManager.command.Command(name, new CommandExecutor() {
			
			public void run(CommandInfo info) {
				Player player = info.getExecutor();
				String command = info.getName();
			}
		});
		
		CommandRegister.register(command);
		
		
	}
	
	public void registerListener(Listener listener) {
		Bukkit.getPluginManager().registerEvents(listener,  this);
	}

}

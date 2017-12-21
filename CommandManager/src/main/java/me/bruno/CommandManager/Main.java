package me.bruno.CommandManager;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.bruno.CommandManager.listeners.Listen;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerListener(new Listen());
	}
	
	public void registerListener(Listener listener) {
		Bukkit.getPluginManager().registerEvents(listener,  this);
	}

}

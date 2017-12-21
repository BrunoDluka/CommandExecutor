package me.bruno.CommandManager.command;

import org.bukkit.entity.Player;

public class CommandInfo {

	public CommandInfo(String name, Player executor) {
		this.name = name;
		this.executor = executor;
	}

	private String name;

	public Player getExecutor() {
		return executor;
	}

	private Player executor;

	public String getName() {
		return name;
	}

}
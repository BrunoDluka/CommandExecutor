package me.bruno.CommandManager.command;

public class Command {
	
	public String name;
	public CommandExecutor executor;
	
	public Command(String name, CommandExecutor executor) {
		this.name = name;
		this.executor = executor;
	}
	
}

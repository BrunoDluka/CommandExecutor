package me.bruno.CommandManager.command;

import java.util.ArrayList;
import java.util.List;

public class CommandRegister {
	
	private static List<Command> commands = new ArrayList<Command>();
	
	public static void register(Command command) {
		commands.add(command);
	}
	
	public static List<Command> getCommands() {
		return commands;
	}

}

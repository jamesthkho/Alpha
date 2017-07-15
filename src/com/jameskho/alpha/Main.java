package com.jameskho.alpha;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getLogger().info("Alpha has been enabled!");
		getCommand("alpha").setExecutor(new Command());
	}
	@Override
	public void onDisable() {
		getLogger().info("Alpha has been disabled!");		
	}

}

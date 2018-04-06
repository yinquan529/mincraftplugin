package io.github.yinquan.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MytestPlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}

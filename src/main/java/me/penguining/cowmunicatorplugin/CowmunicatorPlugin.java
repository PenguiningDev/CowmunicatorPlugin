package me.penguining.cowmunicatorplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CowmunicatorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("cowmunicator")).setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

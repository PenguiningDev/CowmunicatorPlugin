    package me.penguining.cowmunicatorplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command!");
            return false;

        }

        Player player = (Player) sender;
        Location location = player.getLocation();

        if (player.isOp()) {
            if (command.getName().equalsIgnoreCase("cowmunicator")) {

                LivingEntity cow = (LivingEntity) location.getWorld().spawnEntity(location, EntityType.COW);

                cow.setCustomName(ChatColor.GOLD + "Cow-municator");
                cow.setCustomNameVisible(true);

                cow.setAI(false); // Disable default AI
                cow.setSilent(true); // Prevent sounds
                cow.setCollidable(false); // Prevent collision
                cow.setGravity(false); // Prevent falling
                cow.setInvulnerable(true); // Prevent damage
                cow.setCanPickupItems(false); // Prevent item pickup
                cow.setInvulnerable(true);

                return true;
            }
        }

        return true;
    }
}

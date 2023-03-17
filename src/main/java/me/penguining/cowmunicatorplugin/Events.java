package me.penguining.cowmunicatorplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

import java.util.Random;

public class Events implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();

        if (event.getRightClicked() instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) event.getRightClicked();

            if (event.getHand().equals(EquipmentSlot.HAND)) {


                if (entity.getCustomName().equalsIgnoreCase(ChatColor.GOLD + "Cow-municator")) {
                    Random rand = new Random();

                    int randomInt = rand.nextInt(10 + 1);

                    if (randomInt == 1) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Hello there! I am a cow-municator, designed to deliver random messages when you click on me!");
                    }

                    if (randomInt == 2) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Designed by Penguining.");
                    }

                    if (randomInt == 3) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Made in China.");
                    }

                    if (randomInt == 4) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Inspired by " + ChatColor.RED + "[ADMIN] Brandonjja" + ChatColor.WHITE + ".");
                    }

                    if (randomInt == 5) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "i luv right clix");
                    }

                    if (randomInt == 6) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "What am I meant to do again?");
                    }

                    if (randomInt == 7) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Moooooooo!");
                    }

                    if (randomInt == 8) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.RED + "SEND HELP!");
                    }

                    if (randomInt == 9) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Moo");
                    }

                    if (randomInt == 10) {
                        player.sendMessage(ChatColor.GOLD + "[COW-MUNICATOR] " + ChatColor.WHITE + "Seriously? You again?");
                    }
                }
            }
        }
    }
}


package de.jensausngl.comands;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class TeamChat extends Command {
    public TeamChat(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer player = (ProxiedPlayer) sender;

        if (args[0].equalsIgnoreCase("Teamchat")) {

            if (!player.hasPermission("teamchat.use")) {
                player.sendMessage("§6Dazu hast du keine Rechte");
                return;
            }

        }
    }
}

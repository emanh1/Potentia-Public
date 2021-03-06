package me.potentia.client.command;

import me.potentia.client.module.Modules;
import me.potentia.client.util.ChatUtils;
import me.potentia.client.module.Module;

public class CommandFly extends Command {

    @Override
    public boolean onCommand(String command, String[] args) {
        Module fly = Modules.getById("fly");
        Modules.toggle(fly.getId());
        ChatUtils.printMessage(ChatUtils.toggledMsg(fly));
        return false;
    }

    @Override
    public String getUsage() {
        return "fly";
    }

    @Override
    public String getDescription() {
        return "Gives you the ability to fly";
    }
}

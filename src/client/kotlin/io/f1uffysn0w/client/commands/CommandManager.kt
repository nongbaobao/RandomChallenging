package io.f1uffysn0w.client.commands

import io.f1uffysn0w.client.commands.impl.*
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.minecraft.commands.Commands

class CommandManager {

    val commands = listOf<CommandBase>(
        HelloCommand()
    )

    init {
        CommandRegistrationCallback.EVENT.register { dispatcher, _, _ ->
            val root = Commands.literal("rcg")
            commands.forEach {
                it.attach(root)
            }
            dispatcher.register(root)
        }
    }

}
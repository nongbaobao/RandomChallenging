package io.f1uffysn0w.client.commands.impl

import com.mojang.brigadier.builder.LiteralArgumentBuilder
import io.f1uffysn0w.client.commands.Feedback
import io.f1uffysn0w.client.commands.CommandBase
import net.minecraft.commands.CommandSourceStack
import net.minecraft.commands.Commands

class HelloCommand : CommandBase {

    override fun attach(root: LiteralArgumentBuilder<CommandSourceStack>) {
        root.then(Commands.literal("hello")
            .executes {
                Feedback.ok(it.source, "Hello Command")
                1
            })
    }
}
package io.f1uffysn0w.client.commands

import com.mojang.brigadier.builder.LiteralArgumentBuilder
import net.minecraft.commands.CommandSourceStack

interface CommandBase {

    fun attach(root: LiteralArgumentBuilder<CommandSourceStack>)

}
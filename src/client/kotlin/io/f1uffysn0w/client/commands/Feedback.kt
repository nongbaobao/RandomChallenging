package io.f1uffysn0w.client.commands

import net.minecraft.commands.CommandSourceStack
import net.minecraft.network.chat.Component

class Feedback {

    companion object {
        fun ok(src: CommandSourceStack, msg: String, vararg args: Any?) {
            src.sendSuccess({ Component.literal(if (args.isEmpty()) "[RCG] $msg" else msg.format(*args)) }, false)
        }

        fun fail(src: CommandSourceStack, msg: String) {
            src.sendFailure(Component.literal(msg))
        }
    }

}
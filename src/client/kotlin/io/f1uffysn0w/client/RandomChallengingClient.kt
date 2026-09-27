package io.f1uffysn0w.client

import io.f1uffysn0w.client.commands.CommandManager
import net.fabricmc.api.ClientModInitializer

object RandomChallengingClient : ClientModInitializer {
	override fun onInitializeClient() {
		// Init Commands
		CommandManager()
	}
}
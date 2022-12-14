package net.xalixilax.untitledmod;

import net.fabricmc.api.ModInitializer;
import net.xalixilax.untitledmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UntitledMod implements ModInitializer {
	public static final String MOD_ID = "untitledmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}

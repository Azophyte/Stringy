package net.azo.stringy;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stringy implements ModInitializer {
	public static final String MOD_ID = "stringy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Stringy loaded!");
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}

}

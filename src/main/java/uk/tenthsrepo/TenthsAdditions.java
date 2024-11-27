package uk.tenthsrepo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.tenthsrepo.block.ModBlocks;
import uk.tenthsrepo.item.ModItemGroups;
import uk.tenthsrepo.item.ModItems;
import uk.tenthsrepo.world.gen.ModWorldGeneration;

public class TenthsAdditions implements ModInitializer {
	public static final String MOD_ID = "tenthsadditions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
	}
}
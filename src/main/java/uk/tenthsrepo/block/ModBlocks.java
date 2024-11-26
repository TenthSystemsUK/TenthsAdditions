package uk.tenthsrepo.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import uk.tenthsrepo.TenthsAdditions;

public class ModBlocks {

    public static final Block COMPACTED_ETERNAL_COIN = registerBlock("compacted_eternal_coin",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block ETERNAL_FRAGMENT_ORE = registerBlock("eternal_fragment_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TenthsAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TenthsAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TenthsAdditions.LOGGER.info("Registering ModBlocks for " + TenthsAdditions.MOD_ID);
    }
}

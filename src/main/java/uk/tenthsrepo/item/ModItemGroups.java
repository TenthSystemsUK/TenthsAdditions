package uk.tenthsrepo.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import uk.tenthsrepo.TenthsAdditions;
import uk.tenthsrepo.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup CURRENCY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TenthsAdditions.MOD_ID, "currency"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.currency"))
                    .icon(() -> new ItemStack(ModItems.ETERNAL_COIN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPACTED_ETERNAL_COIN);
                        entries.add(ModItems.ETERNAL_COIN);
                        entries.add(ModItems.ETERNAL_COIN_FRAG);
                    }).build());

    public static void registerItemGroups() {
        TenthsAdditions.LOGGER.info("Registering Item Groups for" + TenthsAdditions.MOD_ID);
    }
}

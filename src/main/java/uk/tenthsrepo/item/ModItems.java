package uk.tenthsrepo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import uk.tenthsrepo.TenthsAdditions;

public class ModItems {
    public static final Item ETERNAL_COIN = registerItem("eternal_coin", new Item(new FabricItemSettings()));
    public static final Item ETERNAL_COIN_FRAG = registerItem("eternal_coin_frag", new Item((new FabricItemSettings())));

    /* private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ETERNAL_COIN);
        entries.add(ETERNAL_COIN_FRAG);
    } */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TenthsAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TenthsAdditions.LOGGER.info("Registering ModItems for " + TenthsAdditions.MOD_ID);
        // ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

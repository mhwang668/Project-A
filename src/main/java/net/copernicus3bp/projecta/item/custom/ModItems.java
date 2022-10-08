package net.copernicus3bp.projecta.item.custom;

import net.copernicus3bp.projecta.ProjectA;
import net.copernicus3bp.projecta.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectA.MOD_ID);

    public static final RegistryObject<Item> IRON_PALADIN_SPAWN_EGG = ITEMS .register("iron_paladin_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.IRON_PALADIN, 0xd6d6d6, 0x855252,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

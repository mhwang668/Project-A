package net.copernicus3bp.projecta.entity;

import net.copernicus3bp.projecta.ProjectA;
import net.copernicus3bp.projecta.entity.custom.IronPaladinEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProjectA.MOD_ID);

    public static final RegistryObject<EntityType<IronPaladinEntity>> IRON_PALADIN =
            ENTITY_TYPES.register("iron_paladin",
                    () -> EntityType.Builder.of(IronPaladinEntity::new, MobCategory.MONSTER)
                            .sized(1.6f, 3.3f)
                            .build(new ResourceLocation(ProjectA.MOD_ID, "iron_paladin").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

package net.copernicus3bp.projecta.event;

import net.copernicus3bp.projecta.ProjectA;
import net.copernicus3bp.projecta.entity.ModEntityTypes;
import net.copernicus3bp.projecta.entity.custom.IronPaladinEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = ProjectA.MOD_ID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = ProjectA.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.IRON_PALADIN.get(), IronPaladinEntity.setAttributes());
        }
    }
}

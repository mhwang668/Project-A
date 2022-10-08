package net.copernicus3bp.projecta.entity.client;

import net.copernicus3bp.projecta.ProjectA;
import net.copernicus3bp.projecta.entity.custom.IronPaladinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IronPaladinModel extends AnimatedGeoModel<IronPaladinEntity> {
    @Override
    public ResourceLocation getModelResource(IronPaladinEntity object) {
        return new ResourceLocation(ProjectA.MOD_ID, "geo/iron_paladin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IronPaladinEntity object) {
        return new ResourceLocation(ProjectA.MOD_ID, "textures/entity/iron_paladin_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IronPaladinEntity animatable) {
        return new ResourceLocation(ProjectA.MOD_ID, "animations/iron_paladin.animation.json");
    }
}

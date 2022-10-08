package net.copernicus3bp.projecta.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.copernicus3bp.projecta.ProjectA;
import net.copernicus3bp.projecta.entity.custom.IronPaladinEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class IronPaladinRenderer extends GeoEntityRenderer<IronPaladinEntity> {
    public IronPaladinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IronPaladinModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(IronPaladinEntity instance) {
        return new ResourceLocation(ProjectA.MOD_ID, "textures/entity/iron_paladin_texture.png");
    }

    @Override
    public RenderType getRenderType(IronPaladinEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0f, 1.0f, 1.0f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

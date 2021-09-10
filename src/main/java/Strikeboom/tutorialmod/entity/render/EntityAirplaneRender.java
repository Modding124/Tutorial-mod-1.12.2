package Strikeboom.tutorialmod.entity.render;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.entity.EntityAirplane;
import Strikeboom.tutorialmod.entity.render.model.ModelAirplane;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class EntityAirplaneRender extends Render<EntityAirplane> {
    ModelBase model = new ModelAirplane();
    public EntityAirplaneRender(RenderManager renderManager) {
        super(renderManager);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityAirplane entity) {
        return new ResourceLocation(TutorialMod.MOD_ID,"textures/entity/airplane.png");
    }
    @Override
    public void doRender(EntityAirplane entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y + 0.375F, (float)z);
        GlStateManager.rotate(180f, 1f, 0F, 0f);
        bindEntityTexture(entity);

        if (this.renderOutlines)
        {
            GlStateManager.enableColorMaterial();
            GlStateManager.enableOutlineMode(this.getTeamColor(entity));
        }

        this.model.render(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

        if (this.renderOutlines)
        {
            GlStateManager.disableOutlineMode();
            GlStateManager.disableColorMaterial();
        }

        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}

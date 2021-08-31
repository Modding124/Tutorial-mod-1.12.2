package Strikeboom.tutorialmod.entity.render;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.entity.EntityGlowingCow;
import Strikeboom.tutorialmod.entity.render.model.ModelGlowingCow;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class EntityGlowingCowRender extends RenderLiving<EntityGlowingCow> {
    public EntityGlowingCowRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelGlowingCow(), .5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityGlowingCow entity) {
        return new ResourceLocation(TutorialMod.MOD_ID,"textures/entity/glowing_cow.png");
    }
}

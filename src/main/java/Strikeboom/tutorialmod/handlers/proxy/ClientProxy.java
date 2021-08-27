package Strikeboom.tutorialmod.handlers.proxy;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.entity.EntityGlowingCow;
import Strikeboom.tutorialmod.entity.render.EntityGlowingCowRender;
import Strikeboom.tutorialmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy implements IProxy{
    @Override
    public void preInit() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGlowingCow.class, EntityGlowingCowRender::new);
    }

    @Override
    public void init() {

    }
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
    public static class ModelRegistry {
        @SubscribeEvent
        public static void modelRegister(ModelRegistryEvent event) {
            ModItems.ITEMS.forEach(item -> ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory")));
        }
    }
}

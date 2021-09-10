package Strikeboom.tutorialmod.handlers;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.entity.EntityAirplane;
import Strikeboom.tutorialmod.entity.EntityGlowingCow;
import Strikeboom.tutorialmod.init.ModBlocks;
import Strikeboom.tutorialmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class RegistryHandlers {
    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
    @SubscribeEvent
    public static void entityRegister(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.create().
                entity(EntityGlowingCow.class)
                .tracker(50,1,true)
                .id("glowing_cow",1223)
                .name("glowing_cow")
                .egg(0xffea00,0x544d00)
                .build());
        event.getRegistry().register(EntityEntryBuilder.create()
                        .entity(EntityAirplane.class)
                        .egg(0xebe534,0x212002)
                        .tracker(50,1,true)
                        .id("airplane",1822)
                        .name("airplane")
                .build());
    }
}

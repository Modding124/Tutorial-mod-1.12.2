package Strikeboom.tutorialmod.handlers;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class RegistryHandlers {
    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
}

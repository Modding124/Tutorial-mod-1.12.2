package Strikeboom.tutorialmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.stripedOre,new ItemStack(ModItems.stripedIngot),1f);
    }
}

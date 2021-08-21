package Strikeboom.tutorialmod.handlers;

import Strikeboom.tutorialmod.init.ModBlocks;
import Strikeboom.tutorialmod.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
    public static void init() {
        OreDictionary.registerOre("ingotStriped", ModItems.stripedIngot);
        OreDictionary.registerOre("blockStriped", ModBlocks.stripedBlock);
        OreDictionary.registerOre("oreStriped", ModBlocks.stripedOre);
    }
}

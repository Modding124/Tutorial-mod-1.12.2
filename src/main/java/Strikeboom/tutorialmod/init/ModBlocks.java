package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.blocks.StripedBlock;
import Strikeboom.tutorialmod.blocks.StripedOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.LinkedList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new LinkedList<>();

    public static Block stripedBlock;
    public static Block stripedOre;

    public static void preInit() {
        stripedBlock = new StripedBlock().setRegistryName("striped_block");
        stripedOre = new StripedOre().setRegistryName("striped_ore");

        add(stripedBlock);
        add(stripedOre);
    }
    private static void add(Block block) {
        block.setUnlocalizedName(block.getRegistryName().toString().replace(":","."));
        block.setCreativeTab(TutorialMod.MOD_TAB);
        BLOCKS.add(block);
        ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}

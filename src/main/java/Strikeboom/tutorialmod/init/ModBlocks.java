package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.blocks.Healer;
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
    public static Block healer;

    public static void preInit() {
        stripedBlock = new StripedBlock().setRegistryName("striped_block");
        stripedOre = new StripedOre().setRegistryName("striped_ore");
        healer = new Healer().setRegistryName("healer");

        add(stripedBlock);
        add(stripedOre);
        add(healer);
    }
    private static void add(Block block) {
        block.setUnlocalizedName(block.getRegistryName().toString().replace(":","."));
        block.setCreativeTab(TutorialMod.MOD_TAB);
        BLOCKS.add(block);
        ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}

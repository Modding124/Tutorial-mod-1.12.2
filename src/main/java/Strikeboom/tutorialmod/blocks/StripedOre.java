package Strikeboom.tutorialmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StripedOre extends Block {
    public StripedOre() {
        super(Material.ROCK);
        setHardness(4f);
        setResistance(7f);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe",2);
    }
}

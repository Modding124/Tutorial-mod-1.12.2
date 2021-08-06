package Strikeboom.tutorialmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StripedBlock extends Block {
    public StripedBlock() {
        super(Material.IRON);
        setSoundType(SoundType.METAL);
        setHardness(6f);
        setResistance(12f);
        setHarvestLevel("pickaxe",2);
    }
}

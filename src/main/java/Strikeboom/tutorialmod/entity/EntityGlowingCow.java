package Strikeboom.tutorialmod.entity;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Blocks;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class EntityGlowingCow extends EntityCow {
    public EntityGlowingCow(World worldIn) {
        super(worldIn);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentTranslation("entity.glowing_cow.name");
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!world.isRemote) {
            if (!isDead) {
                if (world.getBlockState(getPosition()).getBlock() != Blocks.AIR) {
                    world.setBlockState(getPosition(),Blocks.TORCH.getDefaultState());
                }
            }
        }
    }
}

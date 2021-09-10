package Strikeboom.tutorialmod.items;

import Strikeboom.tutorialmod.entity.EntityAirplane;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Airplane extends Item {
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            Entity airplane = new EntityAirplane(worldIn);
            airplane.setPositionAndUpdate(playerIn.posX, playerIn.posY, playerIn.posZ);
            airplane.rotationYaw = playerIn.prevRotationYaw;
            playerIn.getHeldItemMainhand().shrink(1);
            worldIn.spawnEntity(airplane);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

package Strikeboom.tutorialmod.items;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class TotemOfDestruction extends Item {
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(I18n.format("item.tutorialmod.totem_of_destruction.tooltip"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            if (!playerIn.isSneaking()) {
                worldIn.getEntitiesWithinAABB(EntityLivingBase.class,new AxisAlignedBB(playerIn.getPosition()).grow(5f)).forEach(entityLivingBase -> {
                    if (entityLivingBase != playerIn) {
                        entityLivingBase.onKillCommand();
                    }
                });
                playerIn.getHeldItem(handIn).shrink(1);
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}

package Strikeboom.tutorialmod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class EntityAirplane extends Entity {
    public EntityAirplane(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {

    }
    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentTranslation("entity.airplane.name");
    }

    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return entityIn instanceof EntityPlayer;
    }
    @Override
    public boolean canRiderInteract() {
        return true;
    }

    @Override
    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {
        if (!this.isBeingRidden()) {
            player.startRiding(this);
        }
        return super.processInitialInteract(player, hand);
    }

    @Override
    public AxisAlignedBB getCollisionBox(Entity entityIn)
    {
        return entityIn.canBePushed() ? entityIn.getEntityBoundingBox() : null;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
        return getEntityBoundingBox();
    }

    @Override
    public boolean canBePushed() {
        return true;
    }
    @Override
    public double getMountedYOffset() {
        return -.1d;
    }

    @Override
    public boolean canBeCollidedWith() {
        return !isDead;
    }
    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (!world.isRemote) {
            setDead();
            return true;
        }
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void updatePassenger(Entity passenger) {
        if (!world.isRemote) {
            if (isBeingRidden()) {
                EntityPlayer player = (EntityPlayer) passenger;
                this.moveToBlockPosAndAngles(new BlockPos(player.posX + player.getLookVec().x * .51f,player.posY + 1,player.posZ + player.getLookVec().z * .51f),player.rotationYaw,player.rotationPitch);
            }
        }
        super.updatePassenger(passenger);
    }
}

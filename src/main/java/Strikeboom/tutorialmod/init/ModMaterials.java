package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
    public static final Item.ToolMaterial STRIPED = EnumHelper.addToolMaterial("striped",2,1000,7f,2.5f,20).setRepairItem(new ItemStack(ModItems.stripedIngot));
    public static final ItemArmor.ArmorMaterial STRIPED_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("striped", TutorialMod.MOD_ID+":striped",200,new int[] {4,6,5,3},20, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0f).setRepairItem(new ItemStack(ModItems.stripedIngot));
}

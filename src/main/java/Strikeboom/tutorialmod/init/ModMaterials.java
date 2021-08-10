package Strikeboom.tutorialmod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
    public static final Item.ToolMaterial STRIPED = EnumHelper.addToolMaterial("striped",2,1000,7f,2.5f,20).setRepairItem(new ItemStack(ModItems.stripedIngot));
}

package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import net.minecraft.item.Item;

import java.util.LinkedList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new LinkedList<>();

    public static Item stripedIngot;

    public static void preInit() {
        //tutorialmod:striped_ingot
        stripedIngot = new Item().setRegistryName("striped_ingot");

        add(stripedIngot);
    }
    private static void add(Item i) {
        i.setUnlocalizedName(i.getRegistryName().toString().replace(":","."));
        i.setCreativeTab(TutorialMod.MOD_TAB);
        ITEMS.add(i);
    }
}

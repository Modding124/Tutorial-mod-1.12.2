package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.items.tools.*;
import net.minecraft.item.Item;

import java.util.LinkedList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new LinkedList<>();

    public static Item stripedIngot;
    public static Item stripedPickaxe;
    public static Item stripedAxe;
    public static Item stripedShovel;
    public static Item stripedSword;
    public static Item stripedHoe;

    public static void preInit() {
        //tutorialmod:striped_ingot
        stripedIngot = new Item().setRegistryName("striped_ingot");
        stripedPickaxe = new ToolPickaxe(ModMaterials.STRIPED).setRegistryName("striped_pickaxe");
        stripedAxe = new ToolAxe(ModMaterials.STRIPED,8f,-3.1f).setRegistryName("striped_axe");
        stripedShovel = new ToolShovel(ModMaterials.STRIPED).setRegistryName("striped_shovel");
        stripedSword = new ToolSword(ModMaterials.STRIPED).setRegistryName("striped_sword");
        stripedHoe = new ToolHoe(ModMaterials.STRIPED).setRegistryName("striped_hoe");

        add(stripedIngot);
        add(stripedPickaxe);
        add(stripedAxe);
        add(stripedShovel);
        add(stripedSword);
        add(stripedHoe);
    }
    private static void add(Item i) {
        i.setUnlocalizedName(i.getRegistryName().toString().replace(":","."));
        i.setCreativeTab(TutorialMod.MOD_TAB);
        ITEMS.add(i);
    }
}

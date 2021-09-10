package Strikeboom.tutorialmod.init;

import Strikeboom.tutorialmod.TutorialMod;
import Strikeboom.tutorialmod.items.Airplane;
import Strikeboom.tutorialmod.items.TotemOfDestruction;
import Strikeboom.tutorialmod.items.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

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
    public static Item stripedHelmet;
    public static Item stripedChestplate;
    public static Item stripedLeggings;
    public static Item stripedBoots;
    public static Item totemOfDestruction;
    public static Item airplane;

    public static void preInit() {
        //tutorialmod:striped_ingot
        stripedIngot = new Item().setRegistryName("striped_ingot");
        stripedPickaxe = new ToolPickaxe(ModMaterials.STRIPED).setRegistryName("striped_pickaxe");
        stripedAxe = new ToolAxe(ModMaterials.STRIPED,8f,-3.1f).setRegistryName("striped_axe");
        stripedShovel = new ToolShovel(ModMaterials.STRIPED).setRegistryName("striped_shovel");
        stripedSword = new ToolSword(ModMaterials.STRIPED).setRegistryName("striped_sword");
        stripedHoe = new ToolHoe(ModMaterials.STRIPED).setRegistryName("striped_hoe");
        stripedHelmet = new ItemArmor(ModMaterials.STRIPED_ARMOR_MATERIAL,1, EntityEquipmentSlot.HEAD).setRegistryName("striped_helmet");
        stripedChestplate = new ItemArmor(ModMaterials.STRIPED_ARMOR_MATERIAL,1,EntityEquipmentSlot.CHEST).setRegistryName("striped_chestplate");
        stripedLeggings = new ItemArmor(ModMaterials.STRIPED_ARMOR_MATERIAL,2,EntityEquipmentSlot.LEGS).setRegistryName("striped_leggings");
        stripedBoots = new ItemArmor(ModMaterials.STRIPED_ARMOR_MATERIAL,1,EntityEquipmentSlot.FEET).setRegistryName("striped_boots");
        totemOfDestruction = new TotemOfDestruction().setRegistryName("totem_of_destruction");
        airplane = new Airplane().setRegistryName("airplane");

        add(airplane);
        add(stripedIngot);
        add(stripedPickaxe);
        add(stripedAxe);
        add(stripedShovel);
        add(stripedSword);
        add(stripedHoe);
        add(stripedHelmet);
        add(stripedChestplate);
        add(stripedLeggings);
        add(stripedBoots);
        add(totemOfDestruction);
    }
    private static void add(Item i) {
        i.setUnlocalizedName(i.getRegistryName().toString().replace(":","."));
        i.setCreativeTab(TutorialMod.MOD_TAB);
        ITEMS.add(i);
    }
}

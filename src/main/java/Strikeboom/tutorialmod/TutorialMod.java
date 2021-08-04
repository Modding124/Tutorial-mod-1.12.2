package Strikeboom.tutorialmod;

import Strikeboom.tutorialmod.handlers.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MOD_ID,name = "Tutorial Mod",version = "1.0",acceptedMinecraftVersions = "1.12.2")
public class TutorialMod {
    public static final String MOD_ID = "tutorialmod";

    @Mod.Instance
    public static TutorialMod instance;

    @SidedProxy(clientSide = "Strikeboom.tutorialmod.handlers.proxy.ClientProxy",serverSide = "Strikeboom.tutorialmod.handlers.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
}

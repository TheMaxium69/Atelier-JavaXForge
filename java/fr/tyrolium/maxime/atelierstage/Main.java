package fr.tyrolium.maxime.atelierstage;

import fr.tyrolium.maxime.atelierstage.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Global.MODID, name = Global.NAME, version = Global.VERSION, acceptedMinecraftVersions = Global.MINECRAFT_VERSION)
public class Main {

    @Instance
    public static Main INSTANCE;

    @SidedProxy(clientSide = Global.CLIENT_PROXY, serverSide = Global.SERVER_PROXY)
    public static CommonProxy proxy;

    private static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("preInit");

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Init");

        System.out.println("Mon mod a bien charger");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("postInit");

    }

}

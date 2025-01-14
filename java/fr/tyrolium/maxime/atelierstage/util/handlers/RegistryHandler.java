package fr.tyrolium.maxime.atelierstage.util.handlers;

import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemsMod.ITEMS.toArray(new Item[0]));
    }

//    @SubscribeEvent
//    public static void registerBlokcs(RegistryEvent.Register<Block> event){
//        event.getRegistry().registerAll(/* mettre nos blocks */);
//    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){

        for(Item item : ItemsMod.ITEMS){
            if (item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

//        for(Block block : /* nos block */){
//            if (block instanceof IHasModel){
//                ((IHasModel)block).registerModels();
//            }
//        }

    }

}

package fr.tyrolium.maxime.atelierstage.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class Client extends CommonProxy {

    @Override
    public void registerModels(Item item, int metadata){
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}

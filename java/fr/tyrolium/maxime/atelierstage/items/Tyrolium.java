package fr.tyrolium.maxime.atelierstage.items;

import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tyrolium extends Item implements IHasModel {

    /* LES PROPRIETER */
    private String name = "tyrolium";


    /* FUNCTION */

        /* CONSTRUCT */
    public Tyrolium() {

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.COMBAT);


        ItemsMod.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerModels(this, 0);
    }
}

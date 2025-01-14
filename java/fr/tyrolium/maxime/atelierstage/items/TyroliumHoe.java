package fr.tyrolium.maxime.atelierstage.items;

import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.init.MaterialsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class TyroliumHoe extends ItemHoe implements IHasModel {

    private String name = "tyrolium_hoe";

    public TyroliumHoe() {
        super(MaterialsMod.TYROLIUM_TOOL);

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

package fr.tyrolium.maxime.atelierstage.items;

import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.init.MaterialsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSword;

public class TyroliumSword extends ItemSword implements IHasModel {

    private String name = "tyrolium_sword";

    public TyroliumSword() {

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

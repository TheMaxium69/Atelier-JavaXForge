package fr.tyrolium.maxime.atelierstage.items;

import com.google.common.collect.Sets;
import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.init.MaterialsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class TyroliumAxe extends ItemTool implements IHasModel {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    private String name = "tyrolium_axe";


    public TyroliumAxe() {
        super(MaterialsMod.TYROLIUM_TOOL, EFFECTIVE_ON);

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

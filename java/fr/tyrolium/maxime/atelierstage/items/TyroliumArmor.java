package fr.tyrolium.maxime.atelierstage.items;

import fr.tyrolium.maxime.atelierstage.Main;
import fr.tyrolium.maxime.atelierstage.init.ItemsMod;
import fr.tyrolium.maxime.atelierstage.init.MaterialsMod;
import fr.tyrolium.maxime.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TyroliumArmor extends ItemArmor implements IHasModel {

    private String name;
    private String type;

    public TyroliumArmor(EntityEquipmentSlot equipmentSlot) {
        super(MaterialsMod.TYROLIUM_ARMOR, 1, equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.HEAD) {
            this.type = "helmet";
        }
        if (equipmentSlot == EntityEquipmentSlot.CHEST) {
            this.type = "chestplate";
        }
        if (equipmentSlot == EntityEquipmentSlot.LEGS) {
            this.type = "leggings";
        }
        if (equipmentSlot == EntityEquipmentSlot.FEET) {
            this.type = "boots";
        }

        this.name = "tyrolium_" + this.type;

        setUnlocalizedName(this.name);
        setRegistryName(this.name);
        setCreativeTab(CreativeTabs.COMBAT);


        ItemsMod.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        Main.proxy.registerModels(this, 0);
    }

}

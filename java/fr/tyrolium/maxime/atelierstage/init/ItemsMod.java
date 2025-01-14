package fr.tyrolium.maxime.atelierstage.init;

import fr.tyrolium.maxime.atelierstage.Global;
import fr.tyrolium.maxime.atelierstage.items.Tyrolium;
import fr.tyrolium.maxime.atelierstage.items.TyroliumArmor;
import fr.tyrolium.maxime.atelierstage.items.TyroliumSword;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /* NOS ITEMS */
    public static final Item TYROLIUM = new Tyrolium();

    public static final ItemSword TYROLIUM_SWORD = new TyroliumSword();

    public static final ItemArmor TYROLIUM_HELMET = new TyroliumArmor(EntityEquipmentSlot.HEAD);




}

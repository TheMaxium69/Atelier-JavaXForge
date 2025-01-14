package fr.tyrolium.maxime.atelierstage.init;

import fr.tyrolium.maxime.atelierstage.Global;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialsMod {

    /* TOOL */
    public static final Item.ToolMaterial TYROLIUM_TOOL = EnumHelper.addToolMaterial("tyrolium_tool", 4, 2000, 16.0F, 4.0F, 99);


    /* ARMOR */
    public static final ItemArmor.ArmorMaterial TYROLIUM_ARMOR = EnumHelper.addArmorMaterial("tyrolium_armor", Global.MODID + ":tyrolium", 35, new int[]{4, 7, 9, 4}, 99, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

}
package com.me.ctools;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
/**
 * http://www.minecraftforge.net/wiki/Tutorial:_Create_your_Toolset
 * ESVdefCON
 * http://www.minecraftforge.net/wiki/Icons_and_Textures
 */
@Mod(modid = CowTools.MODID, version = CowTools.VERSION)
public class CowTools
{
    public static final String MODID = "cowtools";
    public static final String VERSION = "1.0";
    public static ToolMaterial cow = EnumHelper.addToolMaterial("Cow", 3, 90, 2.0F, 5, 4);
    public static CowSword cs = (CowSword) new com.me.ctools.CowSword(cow).setTextureName("cowtools:cow_sword").setUnlocalizedName("csword").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabCombat);
    public static CowPickaxe cp = (CowPickaxe) new com.me.ctools.CowPickaxe(cow).setTextureName("cowtools:cow_pickaxe").setUnlocalizedName("cpick").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools);
    public static CowHoe ch = (CowHoe) new com.me.ctools.CowHoe(cow).setTextureName("cowtools:cow_hoe").setUnlocalizedName("choe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools);
    public static CowAxe ca = (CowAxe) new com.me.ctools.CowAxe(cow).setTextureName("cowtools:cow_axe").setUnlocalizedName("caxe").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools);
    public static CowSpade ce = (CowSpade) new com.me.ctools.CowSpade(cow).setTextureName("cowtools:cow_shovel").setUnlocalizedName("cshovel").setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabTools);
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	LanguageRegistry.addName(cs, "Cow Sword");
    	GameRegistry.registerItem(cs, "Cow Sword", CowTools.MODID);
    	LanguageRegistry.addName(cp, "Cow Pickaxe");
    	GameRegistry.registerItem(cp, "Cow Pickaxe", CowTools.MODID);
    	LanguageRegistry.addName(ch, "Cow Hoe");
    	GameRegistry.registerItem(ch, "Cow Hoe", CowTools.MODID);
    	LanguageRegistry.addName(ca, "Cow Axe");
    	GameRegistry.registerItem(ca, "Cow Axe", CowTools.MODID);
    	LanguageRegistry.addName(ce, "Cow Shovel");
    	GameRegistry.registerItem(ce, "Cow Shovel", CowTools.MODID);
	}
}

/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expansivetoolspack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.expansivetoolspack.item.TNTICKAXEItem;
import net.mcreator.expansivetoolspack.item.TNTARMORItem;
import net.mcreator.expansivetoolspack.ExpansiveToolsPackMod;

import java.util.function.Function;

public class ExpansiveToolsPackModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ExpansiveToolsPackMod.MODID);
	public static final DeferredItem<Item> TNTICKAXE;
	public static final DeferredItem<Item> TNTARMOR_HELMET;
	public static final DeferredItem<Item> TNTARMOR_CHESTPLATE;
	public static final DeferredItem<Item> TNTARMOR_LEGGINGS;
	public static final DeferredItem<Item> TNTARMOR_BOOTS;
	static {
		TNTICKAXE = register("tntickaxe", TNTICKAXEItem::new);
		TNTARMOR_HELMET = register("tntarmor_helmet", TNTARMORItem.Helmet::new);
		TNTARMOR_CHESTPLATE = register("tntarmor_chestplate", TNTARMORItem.Chestplate::new);
		TNTARMOR_LEGGINGS = register("tntarmor_leggings", TNTARMORItem.Leggings::new);
		TNTARMOR_BOOTS = register("tntarmor_boots", TNTARMORItem.Boots::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
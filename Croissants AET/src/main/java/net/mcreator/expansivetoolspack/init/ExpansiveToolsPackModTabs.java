/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expansivetoolspack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.expansivetoolspack.ExpansiveToolsPackMod;

@EventBusSubscriber
public class ExpansiveToolsPackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExpansiveToolsPackMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ExpansiveToolsPackModItems.TNTICKAXE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ExpansiveToolsPackModItems.TNTARMOR_HELMET.get());
			tabData.accept(ExpansiveToolsPackModItems.TNTARMOR_CHESTPLATE.get());
			tabData.accept(ExpansiveToolsPackModItems.TNTARMOR_LEGGINGS.get());
			tabData.accept(ExpansiveToolsPackModItems.TNTARMOR_BOOTS.get());
		}
	}
}
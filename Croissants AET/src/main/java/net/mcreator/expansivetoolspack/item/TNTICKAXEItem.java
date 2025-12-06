package net.mcreator.expansivetoolspack.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.expansivetoolspack.procedures.TNTICKAXERightclickedOnBlockProcedure;
import net.mcreator.expansivetoolspack.procedures.TNTICKAXEItemIsCraftedsmeltedProcedure;

public class TNTICKAXEItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("expansive_tools_pack:tntickaxe_repair_items")));

	public TNTICKAXEItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, -3f));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TNTICKAXERightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		TNTICKAXEItemIsCraftedsmeltedProcedure.execute(entity);
	}
}
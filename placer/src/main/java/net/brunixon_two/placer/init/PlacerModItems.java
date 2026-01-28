
package net.brunixon_two.placer.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.brunixon_two.placer.PlacerMod;

public class PlacerModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PlacerMod.MODID);
	public static final DeferredItem<Item> PLACER;
	static {
		PLACER = block(PlacerModBlocks.PLACER);
	}


	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

}

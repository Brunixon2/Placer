/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.brunixon_two.placer.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.brunixon_two.placer.block.PlacerBlock;
import net.brunixon_two.placer.PlacerMod;

public class PlacerModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PlacerMod.MODID);
	public static final DeferredBlock<Block> PLACER;
	static {
		PLACER = REGISTRY.register("placer", PlacerBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
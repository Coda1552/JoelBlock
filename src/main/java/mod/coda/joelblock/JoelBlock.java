package mod.coda.joelblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;

public class JoelBlock implements ModInitializer {

	public static final Block JOEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).resistance(6.0f).requiresTool().sounds(BlockSoundGroup.METAL));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("joelblock", "joel_block"), JOEL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("joelblock", "joel_block"), new BlockItem(JOEL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		System.out.println("Joel Block!");
	}
}

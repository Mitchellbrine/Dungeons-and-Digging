package wildKingdoms.dungeonsAndDigging.blocks.solidBlocks;

import java.util.Random;

import wildKingdoms.dungeonsAndDigging.Main;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DDSapphireBlock extends Block {

	public DDSapphireBlock(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock); // place in creative tabs

	}

	// drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3) {
		return Main.sapphireBlock.blockID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}
}
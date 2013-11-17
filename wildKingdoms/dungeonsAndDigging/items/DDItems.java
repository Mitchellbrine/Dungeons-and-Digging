package wildKingdoms.dungeonsAndDigging.items;

import wildKingdoms.dungeonsAndDigging.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DDItems {

		private static Item crystal = Main.crystal;
		private static Item ruby = Main.ruby;
		private static Item sapphire = Main.saphire;
		
		private static Block crystalBlock = MainMod.crystalBlock;
		private static Block rubyBlock = MainMod.rubyBlock;
		private static Block sapphireBlock = Main.sapphireBlock;


	public static void init() {
		// define items/blocks
		crystal = new DDGemItems(3200).setUnlocalizedName("crystal")
				.setTextureName("DungeonsAndDigging:crystal");
		ruby = new DDGemItems(3201).setUnlocalizedName("ruby").setTextureName(
				"DungeonsAndDigging:ruby");
		sapphire = new DDGemItems(3202).setUnlocalizedName("sapphire")
				.setTextureName("DungeonsAndDigging:sapphire");

		// adding names
		LanguageRegistry.addName(crystal, "Crystal");
		LanguageRegistry.addName(ruby, "Ruby");
		LanguageRegistry.addName(sapphire, "Sapphire");

	}

	public static void recipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(crystal, 9),
				new Object[] { crystalBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ruby, 9),
				new Object[] { rubyBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(sapphire, 9),
				new Object[] { sapphireBlock });
	}
}

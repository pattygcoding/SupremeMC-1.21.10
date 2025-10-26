package net.pattyg.suprememc.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pattyg.suprememc.SupremeMC;
import net.pattyg.suprememc.block.SMCGlowBlock;
import net.pattyg.suprememc.block.SMCSlimeBlock;

import java.util.function.Supplier;

public class InItBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SupremeMC.MOD_ID);

    // Ruby Block (similar to diamond block)
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
        () -> new Block(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_RED)
                .strength(5.0F, 6.0F)
                .setId(BLOCKS.key("ruby_block"))));

    // Glow Blocks - all 15 variants
    public static final RegistryObject<Block> RED_GLOW_BLOCK = registerBlock("red_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_RED)
                .setId(BLOCKS.key("red_glow_block"))));
    
    public static final RegistryObject<Block> ORANGE_GLOW_BLOCK = registerBlock("orange_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_ORANGE)
                .setId(BLOCKS.key("orange_glow_block"))));
    
    public static final RegistryObject<Block> YELLOW_GLOW_BLOCK = registerBlock("yellow_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_YELLOW)
                .setId(BLOCKS.key("yellow_glow_block"))));
    
    public static final RegistryObject<Block> LIME_GLOW_BLOCK = registerBlock("lime_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_LIGHT_GREEN)
                .setId(BLOCKS.key("lime_glow_block"))));
    
    public static final RegistryObject<Block> GREEN_GLOW_BLOCK = registerBlock("green_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_GREEN)
                .setId(BLOCKS.key("green_glow_block"))));
    
    public static final RegistryObject<Block> CYAN_GLOW_BLOCK = registerBlock("cyan_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_CYAN)
                .setId(BLOCKS.key("cyan_glow_block"))));
    
    public static final RegistryObject<Block> LIGHT_BLUE_GLOW_BLOCK = registerBlock("light_blue_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_LIGHT_BLUE)
                .setId(BLOCKS.key("light_blue_glow_block"))));
    
    public static final RegistryObject<Block> BLUE_GLOW_BLOCK = registerBlock("blue_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_BLUE)
                .setId(BLOCKS.key("blue_glow_block"))));
    
    public static final RegistryObject<Block> PURPLE_GLOW_BLOCK = registerBlock("purple_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_PURPLE)
                .setId(BLOCKS.key("purple_glow_block"))));
    
    public static final RegistryObject<Block> MAGENTA_GLOW_BLOCK = registerBlock("magenta_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_MAGENTA)
                .setId(BLOCKS.key("magenta_glow_block"))));
    
    public static final RegistryObject<Block> PINK_GLOW_BLOCK = registerBlock("pink_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_PINK)
                .setId(BLOCKS.key("pink_glow_block"))));
    
    public static final RegistryObject<Block> BROWN_GLOW_BLOCK = registerBlock("brown_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_BROWN)
                .setId(BLOCKS.key("brown_glow_block"))));
    
    public static final RegistryObject<Block> WHITE_GLOW_BLOCK = registerBlock("white_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.SNOW)
                .setId(BLOCKS.key("white_glow_block"))));
    
    public static final RegistryObject<Block> LIGHT_GRAY_GLOW_BLOCK = registerBlock("light_gray_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_LIGHT_GRAY)
                .setId(BLOCKS.key("light_gray_glow_block"))));
    
    public static final RegistryObject<Block> BLACK_GLOW_BLOCK = registerBlock("black_glow_block",
        () -> new SMCGlowBlock(SMCGlowBlock.createProperties(MapColor.COLOR_BLACK)
                .setId(BLOCKS.key("black_glow_block"))));

    // Slime Blocks - all 15 variants
    public static final RegistryObject<Block> RED_SLIME_BLOCK = registerBlock("red_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_RED)
                .setId(BLOCKS.key("red_slime_block"))));
    
    public static final RegistryObject<Block> ORANGE_SLIME_BLOCK = registerBlock("orange_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_ORANGE)
                .setId(BLOCKS.key("orange_slime_block"))));
    
    public static final RegistryObject<Block> YELLOW_SLIME_BLOCK = registerBlock("yellow_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_YELLOW)
                .setId(BLOCKS.key("yellow_slime_block"))));
    
    public static final RegistryObject<Block> LIME_SLIME_BLOCK = registerBlock("lime_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_LIGHT_GREEN)
                .setId(BLOCKS.key("lime_slime_block"))));
    
    public static final RegistryObject<Block> GREEN_SLIME_BLOCK = registerBlock("green_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_GREEN)
                .setId(BLOCKS.key("green_slime_block"))));
    
    public static final RegistryObject<Block> CYAN_SLIME_BLOCK = registerBlock("cyan_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_CYAN)
                .setId(BLOCKS.key("cyan_slime_block"))));
    
    public static final RegistryObject<Block> LIGHT_BLUE_SLIME_BLOCK = registerBlock("light_blue_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_LIGHT_BLUE)
                .setId(BLOCKS.key("light_blue_slime_block"))));
    
    public static final RegistryObject<Block> BLUE_SLIME_BLOCK = registerBlock("blue_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_BLUE)
                .setId(BLOCKS.key("blue_slime_block"))));
    
    public static final RegistryObject<Block> PURPLE_SLIME_BLOCK = registerBlock("purple_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_PURPLE)
                .setId(BLOCKS.key("purple_slime_block"))));
    
    public static final RegistryObject<Block> MAGENTA_SLIME_BLOCK = registerBlock("magenta_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_MAGENTA)
                .setId(BLOCKS.key("magenta_slime_block"))));
    
    public static final RegistryObject<Block> PINK_SLIME_BLOCK = registerBlock("pink_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_PINK)
                .setId(BLOCKS.key("pink_slime_block"))));
    
    public static final RegistryObject<Block> BROWN_SLIME_BLOCK = registerBlock("brown_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_BROWN)
                .setId(BLOCKS.key("brown_slime_block"))));
    
    public static final RegistryObject<Block> WHITE_SLIME_BLOCK = registerBlock("white_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.SNOW)
                .setId(BLOCKS.key("white_slime_block"))));
    
    public static final RegistryObject<Block> LIGHT_GRAY_SLIME_BLOCK = registerBlock("light_gray_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_LIGHT_GRAY)
                .setId(BLOCKS.key("light_gray_slime_block"))));
    
    public static final RegistryObject<Block> BLACK_SLIME_BLOCK = registerBlock("black_slime_block",
        () -> new SMCSlimeBlock(SMCSlimeBlock.createProperties(MapColor.COLOR_BLACK)
                .setId(BLOCKS.key("black_slime_block"))));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return InItItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(InItItems.ITEMS.key(name))));
    }
}

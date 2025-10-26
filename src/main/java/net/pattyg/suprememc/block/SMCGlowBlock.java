package net.pattyg.suprememc.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class SMCGlowBlock extends Block {
    public SMCGlowBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
    
    public static BlockBehaviour.Properties createProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .strength(0.5F)
                .lightLevel((state) -> 15);
    }
}

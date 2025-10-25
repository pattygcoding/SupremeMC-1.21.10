package net.pattyg.suprememc.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class GlowBlock extends Block {
    public GlowBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
    
    public static BlockBehaviour.Properties createProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .strength(0.5F)
                .lightLevel((state) -> 15);
    }
}

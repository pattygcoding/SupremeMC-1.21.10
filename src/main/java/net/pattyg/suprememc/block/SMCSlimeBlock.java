package net.pattyg.suprememc.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.Vec3;
import javax.annotation.Nonnull;

public class SMCSlimeBlock extends SlimeBlock {
    
    public SMCSlimeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void fallOn(@Nonnull Level level, @Nonnull BlockState state, @Nonnull BlockPos pos, @Nonnull Entity entity, double fallDistance) {
        if (!entity.isSuppressingBounce()) {
            entity.causeFallDamage(fallDistance, 0.0F, level.damageSources().fall());
        }
    }

    @Override
    public void updateEntityMovementAfterFallOn(@Nonnull BlockGetter blockGetter, @Nonnull Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityMovementAfterFallOn(blockGetter, entity);
        } else {
            this.bounceUp(entity);
        }
    }

    @Override
    public boolean canStickTo(BlockState state, BlockState other)
    {
        // Allow sticking to the same block type (same color slime blocks)
        if (other.getBlock() == state.getBlock()) {
            return true;
        }
        
        // Prevent sticking to other slime blocks (different colors or vanilla slime)
        if (other.getBlock() instanceof SlimeBlock) {
            return false;
        }
        
        // Allow sticking to all non-slime blocks
        return true;
    }

    private void bounceUp(Entity entity) {
        Vec3 vec3 = entity.getDeltaMovement();
        if (vec3.y < 0.0) {
            double d0 = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setDeltaMovement(vec3.x, -vec3.y * d0, vec3.z);
        }
    }

    @Override
    public void stepOn(@Nonnull Level level, @Nonnull BlockPos pos, @Nonnull BlockState state, @Nonnull Entity entity) {
        double d0 = Math.abs(entity.getDeltaMovement().y);
        if (d0 < 0.1 && !entity.isSteppingCarefully()) {
            double d1 = 0.4 + d0 * 0.2;
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(d1, 1.0, d1));
        }

        super.stepOn(level, pos, state, entity);
    }
    
    public static BlockBehaviour.Properties createProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .friction(0.8F)
                .sound(net.minecraft.world.level.block.SoundType.SLIME_BLOCK)
                .noOcclusion();
    }
}

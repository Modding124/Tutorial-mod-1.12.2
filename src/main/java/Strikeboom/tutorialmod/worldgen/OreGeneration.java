package Strikeboom.tutorialmod.worldgen;

import Strikeboom.tutorialmod.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {
    private final WorldGenerator STRIPED_ORE_GENERATOR;
    public OreGeneration() {
        STRIPED_ORE_GENERATOR = new WorldGenMinable(ModBlocks.stripedOre.getDefaultState(),8);
    }
    private void runGenerator(WorldGenerator generator,Random rand, int chunkX,int chunkZ,World world, int chancesToSpawn,int minHeight,int maxHeight) {
        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn;i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            generator.generate(world,rand,new BlockPos(x,y,z));
        }
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            runGenerator(STRIPED_ORE_GENERATOR,random,chunkX,chunkZ,world,15,2,55);
        }
    }
}

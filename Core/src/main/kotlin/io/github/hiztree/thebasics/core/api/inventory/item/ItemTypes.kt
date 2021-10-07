/*
 * MIT License
 *
 * Copyright (c) 2021 Levi Pawlak
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.hiztree.thebasics.core.api.inventory.item

import com.google.common.collect.Lists
import java.util.*

@Suppress("unused")
object ItemTypes {

    val VALUES: ArrayList<ItemType> = Lists.newArrayList()!!

    val AIR = ItemType("AIR")
    val STONE = ItemType("STONE")
    val GRASS = ItemType("GRASS")
    val DIRT = ItemType("DIRT")
    val COBBLESTONE = ItemType("COBBLESTONE")
    val WOOD = ItemType("WOOD")
    val SAPLING = ItemType("SAPLING")
    val BEDROCK = ItemType("BEDROCK")
    val WATER = ItemType("WATER")
    val STATIONARY_WATER = ItemType("STATIONARY_WATER")
    val LAVA = ItemType("LAVA")
    val STATIONARY_LAVA = ItemType("STATIONARY_LAVA")
    val SAND = ItemType("SAND")
    val GRAVEL = ItemType("GRAVEL")
    val GOLD_ORE = ItemType("GOLD_ORE")
    val IRON_ORE = ItemType("IRON_ORE")
    val COAL_ORE = ItemType("COAL_ORE")
    val LOG = ItemType("LOG")
    val LEAVES = ItemType("LEAVES")
    val SPONGE = ItemType("SPONGE")
    val GLASS = ItemType("GLASS")
    val LAPIS_ORE = ItemType("LAPIS_ORE")
    val LAPIS_BLOCK = ItemType("LAPIS_BLOCK")
    val DISPENSER = ItemType("DISPENSER")
    val SANDSTONE = ItemType("SANDSTONE")
    val NOTE_BLOCK = ItemType("NOTE_BLOCK")
    val BED_BLOCK = ItemType("BED_BLOCK")
    val POWERED_RAIL = ItemType("POWERED_RAIL")
    val DETECTOR_RAIL = ItemType("DETECTOR_RAIL")
    val PISTON_STICKY_BASE = ItemType("PISTON_STICKY_BASE")
    val WEB = ItemType("WEB")
    val LONG_GRASS = ItemType("LONG_GRASS")
    val DEAD_BUSH = ItemType("DEAD_BUSH")
    val PISTON_BASE = ItemType("PISTON_BASE")
    val PISTON_EXTENSION = ItemType("PISTON_EXTENSION")
    val WOOL = ItemType("WOOL")
    val PISTON_MOVING_PIECE = ItemType("PISTON_MOVING_PIECE")
    val YELLOW_FLOWER = ItemType("YELLOW_FLOWER")
    val RED_ROSE = ItemType("RED_ROSE")
    val BROWN_MUSHROOM = ItemType("BROWN_MUSHROOM")
    val RED_MUSHROOM = ItemType("RED_MUSHROOM")
    val GOLD_BLOCK = ItemType("GOLD_BLOCK")
    val IRON_BLOCK = ItemType("IRON_BLOCK")
    val DOUBLE_STEP = ItemType("DOUBLE_STEP")
    val STEP = ItemType("STEP")
    val BRICK = ItemType("BRICK")
    val TNT = ItemType("TNT")
    val BOOKSHELF = ItemType("BOOKSHELF")
    val MOSSY_COBBLESTONE = ItemType("MOSSY_COBBLESTONE")
    val OBSIDIAN = ItemType("OBSIDIAN")
    val TORCH = ItemType("TORCH")
    val FIRE = ItemType("FIRE")
    val MOB_SPAWNER = ItemType("MOB_SPAWNER")
    val WOOD_STAIRS = ItemType("WOOD_STAIRS")
    val CHEST = ItemType("CHEST")
    val REDSTONE_WIRE = ItemType("REDSTONE_WIRE")
    val DIAMOND_ORE = ItemType("DIAMOND_ORE")
    val DIAMOND_BLOCK = ItemType("DIAMOND_BLOCK")
    val WORKBENCH = ItemType("WORKBENCH")
    val CROPS = ItemType("CROPS")
    val SOIL = ItemType("SOIL")
    val FURNACE = ItemType("FURNACE")
    val BURNING_FURNACE = ItemType("BURNING_FURNACE")
    val SIGN_POST = ItemType("SIGN_POST")
    val WOODEN_DOOR = ItemType("WOODEN_DOOR")
    val LADDER = ItemType("LADDER")
    val RAILS = ItemType("RAILS")
    val COBBLESTONE_STAIRS = ItemType("COBBLESTONE_STAIRS")
    val WALL_SIGN = ItemType("WALL_SIGN")
    val LEVER = ItemType("LEVER")
    val STONE_PLATE = ItemType("STONE_PLATE")
    val IRON_DOOR_BLOCK = ItemType("IRON_DOOR_BLOCK")
    val WOOD_PLATE = ItemType("WOOD_PLATE")
    val REDSTONE_ORE = ItemType("REDSTONE_ORE")
    val GLOWING_REDSTONE_ORE = ItemType("GLOWING_REDSTONE_ORE")
    val REDSTONE_TORCH_OFF = ItemType("REDSTONE_TORCH_OFF")
    val REDSTONE_TORCH_ON = ItemType("REDSTONE_TORCH_ON")
    val STONE_BUTTON = ItemType("STONE_BUTTON")
    val SNOW = ItemType("SNOW")
    val ICE = ItemType("ICE")
    val SNOW_BLOCK = ItemType("SNOW_BLOCK")
    val CACTUS = ItemType("CACTUS")
    val CLAY = ItemType("CLAY")
    val SUGAR_CANE_BLOCK = ItemType("SUGAR_CANE_BLOCK")
    val JUKEBOX = ItemType("JUKEBOX")
    val FENCE = ItemType("FENCE")
    val PUMPKIN = ItemType("PUMPKIN")
    val NETHERRACK = ItemType("NETHERRACK")
    val SOUL_SAND = ItemType("SOUL_SAND")
    val GLOWSTONE = ItemType("GLOWSTONE")
    val PORTAL = ItemType("PORTAL")
    val JACK_O_LANTERN = ItemType("JACK_O_LANTERN")
    val CAKE_BLOCK = ItemType("CAKE_BLOCK")
    val DIODE_BLOCK_OFF = ItemType("DIODE_BLOCK_OFF")
    val DIODE_BLOCK_ON = ItemType("DIODE_BLOCK_ON")
    val STAINED_GLASS = ItemType("STAINED_GLASS")
    val TRAP_DOOR = ItemType("TRAP_DOOR")
    val MONSTER_EGGS = ItemType("MONSTER_EGGS")
    val SMOOTH_BRICK = ItemType("SMOOTH_BRICK")
    val HUGE_MUSHROOM_1 = ItemType("HUGE_MUSHROOM_1")
    val HUGE_MUSHROOM_2 = ItemType("HUGE_MUSHROOM_2")
    val IRON_FENCE = ItemType("IRON_FENCE")
    val THIN_GLASS = ItemType("THIN_GLASS")
    val MELON_BLOCK = ItemType("MELON_BLOCK")
    val PUMPKIN_STEM = ItemType("PUMPKIN_STEM")
    val MELON_STEM = ItemType("MELON_STEM")
    val VINE = ItemType("VINE")
    val FENCE_GATE = ItemType("FENCE_GATE")
    val BRICK_STAIRS = ItemType("BRICK_STAIRS")
    val SMOOTH_STAIRS = ItemType("SMOOTH_STAIRS")
    val MYCEL = ItemType("MYCEL")
    val WATER_LILY = ItemType("WATER_LILY")
    val NETHER_BRICK = ItemType("NETHER_BRICK")
    val NETHER_FENCE = ItemType("NETHER_FENCE")
    val NETHER_BRICK_STAIRS = ItemType("NETHER_BRICK_STAIRS")
    val NETHER_WARTS = ItemType("NETHER_WARTS")
    val ENCHANTMENT_TABLE = ItemType("ENCHANTMENT_TABLE")
    val BREWING_STAND = ItemType("BREWING_STAND")
    val CAULDRON = ItemType("CAULDRON")
    val ENDER_PORTAL = ItemType("ENDER_PORTAL")
    val ENDER_PORTAL_FRAME = ItemType("ENDER_PORTAL_FRAME")
    val ENDER_STONE = ItemType("ENDER_STONE")
    val DRAGON_EGG = ItemType("DRAGON_EGG")
    val REDSTONE_LAMP_OFF = ItemType("REDSTONE_LAMP_OFF")
    val REDSTONE_LAMP_ON = ItemType("REDSTONE_LAMP_ON")
    val WOOD_DOUBLE_STEP = ItemType("WOOD_DOUBLE_STEP")
    val WOOD_STEP = ItemType("WOOD_STEP")
    val COCOA = ItemType("COCOA")
    val SANDSTONE_STAIRS = ItemType("SANDSTONE_STAIRS")
    val EMERALD_ORE = ItemType("EMERALD_ORE")
    val ENDER_CHEST = ItemType("ENDER_CHEST")
    val TRIPWIRE_HOOK = ItemType("TRIPWIRE_HOOK")
    val TRIPWIRE = ItemType("TRIPWIRE")
    val EMERALD_BLOCK = ItemType("EMERALD_BLOCK")
    val SPRUCE_WOOD_STAIRS = ItemType("SPRUCE_WOOD_STAIRS")
    val BIRCH_WOOD_STAIRS = ItemType("BIRCH_WOOD_STAIRS")
    val JUNGLE_WOOD_STAIRS = ItemType("JUNGLE_WOOD_STAIRS")
    val COMMAND = ItemType("COMMAND")
    val BEACON = ItemType("BEACON")
    val COBBLE_WALL = ItemType("COBBLE_WALL")
    val FLOWER_POT = ItemType("FLOWER_POT")
    val CARROT = ItemType("CARROT")
    val POTATO = ItemType("POTATO")
    val WOOD_BUTTON = ItemType("WOOD_BUTTON")
    val SKULL = ItemType("SKULL")
    val ANVIL = ItemType("ANVIL")
    val TRAPPED_CHEST = ItemType("TRAPPED_CHEST")
    val GOLD_PLATE = ItemType("GOLD_PLATE")
    val IRON_PLATE = ItemType("IRON_PLATE")
    val REDSTONE_COMPARATOR_OFF = ItemType("REDSTONE_COMPARATOR_OFF")
    val REDSTONE_COMPARATOR_ON = ItemType("REDSTONE_COMPARATOR_ON")
    val DAYLIGHT_DETECTOR = ItemType("DAYLIGHT_DETECTOR")
    val REDSTONE_BLOCK = ItemType("REDSTONE_BLOCK")
    val QUARTZ_ORE = ItemType("QUARTZ_ORE")
    val HOPPER = ItemType("HOPPER")
    val QUARTZ_BLOCK = ItemType("QUARTZ_BLOCK")
    val QUARTZ_STAIRS = ItemType("QUARTZ_STAIRS")
    val ACTIVATOR_RAIL = ItemType("ACTIVATOR_RAIL")
    val DROPPER = ItemType("DROPPER")
    val STAINED_CLAY = ItemType("STAINED_CLAY")
    val STAINED_GLASS_PANE = ItemType("STAINED_GLASS_PANE")
    val LEAVES_2 = ItemType("LEAVES_2")
    val LOG_2 = ItemType("LOG_2")
    val ACACIA_STAIRS = ItemType("ACACIA_STAIRS")
    val DARK_OAK_STAIRS = ItemType("DARK_OAK_STAIRS")
    val SLIME_BLOCK = ItemType("SLIME_BLOCK")
    val BARRIER = ItemType("BARRIER")
    val IRON_TRAPDOOR = ItemType("IRON_TRAPDOOR")
    val PRISMARINE = ItemType("PRISMARINE")
    val SEA_LANTERN = ItemType("SEA_LANTERN")
    val HAY_BLOCK = ItemType("HAY_BLOCK")
    val CARPET = ItemType("CARPET")
    val HARD_CLAY = ItemType("HARD_CLAY")
    val COAL_BLOCK = ItemType("COAL_BLOCK")
    val PACKED_ICE = ItemType("PACKED_ICE")
    val DOUBLE_PLANT = ItemType("DOUBLE_PLANT")
    val STANDING_BANNER = ItemType("STANDING_BANNER")
    val WALL_BANNER = ItemType("WALL_BANNER")
    val DAYLIGHT_DETECTOR_INVERTED = ItemType("DAYLIGHT_DETECTOR_INVERTED")
    val RED_SANDSTONE = ItemType("RED_SANDSTONE")
    val RED_SANDSTONE_STAIRS = ItemType("RED_SANDSTONE_STAIRS")
    val DOUBLE_STONE_SLAB2 = ItemType("DOUBLE_STONE_SLAB2")
    val STONE_SLAB2 = ItemType("STONE_SLAB2")
    val SPRUCE_FENCE_GATE = ItemType("SPRUCE_FENCE_GATE")
    val BIRCH_FENCE_GATE = ItemType("BIRCH_FENCE_GATE")
    val JUNGLE_FENCE_GATE = ItemType("JUNGLE_FENCE_GATE")
    val DARK_OAK_FENCE_GATE = ItemType("DARK_OAK_FENCE_GATE")
    val ACACIA_FENCE_GATE = ItemType("ACACIA_FENCE_GATE")
    val SPRUCE_FENCE = ItemType("SPRUCE_FENCE")
    val BIRCH_FENCE = ItemType("BIRCH_FENCE")
    val JUNGLE_FENCE = ItemType("JUNGLE_FENCE")
    val DARK_OAK_FENCE = ItemType("DARK_OAK_FENCE")
    val ACACIA_FENCE = ItemType("ACACIA_FENCE")
    val SPRUCE_DOOR = ItemType("SPRUCE_DOOR")
    val BIRCH_DOOR = ItemType("BIRCH_DOOR")
    val JUNGLE_DOOR = ItemType("JUNGLE_DOOR")
    val ACACIA_DOOR = ItemType("ACACIA_DOOR")
    val DARK_OAK_DOOR = ItemType("DARK_OAK_DOOR")
    val END_ROD = ItemType("END_ROD")
    val CHORUS_PLANT = ItemType("CHORUS_PLANT")
    val CHORUS_FLOWER = ItemType("CHORUS_FLOWER")
    val PURPUR_BLOCK = ItemType("PURPUR_BLOCK")
    val PURPUR_PILLAR = ItemType("PURPUR_PILLAR")
    val PURPUR_STAIRS = ItemType("PURPUR_STAIRS")
    val PURPUR_DOUBLE_SLAB = ItemType("PURPUR_DOUBLE_SLAB")
    val PURPUR_SLAB = ItemType("PURPUR_SLAB")
    val END_BRICKS = ItemType("END_BRICKS")
    val BEETROOT_BLOCK = ItemType("BEETROOT_BLOCK")
    val GRASS_PATH = ItemType("GRASS_PATH")
    val END_GATEWAY = ItemType("END_GATEWAY")
    val COMMAND_REPEATING = ItemType("COMMAND_REPEATING")
    val COMMAND_CHAIN = ItemType("COMMAND_CHAIN")
    val FROSTED_ICE = ItemType("FROSTED_ICE")
    val MAGMA = ItemType("MAGMA")
    val NETHER_WART_BLOCK = ItemType("NETHER_WART_BLOCK")
    val RED_NETHER_BRICK = ItemType("RED_NETHER_BRICK")
    val BONE_BLOCK = ItemType("BONE_BLOCK")
    val STRUCTURE_VOID = ItemType("STRUCTURE_VOID")
    val OBSERVER = ItemType("OBSERVER")
    val WHITE_SHULKER_BOX = ItemType("WHITE_SHULKER_BOX")
    val ORANGE_SHULKER_BOX = ItemType("ORANGE_SHULKER_BOX")
    val MAGENTA_SHULKER_BOX = ItemType("MAGENTA_SHULKER_BOX")
    val LIGHT_BLUE_SHULKER_BOX = ItemType("LIGHT_BLUE_SHULKER_BOX")
    val YELLOW_SHULKER_BOX = ItemType("YELLOW_SHULKER_BOX")
    val LIME_SHULKER_BOX = ItemType("LIME_SHULKER_BOX")
    val PINK_SHULKER_BOX = ItemType("PINK_SHULKER_BOX")
    val GRAY_SHULKER_BOX = ItemType("GRAY_SHULKER_BOX")
    val SILVER_SHULKER_BOX = ItemType("SILVER_SHULKER_BOX")
    val CYAN_SHULKER_BOX = ItemType("CYAN_SHULKER_BOX")
    val PURPLE_SHULKER_BOX = ItemType("PURPLE_SHULKER_BOX")
    val BLUE_SHULKER_BOX = ItemType("BLUE_SHULKER_BOX")
    val BROWN_SHULKER_BOX = ItemType("BROWN_SHULKER_BOX")
    val GREEN_SHULKER_BOX = ItemType("GREEN_SHULKER_BOX")
    val RED_SHULKER_BOX = ItemType("RED_SHULKER_BOX")
    val BLACK_SHULKER_BOX = ItemType("BLACK_SHULKER_BOX")
    val WHITE_GLAZED_TERRACOTTA = ItemType("WHITE_GLAZED_TERRACOTTA")
    val ORANGE_GLAZED_TERRACOTTA = ItemType("ORANGE_GLAZED_TERRACOTTA")
    val MAGENTA_GLAZED_TERRACOTTA = ItemType("MAGENTA_GLAZED_TERRACOTTA")
    val LIGHT_BLUE_GLAZED_TERRACOTTA = ItemType("LIGHT_BLUE_GLAZED_TERRACOTTA")
    val YELLOW_GLAZED_TERRACOTTA = ItemType("YELLOW_GLAZED_TERRACOTTA")
    val LIME_GLAZED_TERRACOTTA = ItemType("LIME_GLAZED_TERRACOTTA")
    val PINK_GLAZED_TERRACOTTA = ItemType("PINK_GLAZED_TERRACOTTA")
    val GRAY_GLAZED_TERRACOTTA = ItemType("GRAY_GLAZED_TERRACOTTA")
    val SILVER_GLAZED_TERRACOTTA = ItemType("SILVER_GLAZED_TERRACOTTA")
    val CYAN_GLAZED_TERRACOTTA = ItemType("CYAN_GLAZED_TERRACOTTA")
    val PURPLE_GLAZED_TERRACOTTA = ItemType("PURPLE_GLAZED_TERRACOTTA")
    val BLUE_GLAZED_TERRACOTTA = ItemType("BLUE_GLAZED_TERRACOTTA")
    val BROWN_GLAZED_TERRACOTTA = ItemType("BROWN_GLAZED_TERRACOTTA")
    val GREEN_GLAZED_TERRACOTTA = ItemType("GREEN_GLAZED_TERRACOTTA")
    val RED_GLAZED_TERRACOTTA = ItemType("RED_GLAZED_TERRACOTTA")
    val BLACK_GLAZED_TERRACOTTA = ItemType("BLACK_GLAZED_TERRACOTTA")
    val CONCRETE = ItemType("CONCRETE")
    val CONCRETE_POWDER = ItemType("CONCRETE_POWDER")
    val STRUCTURE_BLOCK = ItemType("STRUCTURE_BLOCK")
    val IRON_SPADE = ItemType("IRON_SPADE")
    val IRON_PICKAXE = ItemType("IRON_PICKAXE")
    val IRON_AXE = ItemType("IRON_AXE")
    val FLINT_AND_STEEL = ItemType("FLINT_AND_STEEL")
    val APPLE = ItemType("APPLE")
    val BOW = ItemType("BOW")
    val ARROW = ItemType("ARROW")
    val COAL = ItemType("COAL")
    val DIAMOND = ItemType("DIAMOND")
    val IRON_INGOT = ItemType("IRON_INGOT")
    val GOLD_INGOT = ItemType("GOLD_INGOT")
    val IRON_SWORD = ItemType("IRON_SWORD")
    val WOOD_SWORD = ItemType("WOOD_SWORD")
    val WOOD_SPADE = ItemType("WOOD_SPADE")
    val WOOD_PICKAXE = ItemType("WOOD_PICKAXE")
    val WOOD_AXE = ItemType("WOOD_AXE")
    val STONE_SWORD = ItemType("STONE_SWORD")
    val STONE_SPADE = ItemType("STONE_SPADE")
    val STONE_PICKAXE = ItemType("STONE_PICKAXE")
    val STONE_AXE = ItemType("STONE_AXE")
    val DIAMOND_SWORD = ItemType("DIAMOND_SWORD")
    val DIAMOND_SPADE = ItemType("DIAMOND_SPADE")
    val DIAMOND_PICKAXE = ItemType("DIAMOND_PICKAXE")
    val DIAMOND_AXE = ItemType("DIAMOND_AXE")
    val STICK = ItemType("STICK")
    val BOWL = ItemType("BOWL")
    val MUSHROOM_SOUP = ItemType("MUSHROOM_SOUP")
    val GOLD_SWORD = ItemType("GOLD_SWORD")
    val GOLD_SPADE = ItemType("GOLD_SPADE")
    val GOLD_PICKAXE = ItemType("GOLD_PICKAXE")
    val GOLD_AXE = ItemType("GOLD_AXE")
    val STRING = ItemType("STRING")
    val FEATHER = ItemType("FEATHER")
    val SULPHUR = ItemType("SULPHUR")
    val WOOD_HOE = ItemType("WOOD_HOE")
    val STONE_HOE = ItemType("STONE_HOE")
    val IRON_HOE = ItemType("IRON_HOE")
    val DIAMOND_HOE = ItemType("DIAMOND_HOE")
    val GOLD_HOE = ItemType("GOLD_HOE")
    val SEEDS = ItemType("SEEDS")
    val WHEAT = ItemType("WHEAT")
    val BREAD = ItemType("BREAD")
    val LEATHER_HELMET = ItemType("LEATHER_HELMET")
    val LEATHER_CHESTPLATE = ItemType("LEATHER_CHESTPLATE")
    val LEATHER_LEGGINGS = ItemType("LEATHER_LEGGINGS")
    val LEATHER_BOOTS = ItemType("LEATHER_BOOTS")
    val CHAINMAIL_HELMET = ItemType("CHAINMAIL_HELMET")
    val CHAINMAIL_CHESTPLATE = ItemType("CHAINMAIL_CHESTPLATE")
    val CHAINMAIL_LEGGINGS = ItemType("CHAINMAIL_LEGGINGS")
    val CHAINMAIL_BOOTS = ItemType("CHAINMAIL_BOOTS")
    val IRON_HELMET = ItemType("IRON_HELMET")
    val IRON_CHESTPLATE = ItemType("IRON_CHESTPLATE")
    val IRON_LEGGINGS = ItemType("IRON_LEGGINGS")
    val IRON_BOOTS = ItemType("IRON_BOOTS")
    val DIAMOND_HELMET = ItemType("DIAMOND_HELMET")
    val DIAMOND_CHESTPLATE = ItemType("DIAMOND_CHESTPLATE")
    val DIAMOND_LEGGINGS = ItemType("DIAMOND_LEGGINGS")
    val DIAMOND_BOOTS = ItemType("DIAMOND_BOOTS")
    val GOLD_HELMET = ItemType("GOLD_HELMET")
    val GOLD_CHESTPLATE = ItemType("GOLD_CHESTPLATE")
    val GOLD_LEGGINGS = ItemType("GOLD_LEGGINGS")
    val GOLD_BOOTS = ItemType("GOLD_BOOTS")
    val FLINT = ItemType("FLINT")
    val PORK = ItemType("PORK")
    val GRILLED_PORK = ItemType("GRILLED_PORK")
    val PAINTING = ItemType("PAINTING")
    val GOLDEN_APPLE = ItemType("GOLDEN_APPLE")
    val SIGN = ItemType("SIGN")
    val WOOD_DOOR = ItemType("WOOD_DOOR")
    val BUCKET = ItemType("BUCKET")
    val WATER_BUCKET = ItemType("WATER_BUCKET")
    val LAVA_BUCKET = ItemType("LAVA_BUCKET")
    val MINECART = ItemType("MINECART")
    val SADDLE = ItemType("SADDLE")
    val IRON_DOOR = ItemType("IRON_DOOR")
    val REDSTONE = ItemType("REDSTONE")
    val SNOW_BALL = ItemType("SNOW_BALL")
    val BOAT = ItemType("BOAT")
    val LEATHER = ItemType("LEATHER")
    val MILK_BUCKET = ItemType("MILK_BUCKET")
    val CLAY_BRICK = ItemType("CLAY_BRICK")
    val CLAY_BALL = ItemType("CLAY_BALL")
    val SUGAR_CANE = ItemType("SUGAR_CANE")
    val PAPER = ItemType("PAPER")
    val BOOK = ItemType("BOOK")
    val SLIME_BALL = ItemType("SLIME_BALL")
    val STORAGE_MINECART = ItemType("STORAGE_MINECART")
    val POWERED_MINECART = ItemType("POWERED_MINECART")
    val EGG = ItemType("EGG")
    val COMPASS = ItemType("COMPASS")
    val FISHING_ROD = ItemType("FISHING_ROD")
    val WATCH = ItemType("WATCH")
    val GLOWSTONE_DUST = ItemType("GLOWSTONE_DUST")
    val RAW_FISH = ItemType("RAW_FISH")
    val COOKED_FISH = ItemType("COOKED_FISH")
    val INK_SACK = ItemType("INK_SACK", "dye")
    val BONE = ItemType("BONE")
    val SUGAR = ItemType("SUGAR")
    val CAKE = ItemType("CAKE")
    val BED = ItemType("BED")
    val DIODE = ItemType("DIODE")
    val COOKIE = ItemType("COOKIE")
    val MAP = ItemType("MAP")
    val SHEARS = ItemType("SHEARS")
    val MELON = ItemType("MELON")
    val PUMPKIN_SEEDS = ItemType("PUMPKIN_SEEDS")
    val MELON_SEEDS = ItemType("MELON_SEEDS")
    val RAW_BEEF = ItemType("RAW_BEEF")
    val COOKED_BEEF = ItemType("COOKED_BEEF")
    val RAW_CHICKEN = ItemType("RAW_CHICKEN")
    val COOKED_CHICKEN = ItemType("COOKED_CHICKEN")
    val ROTTEN_FLESH = ItemType("ROTTEN_FLESH")
    val ENDER_PEARL = ItemType("ENDER_PEARL")
    val BLAZE_ROD = ItemType("BLAZE_ROD")
    val GHAST_TEAR = ItemType("GHAST_TEAR")
    val GOLD_NUGGET = ItemType("GOLD_NUGGET")
    val NETHER_STALK = ItemType("NETHER_STALK")
    val POTION = ItemType("POTION")
    val GLASS_BOTTLE = ItemType("GLASS_BOTTLE")
    val SPIDER_EYE = ItemType("SPIDER_EYE")
    val FERMENTED_SPIDER_EYE = ItemType("FERMENTED_SPIDER_EYE")
    val BLAZE_POWDER = ItemType("BLAZE_POWDER")
    val MAGMA_CREAM = ItemType("MAGMA_CREAM")
    val BREWING_STAND_ITEM = ItemType("BREWING_STAND_ITEM")
    val CAULDRON_ITEM = ItemType("CAULDRON_ITEM")
    val EYE_OF_ENDER = ItemType("EYE_OF_ENDER")
    val SPECKLED_MELON = ItemType("SPECKLED_MELON")
    val MONSTER_EGG = ItemType("MONSTER_EGG")
    val EXP_BOTTLE = ItemType("EXP_BOTTLE")
    val FIREBALL = ItemType("FIREBALL")
    val BOOK_AND_QUILL = ItemType("BOOK_AND_QUILL")
    val WRITTEN_BOOK = ItemType("WRITTEN_BOOK", "WRITABLE_BOOK")
    val EMERALD = ItemType("EMERALD")
    val ITEM_FRAME = ItemType("ITEM_FRAME")
    val FLOWER_POT_ITEM = ItemType("FLOWER_POT_ITEM")
    val CARROT_ITEM = ItemType("CARROT_ITEM")
    val POTATO_ITEM = ItemType("POTATO_ITEM")
    val BAKED_POTATO = ItemType("BAKED_POTATO")
    val POISONOUS_POTATO = ItemType("POISONOUS_POTATO")
    val EMPTY_MAP = ItemType("EMPTY_MAP")
    val GOLDEN_CARROT = ItemType("GOLDEN_CARROT")
    val SKULL_ITEM = ItemType("SKULL_ITEM")
    val CARROT_STICK = ItemType("CARROT_STICK")
    val NETHER_STAR = ItemType("NETHER_STAR")
    val PUMPKIN_PIE = ItemType("PUMPKIN_PIE")
    val FIREWORK = ItemType("FIREWORK")
    val FIREWORK_CHARGE = ItemType("FIREWORK_CHARGE")
    val ENCHANTED_BOOK = ItemType("ENCHANTED_BOOK")
    val REDSTONE_COMPARATOR = ItemType("REDSTONE_COMPARATOR")
    val NETHER_BRICK_ITEM = ItemType("NETHER_BRICK_ITEM")
    val QUARTZ = ItemType("QUARTZ")
    val EXPLOSIVE_MINECART = ItemType("EXPLOSIVE_MINECART")
    val HOPPER_MINECART = ItemType("HOPPER_MINECART")
    val PRISMARINE_SHARD = ItemType("PRISMARINE_SHARD")
    val PRISMARINE_CRYSTALS = ItemType("PRISMARINE_CRYSTALS")
    val RABBIT = ItemType("RABBIT")
    val COOKED_RABBIT = ItemType("COOKED_RABBIT")
    val RABBIT_STEW = ItemType("RABBIT_STEW")
    val RABBIT_FOOT = ItemType("RABBIT_FOOT")
    val RABBIT_HIDE = ItemType("RABBIT_HIDE")
    val ARMOR_STAND = ItemType("ARMOR_STAND")
    val IRON_BARDING = ItemType("IRON_BARDING")
    val GOLD_BARDING = ItemType("GOLD_BARDING")
    val DIAMOND_BARDING = ItemType("DIAMOND_BARDING")
    val LEASH = ItemType("LEASH")
    val NAME_TAG = ItemType("NAME_TAG")
    val COMMAND_MINECART = ItemType("COMMAND_MINECART")
    val MUTTON = ItemType("MUTTON")
    val COOKED_MUTTON = ItemType("COOKED_MUTTON")
    val BANNER = ItemType("BANNER")
    val END_CRYSTAL = ItemType("END_CRYSTAL")
    val SPRUCE_DOOR_ITEM = ItemType("SPRUCE_DOOR_ITEM")
    val BIRCH_DOOR_ITEM = ItemType("BIRCH_DOOR_ITEM")
    val JUNGLE_DOOR_ITEM = ItemType("JUNGLE_DOOR_ITEM")
    val ACACIA_DOOR_ITEM = ItemType("ACACIA_DOOR_ITEM")
    val DARK_OAK_DOOR_ITEM = ItemType("DARK_OAK_DOOR_ITEM")
    val CHORUS_FRUIT = ItemType("CHORUS_FRUIT")
    val CHORUS_FRUIT_POPPED = ItemType("CHORUS_FRUIT_POPPED")
    val BEETROOT = ItemType("BEETROOT")
    val BEETROOT_SEEDS = ItemType("BEETROOT_SEEDS")
    val BEETROOT_SOUP = ItemType("BEETROOT_SOUP")
    val DRAGONS_BREATH = ItemType("DRAGONS_BREATH")
    val SPLASH_POTION = ItemType("SPLASH_POTION")
    val SPECTRAL_ARROW = ItemType("SPECTRAL_ARROW")
    val TIPPED_ARROW = ItemType("TIPPED_ARROW")
    val LINGERING_POTION = ItemType("LINGERING_POTION")
    val SHIELD = ItemType("SHIELD")
    val ELYTRA = ItemType("ELYTRA")
    val BOAT_SPRUCE = ItemType("BOAT_SPRUCE")
    val BOAT_BIRCH = ItemType("BOAT_BIRCH")
    val BOAT_JUNGLE = ItemType("BOAT_JUNGLE")
    val BOAT_ACACIA = ItemType("BOAT_ACACIA")
    val BOAT_DARK_OAK = ItemType("BOAT_DARK_OAK")
    val TOTEM = ItemType("TOTEM")
    val SHULKER_SHELL = ItemType("SHULKER_SHELL")
    val IRON_NUGGET = ItemType("IRON_NUGGET")
    val KNOWLEDGE_BOOK = ItemType("KNOWLEDGE_BOOK")
    val GOLD_RECORD = ItemType("GOLD_RECORD")
    val GREEN_RECORD = ItemType("GREEN_RECORD")
    val RECORD_3 = ItemType("RECORD_3")
    val RECORD_4 = ItemType("RECORD_4")
    val RECORD_5 = ItemType("RECORD_5")
    val RECORD_6 = ItemType("RECORD_6")
    val RECORD_7 = ItemType("RECORD_7")
    val RECORD_8 = ItemType("RECORD_8")
    val RECORD_9 = ItemType("RECORD_9")
    val RECORD_10 = ItemType("RECORD_10")
    val RECORD_11 = ItemType("RECORD_11")
    val RECORD_12 = ItemType("RECORD_12")

    val ENUMERATION = VALUES.toEnumeration()

    fun ItemType.isEqual(other: ItemType): Boolean {
        if (this.actualModID.isNotBlank())
            return this.actualModID == other.actualModID

        if (this == other) {
            return true
        }

        return false
    }

    fun getByName(name: String): ItemType? {
        val split = name.split(":")
        var itemName = ""

        if (split.size == 1) {
            itemName = split[0]
        } else if (split.size == 2) {
            val registryName = split[0]
            itemName = split[1]

            if (!registryName.equals("minecraft", true)) {
                return ItemType(itemName, "$registryName:$itemName", "$registryName:$itemName")
            }
        }

        for (value in VALUES) {
            if (value.name.equals(itemName, true) || value.altID.equals(itemName, true)) {
                return value
            }
        }

        return null
    }

    private fun List<ItemType>.toEnumeration(): Enumeration<ItemType> {
        return object : Enumeration<ItemType> {
            var count = 0

            override fun hasMoreElements(): Boolean {
                return this.count < size
            }

            override fun nextElement(): ItemType {
                if (this.count < size) {
                    return get(this.count++)
                }
                throw NoSuchElementException("List enumeration asked for more elements than present")
            }
        }
    }
}
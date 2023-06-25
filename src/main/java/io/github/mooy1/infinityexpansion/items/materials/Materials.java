package io.github.mooy1.infinityexpansion.items.materials;

import java.util.Arrays;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.machines.VoidHarvester;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

@UtilityClass
public final class Materials {


    public static final SlimefunItemStack INFINITE_CIRCUIT = new SlimefunItemStack(
            "INFINITE_MACHINE_CIRCUIT",
            Material.DIAMOND,
            "&b無限&6機器電路板",
            "&7機器組件"
    );
    public static final SlimefunItemStack INFINITE_CORE = new SlimefunItemStack(
            "INFINITE_MACHINE_CORE",
            Material.DIAMOND_BLOCK,
            "&b無限機器核心",
            "&7機器組件"
    );
    public static final SlimefunItemStack MAGSTEEL_PLATE = new SlimefunItemStack(
            "MAGSTEEL_PLATE",
            Material.NETHERITE_SCRAP,
            "&4鎂鋼板",
            "&7機器組件"
    );
    public static final SlimefunItemStack MACHINE_PLATE = new SlimefunItemStack(
            "MACHINE_PLATE",
            Material.PAPER,
            "&f機器板",
            "&7機器組件"
    );
    public static final SlimefunItemStack MACHINE_CIRCUIT = new SlimefunItemStack(
            "MACHINE_CIRCUIT",
            Material.GOLD_INGOT,
            "&6機器電路板",
            "&7機器組件"
    );

    public static final SlimefunItemStack MACHINE_CORE = new SlimefunItemStack(
            "MACHINE_CORE",
            Material.IRON_BLOCK,
            "&f機器核心",
            "&7機器組件"
    );
    public static final SlimefunItemStack VOID_BIT = new SlimefunItemStack(
            "VOID_BIT",
            Material.IRON_NUGGET,
            "&8虛空之點",
            "&7&o感覺就像是... 虛無"
    );
    public static final SlimefunItemStack VOID_DUST = new SlimefunItemStack(
            "VOID_DUST",
            Material.GUNPOWDER,
            "&8虛空粉",
            "&7&o它開始形成..."
    );
    public static final SlimefunItemStack VOID_INGOT = new SlimefunItemStack(
            "VOID_INGOT",
            Material.NETHERITE_INGOT,
            "&8虛空錠",
            "&7&o宇宙中的虛無",
            "&7&o就在你手掌中"
    );
    public static final SlimefunItemStack COBBLE_1 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_1",
            Material.ANDESITE,
            "&7單壓縮鵝卵石",
            "&89個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_2 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_2",
            Material.ANDESITE,
            "&7雙重壓縮鵝卵石",
            "&881個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_3 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_3",
            Material.STONE,
            "&7三重壓縮鵝卵石",
            "&8729個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_4 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_4",
            Material.STONE,
            "&7四重壓縮鵝卵石",
            "&86,561個鵝卵石結合而成"
    );
    public static final SlimefunItemStack COBBLE_5 = new SlimefunItemStack(
            "COMPRESSED_COBBLESTONE_5",
            Material.POLISHED_ANDESITE,
            "&7五重壓縮鵝卵石",
            "&859,049個鵝卵石結合而成"
    );
    // 魔改：开始
    public static final SlimefunItemStack BIO_MASS = new SlimefunItemStack(
            "BIO_MASS",
            Material.SLIME_BALL,
            "&b酵解生物質",
            "&7&o富含多種有機成分，不可食用...",
            "&7&o通過二次發酵可獲得原油",
            "&7&o也可和原油、纖維質在冶煉爐裡製造人造革"
    );
    public static final SlimefunItemStack FIBRE = new SlimefunItemStack(
            "FIBRE",
            Material.PAPER,
            "&b纖維質",
            "&7&o味同嚼蠟..."
    );
    public static final SlimefunItemStack FIBRE_BLOCK = new SlimefunItemStack(
            "FIBRE_BLOCK",
            Material.WHITE_WOOL,
            "&b纤维块",
            "&7&o投入分解机，然后你就获得了一堆纸"
    );
    public static final SlimefunItemStack FEATHER_MASS = new SlimefunItemStack(
            "FEATHER_MASS",
            Material.BROWN_CONCRETE,
            "&b人造革塊",
            "&7&o散發著皮革氣味的大塊物質，需要用分解機進行分割"
    );
    public static final SlimefunItemStack APPLE_MASS = new SlimefunItemStack(
            "APPLE_MASS",
            Material.APPLE,
            "&b蘋果奇點",
            "&7&o蘋果+蘋果+蘋果+...= ?",
            "&7&o好像咬不動...可惡啊..."
    );
    public static final SlimefunItemStack GOLDEN_APPLE_MASS = new SlimefunItemStack(
            "GOLDEN_APPLE_MASS",
            Material.GOLDEN_APPLE,
            "&b黃金蘋果奇點",
            "&7&o罪惡的黃金果",
            "&7&o還是咬不動..."
    );
    public static final SlimefunItemStack ENCHANTED_APPLE_MASS = new SlimefunItemStack(
            "ENCHANTED_APPLE_MASS",
            Material.ENCHANTED_GOLDEN_APPLE,
            "&b魔法蘋果奇點",
            "&7&o魔力灌注後的金蘋果會是青金石味的嗎？",
            "&7&o真想咬一口..."
    );
    public static final SlimefunItemStack GOLDEN_MASS = new SlimefunItemStack(
            "GOLDEN_MASS",
            Material.DEEPSLATE_GOLD_ORE,
            "&b點金石",
            "&7&o和蘋果奇點對撞，會發生某種神奇的事情..."
    );
    public static final SlimefunItemStack ENCHANTED_MASS = new SlimefunItemStack(
            "ENCHANTED_MASS",
            Material.GILDED_BLACKSTONE,
            "&b注魔點金石",
            "&7&o向黃金果實注入無窮魔力..."
    );
    // 魔改：結束
    public static final SlimefunItemStack MAGSTEEL = new SlimefunItemStack(
            "MAGSTEEL",
            Material.BRICK,
            "&4鎂鋼"
    );
    public static final SlimefunItemStack MAGNONIUM = new SlimefunItemStack(
            "MAGNONIUM",
            Material.NETHER_BRICK,
            "&5磁振子元素"
    );
    public static final SlimefunItemStack TITANIUM = new SlimefunItemStack(
            "TITANIUM",
            Material.IRON_INGOT,
            "&7鈦"
    );
    public static final SlimefunItemStack MYTHRIL = new SlimefunItemStack(
            "MYTHRIL",
            Material.IRON_INGOT,
            "&b秘銀"
    );
    public static final SlimefunItemStack ADAMANTITE = new SlimefunItemStack(
            "ADAMANTITE",
            Material.BRICK,
            "&d精金"
    );
    public static final SlimefunItemStack INFINITE_INGOT = new SlimefunItemStack(
            "INFINITE_INGOT",
            Material.IRON_INGOT,
            "&e無限錠", // &dI&cn&6f&ei&an&bi&3t&9y &fIngot
            "&7&o宇宙之怒",
            "&7&o在手裡掌握著"
    );
    public static final SlimefunItemStack FORTUNE_SINGULARITY = new SlimefunItemStack(
            "FORTUNE_SINGULARITY",
            Material.NETHER_STAR,
            "&6幸運奇點"
    );
    public static final SlimefunItemStack EARTH_SINGULARITY = new SlimefunItemStack(
            "EARTH_SINGULARITY",
            Material.NETHER_STAR,
            "&a地球奇點"
    );
    public static final SlimefunItemStack METAL_SINGULARITY = new SlimefunItemStack(
            "METAL_SINGULARITY",
            Material.NETHER_STAR,
            "&8金屬奇點"
    );
    public static final SlimefunItemStack MAGIC_SINGULARITY = new SlimefunItemStack(
            "MAGIC_SINGULARITY",
            Material.NETHER_STAR,
            "&d魔法奇點"
    );
    public static final SlimefunItemStack ENDER_ESSENCE = new SlimefunItemStack(
            "END_ESSENCE",
            Material.BLAZE_POWDER,
            "&5終界精華",
            "&8&o來自終界的深處..."
    );


    public static final SlimefunItemStack COPPER_SINGULARITY = new SlimefunItemStack(
            "COPPER_SINGULARITY",
            Material.BRICKS,
            "&6銅奇點"
    );
    public static final SlimefunItemStack ZINC_SINGULARITY = new SlimefunItemStack(
            "ZINC_SINGULARITY",
            Material.IRON_BLOCK,
            "&7鋅奇點"
    );
    public static final SlimefunItemStack TIN_SINGULARITY = new SlimefunItemStack(
            "TIN_SINGULARITY",
            Material.IRON_BLOCK,
            "&7錫奇點"
    );
    public static final SlimefunItemStack ALUMINUM_SINGULARITY = new SlimefunItemStack(
            "ALUMINUM_SINGULARITY",
            Material.IRON_BLOCK,
            "&7鋁奇點"
    );
    public static final SlimefunItemStack SILVER_SINGULARITY = new SlimefunItemStack(
            "SILVER_SINGULARITY",
            Material.IRON_BLOCK,
            "&7銀奇點"
    );
    public static final SlimefunItemStack MAGNESIUM_SINGULARITY = new SlimefunItemStack(
            "MAGNESIUM_SINGULARITY",
            Material.NETHER_BRICKS,
            "&5鎂奇點"
    );
    public static final SlimefunItemStack LEAD_SINGULARITY = new SlimefunItemStack(
            "LEAD_SINGULARITY",
            Material.IRON_BLOCK,
            "&8鉛奇點"
    );
    public static final SlimefunItemStack GOLD_SINGULARITY = new SlimefunItemStack(
            "GOLD_SINGULARITY",
            Material.GOLD_BLOCK,
            "&6金奇點"
    );
    public static final SlimefunItemStack IRON_SINGULARITY = new SlimefunItemStack(
            "IRON_SINGULARITY",
            Material.IRON_BLOCK,
            "&7鐵奇點"
    );
    public static final SlimefunItemStack DIAMOND_SINGULARITY = new SlimefunItemStack(
            "DIAMOND_SINGULARITY",
            Material.DIAMOND_BLOCK,
            "&b鑽石奇點"
    );
    public static final SlimefunItemStack EMERALD_SINGULARITY = new SlimefunItemStack(
            "EMERALD_SINGULARITY",
            Material.EMERALD_BLOCK,
            "&a綠寶石奇點"
    );
    public static final SlimefunItemStack NETHERITE_SINGULARITY = new SlimefunItemStack(
            "NETHERITE_SINGULARITY",
            Material.NETHERITE_BLOCK,
            "&4獄髓奇點"
    );
    public static final SlimefunItemStack COAL_SINGULARITY = new SlimefunItemStack(
            "COAL_SINGULARITY",
            Material.COAL_BLOCK,
            "&8煤炭奇點"
    );
    public static final SlimefunItemStack REDSTONE_SINGULARITY = new SlimefunItemStack(
            "REDSTONE_SINGULARITY",
            Material.REDSTONE_BLOCK,
            "&c紅石奇點"
    );
    public static final SlimefunItemStack LAPIS_SINGULARITY = new SlimefunItemStack(
            "LAPIS_SINGULARITY",
            Material.LAPIS_BLOCK,
            "&9青金石奇點"
    );
    public static final SlimefunItemStack QUARTZ_SINGULARITY = new SlimefunItemStack(
            "QUARTZ_SINGULARITY",
            Material.QUARTZ_BLOCK,
            "&f地獄石英奇點"
    );
    public static final SlimefunItemStack INFINITY_SINGULARITY = new SlimefunItemStack(
            "INFINITY_SINGULARITY",
            Material.SMOOTH_QUARTZ,
            "&b無限奇點"
    );
    // 魔改：开始
    public static final SlimefunItemStack VOID_SINGULARITY = new SlimefunItemStack(
            "VOID_SINGULARITY",
            Material.ANCIENT_DEBRIS,
            "&b虛空奇點"
    );
    public static final SlimefunItemStack COBBLE_HEART = new SlimefunItemStack(
            "COBBLE_HEART",
            Material.DIAMOND,
            "&b極致之心",
            "&7&o或許是一座極致的里程碑..."
    );
    public static final SlimefunItemStack LUMINA_SINGULARITY = new SlimefunItemStack(
            "LUMINA_SINGULARITY",
            Material.GLOWSTONE,
            "&b穩定態光結構",
            "&7&o創造的可能性閃爍於此..."
    );
    public static final SlimefunItemStack LUMINA_DUST = new SlimefunItemStack(
            "LUMINA_DUST",
            Material.GLOWSTONE_DUST,
            "&b亞穩態光塵",
            "&7&o凝聚在時空與能量間的某種可能性..."
    );
    public static final SlimefunItemStack LUMINA_GLASS = new SlimefunItemStack(
            "LUMINA_GLASS",
            Material.END_CRYSTAL,
            "&b光量子玻晶",
            "&7&o一閃一閃亮晶晶..."
    );
    // 魔改：結束
    public static final SlimefunItemStack BASIC_STRAINER = new SlimefunItemStack(
            "BASIC_STRAINER",
            Material.FISHING_ROD,
            "&9基本過濾器",
            "&7從水流中收集材料",
            "",
            LoreBuilder.speed(1)
    );
    public static final SlimefunItemStack ADVANCED_STRAINER = new SlimefunItemStack(
            "ADVANCED_STRAINER",
            Material.FISHING_ROD,
            "&c高級過濾器",
            "&7從水流中收集材料",
            "",
            LoreBuilder.speed(4)
    );
    public static final SlimefunItemStack REINFORCED_STRAINER = new SlimefunItemStack(
            "REINFORCED_STRAINER",
            Material.FISHING_ROD,
            "&f強化過濾器",
            "&7從水流中收集材料"",
            "",
            LoreBuilder.speed(20)
    );

    public static void setup(InfinityExpansion plugin) {
        new EnderEssence(Groups.MAIN_MATERIALS, ENDER_ESSENCE, new NamespacedKey(plugin, "ender_essence")).register(plugin);
        registerEnhanced(COBBLE_1, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE)
        });
        registerEnhanced(COBBLE_2, new ItemStack[] {
                COBBLE_1, COBBLE_1, COBBLE_1,
                COBBLE_1, COBBLE_1, COBBLE_1,
                COBBLE_1, COBBLE_1, COBBLE_1
        });
        registerEnhanced(COBBLE_3, new ItemStack[] {
                COBBLE_2, COBBLE_2, COBBLE_2,
                COBBLE_2, COBBLE_2, COBBLE_2,
                COBBLE_2, COBBLE_2, COBBLE_2
        });
        registerEnhanced(COBBLE_4, new ItemStack[] {
                COBBLE_3, COBBLE_3, COBBLE_3,
                COBBLE_3, COBBLE_3, COBBLE_3,
                COBBLE_3, COBBLE_3, COBBLE_3
        });
        registerEnhanced(COBBLE_5, new ItemStack[] {
                COBBLE_4, COBBLE_4, COBBLE_4,
                COBBLE_4, COBBLE_4, COBBLE_4,
                COBBLE_4, COBBLE_4, COBBLE_4
        });
        registerEnhanced(VOID_DUST, new ItemStack[] {
                VOID_BIT, VOID_BIT, VOID_BIT,
                VOID_BIT, VOID_BIT, VOID_BIT,
                VOID_BIT, VOID_BIT, VOID_BIT
        });
        registerEnhanced(VOID_INGOT, new ItemStack[] {
                VOID_DUST, VOID_DUST, VOID_DUST,
                VOID_DUST, VOID_DUST, VOID_DUST,
                VOID_DUST, VOID_DUST, VOID_DUST
        });
        // 魔改：开始
        registerEnhanced(LUMINA_GLASS, new ItemStack[] {
                QUARTZ_SINGULARITY, LUMINA_DUST, QUARTZ_SINGULARITY,
                LUMINA_DUST, VOID_INGOT, LUMINA_DUST,
                QUARTZ_SINGULARITY, LUMINA_DUST, QUARTZ_SINGULARITY
        });
        registerEnhanced(GOLDEN_MASS, new ItemStack[] {
            SlimefunItems.GOLD_24K, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.GOLD_24K,
            SlimefunItems.BLISTERING_INGOT_3, new ItemStack(Material.LAPIS_BLOCK), SlimefunItems.BLISTERING_INGOT_3,
            SlimefunItems.GOLD_24K, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.GOLD_24K
        });
        registerEnhanced(ENCHANTED_MASS, new ItemStack[] {
            new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.NETHER_STAR), new ItemStack(Material.LAPIS_BLOCK),
            new ItemStack(Material.NETHER_STAR), GOLDEN_MASS, new ItemStack(Material.NETHER_STAR),
            new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.NETHER_STAR), new ItemStack(Material.LAPIS_BLOCK)
        });
        registerEnhanced(FIBRE_BLOCK, new ItemStack[] {
            FIBRE, FIBRE, FIBRE,
            FIBRE, FIBRE, FIBRE,
            null, null, null
        });
        registerSmeltery(FEATHER_MASS, SlimefunItems.OIL_BUCKET, BIO_MASS, FIBRE);
        // 魔改：结束
        registerSmeltery(INFINITE_INGOT, EARTH_SINGULARITY, MYTHRIL, FORTUNE_SINGULARITY, MAGIC_SINGULARITY, VOID_INGOT, METAL_SINGULARITY);
        registerSmeltery(FORTUNE_SINGULARITY, GOLD_SINGULARITY, DIAMOND_SINGULARITY, EMERALD_SINGULARITY, NETHERITE_SINGULARITY, ADAMANTITE);
        registerSmeltery(MAGIC_SINGULARITY, REDSTONE_SINGULARITY, LAPIS_SINGULARITY, QUARTZ_SINGULARITY, MAGNESIUM_SINGULARITY, MAGNONIUM);
        registerSmeltery(EARTH_SINGULARITY, COBBLE_4, COAL_SINGULARITY, IRON_SINGULARITY, COPPER_SINGULARITY, LEAD_SINGULARITY);
        registerSmeltery(METAL_SINGULARITY, SILVER_SINGULARITY, ALUMINUM_SINGULARITY, TIN_SINGULARITY, ZINC_SINGULARITY, TITANIUM);
        registerSmeltery(MAGSTEEL, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.MAGNESIUM_DUST);
        registerSmeltery(TITANIUM, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(MYTHRIL, SlimefunItems.REINFORCED_ALLOY_INGOT, IRON_SINGULARITY, SlimefunItems.HARDENED_METAL_INGOT);
        registerSmeltery(ADAMANTITE, SlimefunItems.REDSTONE_ALLOY, DIAMOND_SINGULARITY, MAGSTEEL);
        registerSmeltery(MAGNONIUM, MAGSTEEL, MAGNESIUM_SINGULARITY, ENDER_ESSENCE);
        register(VOID_BIT, VoidHarvester.TYPE, new ItemStack[0]);
        registerEnhanced(MAGSTEEL_PLATE, new ItemStack[] {
                MAGSTEEL, MAGSTEEL, MAGSTEEL,
                MAGSTEEL, SlimefunItems.HARDENED_METAL_INGOT, MAGSTEEL,
                MAGSTEEL, MAGSTEEL, MAGSTEEL
        });
        registerEnhanced(MACHINE_CIRCUIT, new ItemStack[] {
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.SILICON, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.COPPER_INGOT
        });
        new Strainer(BASIC_STRAINER, new ItemStack[] {
                new ItemStack(Material.STICK), new ItemStack(Material.STRING), new ItemStack(Material.STICK),
                new ItemStack(Material.STRING), new ItemStack(Material.STICK), new ItemStack(Material.STRING),
                new ItemStack(Material.STICK), new ItemStack(Material.STRING), new ItemStack(Material.STICK),
        }, 1).register(plugin);
        new Strainer(ADVANCED_STRAINER, new ItemStack[] {
                Materials.MAGSTEEL, new ItemStack(Material.STRING), Materials.MAGSTEEL,
                new ItemStack(Material.STRING), BASIC_STRAINER, new ItemStack(Material.STRING),
                Materials.MAGSTEEL, new ItemStack(Material.STRING), Materials.MAGSTEEL
        }, 4).register(plugin);
        new Strainer(REINFORCED_STRAINER, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT,
                new ItemStack(Material.STRING), ADVANCED_STRAINER, new ItemStack(Material.STRING),
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.STRING), SlimefunItems.REINFORCED_ALLOY_INGOT
        }, 20).register(plugin);
        registerEnhanced(MACHINE_CORE, new ItemStack[] {
                TITANIUM, MACHINE_CIRCUIT, TITANIUM,
                MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CIRCUIT,
                TITANIUM, MACHINE_CIRCUIT, TITANIUM
        });
        registerEnhanced(MACHINE_PLATE, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT,
                MAGSTEEL_PLATE, TITANIUM, MAGSTEEL_PLATE,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT
        });
        register(Groups.INFINITY_CHEAT, INFINITE_CIRCUIT, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                INFINITE_INGOT, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITE_INGOT,
                INFINITE_INGOT, VOID_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, VOID_INGOT, INFINITE_INGOT,
                VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT, VOID_INGOT, MACHINE_CIRCUIT, VOID_INGOT,
                MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT, MACHINE_CIRCUIT, INFINITE_INGOT, MACHINE_CIRCUIT
        });
        register(Groups.INFINITY_CHEAT, INFINITE_CORE, InfinityWorkbench.TYPE, new ItemStack[] {
                MACHINE_PLATE, MACHINE_CORE, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CORE, MACHINE_PLATE,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT,
                INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CIRCUIT, INFINITE_INGOT,
                MACHINE_CORE, MACHINE_PLATE, MACHINE_CIRCUIT, MACHINE_CIRCUIT, MACHINE_PLATE, MACHINE_CORE,
                MACHINE_PLATE, MACHINE_CORE, INFINITE_INGOT, INFINITE_INGOT, MACHINE_CORE, MACHINE_PLATE
        });
        new Singularity(COPPER_SINGULARITY, SlimefunItems.COPPER_INGOT, 3000).register(plugin);
        new Singularity(ZINC_SINGULARITY, SlimefunItems.ZINC_INGOT, 3000).register(plugin);
        new Singularity(TIN_SINGULARITY, SlimefunItems.TIN_INGOT, 3000).register(plugin);
        new Singularity(ALUMINUM_SINGULARITY, SlimefunItems.ALUMINUM_INGOT, 3000).register(plugin);
        new Singularity(SILVER_SINGULARITY, SlimefunItems.SILVER_INGOT, 3000).register(plugin);
        new Singularity(MAGNESIUM_SINGULARITY, SlimefunItems.MAGNESIUM_INGOT, 3000).register(plugin);
        new Singularity(LEAD_SINGULARITY, SlimefunItems.LEAD_INGOT, 3000).register(plugin);
        new Singularity(GOLD_SINGULARITY, Material.GOLD_INGOT, 2000).register(plugin);
        new Singularity(IRON_SINGULARITY, Material.IRON_INGOT, 2000).register(plugin);
        new Singularity(DIAMOND_SINGULARITY, Material.DIAMOND, 500).register(plugin);
        new Singularity(EMERALD_SINGULARITY, Material.EMERALD, 500).register(plugin);
        new Singularity(NETHERITE_SINGULARITY, Material.NETHERITE_INGOT, 200).register(plugin);
        new Singularity(COAL_SINGULARITY, Material.COAL, 1500).register(plugin);
        new Singularity(REDSTONE_SINGULARITY, Material.REDSTONE, 1500).register(plugin);
        new Singularity(LAPIS_SINGULARITY, Material.LAPIS_LAZULI, 1500).register(plugin);
        new Singularity(QUARTZ_SINGULARITY, Material.QUARTZ, 1500).register(plugin);
        new Singularity(INFINITY_SINGULARITY, INFINITE_INGOT, 100).register(plugin);
        // 魔改：开始
        new Singularity(VOID_SINGULARITY, VOID_INGOT, 128).register(plugin);
        new Singularity(LUMINA_SINGULARITY, LUMINA_DUST, 64).register(plugin);
        new Singularity(COBBLE_HEART, COBBLE_5, 1024).register(plugin);
        new Singularity(APPLE_MASS, Material.APPLE, 64).register(plugin);
        new Singularity(GOLDEN_APPLE_MASS, Material.GOLDEN_APPLE, 64).register(plugin);
        new Singularity(ENCHANTED_APPLE_MASS, Material.ENCHANTED_GOLDEN_APPLE, 64).register(plugin);
        // 魔改：结束
    }

    private static void registerEnhanced(SlimefunItemStack item, ItemStack[] recipe) {
        register(item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }

    private static void registerSmeltery(SlimefunItemStack itemStack, ItemStack... recipe) {
        register(itemStack, RecipeType.SMELTERY, Arrays.copyOf(recipe, 9));
    }

    private static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
        register(Groups.MAIN_MATERIALS, itemStack, type, recipe);
    }

    private static void register(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        new SimpleMaterial(category, item, recipeType, recipe).register(InfinityExpansion.instance());
    }

}

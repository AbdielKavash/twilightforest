package twilightforest.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import twilightforest.TwilightForestMod;

public class TFItems {

    public static ItemArmor.ArmorMaterial ARMOR_NAGA = EnumHelper
            .addArmorMaterial("NAGA_SCALE", 21, new int[] { 2, 7, 6, 3 }, 15);
    public static ItemArmor.ArmorMaterial ARMOR_IRONWOOD = EnumHelper
            .addArmorMaterial("IRONWOOD", 20, new int[] { 2, 7, 5, 2 }, 15);
    public static ItemArmor.ArmorMaterial ARMOR_FIERY = EnumHelper
            .addArmorMaterial("FIERY", 25, new int[] { 4, 9, 7, 4 }, 10);
    public static ItemArmor.ArmorMaterial ARMOR_STEELEAF = EnumHelper
            .addArmorMaterial("STEELEAF", 10, new int[] { 3, 8, 6, 3 }, 9);
    public static ItemArmor.ArmorMaterial ARMOR_KNIGHTLY = EnumHelper
            .addArmorMaterial("KNIGHTMETAL", 20, new int[] { 3, 8, 6, 3 }, 8);
    public static ItemArmor.ArmorMaterial ARMOR_PHANTOM = EnumHelper
            .addArmorMaterial("KNIGHTPHANTOM", 30, new int[] { 3, 8, 6, 3 }, 8);
    public static ItemArmor.ArmorMaterial ARMOR_YETI = EnumHelper
            .addArmorMaterial("YETI", 20, new int[] { 4, 7, 6, 3 }, 15);
    public static ItemArmor.ArmorMaterial ARMOR_ARCTIC = EnumHelper
            .addArmorMaterial("ARCTIC", 10, new int[] { 2, 7, 5, 2 }, 8);

    public static Item.ToolMaterial TOOL_IRONWOOD = EnumHelper.addToolMaterial("IRONWOOD", 2, 512, 6.5F, 2, 25);
    public static Item.ToolMaterial TOOL_FIERY = EnumHelper.addToolMaterial("FIERY", 4, 1024, 9F, 4, 10);
    public static Item.ToolMaterial TOOL_STEELEAF = EnumHelper.addToolMaterial("STEELEAF", 3, 131, 8.0F, 3, 9);
    public static Item.ToolMaterial TOOL_KNIGHTLY = EnumHelper.addToolMaterial("KNIGHTMETAL", 3, 512, 8.0F, 3, 8);
    public static Item.ToolMaterial TOOL_GIANT = EnumHelper.addToolMaterial("GIANTSTONE", 1, 1024, 4.0F, 1.0F, 5);
    public static Item.ToolMaterial TOOL_ICE = EnumHelper.addToolMaterial("TFICE", 0, 32, 1.0F, 3.5F, 5);
    public static Item.ToolMaterial TOOL_GLASS = EnumHelper.addToolMaterial("TFGLASS", 0, 1, 1.0F, 36.0F, 30);

    public static Item nagaScale;
    public static Item plateNaga;
    public static Item legsNaga;
    public static Item scepterTwilight;
    public static Item scepterLifeDrain;
    public static Item scepterZombie;
    public static Item wandPacification;
    public static Item oreMeter;
    public static Item magicMap;
    public static Item mazeMap;
    public static Item oreMap;
    public static Item feather;
    public static Item magicMapFocus;
    public static Item mazeMapFocus;
    public static Item liveRoot;
    public static Item ironwoodRaw;
    public static Item ironwoodIngot;
    public static Item ironwoodHelm;
    public static Item ironwoodPlate;
    public static Item ironwoodLegs;
    public static Item ironwoodBoots;
    public static Item ironwoodSword;
    public static Item ironwoodShovel;
    public static Item ironwoodPick;
    public static Item ironwoodAxe;
    public static Item ironwoodHoe;
    public static Item torchberries;
    public static Item spawnEgg;
    public static Item venisonRaw;
    public static Item venisonCooked;
    public static Item hydraChop;
    public static Item fieryBlood;
    public static Item trophy;
    public static Item fieryIngot;
    public static Item fieryHelm;
    public static Item fieryPlate;
    public static Item fieryLegs;
    public static Item fieryBoots;
    public static Item fierySword;
    public static Item fieryPick;
    public static Item steeleafIngot;
    public static Item steeleafHelm;
    public static Item steeleafPlate;
    public static Item steeleafLegs;
    public static Item steeleafBoots;
    public static Item steeleafSword;
    public static Item steeleafShovel;
    public static Item steeleafPick;
    public static Item steeleafAxe;
    public static Item steeleafHoe;
    public static Item minotaurAxe;
    public static Item mazebreakerPick;
    public static Item transformPowder;
    public static Item meefRaw;
    public static Item meefSteak;
    public static Item meefStroganoff;
    public static Item mazeWafer;
    public static Item emptyMagicMap;
    public static Item emptyMazeMap;
    public static Item emptyOreMap;
    public static Item oreMagnet;
    public static Item crumbleHorn;
    public static Item peacockFan;
    public static Item moonwormQueen;
    public static Item charmOfLife1;
    public static Item charmOfLife2;
    public static Item charmOfKeeping1;
    public static Item charmOfKeeping2;
    public static Item charmOfKeeping3;
    public static Item towerKey;
    public static Item borerEssence;
    public static Item carminite;
    public static Item experiment115;
    public static Item armorShard;
    public static Item knightMetal;
    public static Item shardCluster;
    public static Item knightlyHelm;
    public static Item knightlyPlate;
    public static Item knightlyLegs;
    public static Item knightlyBoots;
    public static Item knightlySword;
    public static Item knightlyPick;
    public static Item knightlyAxe;
    public static Item phantomHelm;
    public static Item phantomPlate;
    public static Item lampOfCinders;
    public static Item fieryTears;
    public static Item alphaFur;
    public static Item yetiHelm;
    public static Item yetiPlate;
    public static Item yetiLegs;
    public static Item yetiBoots;
    public static Item iceBomb;
    public static Item arcticFur;
    public static Item arcticHelm;
    public static Item arcticPlate;
    public static Item arcticLegs;
    public static Item arcticBoots;
    public static Item magicBeans;
    public static Item giantPick;
    public static Item giantSword;
    public static Item tripleBow;
    public static Item seekerBow;
    public static Item iceBow;
    public static Item enderBow;
    public static Item iceSword;
    public static Item glassSword;
    public static Item knightmetalRing;
    public static Item chainBlock;
    public static Item cubeTalisman;
    public static Item cubeOfAnnihilation;

    public static Item metaItem;

    public static CreativeTabTwilightForest creativeTab = new CreativeTabTwilightForest("twilightForest");

    public static void registerItems() {
        int nagaScaleRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/nagascale_"); // the
                                                                                                            // prefix
                                                                                                            // doesn't
                                                                                                            // seem to
                                                                                                            // matter
        int ironwoodRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/ironwood_"); // the prefix
                                                                                                          // doesn't
                                                                                                          // seem to
                                                                                                          // matter
        int fieryRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/fiery_"); // the prefix
                                                                                                    // doesn't seem to
                                                                                                    // matter
        int steeleafRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/steeleaf_"); // the prefix
                                                                                                          // doesn't
                                                                                                          // seem to
                                                                                                          // matter
        int knightlyRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/knightly_"); // the prefix
                                                                                                          // doesn't
                                                                                                          // seem to
                                                                                                          // matter
        int phantomRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/phantom_"); // the prefix
                                                                                                        // doesn't seem
                                                                                                        // to matter
        int yetiRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/yeti_"); // the prefix doesn't
                                                                                                  // seem to matter
        int arcticRenderID = TwilightForestMod.proxy.registerArmorRenderID("twilightforest/arctic_"); // the prefix
                                                                                                      // doesn't seem to
                                                                                                      // matter

        nagaScale = new ItemTF().setUnlocalizedName("nagaScale");
        plateNaga = new ItemTFNagaArmor(ARMOR_NAGA, nagaScaleRenderID, 1).setUnlocalizedName("plateNaga")
                .setMaxStackSize(1);
        legsNaga = new ItemTFNagaArmor(ARMOR_NAGA, nagaScaleRenderID, 2).setUnlocalizedName("legsNaga")
                .setMaxStackSize(1);
        scepterTwilight = new ItemTFTwilightWand().setUnlocalizedName("scepterTwilight").setMaxStackSize(1).setFull3D();
        scepterLifeDrain = new ItemTFScepterLifeDrain().setUnlocalizedName("scepterLifeDrain").setMaxStackSize(1)
                .setFull3D();
        scepterZombie = new ItemTFZombieWand().setUnlocalizedName("scepterZombie").setMaxStackSize(1).setFull3D();
        // wandPacification = new
        // ItemTF().setIconIndex(6).setUnlocalizedName("wandPacification").setMaxStackSize(1).setFull3D();
        oreMeter = new ItemTFOreMeter().setUnlocalizedName("oreMeter").setMaxStackSize(1);
        magicMap = new ItemTFMagicMap().setUnlocalizedName("magicMap").setMaxStackSize(1);
        mazeMap = new ItemTFMazeMap(false).setUnlocalizedName("mazeMap").setMaxStackSize(1);
        oreMap = new ItemTFMazeMap(true).setUnlocalizedName("oreMap").setMaxStackSize(1);
        feather = new ItemTF().setUnlocalizedName("tfFeather");
        magicMapFocus = new ItemTF().setUnlocalizedName("magicMapFocus");
        mazeMapFocus = new ItemTF().setUnlocalizedName("mazeMapFocus");
        liveRoot = new ItemTF().setUnlocalizedName("liveRoot");
        ironwoodRaw = new ItemTF().setUnlocalizedName("ironwoodRaw");
        ironwoodIngot = new ItemTF().setUnlocalizedName("ironwoodIngot");
        ironwoodHelm = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, ironwoodRenderID, 0).setUnlocalizedName("ironwoodHelm")
                .setMaxStackSize(1);
        ironwoodPlate = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, ironwoodRenderID, 1).setUnlocalizedName("ironwoodPlate")
                .setMaxStackSize(1);
        ironwoodLegs = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, ironwoodRenderID, 2).setUnlocalizedName("ironwoodLegs")
                .setMaxStackSize(1);
        ironwoodBoots = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, ironwoodRenderID, 3).setUnlocalizedName("ironwoodBoots")
                .setMaxStackSize(1);
        ironwoodSword = new ItemTFIronwoodSword(TOOL_IRONWOOD).setUnlocalizedName("ironwoodSword").setMaxStackSize(1);
        ironwoodShovel = new ItemTFIronwoodShovel(TOOL_IRONWOOD).setUnlocalizedName("ironwoodShovel")
                .setMaxStackSize(1);
        ironwoodPick = new ItemTFIronwoodPick(TOOL_IRONWOOD).setUnlocalizedName("ironwoodPick").setMaxStackSize(1);
        ironwoodAxe = new ItemTFIronwoodAxe(TOOL_IRONWOOD).setUnlocalizedName("ironwoodAxe").setMaxStackSize(1);
        ironwoodHoe = new ItemTFIronwoodHoe(TOOL_IRONWOOD).setUnlocalizedName("ironwoodHoe").setMaxStackSize(1);
        torchberries = new ItemTF().setUnlocalizedName("torchberries");
        spawnEgg = new ItemTFSpawnEgg().setUnlocalizedName("tfspawnegg");
        venisonRaw = (new ItemTFFood(3, 0.3F, true)).setUnlocalizedName("venisonRaw");
        venisonCooked = (new ItemTFFood(8, 0.8F, true)).setUnlocalizedName("venisonCooked");
        hydraChop = (new ItemTFHydraChops(18, 2.0F, true)).setPotionEffect(Potion.regeneration.id, 5, 0, 1.0F)
                .setUnlocalizedName("hydraChop");
        fieryBlood = new ItemTF().makeRare().setUnlocalizedName("fieryBlood");
        trophy = new ItemTFTrophy().setUnlocalizedName("trophy");
        fieryIngot = new ItemTF().makeRare().setUnlocalizedName("fieryIngot");
        fieryHelm = new ItemTFFieryArmor(ARMOR_FIERY, fieryRenderID, 0).setUnlocalizedName("fieryHelm")
                .setMaxStackSize(1);
        fieryPlate = new ItemTFFieryArmor(ARMOR_FIERY, fieryRenderID, 1).setUnlocalizedName("fieryPlate")
                .setMaxStackSize(1);
        fieryLegs = new ItemTFFieryArmor(ARMOR_FIERY, fieryRenderID, 2).setUnlocalizedName("fieryLegs")
                .setMaxStackSize(1);
        fieryBoots = new ItemTFFieryArmor(ARMOR_FIERY, fieryRenderID, 3).setUnlocalizedName("fieryBoots")
                .setMaxStackSize(1);
        fierySword = new ItemTFFierySword(TOOL_FIERY).setUnlocalizedName("fierySword").setMaxStackSize(1);
        fieryPick = new ItemTFFieryPick(TOOL_FIERY).setUnlocalizedName("fieryPick").setMaxStackSize(1);
        steeleafIngot = new ItemTF().setUnlocalizedName("steeleafIngot");
        steeleafHelm = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, steeleafRenderID, 0).setUnlocalizedName("steeleafHelm")
                .setMaxStackSize(1);
        steeleafPlate = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, steeleafRenderID, 1).setUnlocalizedName("steeleafPlate")
                .setMaxStackSize(1);
        steeleafLegs = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, steeleafRenderID, 2).setUnlocalizedName("steeleafLegs")
                .setMaxStackSize(1);
        steeleafBoots = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, steeleafRenderID, 3).setUnlocalizedName("steeleafBoots")
                .setMaxStackSize(1);
        steeleafSword = new ItemTFSteeleafSword(TOOL_STEELEAF).setUnlocalizedName("steeleafSword").setMaxStackSize(1);
        steeleafShovel = new ItemTFSteeleafShovel(TOOL_STEELEAF).setUnlocalizedName("steeleafShovel")
                .setMaxStackSize(1);
        steeleafPick = new ItemTFSteeleafPick(TOOL_STEELEAF).setUnlocalizedName("steeleafPick").setMaxStackSize(1);
        steeleafAxe = new ItemTFSteeleafAxe(TOOL_STEELEAF).setUnlocalizedName("steeleafAxe").setMaxStackSize(1);
        steeleafHoe = new ItemTFSteeleafHoe(TOOL_STEELEAF).setUnlocalizedName("steeleafHoe").setMaxStackSize(1);
        minotaurAxe = new ItemTFMinotaurAxe(Item.ToolMaterial.EMERALD).setUnlocalizedName("minotaurAxe")
                .setMaxStackSize(1);
        mazebreakerPick = new ItemTFMazebreakerPick(Item.ToolMaterial.EMERALD).setUnlocalizedName("mazebreakerPick")
                .setMaxStackSize(1);
        transformPowder = new ItemTFTransformPowder().makeRare().setUnlocalizedName("transformPowder");
        meefRaw = (new ItemTFFood(2, 0.3F, true)).setUnlocalizedName("meefRaw");
        meefSteak = (new ItemTFFood(6, 0.6F, true)).setUnlocalizedName("meefSteak");
        meefStroganoff = (new ItemTFFood(8)).setUnlocalizedName("meefStroganoff");
        mazeWafer = (new ItemTFFood(4, 0.6F, false)).setUnlocalizedName("mazeWafer");
        emptyMagicMap = (new ItemTFEmptyMagicMap()).setUnlocalizedName("emptyMagicMap");
        emptyMazeMap = (new ItemTFEmptyMazeMap(false)).setUnlocalizedName("emptyMazeMap");
        emptyOreMap = (new ItemTFEmptyMazeMap(true)).setUnlocalizedName("emptyOreMap");
        oreMagnet = (new ItemTFOreMagnet()).setUnlocalizedName("oreMagnet");
        crumbleHorn = (new ItemTFCrumbleHorn()).setUnlocalizedName("crumbleHorn");
        peacockFan = (new ItemTFPeacockFan()).setUnlocalizedName("peacockFan");
        moonwormQueen = (new ItemTFMoonwormQueen()).setUnlocalizedName("moonwormQueen");
        charmOfLife1 = new ItemTFCharm().setUnlocalizedName("charmOfLife1");
        charmOfLife2 = new ItemTFCharm().setUnlocalizedName("charmOfLife2");
        charmOfKeeping1 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping1");
        charmOfKeeping2 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping2");
        charmOfKeeping3 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping3");
        towerKey = new ItemTFTowerKey().setUnlocalizedName("towerKey");
        borerEssence = new ItemTF().setUnlocalizedName("borerEssence");
        carminite = new ItemTF().makeRare().setUnlocalizedName("carminite");
        experiment115 = (new ItemTFFood(4, 0.3F, false)).setUnlocalizedName("experiment115");
        armorShard = new ItemTF().setUnlocalizedName("armorShards");
        knightMetal = new ItemTF().setUnlocalizedName("knightMetal");
        shardCluster = new ItemTF().setUnlocalizedName("shardCluster");
        knightlyHelm = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, knightlyRenderID, 0).setUnlocalizedName("knightlyHelm")
                .setMaxStackSize(1);
        knightlyPlate = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, knightlyRenderID, 1).setUnlocalizedName("knightlyPlate")
                .setMaxStackSize(1);
        knightlyLegs = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, knightlyRenderID, 2).setUnlocalizedName("knightlyLegs")
                .setMaxStackSize(1);
        knightlyBoots = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, knightlyRenderID, 3).setUnlocalizedName("knightlyBoots")
                .setMaxStackSize(1);
        knightlySword = new ItemTFKnightlySword(TOOL_KNIGHTLY).setUnlocalizedName("knightlySword").setMaxStackSize(1);
        knightlyPick = new ItemTFKnightlyPick(TOOL_KNIGHTLY).setUnlocalizedName("knightlyPick").setMaxStackSize(1);
        knightlyAxe = new ItemTFKnightlyAxe(TOOL_KNIGHTLY).setUnlocalizedName("knightlyAxe").setMaxStackSize(1);
        phantomHelm = new ItemTFPhantomArmor(ARMOR_PHANTOM, phantomRenderID, 0).setUnlocalizedName("phantomHelm")
                .setMaxStackSize(1);
        phantomPlate = new ItemTFPhantomArmor(ARMOR_PHANTOM, phantomRenderID, 1).setUnlocalizedName("phantomPlate")
                .setMaxStackSize(1);
        lampOfCinders = new ItemTFLampOfCinders().setUnlocalizedName("lampOfCinders");
        fieryTears = new ItemTF().makeRare().setUnlocalizedName("fieryTears");
        alphaFur = new ItemTF().makeRare().setUnlocalizedName("alphaFur");
        yetiHelm = new ItemTFYetiArmor(ARMOR_YETI, yetiRenderID, 0).setUnlocalizedName("yetiHelm").setMaxStackSize(1);
        yetiPlate = new ItemTFYetiArmor(ARMOR_YETI, yetiRenderID, 1).setUnlocalizedName("yetiPlate").setMaxStackSize(1);
        yetiLegs = new ItemTFYetiArmor(ARMOR_YETI, yetiRenderID, 2).setUnlocalizedName("yetiLegs").setMaxStackSize(1);
        yetiBoots = new ItemTFYetiArmor(ARMOR_YETI, yetiRenderID, 3).setUnlocalizedName("yetiBoots").setMaxStackSize(1);
        iceBomb = new ItemTFIceBomb().makeRare().setUnlocalizedName("iceBomb").setMaxStackSize(16);
        arcticFur = new ItemTF().setUnlocalizedName("arcticFur");
        arcticHelm = new ItemTFArcticArmor(ARMOR_ARCTIC, arcticRenderID, 0).setUnlocalizedName("arcticHelm")
                .setMaxStackSize(1);
        arcticPlate = new ItemTFArcticArmor(ARMOR_ARCTIC, arcticRenderID, 1).setUnlocalizedName("arcticPlate")
                .setMaxStackSize(1);
        arcticLegs = new ItemTFArcticArmor(ARMOR_ARCTIC, arcticRenderID, 2).setUnlocalizedName("arcticLegs")
                .setMaxStackSize(1);
        arcticBoots = new ItemTFArcticArmor(ARMOR_ARCTIC, arcticRenderID, 3).setUnlocalizedName("arcticBoots")
                .setMaxStackSize(1);
        magicBeans = new ItemTFMagicBeans().setUnlocalizedName("magicBeans");
        giantPick = new ItemTFGiantPick(TOOL_GIANT).setUnlocalizedName("giantPick").setMaxStackSize(1);
        giantSword = new ItemTFGiantSword(TOOL_GIANT).setUnlocalizedName("giantSword").setMaxStackSize(1);
        tripleBow = new ItemTFTripleBow().setUnlocalizedName("tripleBow").setMaxStackSize(1);
        seekerBow = new ItemTFSeekerBow().setUnlocalizedName("seekerBow").setMaxStackSize(1);
        iceBow = new ItemTFIceBow().setUnlocalizedName("iceBow").setMaxStackSize(1);
        enderBow = new ItemTFEnderBow().setUnlocalizedName("enderBow").setMaxStackSize(1);
        iceSword = new ItemTFIceSword(TOOL_ICE).setUnlocalizedName("iceSword").setMaxStackSize(1);
        glassSword = new ItemTFGlassSword(TOOL_GLASS).setUnlocalizedName("glassSword").setMaxStackSize(1);
        knightmetalRing = new ItemTF().setUnlocalizedName("knightmetalRing");
        chainBlock = new ItemTFChainBlock().setUnlocalizedName("chainBlock").setMaxStackSize(1);
        cubeTalisman = new ItemTF().setUnlocalizedName("cubeTalisman");
        cubeOfAnnihilation = new ItemTFCubeOfAnnihilation().setUnlocalizedName("cubeOfAnnihilation").setMaxStackSize(1);

        metaItem = new ItemTFMeta();

        registerTFItem(nagaScale, "Naga Scale");
        registerTFItem(plateNaga, "Naga Scale Tunic");
        registerTFItem(legsNaga, "Naga Scale Leggings");
        registerTFItem(scepterTwilight, "Scepter of Twilight");
        registerTFItem(scepterLifeDrain, "Scepter of Life Draining");
        registerTFItem(scepterZombie, "Zombie Scepter");
        // registerTFItem(wandPacification, "Wand of Pacification [NYI]");
        registerTFItem(oreMeter, "Ore Meter [WIP]");
        registerTFItem(magicMap, "Magic Map");
        registerTFItem(mazeMap, "Maze Map");
        registerTFItem(oreMap, "Maze/Ore Map");
        registerTFItem(feather, "Raven's Feather");
        registerTFItem(magicMapFocus, "Magic Map Focus");
        registerTFItem(mazeMapFocus, "Maze Map Focus");
        registerTFItem(liveRoot, "Liveroot");
        registerTFItem(ironwoodRaw, "Raw Ironwood Materials");
        registerTFItem(ironwoodIngot, "Ironwood Ingot");
        registerTFItem(ironwoodHelm, "Ironwood Helm");
        registerTFItem(ironwoodPlate, "Ironwood Plate");
        registerTFItem(ironwoodLegs, "Ironwood Legs");
        registerTFItem(ironwoodBoots, "Ironwood Boots");
        registerTFItem(ironwoodSword, "Ironwood Sword");
        registerTFItem(ironwoodShovel, "Ironwood Shovel");
        registerTFItem(ironwoodPick, "Ironwood Pick");
        registerTFItem(ironwoodAxe, "Ironwood Axe");
        registerTFItem(ironwoodHoe, "Ironwood Hoe");
        registerTFItem(torchberries, "Torchberries");
        registerTFItem(venisonRaw, "Raw Venison");
        registerTFItem(venisonCooked, "Venison Steak");
        registerTFItem(hydraChop, "Hydra Chop");
        registerTFItem(fieryBlood, "Fiery Blood");
        registerTFItem(trophy, "Hydra Trophy");
        registerTFItem(fieryIngot, "Fiery Ingot");
        registerTFItem(fieryHelm, "Fiery Helm");
        registerTFItem(fieryPlate, "Fiery Plate");
        registerTFItem(fieryLegs, "Fiery Legs");
        registerTFItem(fieryBoots, "Fiery Boots");
        registerTFItem(fierySword, "Fiery Sword");
        registerTFItem(fieryPick, "Fiery Pick");
        registerTFItem(steeleafIngot, "Steeleaf");
        registerTFItem(steeleafHelm, "Steeleaf Helm");
        registerTFItem(steeleafPlate, "Steeleaf Plate");
        registerTFItem(steeleafLegs, "Steeleaf Legs");
        registerTFItem(steeleafBoots, "Steeleaf Boots");
        registerTFItem(steeleafSword, "Steeleaf Sword");
        registerTFItem(steeleafShovel, "Steeleaf Shovel");
        registerTFItem(steeleafPick, "Steeleaf Pick");
        registerTFItem(steeleafAxe, "Steeleaf Axe");
        registerTFItem(steeleafHoe, "Steeleaf Hoe");
        registerTFItem(minotaurAxe, "Minotaur Axe");
        registerTFItem(mazebreakerPick, "Mazebreaker");
        registerTFItem(transformPowder, "Transformation Powder");
        registerTFItem(meefRaw, "Raw Meef");
        registerTFItem(meefSteak, "Meef Steak");
        registerTFItem(meefStroganoff, "Meef Stroganoff");
        registerTFItem(mazeWafer, "Maze Wafer");
        registerTFItem(emptyMagicMap, "Blank Magic Map");
        registerTFItem(emptyMazeMap, "Blank Maze Map");
        registerTFItem(emptyOreMap, "Blank Maze/Ore Map");
        registerTFItem(oreMagnet, "Ore Magnet");
        registerTFItem(crumbleHorn, "Crumble Horn");
        registerTFItem(peacockFan, "Peacock Feather Fan");
        registerTFItem(moonwormQueen, "Moonworm Queen");
        registerTFItem(charmOfLife1, "Charm of Life I");
        registerTFItem(charmOfLife2, "Charm of Life II");
        registerTFItem(charmOfKeeping1, "Charm of Keeping I");
        registerTFItem(charmOfKeeping2, "Charm of Keeping II");
        registerTFItem(charmOfKeeping3, "Charm of Keeping III");
        registerTFItem(towerKey, "Tower Key");
        registerTFItem(borerEssence, "Borer Essence");
        registerTFItem(carminite, "Carminite");
        registerTFItem(experiment115, "Experiment 115");
        registerTFItem(armorShard, "Armor Shards");
        registerTFItem(knightMetal, "Knightmetal Ingot");
        registerTFItem(shardCluster, "Shard Cluster");
        registerTFItem(knightlyHelm, "Knightly Helm");
        registerTFItem(knightlyPlate, "Knightly Plate");
        registerTFItem(knightlyLegs, "Knightly Legs");
        registerTFItem(knightlyBoots, "Knightly Boots");
        registerTFItem(knightlySword, "Knightly Sword");
        registerTFItem(knightlyPick, "Knightly Pick");
        registerTFItem(knightlyAxe, "Knightly Axe");
        registerTFItem(phantomHelm, "Phantom Helm");
        registerTFItem(phantomPlate, "Phantom Plate");
        registerTFItem(lampOfCinders);
        registerTFItem(fieryTears);
        registerTFItem(alphaFur);
        registerTFItem(yetiHelm);
        registerTFItem(yetiPlate);
        registerTFItem(yetiLegs);
        registerTFItem(yetiBoots);
        registerTFItem(iceBomb);
        registerTFItem(arcticFur);
        registerTFItem(arcticHelm);
        registerTFItem(arcticPlate);
        registerTFItem(arcticLegs);
        registerTFItem(arcticBoots);
        registerTFItem(magicBeans);
        registerTFItem(giantPick);
        registerTFItem(giantSword);
        registerTFItem(tripleBow);
        registerTFItem(seekerBow);
        registerTFItem(iceBow);
        registerTFItem(enderBow);
        registerTFItem(iceSword);
        registerTFItem(glassSword);
        registerTFItem(knightmetalRing);
        registerTFItem(chainBlock);
        registerTFItem(cubeTalisman);
        registerTFItem(cubeOfAnnihilation);

        registerTFItem(metaItem);

        registerTFItem(spawnEgg, "Spawn");
    }

    private static void registerTFItem(Item item, String englishName) {
        // LanguageRegistry.instance().addNameForObject(item, "en_US", englishName);
        GameRegistry.registerItem(item, item.getUnlocalizedName(), TwilightForestMod.ID);
    }

    private static void registerTFItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName(), TwilightForestMod.ID);
    }

}

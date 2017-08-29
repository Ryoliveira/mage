/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author fireshoes
 */
public class Commander2017 extends ExpansionSet {

    private static final Commander2017 instance = new Commander2017();

    public static Commander2017 getInstance() {
        return instance;
    }

    private Commander2017() {
        super("Commander 2017 Edition", "C17", ExpansionSet.buildDate(2017, 8, 25), SetType.SUPPLEMENTAL);
        this.blockName = "Command Zone";

        cards.add(new SetCardInfo("Abundance", 145, Rarity.RARE, mage.cards.a.Abundance.class));
        cards.add(new SetCardInfo("Akoum Refuge", 233, Rarity.UNCOMMON, mage.cards.a.AkoumRefuge.class));
        cards.add(new SetCardInfo("Alms Collector", 1, Rarity.RARE, mage.cards.a.AlmsCollector.class));
        cards.add(new SetCardInfo("Ambition's Cost", 95, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Anowon, the Ruin Sage", 96, Rarity.RARE, mage.cards.a.AnowonTheRuinSage.class));
        cards.add(new SetCardInfo("Apprentice Necromancer", 97, Rarity.RARE, mage.cards.a.ApprenticeNecromancer.class));
        cards.add(new SetCardInfo("Arahbo, Roar of the World", 35, Rarity.MYTHIC, mage.cards.a.ArahboRoarOfTheWorld.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 234, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcanis the Omnipotent", 80, Rarity.RARE, mage.cards.a.ArcanisTheOmnipotent.class));
        cards.add(new SetCardInfo("Archaeomancer", 81, Rarity.COMMON, mage.cards.a.Archaeomancer.class));
        cards.add(new SetCardInfo("Argentum Armor", 202, Rarity.RARE, mage.cards.a.ArgentumArmor.class));
        cards.add(new SetCardInfo("Armillary Sphere", 203, Rarity.COMMON, mage.cards.a.ArmillarySphere.class));
        cards.add(new SetCardInfo("Atarka, World Render", 161, Rarity.RARE, mage.cards.a.AtarkaWorldRender.class));
        cards.add(new SetCardInfo("Azami, Lady of Scrolls", 82, Rarity.RARE, mage.cards.a.AzamiLadyOfScrolls.class));
        cards.add(new SetCardInfo("Balan, Wandering Knight", 2, Rarity.RARE, mage.cards.b.BalanWanderingKnight.class));
        cards.add(new SetCardInfo("Behemoth Sledge", 162, Rarity.UNCOMMON, mage.cards.b.BehemothSledge.class));
        cards.add(new SetCardInfo("Black Market", 98, Rarity.RARE, mage.cards.b.BlackMarket.class));
        cards.add(new SetCardInfo("Blade of the Bloodchief", 204, Rarity.RARE, mage.cards.b.BladeOfTheBloodchief.class));
        cards.add(new SetCardInfo("Bladewing the Risen", 163, Rarity.RARE, mage.cards.b.BladewingTheRisen.class));
        cards.add(new SetCardInfo("Blighted Woodland", 235, Rarity.UNCOMMON, mage.cards.b.BlightedWoodland.class));
        cards.add(new SetCardInfo("Blind Obedience", 57, Rarity.RARE, mage.cards.b.BlindObedience.class));
        cards.add(new SetCardInfo("Blood Artist", 99, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Blood Baron of Vizkopa", 164, Rarity.MYTHIC, mage.cards.b.BloodBaronOfVizkopa.class));
        cards.add(new SetCardInfo("Blood Tribute", 100, Rarity.RARE, mage.cards.b.BloodTribute.class));
        cards.add(new SetCardInfo("Bloodfell Caves", 236, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Bloodforged Battle-Axe", 50, Rarity.RARE, mage.cards.b.BloodforgedBattleAxe.class));
        cards.add(new SetCardInfo("Bloodhusk Ritualist", 101, Rarity.UNCOMMON, mage.cards.b.BloodhuskRitualist.class));
        cards.add(new SetCardInfo("Bloodline Necromancer", 14, Rarity.UNCOMMON, mage.cards.b.BloodlineNecromancer.class));
        cards.add(new SetCardInfo("Bloodsworn Steward", 22, Rarity.RARE, mage.cards.b.BloodswornSteward.class));
        cards.add(new SetCardInfo("Blossoming Sands", 237, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Body Double", 83, Rarity.RARE, mage.cards.b.BodyDouble.class));
        cards.add(new SetCardInfo("Bojuka Bog", 238, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Boneyard Scourge", 15, Rarity.RARE, mage.cards.b.BoneyardScourge.class));
        cards.add(new SetCardInfo("Boros Garrison", 239, Rarity.COMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Guildgate", 240, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Boros Signet", 205, Rarity.UNCOMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Broodmate Dragon", 165, Rarity.RARE, mage.cards.b.BroodmateDragon.class));
        cards.add(new SetCardInfo("Butcher of Malakir", 103, Rarity.RARE, mage.cards.b.ButcherOfMalakir.class));
        cards.add(new SetCardInfo("Captivating Vampire", 104, Rarity.RARE, mage.cards.c.CaptivatingVampire.class));
        cards.add(new SetCardInfo("Cauldron Dance", 166, Rarity.UNCOMMON, mage.cards.c.CauldronDance.class));
        cards.add(new SetCardInfo("Chaos Warp", 131, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Cinder Barrens", 241, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("Clone Legion", 84, Rarity.MYTHIC, mage.cards.c.CloneLegion.class));
        cards.add(new SetCardInfo("Comet Storm", 132, Rarity.MYTHIC, mage.cards.c.CometStorm.class));
        cards.add(new SetCardInfo("Command Tower", 242, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 206, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Condemn", 58, Rarity.UNCOMMON, mage.cards.c.Condemn.class));
        cards.add(new SetCardInfo("Consuming Vapors", 105, Rarity.RARE, mage.cards.c.ConsumingVapors.class));
        cards.add(new SetCardInfo("Corpse Augur", 106, Rarity.UNCOMMON, mage.cards.c.CorpseAugur.class));
        cards.add(new SetCardInfo("Crackling Doom", 167, Rarity.RARE, mage.cards.c.CracklingDoom.class));
        cards.add(new SetCardInfo("Crimson Honor Guard", 23, Rarity.RARE, mage.cards.c.CrimsonHonorGuard.class));
        cards.add(new SetCardInfo("Crosis's Charm", 169, Rarity.UNCOMMON, mage.cards.c.CrosissCharm.class));
        cards.add(new SetCardInfo("Crosis, the Purger", 168, Rarity.RARE, mage.cards.c.CrosisThePurger.class));
        cards.add(new SetCardInfo("Crucible of Fire", 133, Rarity.RARE, mage.cards.c.CrucibleOfFire.class));
        cards.add(new SetCardInfo("Crucible of the Spirit Dragon", 243, Rarity.RARE, mage.cards.c.CrucibleOfTheSpiritDragon.class));
        cards.add(new SetCardInfo("Crumbling Necropolis", 244, Rarity.UNCOMMON, mage.cards.c.CrumblingNecropolis.class));
        cards.add(new SetCardInfo("Crushing Vines", 146, Rarity.COMMON, mage.cards.c.CrushingVines.class));
        cards.add(new SetCardInfo("Crux of Fate", 107, Rarity.RARE, mage.cards.c.CruxOfFate.class));
        cards.add(new SetCardInfo("Cultivate", 147, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Curse of Bounty", 30, Rarity.UNCOMMON, mage.cards.c.CurseOfBounty.class));
        cards.add(new SetCardInfo("Curse of Disturbance", 16, Rarity.UNCOMMON, mage.cards.c.CurseOfDisturbance.class));
        cards.add(new SetCardInfo("Curse of Opulence", 24, Rarity.UNCOMMON, mage.cards.c.CurseOfOpulence.class));
        cards.add(new SetCardInfo("Curse of Verbosity", 9, Rarity.UNCOMMON, mage.cards.c.CurseOfVerbosity.class));
        cards.add(new SetCardInfo("Curse of Vitality", 3, Rarity.UNCOMMON, mage.cards.c.CurseOfVitality.class));
        cards.add(new SetCardInfo("Damnable Pact", 108, Rarity.RARE, mage.cards.d.DamnablePact.class));
        cards.add(new SetCardInfo("Darksteel Ingot", 207, Rarity.UNCOMMON, mage.cards.d.DarksteelIngot.class));
        cards.add(new SetCardInfo("Deathbringer Regent", 110, Rarity.RARE, mage.cards.d.DeathbringerRegent.class));
        cards.add(new SetCardInfo("Decree of Pain", 111, Rarity.RARE, mage.cards.d.DecreeOfPain.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 245, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dismal Backwater", 246, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Disrupt Decorum", 25, Rarity.RARE, mage.cards.d.DisruptDecorum.class));
        cards.add(new SetCardInfo("Divine Reckoning", 59, Rarity.RARE, mage.cards.d.DivineReckoning.class));
        cards.add(new SetCardInfo("Door of Destinies", 208, Rarity.RARE, mage.cards.d.DoorOfDestinies.class));
        cards.add(new SetCardInfo("Dragon Tempest", 134, Rarity.RARE, mage.cards.d.DragonTempest.class));
        cards.add(new SetCardInfo("Dragonlord's Servant", 135, Rarity.UNCOMMON, mage.cards.d.DragonlordsServant.class));
        cards.add(new SetCardInfo("Dragonspeaker Shaman", 136, Rarity.UNCOMMON, mage.cards.d.DragonspeakerShaman.class));
        cards.add(new SetCardInfo("Drana, Kalastria Bloodchief", 112, Rarity.RARE, mage.cards.d.DranaKalastriaBloodchief.class));
        cards.add(new SetCardInfo("Dreamstone Hedron", 209, Rarity.UNCOMMON, mage.cards.d.DreamstoneHedron.class));
        cards.add(new SetCardInfo("Dromoka, the Eternal", 170, Rarity.RARE, mage.cards.d.DromokaTheEternal.class));
        cards.add(new SetCardInfo("Earthquake", 137, Rarity.RARE, mage.cards.e.Earthquake.class));
        cards.add(new SetCardInfo("Edgar Markov", 36, Rarity.MYTHIC, mage.cards.e.EdgarMarkov.class));
        cards.add(new SetCardInfo("Elemental Bond", 148, Rarity.UNCOMMON, mage.cards.e.ElementalBond.class));
        cards.add(new SetCardInfo("Elfhame Palace", 247, Rarity.UNCOMMON, mage.cards.e.ElfhamePalace.class));
        cards.add(new SetCardInfo("Etherium-Horn Sorcerer", 171, Rarity.RARE, mage.cards.e.EtheriumHornSorcerer.class));
        cards.add(new SetCardInfo("Evolving Wilds", 248, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 249, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Falkenrath Noble", 113, Rarity.COMMON, mage.cards.f.FalkenrathNoble.class));
        cards.add(new SetCardInfo("Farseek", 149, Rarity.COMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Fell the Mighty", 60, Rarity.RARE, mage.cards.f.FellTheMighty.class));
        cards.add(new SetCardInfo("Fellwar Stone", 210, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Fist of Suns", 211, Rarity.RARE, mage.cards.f.FistOfSuns.class));
        cards.add(new SetCardInfo("Fleecemane Lion", 172, Rarity.RARE, mage.cards.f.FleecemaneLion.class));
        cards.add(new SetCardInfo("Forest", 307, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 308, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 309, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forsaken Sanctuary", 250, Rarity.UNCOMMON, mage.cards.f.ForsakenSanctuary.class));
        cards.add(new SetCardInfo("Fortunate Few", 4, Rarity.RARE, mage.cards.f.FortunateFew.class));
        cards.add(new SetCardInfo("Fractured Identity", 37, Rarity.RARE, mage.cards.f.FracturedIdentity.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 251, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Frontier Siege", 150, Rarity.RARE, mage.cards.f.FrontierSiege.class));
        cards.add(new SetCardInfo("Galecaster Colossus", 10, Rarity.RARE, mage.cards.g.GalecasterColossus.class));
        cards.add(new SetCardInfo("Go for the Throat", 114, Rarity.UNCOMMON, mage.cards.g.GoForTheThroat.class));
        cards.add(new SetCardInfo("Grappling Hook", 212, Rarity.RARE, mage.cards.g.GrapplingHook.class));
        cards.add(new SetCardInfo("Grasslands", 252, Rarity.UNCOMMON, mage.cards.g.Grasslands.class));
        cards.add(new SetCardInfo("Graypelt Refuge", 253, Rarity.UNCOMMON, mage.cards.g.GraypeltRefuge.class));
        cards.add(new SetCardInfo("Grixis Panorama", 254, Rarity.COMMON, mage.cards.g.GrixisPanorama.class));
        cards.add(new SetCardInfo("Hammer of Nazahn", 51, Rarity.RARE, mage.cards.h.HammerOfNazahn.class));
        cards.add(new SetCardInfo("Harbinger of the Tides", 85, Rarity.RARE, mage.cards.h.HarbingerOfTheTides.class));
        cards.add(new SetCardInfo("Harmonize", 151, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Haven of the Spirit Dragon", 255, Rarity.RARE, mage.cards.h.HavenOfTheSpiritDragon.class));
        cards.add(new SetCardInfo("Havengul Lich", 173, Rarity.MYTHIC, mage.cards.h.HavengulLich.class));
        cards.add(new SetCardInfo("Hedron Archive", 213, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hellkite Charger", 138, Rarity.RARE, mage.cards.h.HellkiteCharger.class));
        cards.add(new SetCardInfo("Herald's Horn", 53, Rarity.UNCOMMON, mage.cards.h.HeraldsHorn.class));
        cards.add(new SetCardInfo("Heirloom Blade", 52, Rarity.UNCOMMON, mage.cards.h.HeirloomBlade.class));
        cards.add(new SetCardInfo("Hero's Blade", 214, Rarity.UNCOMMON, mage.cards.h.HerosBlade.class));
        cards.add(new SetCardInfo("Hungry Lynx", 31, Rarity.RARE, mage.cards.h.HungryLynx.class));
        cards.add(new SetCardInfo("Hunter's Prowess", 152, Rarity.RARE, mage.cards.h.HuntersProwess.class));
        cards.add(new SetCardInfo("Inalla, Archmage Ritualist", 38, Rarity.MYTHIC, mage.cards.i.InallaArchmageRitualist.class));
        cards.add(new SetCardInfo("Intet, the Dreamer", 174, Rarity.RARE, mage.cards.i.IntetTheDreamer.class));
        cards.add(new SetCardInfo("Into the Roil", 86, Rarity.COMMON, mage.cards.i.IntoTheRoil.class));
        cards.add(new SetCardInfo("Island", 298, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 299, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 300, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Izzet Boilerworks", 256, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Chemister", 26, Rarity.RARE, mage.cards.i.IzzetChemister.class));
        cards.add(new SetCardInfo("Izzet Chronarch", 175, Rarity.COMMON, mage.cards.i.IzzetChronarch.class));
        cards.add(new SetCardInfo("Jareth, Leonine Titan", 61, Rarity.RARE, mage.cards.j.JarethLeonineTitan.class));
        cards.add(new SetCardInfo("Jazal Goldmane", 62, Rarity.MYTHIC, mage.cards.j.JazalGoldmane.class));
        cards.add(new SetCardInfo("Jedit Ojanen of Efrava", 153, Rarity.RARE, mage.cards.j.JeditOjanenOfEfrava.class));
        cards.add(new SetCardInfo("Jungle Shrine", 257, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Jwar Isle Refuge", 258, Rarity.UNCOMMON, mage.cards.j.JwarIsleRefuge.class));
        cards.add(new SetCardInfo("Kabira Crossroads", 259, Rarity.COMMON, mage.cards.k.KabiraCrossroads.class));
        cards.add(new SetCardInfo("Kemba, Kha Regent", 63, Rarity.RARE, mage.cards.k.KembaKhaRegent.class));
        cards.add(new SetCardInfo("Kess, Dissident Mage", 39, Rarity.MYTHIC, mage.cards.k.KessDissidentMage.class));
        cards.add(new SetCardInfo("Kheru Mind-Eater", 17, Rarity.RARE, mage.cards.k.KheruMindEater.class));
        cards.add(new SetCardInfo("Kindred Boon", 5, Rarity.RARE, mage.cards.k.KindredBoon.class));
        cards.add(new SetCardInfo("Kindred Charge", 27, Rarity.RARE, mage.cards.k.KindredCharge.class));
        cards.add(new SetCardInfo("Kindred Discovery", 11, Rarity.RARE, mage.cards.k.KindredDiscovery.class));
        cards.add(new SetCardInfo("Kindred Dominance", 18, Rarity.RARE, mage.cards.k.KindredDominance.class));
        cards.add(new SetCardInfo("Kindred Summons", 32, Rarity.RARE, mage.cards.k.KindredSummons.class));
        cards.add(new SetCardInfo("Kodama's Reach", 154, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kolaghan, the Storm's Fury", 176, Rarity.RARE, mage.cards.k.KolaghanTheStormsFury.class));
        cards.add(new SetCardInfo("Krosan Verge", 260, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Leonin Arbiter", 64, Rarity.RARE, mage.cards.l.LeoninArbiter.class));
        cards.add(new SetCardInfo("Leonin Relic-Warder", 65, Rarity.UNCOMMON, mage.cards.l.LeoninRelicWarder.class));
        cards.add(new SetCardInfo("Leonin Shikari", 66, Rarity.RARE, mage.cards.l.LeoninShikari.class));
        cards.add(new SetCardInfo("Licia, Sanguine Tribune", 40, Rarity.MYTHIC, mage.cards.l.LiciaSanguineTribune.class));
        cards.add(new SetCardInfo("Lightning Greaves", 215, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Loxodon Warhammer", 216, Rarity.UNCOMMON, mage.cards.l.LoxodonWarhammer.class));
        cards.add(new SetCardInfo("Magus of the Abyss", 115, Rarity.RARE, mage.cards.m.MagusOfTheAbyss.class));
        cards.add(new SetCardInfo("Magus of the Mind", 12, Rarity.RARE, mage.cards.m.MagusOfTheMind.class));
        cards.add(new SetCardInfo("Mairsil, the Pretender", 41, Rarity.MYTHIC, mage.cards.m.MairsilThePretender.class));
        cards.add(new SetCardInfo("Malakir Bloodwitch", 116, Rarity.RARE, mage.cards.m.MalakirBloodwitch.class));
        cards.add(new SetCardInfo("Marchesa, the Black Rose", 177, Rarity.MYTHIC, mage.cards.m.MarchesaTheBlackRose.class));
        cards.add(new SetCardInfo("Mathas, Fiend Seeker", 42, Rarity.MYTHIC, mage.cards.m.MathasFiendSeeker.class));
        cards.add(new SetCardInfo("Memory Plunder", 178, Rarity.RARE, mage.cards.m.MemoryPlunder.class));
        cards.add(new SetCardInfo("Merchant of Secrets", 87, Rarity.COMMON, mage.cards.m.MerchantOfSecrets.class));
        cards.add(new SetCardInfo("Merciless Eviction", 179, Rarity.RARE, mage.cards.m.MercilessEviction.class));
        cards.add(new SetCardInfo("Mercurial Chemister", 180, Rarity.RARE, mage.cards.m.MercurialChemister.class));
        cards.add(new SetCardInfo("Mirari's Wake", 181, Rarity.MYTHIC, mage.cards.m.MirarisWake.class));
        cards.add(new SetCardInfo("Mirri, Weatherlight Duelist", 43, Rarity.MYTHIC, mage.cards.m.MirriWeatherlightDuelist.class));
        cards.add(new SetCardInfo("Mirror of the Forebears", 54, Rarity.UNCOMMON, mage.cards.m.MirrorOfTheForebears.class));
        cards.add(new SetCardInfo("Monastery Siege", 88, Rarity.RARE, mage.cards.m.MonasterySiege.class));
        cards.add(new SetCardInfo("Mortify", 182, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 261, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mountain", 304, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 305, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 306, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Myriad Landscape", 262, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Monastery", 263, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Mystifying Maze", 264, Rarity.RARE, mage.cards.m.MystifyingMaze.class));
        cards.add(new SetCardInfo("Nazahn, Revered Bladesmith", 44, Rarity.MYTHIC, mage.cards.n.NazahnReveredBladesmith.class));
        cards.add(new SetCardInfo("Necromantic Selection", 117, Rarity.RARE, mage.cards.n.NecromanticSelection.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 217, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Nihil Spellbomb", 218, Rarity.COMMON, mage.cards.n.NihilSpellbomb.class));
        cards.add(new SetCardInfo("Nin, the Pain Artist", 183, Rarity.RARE, mage.cards.n.NinThePainArtist.class));
        cards.add(new SetCardInfo("Nissa's Pilgrimage", 155, Rarity.COMMON, mage.cards.n.NissasPilgrimage.class));
        cards.add(new SetCardInfo("Niv-Mizzet, Dracogenius", 184, Rarity.RARE, mage.cards.n.NivMizzetDracogenius.class));
        cards.add(new SetCardInfo("Niv-Mizzet, the Firemind", 185, Rarity.RARE, mage.cards.n.NivMizzetTheFiremind.class));
        cards.add(new SetCardInfo("Nivix Guildmage", 186, Rarity.UNCOMMON, mage.cards.n.NivixGuildmage.class));
        cards.add(new SetCardInfo("Nomad Outpost", 265, Rarity.UNCOMMON, mage.cards.n.NomadOutpost.class));
        cards.add(new SetCardInfo("O-Kagachi, Vengeful Kami", 45, Rarity.MYTHIC, mage.cards.o.OKagachiVengefulKami.class));
        cards.add(new SetCardInfo("Ojutai, Soul of Winter", 187, Rarity.RARE, mage.cards.o.OjutaiSoulOfWinter.class));
        cards.add(new SetCardInfo("Opal Palace", 266, Rarity.COMMON, mage.cards.o.OpalPalace.class));
        cards.add(new SetCardInfo("Opportunity", 89, Rarity.UNCOMMON, mage.cards.o.Opportunity.class));
        cards.add(new SetCardInfo("Opulent Palace", 267, Rarity.UNCOMMON, mage.cards.o.OpulentPalace.class));
        cards.add(new SetCardInfo("Orator of Ojutai", 67, Rarity.UNCOMMON, mage.cards.o.OratorOfOjutai.class));
        cards.add(new SetCardInfo("Oreskos Explorer", 68, Rarity.UNCOMMON, mage.cards.o.OreskosExplorer.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 268, Rarity.COMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Guildgate", 269, Rarity.COMMON, mage.cards.o.OrzhovGuildgate.class));
        cards.add(new SetCardInfo("Orzhov Signet", 219, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Outpost Siege", 139, Rarity.RARE, mage.cards.o.OutpostSiege.class));
        cards.add(new SetCardInfo("Painful Truths", 118, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Palace Siege", 119, Rarity.RARE, mage.cards.p.PalaceSiege.class));
        cards.add(new SetCardInfo("Path of Ancestry", 56, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Patron of the Vein", 20, Rarity.RARE, mage.cards.p.PatronOfTheVein.class));
        cards.add(new SetCardInfo("Pawn of Ulamog", 120, Rarity.UNCOMMON, mage.cards.p.PawnOfUlamog.class));
        cards.add(new SetCardInfo("Phantom Nishoba", 188, Rarity.RARE, mage.cards.p.PhantomNishoba.class));
        cards.add(new SetCardInfo("Plains", 295, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 296, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 297, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polymorphist's Jest", 90, Rarity.RARE, mage.cards.p.PolymorphistsJest.class));
        cards.add(new SetCardInfo("Portal Mage", 13, Rarity.RARE, mage.cards.p.PortalMage.class));
        cards.add(new SetCardInfo("Puppeteer Clique", 121, Rarity.RARE, mage.cards.p.PuppeteerClique.class));
        cards.add(new SetCardInfo("Qasali Pridemage", 189, Rarity.COMMON, mage.cards.q.QasaliPridemage.class));
        cards.add(new SetCardInfo("Qasali Slingers", 33, Rarity.RARE, mage.cards.q.QasaliSlingers.class));
        cards.add(new SetCardInfo("Quietus Spike", 220, Rarity.RARE, mage.cards.q.QuietusSpike.class));
        cards.add(new SetCardInfo("Rain of Thorns", 156, Rarity.UNCOMMON, mage.cards.r.RainOfThorns.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 270, Rarity.COMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rakdos Charm", 190, Rarity.UNCOMMON, mage.cards.r.RakdosCharm.class));
        cards.add(new SetCardInfo("Rakdos Guildgate", 271, Rarity.COMMON, mage.cards.r.RakdosGuildgate.class));
        cards.add(new SetCardInfo("Rakdos Signet", 221, Rarity.UNCOMMON, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Rakish Heir", 140, Rarity.UNCOMMON, mage.cards.r.RakishHeir.class));
        cards.add(new SetCardInfo("Raksha Golden Cub", 69, Rarity.RARE, mage.cards.r.RakshaGoldenCub.class));
        cards.add(new SetCardInfo("Ramos, Dragon Engine", 55, Rarity.MYTHIC, mage.cards.r.RamosDragonEngine.class));
        cards.add(new SetCardInfo("Read the Bones", 122, Rarity.COMMON, mage.cards.r.ReadTheBones.class));
        cards.add(new SetCardInfo("Reality Shift", 91, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Relic Crush", 157, Rarity.UNCOMMON, mage.cards.r.RelicCrush.class));
        cards.add(new SetCardInfo("Return to Dust", 70, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Rogue's Passage", 272, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Rout", 71, Rarity.RARE, mage.cards.r.Rout.class));
        cards.add(new SetCardInfo("Ryusei, the Falling Star", 141, Rarity.MYTHIC, mage.cards.r.RyuseiTheFallingStar.class));
        cards.add(new SetCardInfo("Saltcrusted Steppe", 273, Rarity.UNCOMMON, mage.cards.s.SaltcrustedSteppe.class));
        cards.add(new SetCardInfo("Sandsteppe Citadel", 274, Rarity.UNCOMMON, mage.cards.s.SandsteppeCitadel.class));
        cards.add(new SetCardInfo("Sangromancer", 123, Rarity.RARE, mage.cards.s.Sangromancer.class));
        cards.add(new SetCardInfo("Sanguine Bond", 124, Rarity.RARE, mage.cards.s.SanguineBond.class));
        cards.add(new SetCardInfo("Savage Lands", 275, Rarity.UNCOMMON, mage.cards.s.SavageLands.class));
        cards.add(new SetCardInfo("Savage Ventmaw", 191, Rarity.UNCOMMON, mage.cards.s.SavageVentmaw.class));
        cards.add(new SetCardInfo("Scalelord Reckoner", 6, Rarity.RARE, mage.cards.s.ScalelordReckoner.class));
        cards.add(new SetCardInfo("Scion of the Ur-Dragon", 192, Rarity.RARE, mage.cards.s.ScionOfTheUrDragon.class));
        cards.add(new SetCardInfo("Scoured Barrens", 276, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Scourge of Valkas", 142, Rarity.MYTHIC, mage.cards.s.ScourgeOfValkas.class));
        cards.add(new SetCardInfo("Sea Gate Oracle", 92, Rarity.COMMON, mage.cards.s.SeaGateOracle.class));
        cards.add(new SetCardInfo("Seaside Citadel", 277, Rarity.UNCOMMON, mage.cards.s.SeasideCitadel.class));
        cards.add(new SetCardInfo("Secluded Steppe", 278, Rarity.COMMON, mage.cards.s.SecludedSteppe.class));
        cards.add(new SetCardInfo("Seht's Tiger", 72, Rarity.RARE, mage.cards.s.SehtsTiger.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 279, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Selesnya Sanctuary", 280, Rarity.COMMON, mage.cards.s.SelesnyaSanctuary.class));
        cards.add(new SetCardInfo("Serendib Sorcerer", 93, Rarity.RARE, mage.cards.s.SerendibSorcerer.class));
        cards.add(new SetCardInfo("Shadowmage Infiltrator", 193, Rarity.RARE, mage.cards.s.ShadowmageInfiltrator.class));
        cards.add(new SetCardInfo("Shifting Shadow", 28, Rarity.RARE, mage.cards.s.ShiftingShadow.class));
        cards.add(new SetCardInfo("Silumgar's Command", 195, Rarity.RARE, mage.cards.s.SilumgarsCommand.class));
        cards.add(new SetCardInfo("Silumgar, the Drifting Death", 194, Rarity.RARE, mage.cards.s.SilumgarTheDriftingDeath.class));
        cards.add(new SetCardInfo("Skeletal Scrying", 125, Rarity.UNCOMMON, mage.cards.s.SkeletalScrying.class));
        cards.add(new SetCardInfo("Skeletal Vampire", 126, Rarity.RARE, mage.cards.s.SkeletalVampire.class));
        cards.add(new SetCardInfo("Skullclamp", 222, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Sol Ring", 223, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soul's Majesty", 158, Rarity.RARE, mage.cards.s.SoulsMajesty.class));
        cards.add(new SetCardInfo("Spellbound Dragon", 196, Rarity.RARE, mage.cards.s.SpellboundDragon.class));
        cards.add(new SetCardInfo("Spelltwine", 94, Rarity.RARE, mage.cards.s.Spelltwine.class));
        cards.add(new SetCardInfo("Spirit of the Hearth", 73, Rarity.RARE, mage.cards.s.SpiritOfTheHearth.class));
        cards.add(new SetCardInfo("Staff of Nin", 224, Rarity.RARE, mage.cards.s.StaffOfNin.class));
        cards.add(new SetCardInfo("Steel Hellkite", 225, Rarity.RARE, mage.cards.s.SteelHellkite.class));
        cards.add(new SetCardInfo("Stirring Wildwood", 281, Rarity.RARE, mage.cards.s.StirringWildwood.class));
        cards.add(new SetCardInfo("Stone Quarry", 282, Rarity.UNCOMMON, mage.cards.s.StoneQuarry.class));
        cards.add(new SetCardInfo("Stromkirk Captain", 197, Rarity.UNCOMMON, mage.cards.s.StromkirkCaptain.class));
        cards.add(new SetCardInfo("Sunscorch Regent", 74, Rarity.RARE, mage.cards.s.SunscorchRegent.class));
        cards.add(new SetCardInfo("Sunspear Shikari", 75, Rarity.COMMON, mage.cards.s.SunspearShikari.class));
        cards.add(new SetCardInfo("Swamp", 301, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 302, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 303, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftfoot Boots", 226, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 283, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Sword of Vengeance", 228, Rarity.RARE, mage.cards.s.SwordOfVengeance.class));
        cards.add(new SetCardInfo("Sword of the Animist", 227, Rarity.RARE, mage.cards.s.SwordOfTheAnimist.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 76, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Syphon Mind", 127, Rarity.COMMON, mage.cards.s.SyphonMind.class));
        cards.add(new SetCardInfo("Taigam, Ojutai Master", 46, Rarity.MYTHIC, mage.cards.t.TaigamOjutaiMaster.class));
        cards.add(new SetCardInfo("Taigam, Sidisi's Hand", 47, Rarity.RARE, mage.cards.t.TaigamSidisisHand.class));
        cards.add(new SetCardInfo("Taj-Nar Swordsmith", 77, Rarity.UNCOMMON, mage.cards.t.TajNarSwordsmith.class));
        cards.add(new SetCardInfo("Teferi's Protection", 8, Rarity.RARE, mage.cards.t.TeferisProtection.class));
        cards.add(new SetCardInfo("Temple of the False God", 284, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Temur Sabertooth", 159, Rarity.UNCOMMON, mage.cards.t.TemurSabertooth.class));
        cards.add(new SetCardInfo("Teneb, the Harvester", 198, Rarity.RARE, mage.cards.t.TenebTheHarvester.class));
        cards.add(new SetCardInfo("Terminate", 199, Rarity.UNCOMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 285, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Territorial Hellkite", 29, Rarity.RARE, mage.cards.t.TerritorialHellkite.class));
        cards.add(new SetCardInfo("The Ur-Dragon", 48, Rarity.MYTHIC, mage.cards.t.TheUrDragon.class));
        cards.add(new SetCardInfo("Tithe Drinker", 200, Rarity.COMMON, mage.cards.t.TitheDrinker.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 286, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 287, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Traverse the Outlands", 34, Rarity.RARE, mage.cards.t.TraverseTheOutlands.class));
        cards.add(new SetCardInfo("Tyrant's Familiar", 143, Rarity.RARE, mage.cards.t.TyrantsFamiliar.class));
        cards.add(new SetCardInfo("Underworld Connections", 128, Rarity.RARE, mage.cards.u.UnderworldConnections.class));
        cards.add(new SetCardInfo("Unstable Obelisk", 229, Rarity.UNCOMMON, mage.cards.u.UnstableObelisk.class));
        cards.add(new SetCardInfo("Urborg Volcano", 288, Rarity.UNCOMMON, mage.cards.u.UrborgVolcano.class));
        cards.add(new SetCardInfo("Utvara Hellkite", 144, Rarity.MYTHIC, mage.cards.u.UtvaraHellkite.class));
        cards.add(new SetCardInfo("Vampire Nighthawk", 129, Rarity.UNCOMMON, mage.cards.v.VampireNighthawk.class));
        cards.add(new SetCardInfo("Vein Drinker", 130, Rarity.RARE, mage.cards.v.VeinDrinker.class));
        cards.add(new SetCardInfo("Vela the Night-Clad", 201, Rarity.MYTHIC, mage.cards.v.VelaTheNightClad.class));
        cards.add(new SetCardInfo("Vindictive Lich", 21, Rarity.RARE, mage.cards.v.VindictiveLich.class));
        cards.add(new SetCardInfo("Vivid Crag", 289, Rarity.UNCOMMON, mage.cards.v.VividCrag.class));
        cards.add(new SetCardInfo("Vivid Creek", 290, Rarity.UNCOMMON, mage.cards.v.VividCreek.class));
        cards.add(new SetCardInfo("Vivid Grove", 291, Rarity.UNCOMMON, mage.cards.v.VividGrove.class));
        cards.add(new SetCardInfo("Vivid Marsh", 292, Rarity.UNCOMMON, mage.cards.v.VividMarsh.class));
        cards.add(new SetCardInfo("Vivid Meadow", 293, Rarity.UNCOMMON, mage.cards.v.VividMeadow.class));
        cards.add(new SetCardInfo("Wasitora, Nekoru Queen", 49, Rarity.MYTHIC, mage.cards.w.WasitoraNekoruQueen.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 230, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Well of Lost Dreams", 231, Rarity.RARE, mage.cards.w.WellOfLostDreams.class));
        cards.add(new SetCardInfo("White Sun's Zenith", 78, Rarity.RARE, mage.cards.w.WhiteSunsZenith.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 294, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Wing Shards", 79, Rarity.UNCOMMON, mage.cards.w.WingShards.class));
        cards.add(new SetCardInfo("Worn Powerstone", 232, Rarity.UNCOMMON, mage.cards.w.WornPowerstone.class));
        cards.add(new SetCardInfo("Zendikar Resurgent", 160, Rarity.RARE, mage.cards.z.ZendikarResurgent.class));
    }
}

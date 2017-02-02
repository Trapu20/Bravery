package com.example.pupil.bravery;

import java.lang.reflect.Array;

/**
 * Created by pupil on 1/7/17.
 */
public class Management_Bravery {
    public static int ChampionCount = 0;
    public static int ItemCount = 0;

    public static ChampionList generateChampionList(){
        ChampionList ChampionListe = new ChampionList();

        Champion Aatrox = new Champion("Aatrox", "aatrox");
        try {
            ChampionListe.Add(Aatrox.get_name(), ChampionCount, Aatrox.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ahri = new Champion("Ahri", "ahri");
        try {
            ChampionListe.Add(Ahri.get_name(), ChampionCount, Ahri.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Akali = new Champion("Akali", "akali");
        try {
            ChampionListe.Add(Akali.get_name(), ChampionCount, Akali.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Alistar = new Champion("Alistar", "alistar");
        try {
            ChampionListe.Add(Alistar.get_name(), ChampionCount, Alistar.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Amumu = new Champion("Amumu", "amumu");
        try {
            ChampionListe.Add(Amumu.get_name(), ChampionCount, Amumu.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Anivia = new Champion("Anivia", "anivia");
        try {
            ChampionListe.Add(Anivia.get_name(), ChampionCount, Anivia.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Annie = new Champion("Annie", "annie");
        try {
            ChampionListe.Add(Annie.get_name(), ChampionCount, Annie.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ashe = new Champion("Ashe", "ashe");
        try {
            ChampionListe.Add(Ashe.get_name(), ChampionCount, Ashe.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion AurelionSol = new Champion("Aurelion Sol", "aurelionsol");
        try {
            ChampionListe.Add(AurelionSol.get_name(), ChampionCount, AurelionSol.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Azir = new Champion("Azir", "azir");
        try {
            ChampionListe.Add(Azir.get_name(), ChampionCount, Azir.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//10
        Champion Bard = new Champion("Bard", "bard");
        try {
            ChampionListe.Add(Bard.get_name(), ChampionCount, Bard.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Blitzcrank = new Champion("Blitzcrank", "blitzcrank");
        try {
            ChampionListe.Add(Blitzcrank.get_name(), ChampionCount, Blitzcrank.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Brand = new Champion("Brand", "brand");
        try {
            ChampionListe.Add(Brand.get_name(), ChampionCount, Brand.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Braum = new Champion("Braum", "braum");
        try {
            ChampionListe.Add(Braum.get_name(), ChampionCount, Braum.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Caitlyn = new Champion("Caitlyn", "caitlyn");
        try {
            ChampionListe.Add(Caitlyn.get_name(), ChampionCount, Caitlyn.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Camille = new Champion("Camille", "camille");
        try {
            ChampionListe.Add(Camille.get_name(), ChampionCount, Camille.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Cassiopeia = new Champion("Cassiopeia", "cassiopeia");
        try {
            ChampionListe.Add(Cassiopeia.get_name(), ChampionCount, Cassiopeia.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion ChoGath = new Champion("Cho'Gath", "chogath");
        try {
            ChampionListe.Add(ChoGath.get_name(), ChampionCount, ChoGath.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Corki = new Champion("Corki", "corki");
        try {
            ChampionListe.Add(Corki.get_name(), ChampionCount, Corki.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Darius = new Champion("Darius", "darius");
        try {
            ChampionListe.Add(Darius.get_name(), ChampionCount, Darius.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Diana = new Champion("Diana", "diana");
        try {
            ChampionListe.Add(Diana.get_name(), ChampionCount, Diana.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//20
        Champion Draven = new Champion("Draven", "draven");
        try {
            ChampionListe.Add(Draven.get_name(), ChampionCount, Draven.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion DrMundo = new Champion("Dr.Mundo", "drmundo");
        try {
            ChampionListe.Add(DrMundo.get_name(), ChampionCount, DrMundo.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;


        Champion Ekko = new Champion("Ekko", "ekko");
        try {
            ChampionListe.Add(Ekko.get_name(), ChampionCount, Ekko.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Elise = new Champion("Elise", "elise");
        try {
            ChampionListe.Add(Elise.get_name(), ChampionCount, Elise.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Evelynn = new Champion("Evelynn", "evelynn");
        try {
            ChampionListe.Add(Evelynn.get_name(), ChampionCount, Evelynn.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ezreal = new Champion("Ezreal", "ezreal");
        try {
            ChampionListe.Add(Ezreal.get_name(), ChampionCount, Ezreal.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Fiddlesticks = new Champion("Fiddlesticks", "fiddlesticks");
        try {
            ChampionListe.Add(Fiddlesticks.get_name(), ChampionCount, Fiddlesticks.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Fiora = new Champion("Fiora", "fiora");
        try {
            ChampionListe.Add(Fiora.get_name(), ChampionCount, Fiora.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Fizz = new Champion("Fizz", "fizz");
        try {
            ChampionListe.Add(Fizz.get_name(), ChampionCount, Fizz.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Galio = new Champion("Galio", "galio");
        try {
            ChampionListe.Add(Galio.get_name(), ChampionCount, Galio.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//30
        Champion Gangplank = new Champion("Gangplank", "gangplank");
        try {
            ChampionListe.Add(Gangplank.get_name(), ChampionCount, Gangplank.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Garen = new Champion("Garen", "garen");
        try {
            ChampionListe.Add(Garen.get_name(), ChampionCount, Garen.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Gnar = new Champion("Gnar", "gnar");
        try {
            ChampionListe.Add(Gnar.get_name(), ChampionCount, Gnar.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Gragas = new Champion("Gragas", "gragas");
        try {
            ChampionListe.Add(Gragas.get_name(), ChampionCount, Gragas.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Graves = new Champion("Graves", "Graves");
        try {
            ChampionListe.Add(Graves.get_name(), ChampionCount, Graves.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Hecarim = new Champion("Hecarim", "Hecarim");
        try {
            ChampionListe.Add(Hecarim.get_name(), ChampionCount, Hecarim.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Heimerdinger = new Champion("Heimerdinger", "Heimerdinger");
        try {
            ChampionListe.Add(Heimerdinger.get_name(), ChampionCount, Heimerdinger.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Illaoi = new Champion("Illaoi", "Illaoi");
        try {
            ChampionListe.Add(Illaoi.get_name(), ChampionCount, Illaoi.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Irelia = new Champion("Irelia", "Irelia");
        try {
            ChampionListe.Add(Irelia.get_name(), ChampionCount, Irelia.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ivern = new Champion("Ivern", "Ivern");
        try {
            ChampionListe.Add(Ivern.get_name(), ChampionCount, Ivern.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Janna = new Champion("Janna", "Janna");
        try {
            ChampionListe.Add(Janna.get_name(), ChampionCount, Janna.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//40
        Champion JarvanIV = new Champion("JarvanIV", "JarvanIV");
        try {
            ChampionListe.Add(JarvanIV.get_name(), ChampionCount, JarvanIV.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Jax = new Champion("Jax", "Jax");
        try {
            ChampionListe.Add(Jax.get_name(), ChampionCount, Jax.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Jayce = new Champion("Jayce", "Jayce");
        try {
            ChampionListe.Add(Jayce.get_name(), ChampionCount, Jayce.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Jhin = new Champion("Jhin", "Jhin");
        try {
            ChampionListe.Add(Jhin.get_name(), ChampionCount, Jhin.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Jinx = new Champion("Jinx", "Jinx");
        try {
            ChampionListe.Add(Jinx.get_name(), ChampionCount, Jinx.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Kalista = new Champion("Kalista", "Kalista");
        try {
            ChampionListe.Add(Kalista.get_name(), ChampionCount, Kalista.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Karma = new Champion("Karma", "Karma");
        try {
            ChampionListe.Add(Karma.get_name(), ChampionCount, Karma.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Karthus = new Champion("Karthus", "Karthus");
        try {
            ChampionListe.Add(Karthus.get_name(), ChampionCount, Karthus.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Kassadin = new Champion("Kassadin", "Kassadin");
        try {
            ChampionListe.Add(Kassadin.get_name(), ChampionCount, Kassadin.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Katarina = new Champion("Katarina", "Katarina");
        try {
            ChampionListe.Add(Katarina.get_name(), ChampionCount, Katarina.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//50
        Champion Kayle = new Champion("Kayle", "Kayle");
        try {
            ChampionListe.Add(Kayle.get_name(), ChampionCount, Kayle.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Kennen = new Champion("Kennen", "Kennen");
        try {
            ChampionListe.Add(Kennen.get_name(), ChampionCount, Kennen.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion KhaZix = new Champion("Kha'Zix", "KhaZix");
        try {
            ChampionListe.Add(KhaZix.get_name(), ChampionCount, KhaZix.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Kindred = new Champion("Kindred", "Kindred");
        try {
            ChampionListe.Add(Kindred.get_name(), ChampionCount, Kindred.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Kled = new Champion("Kled", "Kled");
        try {
            ChampionListe.Add(Kled.get_name(), ChampionCount, Kled.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion KogMaw = new Champion("Kog'Maw", "KogMaw");
        try {
            ChampionListe.Add(KogMaw.get_name(), ChampionCount, KogMaw.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion LeBlanc = new Champion("LeBlanc", "LeBlanc");
        try {
            ChampionListe.Add(LeBlanc.get_name(), ChampionCount, LeBlanc.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion LeeSin = new Champion("Lee Sin", "LeeSin");
        try {
            ChampionListe.Add(LeeSin.get_name(), ChampionCount, LeeSin.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Leona = new Champion("Leona", "Leona");
        try {
            ChampionListe.Add(Leona.get_name(), ChampionCount, Leona.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Lissandra = new Champion("Lissandra", "Lissandra");
        try {
            ChampionListe.Add(Lissandra.get_name(), ChampionCount, Lissandra.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Lucian = new Champion("Lucian", "Lucian");
        try {
            ChampionListe.Add(Lucian.get_name(), ChampionCount, Lucian.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//60
        Champion Lulu = new Champion("Lulu", "Lulu");
        try {
            ChampionListe.Add(Lulu.get_name(), ChampionCount, Lulu.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Lux = new Champion("Lux", "Lux");
        try {
            ChampionListe.Add(Lux.get_name(), ChampionCount, Lux.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Malphite = new Champion("Malphite", "Malphite");
        try {
            ChampionListe.Add(Malphite.get_name(), ChampionCount, Malphite.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Malzahar = new Champion("Malzahar", "Malzahar");
        try {
            ChampionListe.Add(Malzahar.get_name(), ChampionCount, Malzahar.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Maokai = new Champion("Maokai", "Maokai");
        try {
            ChampionListe.Add(Maokai.get_name(), ChampionCount, Maokai.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion MasterYi = new Champion("Master Yi", "MasterYi");
        try {
            ChampionListe.Add(MasterYi.get_name(), ChampionCount, MasterYi.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion MissFortune = new Champion("Miss Fortune", "MissFortune");
        try {
            ChampionListe.Add(MissFortune.get_name(), ChampionCount, MissFortune.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Mordekaiser = new Champion("Mordekaiser", "Mordekaiser");
        try {
            ChampionListe.Add(Mordekaiser.get_name(), ChampionCount, Mordekaiser.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Morgana = new Champion("Morgana", "Morgana");
        try {
            ChampionListe.Add(Morgana.get_name(), ChampionCount, Morgana.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Nami = new Champion("Nami", "Nami");
        try {
            ChampionListe.Add(Nami.get_name(), ChampionCount, Nami.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//70
        Champion Nasus = new Champion("Nasus", "Nasus");
        try {
            ChampionListe.Add(Nasus.get_name(), ChampionCount, Nasus.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Nautilus = new Champion("Nautilus", "Nautilus");
        try {
            ChampionListe.Add(Nautilus.get_name(), ChampionCount, Nautilus.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Nidalee = new Champion("Nidalee", "Nidalee");
        try {
            ChampionListe.Add(Nidalee.get_name(), ChampionCount, Nidalee.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Nocturne = new Champion("Nocturne", "Nocturne");
        try {
            ChampionListe.Add(Nocturne.get_name(), ChampionCount, Nocturne.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Nunu = new Champion("Nunu", "Nunu");
        try {
            ChampionListe.Add(Nunu.get_name(), ChampionCount, Nunu.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Olaf = new Champion("Olaf", "Olaf");
        try {
            ChampionListe.Add(Olaf.get_name(), ChampionCount, Olaf.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Orianna = new Champion("Orianna", "Orianna");
        try {
            ChampionListe.Add(Orianna.get_name(), ChampionCount, Orianna.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Pantheon = new Champion("Pantheon", "Pantheon");
        try {
            ChampionListe.Add(Pantheon.get_name(), ChampionCount, Pantheon.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Poppy = new Champion("Poppy", "Poppy");
        try {
            ChampionListe.Add(Poppy.get_name(), ChampionCount, Poppy.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Quinn = new Champion("Quinn", "Quinn");
        try {
            ChampionListe.Add(Quinn.get_name(), ChampionCount, Quinn.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//80
        Champion Rammus = new Champion("Rammus", "Rammus");
        try {
            ChampionListe.Add(Rammus.get_name(), ChampionCount, Rammus.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion RekSai = new Champion("Rek'Sai", "RekSai");
        try {
            ChampionListe.Add(RekSai.get_name(), ChampionCount, RekSai.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Renekton = new Champion("Renekton", "Renekton");
        try {
            ChampionListe.Add(Renekton.get_name(), ChampionCount, Renekton.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Rengar = new Champion("Rengar", "Rengar");
        try {
            ChampionListe.Add(Rengar.get_name(), ChampionCount, Rengar.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Riven = new Champion("Riven", "Riven");
        try {
            ChampionListe.Add(Riven.get_name(), ChampionCount, Riven.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Rumble = new Champion("Rumble", "Rumble");
        try {
            ChampionListe.Add(Rumble.get_name(), ChampionCount, Rumble.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ryze = new Champion("Ryze", "Ryze");
        try {
            ChampionListe.Add(Ryze.get_name(), ChampionCount, Ryze.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Sejuani = new Champion("Sejuani", "Sejuani");
        try {
            ChampionListe.Add(Sejuani.get_name(), ChampionCount, Sejuani.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Shaco = new Champion("Shaco", "Shaco");
        try {
            ChampionListe.Add(Shaco.get_name(), ChampionCount, Shaco.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Shen = new Champion("Shen", "Shen");
        try {
            ChampionListe.Add(Shen.get_name(), ChampionCount, Shen.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//90
        Champion Shyvana = new Champion("Shyvana", "Shyvana");
        try {
            ChampionListe.Add(Shyvana.get_name(), ChampionCount, Shyvana.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Singed = new Champion("Singed", "Singed");
        try {
            ChampionListe.Add(Singed.get_name(), ChampionCount, Singed.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Sion = new Champion("Sion", "Sion");
        try {
            ChampionListe.Add(Sion.get_name(), ChampionCount, Sion.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Sivir = new Champion("Sivir", "Sivir");
        try {
            ChampionListe.Add(Sivir.get_name(), ChampionCount, Sivir.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Skarner = new Champion("Skarner", "Skarner");
        try {
            ChampionListe.Add(Skarner.get_name(), ChampionCount, Skarner.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Sona = new Champion("Sona", "Sona");
        try {
            ChampionListe.Add(Sona.get_name(), ChampionCount, Sona.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Soraka = new Champion("Soraka", "Soraka");
        try {
            ChampionListe.Add(Soraka.get_name(), ChampionCount, Soraka.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Swain = new Champion("Swain", "Swain");
        try {
            ChampionListe.Add(Swain.get_name(), ChampionCount, Swain.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Syndra = new Champion("Syndra", "Syndra");
        try {
            ChampionListe.Add(Syndra.get_name(), ChampionCount, Syndra.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion TahmKench = new Champion("Tahm Kench", "TahmKench");
        try {
            ChampionListe.Add(TahmKench.get_name(), ChampionCount, TahmKench.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//100
        Champion Taliyah = new Champion("Taliyah", "Taliyah");
        try {
            ChampionListe.Add(Taliyah.get_name(), ChampionCount, Taliyah.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Talon = new Champion("Talon", "Talon");
        try {
            ChampionListe.Add(Talon.get_name(), ChampionCount, Talon.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Taric = new Champion("Taric", "Taric");
        try {
            ChampionListe.Add(Taric.get_name(), ChampionCount, Taric.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Teemo = new Champion("Teemo", "Teemo");
        try {
            ChampionListe.Add(Teemo.get_name(), ChampionCount, Teemo.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Thresh = new Champion("Thresh", "Thresh");
        try {
            ChampionListe.Add(Thresh.get_name(), ChampionCount, Thresh.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Tristana = new Champion("Tristana", "Tristana");
        try {
            ChampionListe.Add(Tristana.get_name(), ChampionCount, Tristana.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Trundle = new Champion("Trundle", "Trundle");
        try {
            ChampionListe.Add(Trundle.get_name(), ChampionCount, Trundle.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Tryndamere = new Champion("Tryndamere", "Tryndamere");
        try {
            ChampionListe.Add(Tryndamere.get_name(), ChampionCount, Tryndamere.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion TwistedFate = new Champion("Twisted Fate", "TwistedFate");
        try {
            ChampionListe.Add(TwistedFate.get_name(), ChampionCount, TwistedFate.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Twitch = new Champion("Twitch", "Twitch");
        try {
            ChampionListe.Add(Twitch.get_name(), ChampionCount, Twitch.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//110
        Champion Udyr = new Champion("Udyr", "Udyr");
        try {
            ChampionListe.Add(Udyr.get_name(), ChampionCount, Udyr.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Urgot = new Champion("Urgot", "Urgot");
        try {
            ChampionListe.Add(Urgot.get_name(), ChampionCount, Urgot.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Varus = new Champion("Varus", "Varus");
        try {
            ChampionListe.Add(Varus.get_name(), ChampionCount, Varus.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Vayne = new Champion("Vayne", "Vayne");
        try {
            ChampionListe.Add(Vayne.get_name(), ChampionCount, Vayne.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Veigar = new Champion("Veigar", "Veigar");
        try {
            ChampionListe.Add(Veigar.get_name(), ChampionCount, Veigar.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion VelKoz = new Champion("Vel'Koz", "VelKoz");
        try {
            ChampionListe.Add(VelKoz.get_name(), ChampionCount, VelKoz.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Vi = new Champion("Vi", "Vi");
        try {
            ChampionListe.Add(Vi.get_name(), ChampionCount, Vi.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Viktor = new Champion("Viktor", "Viktor");
        try {
            ChampionListe.Add(Viktor.get_name(), ChampionCount, Viktor.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Vladimir = new Champion("Vladimir", "Vladimir");
        try {
            ChampionListe.Add(Vladimir.get_name(), ChampionCount, Vladimir.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Volibear = new Champion("Volibear", "Volibear");
        try {
            ChampionListe.Add(Volibear.get_name(), ChampionCount, Volibear.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//120
        Champion Warwick = new Champion("Warwick", "Warwick");
        try {
            ChampionListe.Add(Warwick.get_name(), ChampionCount, Warwick.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Wukong = new Champion("Wukong", "Wukong");
        try {
            ChampionListe.Add(Wukong.get_name(), ChampionCount, Wukong.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Xerath = new Champion("Xerath", "Xerath");
        try {
            ChampionListe.Add(Xerath.get_name(), ChampionCount, Xerath.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion XinZhao = new Champion("Xin Zhao", "XinZhao");
        try {
            ChampionListe.Add(XinZhao.get_name(), ChampionCount, XinZhao.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Yasuo = new Champion("Yasuo", "Yasuo");
        try {
            ChampionListe.Add(Yasuo.get_name(), ChampionCount, Yasuo.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Yorick = new Champion("Yorick", "Yorick");
        try {
            ChampionListe.Add(Yorick.get_name(), ChampionCount, Yorick.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Zac = new Champion("Zac", "Zac");
        try {
            ChampionListe.Add(Zac.get_name(), ChampionCount, Zac.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Zed = new Champion("Zed", "Zed");
        try {
            ChampionListe.Add(Zed.get_name(), ChampionCount, Zed.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Ziggs = new Champion("Ziggs", "Ziggs");
        try {
            ChampionListe.Add(Ziggs.get_name(), ChampionCount, Ziggs.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;

        Champion Zilean = new Champion("Zilean", "Zilean");
        try {
            ChampionListe.Add(Zilean.get_name(), ChampionCount, Zilean.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ChampionCount++;
//130
        Champion Zyra = new Champion("Zyra", "Zyra");
        try {
            ChampionListe.Add(Zyra.get_name(), ChampionCount, Zyra.get_pfad());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ChampionListe;
    }
    public static ItemList generateItemList(){
        ItemList ItemListe = new ItemList();

        Item BeinschienenDesBerserkers = new Item("Beinschienen des Berserkers", "BeinschienenDesBerserkers.png",1100);
        try{
            ItemListe.Add(BeinschienenDesBerserkers.get_name(), ItemCount, BeinschienenDesBerserkers.get_pfad(), 1100);
        }catch(Exception e){
            e.printStackTrace();
        }
        ItemCount++;

        Item IonischeLaufstiefelDerDeutlichkeit = new Item("Ionische Stiefel der Deutlichkeit", "IonischeLaufstiefelDerDeutlichkeit.png",900);
        try {
            ItemListe.Add(IonischeLaufstiefelDerDeutlichkeit.get_name(), ItemCount,IonischeLaufstiefelDerDeutlichkeit.get_pfad(),900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item NinjaTabi = new Item("Ninja-Tabi", "NinjaTabi.png",1100);
        try {
            ItemListe.Add(NinjaTabi.get_name(), ItemCount,NinjaTabi.get_pfad(),1100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StiefelDerWendigkeit = new Item("Stiefel der Wendigkeit", "StiefelDerWendigkeit.png",900);
        try {
            ItemListe.Add(StiefelDerWendigkeit.get_name(), ItemCount,StiefelDerWendigkeit.get_pfad(),900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Zauberschuhe = new Item("Zauberschuhe", "Zauberschuhe.png",1100);
        try {
            ItemListe.Add(Zauberschuhe.get_name(), ItemCount,Zauberschuhe.get_pfad(),1100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StiefelDerBewegichkeit = new Item("Stiefel der Beweglichkeit", "StiefelDerBeweglichkeit.png",900);
        try {
            ItemListe.Add(StiefelDerBewegichkeit.get_name(), ItemCount,StiefelDerBewegichkeit.get_pfad(),900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item MerkursSchuhe = new Item("Merkurs Schuhe", "MerkursSchuhe.png",1100);
        try {
            ItemListe.Add(MerkursSchuhe.get_name(), ItemCount,MerkursSchuhe.get_pfad(),1100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //0-6=Schuhe

        Item ZzRotPortal = new Item("Zz'Rot-Portal","ZzRotPortal.png",2700);
        try {
            ItemListe.Add(ZzRotPortal.get_name(), ItemCount,ZzRotPortal.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item ZhonyasStundenglas = new Item("Zhonyas Stundenglas", "ZhonyasStundenglas.png",2900);
        try {
            ItemListe.Add(ZhonyasStundenglas.get_name(), ItemCount,ZhonyasStundenglas.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item ZekesBote = new Item("Zekes Bote", "ZekesBote.png",2250);
        try {
            ItemListe.Add(ZekesBote.get_name(), ItemCount,ZekesBote.get_pfad(),2250);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item YoumusGeistklinge = new Item("Youmus Geistklinge", "YoumusGeistklinge.png",2900);
        try {
            ItemListe.Add(YoumusGeistklinge.get_name(), ItemCount,YoumusGeistklinge.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item WarmogsRuestung = new Item("Warmogs Rüstung","WarmogsRuestung.png",2850);
        try {
            ItemListe.Add(WarmogsRuestung.get_name(), ItemCount,WarmogsRuestung.get_pfad(),2850);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item TitanischeHydra = new Item("Titanische Hydra", "TitanischeHydra.png",3500);
        try {
            ItemListe.Add(TitanischeHydra.get_name(), ItemCount,TitanischeHydra.get_pfad(),3500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item TanzDesTodes = new Item("Tanz des Todes", "TanzdesTodes.png",3500);
        try {
            ItemListe.Add(TanzDesTodes.get_name(), ItemCount,TanzDesTodes.get_pfad(),3500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StaerkeDerDreieinigkeit = new Item("Stärke der Dreieinigkeit", "StaerkeDerDreieinigkeit.png",3733);
        try {
            ItemListe.Add(StaerkeDerDreieinigkeit.get_name(), ItemCount,StaerkeDerDreieinigkeit.get_pfad(),3733);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StabDerZeitalter = new Item("Stab der Zeitalter", "StabDerZeitalter.png",2700);
        try {
            ItemListe.Add(StabDerZeitalter.get_name(), ItemCount, StabDerZeitalter.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StabDesErzengels = new Item("Stab des Erzengels", "StabDesErzengels.png",3100);
        try {
            ItemListe.Add(StabDesErzengels.get_name(), ItemCount,StabDesErzengels.get_pfad(),3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SterblicheMahnung = new Item("Sterbliche Mahnung", "SterblicheMahnung.png",2700);
        try {
            ItemListe.Add(SterblicheMahnung.get_name(), ItemCount,SterblicheMahnung.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //10
        Item SteraksPegel = new Item("Steraks Pegel", "SteraksPegel.png",2600);
        try {
            ItemListe.Add(SteraksPegel.get_name(), ItemCount,SteraksPegel.get_pfad(),2600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item StatikksStich = new Item("Statikks Stich", "StatikksStich.png",2600);
        try {
            ItemListe.Add(StatikksStich.get_name(), ItemCount,StatikksStich.get_pfad(),2600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SonnenfeuerUmhang = new Item("Sonnenfeuer Umhang", "SonnenfeuerUmhang.png",2900);
        try {
            ItemListe.Add(SonnenfeuerUmhang.get_name(), ItemCount,StabDesErzengels.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SehenderRubinstein = new Item("Sehender Rubinstein", "SehenderRubinstein.png",1600);
        try {
            ItemListe.Add(SehenderRubinstein.get_name(), ItemCount,SehenderRubinstein.get_pfad(),1600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SchwarzesBeil = new Item("Schwarzes Beil", "SchwarzesBeil.png",3100);
        try {
            ItemListe.Add(SchwarzesBeil.get_name(), ItemCount, SchwarzesBeil.get_pfad(), 3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Schutzengel = new Item("Schutzengel", "Schutzengel.png",2400);
        try {
            ItemListe.Add(Schutzengel.get_name(), ItemCount, Schutzengel.get_pfad(), 2400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SchnellfeuerGeschuetz = new Item("Schnellfeuer - Geschütz","SchnellfeuerGeschuetz.png",2600);
        try {
            ItemListe.Add(SchnellfeuerGeschuetz.get_name(), ItemCount,SchnellfeuerGeschuetz.get_pfad(),2600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SchlundVonMalmortius = new Item("Schlund von Malmortius", "SchlundVonMalmortius.png",3250);
        try {
            ItemListe.Add(SchlundVonMalmortius.get_name(), ItemCount,SchlundVonMalmortius.get_pfad(),3250);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item SchleierDerTodesfee = new Item("Schleier der Todesfee", "SchleierDerTodesfee.png",2450);
        try {
            ItemListe.Add(SchleierDerTodesfee.get_name(), ItemCount,SchleierDerTodesfee.get_pfad(),2450);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
//20
        Item SaumDerNacht = new Item("Saum der Nacht", "SaumDerNacht.png",3100);
        try {
            ItemListe.Add(SaumDerNacht.get_name(), ItemCount,SaumDerNacht.get_pfad(),3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item RylaisKristallzepter = new Item("Rylais Kristallzepter","RylaisKristallzepter.png",2600);
        try {
            ItemListe.Add(RylaisKristallzepter.get_name(), ItemCount,RylaisKristallzepter.get_pfad(),2600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item RunaansWirbelsturm = new Item("Runaans Wirbelsturm", "RunaansWirbelsturm.png",2600);
        try {
            ItemListe.Add(RunaansWirbelsturm.get_name(), ItemCount,RunaansWirbelsturm.get_pfad(),2600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Ritterschwur = new Item("Ritterschwur", "Ritterschwur.png",2400);
        try {
            ItemListe.Add(Ritterschwur.get_name(), ItemCount,Ritterschwur.get_pfad(),2400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item RedlichePracht = new Item("Redliche Pracht", "RedlichePracht.png",2500);
        try {
            ItemListe.Add(RedlichePracht.get_name(), ItemCount,RedlichePracht.get_pfad(),2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item RanduinsOmen = new Item("Randuins Omen", "RanduinsOmen.png",2900);
        try {
            ItemListe.Add(RanduinsOmen.get_name(), ItemCount,RanduinsOmen.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item RabadonsTodeshaube = new Item("Rabadons Todeshaube", "RabadonsTodeshaube.png",3800);
        try {
            ItemListe.Add(RabadonsTodeshaube.get_name(), ItemCount,RabadonsTodeshaube.get_pfad(),3800);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Phantomtaenzer = new Item("Phantomtänzer", "Phantomtaenzer.png",2550);
        try {
            ItemListe.Add(Phantomtaenzer.get_name(), ItemCount,Phantomtaenzer.get_pfad(),2550);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item PanzerDesTotenMannes = new Item("Panzer des toten Mannes", "PanzerDesTotenMannes.png",2900);
        try {
            ItemListe.Add(PanzerDesTotenMannes.get_name(), ItemCount,PanzerDesTotenMannes.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Ohmzerstoerer = new Item("Ohmzerszörer", "Ohmzerstoerer.png",2650);
        try {
            ItemListe.Add(Ohmzerstoerer.get_name(), ItemCount,Ohmzerstoerer.get_pfad(),2650);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item NashorhsZahn = new Item("Nashors Zahn", "NashorsZahn.png",3000);
        try {
            ItemListe.Add(NashorhsZahn.get_name(), ItemCount,NashorhsZahn.get_pfad(),3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Manamune = new Item("Manamune","Manamune.png",2400);
        try {
            ItemListe.Add(Manamune.get_name(), ItemCount,Manamune.get_pfad(),2400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //30
        Item Morellonomikon = new Item("Morellonomikon","Morellonomikon.png",2900);
        try {
            ItemListe.Add(Morellonomikon.get_name(), ItemCount,Morellonomikon.get_pfad(),2900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item MirakelsSchmelztiegel = new Item("Mirakels Schmelztiegel","MirakelsSchmelztiegel.png",2100);
        try {
            ItemListe.Add(MirakelsSchmelztiegel.get_name(), ItemCount,MirakelsSchmelztiegel.get_pfad(),2100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item MejaisSeelenstehler = new Item("Mejais Seelenstehler", "MejaisSeelenstehler.png",1400);
        try {
            ItemListe.Add(MejaisSeelenstehler.get_name(), ItemCount,MejaisSeelenstehler.get_pfad(),1440);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item LudensEcho = new Item("Ludens Echo", "LudensEcho.png",3200);
        try {
            ItemListe.Add(LudensEcho.get_name(), ItemCount,LudensEcho.get_pfad(),3200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item LordDominiksGruesse = new Item("Lord Dominiks Grüße", "LordDominiksGruesse.png",2700);
        try {
            ItemListe.Add(LordDominiksGruesse.get_name(), ItemCount,LordDominiksGruesse.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item LiandrysQual = new Item("Liandrys Qual", "LiandrysQual.png",3100);
        try {
            ItemListe.Add(LiandrysQual.get_name(), ItemCount,LiandrysQual.get_pfad(),3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Leerenstab = new Item("Leerenstab", "Leerenstab.png",2650);
        try {
            ItemListe.Add(Leerenstab.get_name(), ItemCount,Leerenstab.get_pfad(),2650);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Kommandobanner = new Item("Kommandobanner", "Kommandobanner.png",2200);
        try {
            ItemListe.Add(Kommandobanner.get_name(), ItemCount,Kommandobanner.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item KlingeDesGestuerztenKoenigs = new Item("Klinge des gestürtzten Königs", "KlingeDesGestuerztenKoenigs.png",3400);
        try {
            ItemListe.Add(KlingeDesGestuerztenKoenigs.get_name(), ItemCount,KlingeDesGestuerztenKoenigs.get_pfad(),3400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item KlingeDerUnendlichkeit = new Item("Klinge der Unendlichkeit", "KlingeDerUnendlichkeit.png",3600);
        try {
            ItemListe.Add(KlingeDesGestuerztenKoenigs.get_name(), ItemCount,KlingeDerUnendlichkeit.get_pfad(),3600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //40
        Item Hoellenzepter = new Item("Höllenzepter","Hoellenzepter.png",2750);
        try {
            ItemListe.Add(Hoellenzepter.get_name(), ItemCount,Hoellenzepter.get_pfad(),2750);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item HextechProtoguertel01 = new Item("Hextech - Protogürtel 01", "HextechProtoguertel01.png",2500);
        try {
            ItemListe.Add(HextechProtoguertel01.get_name(), ItemCount,HextechProtoguertel01.get_pfad(),2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item HextechGLP800 = new Item("Hextech - GLP-800","HextechGLP800.png",3000);
        try {
            ItemListe.Add(HextechGLP800.get_name(), ItemCount,HextechGLP800.get_pfad(),3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item HextecGunblade = new Item("Hextech - Gunblade", "HextechGunblade.png",3400);
        try {
            ItemListe.Add(HextecGunblade.get_name(), ItemCount, HextecGunblade.get_pfad(),3400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item GuinoosWutklinge = new Item("Guinoos Wutklinge", "GuinoosWutklinge.png",3600);
        try {
            ItemListe.Add(GuinoosWutklinge.get_name(), ItemCount,GuinoosWutklinge.get_pfad(),3600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item GluehenderRauchschwnker = new Item("Glühender Rauchschwenker", "GluehenderRauchschwenker.png",2300);
        try {
            ItemListe.Add(GluehenderRauchschwnker.get_name(), ItemCount,GluehenderRauchschwnker.get_pfad(),2300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Geistessicht = new Item("Geistessicht", "Geistessicht.png",2800);
        try {
            ItemListe.Add(Geistessicht.get_name(), ItemCount,Geistessicht.get_pfad(),2800);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item GefraessigeHydra = new Item("Gefräßige Hydra", "GefraessigeHydra.png",3500);
        try {
            ItemListe.Add(GefraessigeHydra.get_name(), ItemCount,GefraessigeHydra.get_pfad(),3500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item GefrorenesHerz = new Item("Gefrorenes Herz","GefrorenesHerz.png",2700);
        try {
            ItemListe.Add(GefrorenesHerz.get_name(), ItemCount,GefrorenesHerz.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Gebirgspanzer = new Item("Gebirgspanzer", "Gebirgspanzer.png",2200);
        try {
            ItemListe.Add(Gebirgspanzer.get_name(), ItemCount,Gebirgspanzer.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Frosthammer = new Item("Frosthammer", "Frosthammer.png",3100);
        try {
            ItemListe.Add(Frosthammer.get_name(), ItemCount,Frosthammer.get_pfad(),3100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //50
        Item FluchDesLichts = new Item("Fluch Des Lichts","FluchDesLichts.png",3200);
        try {
            ItemListe.Add(FluchDesLichts.get_name(), ItemCount,FluchDesLichts.get_pfad(),3200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item FlinkerKrummsaebel = new Item("Flinker Krummsäbel", "FlinkerKrummsaebel.png",3600);
        try {
            ItemListe.Add(FlinkerKrummsaebel.get_name(), ItemCount,FlinkerKrummsaebel.get_pfad(),3600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Essenzrauber = new Item("Essenzräuber", "Essenzraeuber.png",3600);
        try {
            ItemListe.Add(Essenzrauber.get_name(), ItemCount,Essenzrauber.get_pfad(),3600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item EndeDerWeisheit = new Item("Ende der Weisheit", "EndeDerWeisheit.png",2500);
        try {
            ItemListe.Add(EndeDerWeisheit.get_name(), ItemCount,EndeDerWeisheit.get_pfad(),2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item EisgeborenenHandschuh = new Item("Eisgeborenen -Handschuh", "EisgeborenenHandschuh.png",2700);
        try {
            ItemListe.Add(EisgeborenenHandschuh.get_name(), ItemCount,EisgeborenenHandschuh.get_pfad(),2700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item DaemmerungsklingeVonDraktharr = new Item("Dämmerungsklinge von Draktharr", "DaemmerungsklingeVonDraktharr.png",3250);
        try {
            ItemListe.Add(DaemmerungsklingeVonDraktharr.get_name(), ItemCount,DaemmerungsklingeVonDraktharr.get_pfad(),3250);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Dornenpanzer = new Item("Dornenpanzer","Dornenpanzer.png",2350);
        try {
            ItemListe.Add(Dornenpanzer.get_name(), ItemCount,Dornenpanzer.get_pfad(),2350);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Befreiungsschlag= new Item("Befreiungsschlag", "Befreiungsschlag.png",2100);
        try {
            ItemListe.Add(Befreiungsschlag.get_name(), ItemCount,Befreiungsschlag.get_pfad(),2100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item Blutduerster = new Item("Blutdürster", "Blutduerster.png",3700);
        try {
            ItemListe.Add(Blutduerster.get_name(), ItemCount,Blutduerster.get_pfad(),3700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AugeDerWaechter = new Item("Auge der Wächter", "AugeDerWaechter.png",2200);
        try {
            ItemListe.Add(AugeDerWaechter.get_name(), ItemCount,AugeDerWaechter.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AugeDerSonnenwende = new Item("Auge der Sonnenwende", "AugeDerSonnenwende.png",2200);
        try {
            ItemListe.Add(AugeDerSonnenwende.get_name(), ItemCount,AugeDerSonnenwende.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;
        //60
        Item AugeDerOase = new Item("Auge der Oase","AugeDerOase.png",1900);
        try {
            ItemListe.Add(AugeDerOase.get_name(), ItemCount,AugeDerOase.get_pfad(),1900);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AthensUnheiligerGral = new Item("Athens unheiliger Gral","AthensUnheiligerGral.png",2250);
        try {
            ItemListe.Add(AthensUnheiligerGral.get_name(), ItemCount,AthensUnheiligerGral.get_pfad(),2250);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AnrechtDerFrostkoenigin = new Item("Anrecht der Frostköigin", "AnrechtDerFrostkoenigin.png",2200);
        try {
            ItemListe.Add(AnrechtDerFrostkoenigin.get_name(), ItemCount,AnrechtDerFrostkoenigin.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AmulettDesAufstiegs = new Item("Amulett des Aufstiegs","AmulettDesAufstiegs.png",2400);
        try {
            ItemListe.Add(AmulettDesAufstiegs.get_name(), ItemCount,AmulettDesAufstiegs.get_pfad(),2400);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ItemCount++;

        Item AmulettDerEisernenSolari = new Item("Amulett der eisernen Solari", "AmulettDerEisernenSolari.png",2200);
        try {
            ItemListe.Add(AmulettDerEisernenSolari.get_name(), ItemCount,AmulettDerEisernenSolari.get_pfad(),2200);
        } catch (Exception e) {
            e.printStackTrace();
        }
//65+7Schuhe
        return ItemListe;
    }
    public static int generateLane(){
        Lane rndLane = new Lane();
        return rndLane.CreateRandomLane();
    }
    public static String generateAbility(){
        Ability rndAbility = new Ability();
        return rndAbility.CreateRandomAbility();
    }
    public static int generateSpell(){
        Spell rndSpell = new Spell();
        return  rndSpell.CreateRandomSpell();
    }
    public static int[] generateMastery(){
       Mastery rndMasteries = new Mastery();
        return rndMasteries.CreateRandomMastery();
    }
}



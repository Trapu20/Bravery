package com.example.pupil.bravery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BraverySolutionPage extends AppCompatActivity {
    private ItemList ItemListe = Management_Bravery.generateItemList();
    private ChampionList ChampionListe = Management_Bravery.generateChampionList();

    private int rndChampion = 0;
    private int Item1, Item2, Item3, Item4, Item5, Item6;
    private int numberOfShoes = 7;
    private int rndLane = 0;

    private  int rndSpell1, rndSpell2;
    private String rndAbility;

    private int[] rndMastery;
    private int[] ChampionImages;
    private int[] ItemImages;
    private int[] LaneImages;
    private int[] SpellImages;
    private int[] AbilityImages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bravery_solution_page);
        BraveryGenerator();
    }
    private void init(){
        rndLane    = Management_Bravery.generateLane();
        rndAbility = Management_Bravery.generateAbility();
        rndMastery = Management_Bravery.generateMastery();
        rndSpell1  = Management_Bravery.generateSpell();
        //spell2 couldn't be the same one as spell1
        do{
            rndSpell2  = Management_Bravery.generateSpell();
        }while(rndSpell1==rndSpell2);

        //calculate random Champion
        rndChampion = 0 + (int) (Math.random() * Management_Bravery.ChampionCount);
        //get all Champion-images in an array
        ChampionImages = generateChampionImageArray();
        //get all Item-images in an array
        ItemImages = generateItemImageArray();

        LaneImages = generateLaneImageArray();
        SpellImages = generateSpellImageArray();
        AbilityImages = generateAbilityImageArray();
        //first item: shoes
        //other items shouldn't be even
        Item1 = generateItemShoes();
        Item2 = generateItem();
        do {
            Item3 = generateItem();
        }while(Item2==Item3);

        do {
            Item4 = generateItem();
        }while(Item4==Item2||Item4==Item3);

        do {
            Item5 = generateItem();
        }while(Item5==Item2||Item5==Item3||Item5==Item4);

        do {
            Item6 = generateItem();
        }while(Item6==Item2||Item6==Item3||Item6==Item4||Item6==Item5);

    }
    public void BraveryGenerator(){
        init();
        //print the Champion (text, image)
        showChampionText(rndChampion);
        showChampionImg(rndChampion, ChampionImages);

        showItemImg(Item1,ItemImages, R.id.img_Item1);
        showItemImg(Item2,ItemImages, R.id.img_Item2);
        showItemImg(Item3,ItemImages, R.id.img_Item3);
        showItemImg(Item4,ItemImages, R.id.img_Item4);
        showItemImg(Item5,ItemImages, R.id.img_Item5);
        showItemImg(Item6, ItemImages, R.id.img_Item6);

        //print spells(text)
        showSpellText(rndSpell1, R.id.txt_Spell1);
        showSpellText(rndSpell2, R.id.txt_Spell2);

        showLaneImg(rndLane, LaneImages);
        showLaneText(rndLane);

        showSpellImg(rndSpell1, SpellImages, R.id.img_Spell1);
        showSpellImg(rndSpell2, SpellImages, R.id.img_Spell2);

        showMasteryText(rndMastery);
        showMasteryImg();

        showAbilityImg(AbilityImages);
    }


    public void NextTry(View view){
        BraveryGenerator();
    }

    private int generateItemShoes(){
        int rndShoe = 0 + (int)(Math.random() * numberOfShoes);
        return rndShoe;
    }
    private int generateItem(){
        int rndItem = 0 + (int)(Math.random() * (Management_Bravery.ItemCount));
        //Wenn es ein Schuh ist, zähle die Anzahl der Schuhe hoch
        if(rndItem <numberOfShoes){
            rndItem= rndItem + numberOfShoes;
        }
        return rndItem;
    }

    private int[] generateChampionImageArray(){
        int[] championArray = {
                R.mipmap.champion_aatrox_img,R.mipmap.champion_ahri_img,R.mipmap.champion_akali_img,R.mipmap.champion_alistar_img,R.mipmap.champion_amumu_img,R.mipmap.champion_anivia_img,
                R.mipmap.champion_annie_img,R.mipmap.champion_aurelionsol_img,R.mipmap.champion_azir_img,R.mipmap.champion_bard_img,R.mipmap.champion_blitzcrank_img,R.mipmap.champion_brand_img,
                R.mipmap.champion_braum_img,R.mipmap.champion_caitlyn_img,R.mipmap.champion_camille_img,R.mipmap.champion_cassiopeia_img,R.mipmap.champion_chogath_img,R.mipmap.champion_corki_img,
                R.mipmap.champion_darius_img,R.mipmap.champion_diana_img,R.mipmap.champion_draven_img,R.mipmap.champion_drmundo_img,R.mipmap.champion_ekko_img,
                R.mipmap.champion_elise_img, R.mipmap.champion_evelynn_img,R.mipmap.champion_ezreal_img,R.mipmap.champion_fiddlesticks_img,R.mipmap.champion_fiora_img,R.mipmap.champion_fizz_img,
                R.mipmap.champion_galio_img,R.mipmap.champion_gangplank_img,
                R.mipmap.champion_garen_img,R.mipmap.champion_gnar_img,R.mipmap.champion_gragas_img,R.mipmap.champion_graves_img,R.mipmap.champion_hecarim_img,R.mipmap.champion_heimerdinger_img,
                R.mipmap.champion_illaoi_img,R.mipmap.champion_irelia_img,R.mipmap.champion_ivern_img,R.mipmap.champion_janna_img,R.mipmap.champion_jarvaniv_img,R.mipmap.champion_jax_img,
                R.mipmap.champion_jayce_img,R.mipmap.champion_jhin_img,R.mipmap.champion_jinx_img,R.mipmap.champion_kalista_img,R.mipmap.champion_karma_img,R.mipmap.champion_karthus_img,
                R.mipmap.champion_kassadin_img,R.mipmap.champion_katarina_img,R.mipmap.champion_kayle_img,R.mipmap.champion_kennen_img,R.mipmap.champion_khazix_img,R.mipmap.champion_kindred_img,
                R.mipmap.champion_kled_img,R.mipmap.champion_kogmaw_img,R.mipmap.champion_leblanc_img,R.mipmap.champion_leesin_img,R.mipmap.champion_leona_img,R.mipmap.champion_lissandra_img,
                R.mipmap.champion_lucian_img,R.mipmap.champion_lulu_img,R.mipmap.champion_lux_img,R.mipmap.champion_malphite_img,R.mipmap.champion_malzahar_img,R.mipmap.champion_maokai_img,
                R.mipmap.champion_masteryi_img,R.mipmap.champion_missfortune_img,R.mipmap.champion_mordekaiser_img,R.mipmap.champion_morgana_img,R.mipmap.champion_nami_img,R.mipmap.champion_nasus_img,
                R.mipmap.champion_nautilus_img,R.mipmap.champion_nidalee_img,R.mipmap.champion_nocturne_img,R.mipmap.champion_nunu_img,R.mipmap.champion_olaf_img,R.mipmap.champion_orianna_img,
                R.mipmap.champion_pantheon_img,R.mipmap.champion_poppy_img,R.mipmap.champion_quinn_img,R.mipmap.champion_rammus_img,R.mipmap.champion_reksai_img,R.mipmap.champion_renekton_img,
                R.mipmap.champion_rengar_img,R.mipmap.champion_riven_img,R.mipmap.champion_rumble_img,R.mipmap.champion_ryze_img,R.mipmap.champion_sejuani_img,R.mipmap.champion_shaco_img,
                R.mipmap.champion_shen_img,R.mipmap.champion_shyvana_img,R.mipmap.champion_singed_img,R.mipmap.champion_sion_img,R.mipmap.champion_sivir_img,R.mipmap.champion_skarner_img,
                R.mipmap.champion_sona_img,R.mipmap.champion_soraka_img,R.mipmap.champion_swain_img,R.mipmap.champion_syndra_img,R.mipmap.champion_tahmkench_img,R.mipmap.champion_taliyah_img,
                R.mipmap.champion_talon_img,R.mipmap.champion_taric_img,R.mipmap.champion_teemo_img,R.mipmap.champion_thresh_img,R.mipmap.champion_tristana_img,R.mipmap.champion_trundle_img,
                R.mipmap.champion_tryndamere_img,R.mipmap.champion_twistedfate_img,R.mipmap.champion_twitch_img,R.mipmap.champion_udyr_img,R.mipmap.champion_urgot_img,R.mipmap.champion_varus_img,
                R.mipmap.champion_vayne_img,R.mipmap.champion_veigar_img,R.mipmap.champion_velkoz_img,R.mipmap.champion_vi_img,R.mipmap.champion_viktor_img,R.mipmap.champion_vlladimir_img,
                R.mipmap.champion_volibear_img,R.mipmap.champion_warwick_img,R.mipmap.champion_wukong_img,R.mipmap.champion_xerath_img,R.mipmap.champion_xinzhao_img,R.mipmap.champion_yasuo_img,
                R.mipmap.champion_yorick_img,R.mipmap.champion_zac_img,R.mipmap.champion_zed_img,R.mipmap.champion_ziggs_img,R.mipmap.champion_zilean_img,R.mipmap.champion_zyra_img};

        return championArray;
    }
    private int[] generateItemImageArray(){
        int[] itemArray ={
                R.mipmap.items_beinschienendesberserkers_img,R.mipmap.items_ionischelaufstiefelderdeutlichkeit_img,R.mipmap.items_merkursschuhe_img,R.mipmap.items_ninjatabi_img,
                R.mipmap.items_stiefelderbeweglichkeit_img,R.mipmap.items_stiefelderwendigkeit_img,R.mipmap.items_zauberschuhe_img,

                R.mipmap.items_amulettdereisernensolari_img,R.mipmap.items_amulettdesaufstiegs_img,R.mipmap.items_anrechtderfrostkoenigin_img,R.mipmap.items_athensunheiligergral_img,
                R.mipmap.items_augederoase_img,R.mipmap.items_augedersonnenwende_img,R.mipmap.items_augedeswaechters_img,R.mipmap.items_befreiungsschlag_img,
                R.mipmap.items_blutduerster_img,R.mipmap.items_daemmerungsklingevondraktharr_img,R.mipmap.items_dornenpanzer_img,R.mipmap.items_eisgeborenenhandschuh_img,R.mipmap.items_endederweisheit_img,
                R.mipmap.items_essenzraeuber_img,R.mipmap.items_fluchdeslichts_img,R.mipmap.items_frosthammer_img,R.mipmap.items_gebirgspanzer_img,R.mipmap.items_gefraessigehydra_img,R.mipmap.items_gefraessigehydra_img,
                R.mipmap.items_gefrorenesherz_img,R.mipmap.items_geistessicht_img,R.mipmap.items_gluehenderrauchschwenker_img,R.mipmap.items_guinooswutklinge_img,R.mipmap.items_hextechglp800_img,
                R.mipmap.items_hextechgunblade_img,R.mipmap.items_hextechprotoguertel01_img,R.mipmap.items_hoellenzepter_img,R.mipmap.items_klingederunendlichkeit_img,
                R.mipmap.items_klingedesgestuerztenkoenigs_img,R.mipmap.items_kommandobanner_img,R.mipmap.items_leerenstab_img,R.mipmap.items_liandrysqual_img,R.mipmap.items_lorddominiksgruesse_img,
                R.mipmap.items_ludensecho_img,R.mipmap.items_manamune_img,R.mipmap.items_mejaisseelenstehler_img,R.mipmap.items_mirakelsschmelztiegel_img,
                R.mipmap.items_morellonomikon_img,R.mipmap.items_nashorszahn_img,R.mipmap.items_ohmzerstoerer_img,R.mipmap.items_panzerdestotenmannes_img,R.mipmap.items_phantomtaenzer_img,
                R.mipmap.items_rabadonstodeshaube_img,R.mipmap.items_randuinsomen_img,R.mipmap.items_redlichepracht_img,R.mipmap.items_ritterschwur_img,R.mipmap.items_runaanswirbelsturm_img,
                R.mipmap.items_rylaiskristallzepter_img,R.mipmap.items_saumdernacht_img,R.mipmap.items_schleierdertodesfee_img,R.mipmap.items_schlundvonmalmortius_img,R.mipmap.items_schnellfeuergeschuetz_img,
                R.mipmap.items_schutzengel_img,R.mipmap.items_schwarzesbeil_img,R.mipmap.items_sehenderrubinstein_img,R.mipmap.items_sonnenfeuerumhang_img,R.mipmap.items_stabderzeitalter_img,
                R.mipmap.items_stabdeserzengels_img,R.mipmap.items_staerkederdreieinigkeit_img,R.mipmap.items_statikksstich_img,R.mipmap.items_sterakspegel_img,R.mipmap.items_sterblichemahnung_img,
                R.mipmap.items_tanzdestodes_img,R.mipmap.items_titanischehydra_img,R.mipmap.items_warmogsruestung_img,
                R.mipmap.items_youmusgeistklinge_img,R.mipmap.items_zekesbote_img,R.mipmap.items_zhonyasstundenglas_img,R.mipmap.items_zzrotportal_img
        };
        return itemArray;
    }
    private int[] generateLaneImageArray(){
        //0 = Top, 1 = Jungle, 2 = Mid, 3 = ADC, 4 = Support
        int[] laneArray = {R.mipmap.lane_top_img, R.mipmap.lane_jungle_img, R.mipmap.lane_mid_img, R.mipmap.lane_adc_img, R.mipmap.lane_support_img};
        return laneArray;
    }
    private int[] generateSpellImageArray(){
        //0 = Flash, 1 = Teleport, 2 = Smite, 3 = Ghost, 4 = Barrier, 5 = Heal, 6 = Ignite, 7 = Exhaust, 8 = Cleanse
        int[] spellArray = {
                R.mipmap.spell_flash_img, R.mipmap.spell_teleport_img, R.mipmap.spell_smite_img, R.mipmap.spell_ghost_img, R.mipmap.spell_barrier_img,
                R.mipmap.spell_heal_img, R.mipmap.spell_ignite_img,R.mipmap.spell_exhaust_img, R.mipmap.spell_cleanse_img};
        return spellArray;
    }
    private int[] generateAbilityImageArray(){
        int[] abilityArray = { R.mipmap.ability_aatroxe_img

        };
        return abilityArray;
    }

    private void showChampionText(int championPosition){
        TextView Champion = (TextView)findViewById(R.id.txt_Champion);
        Champion.setText(ChampionListe.Championauswahl(championPosition));
    }
    private void showChampionImg(int championPosition, int[] imagesChampions){
        ImageView img_champ = (ImageView)findViewById(R.id.img_Champion);
        img_champ.setImageResource(imagesChampions[championPosition - 1]);
    }

    private void showItemImg(int itemPosition, int[] imagesItems, int imgViewId){
        ImageView img_item = (ImageView)findViewById(imgViewId);
        img_item.setImageResource(imagesItems[itemPosition]);
    }

    private void showSpellText(int spellNr, int spellID){
    //0 = Flash, 1 = Teleport, 2 = Smite, 3 = Ghost, 4 = Barrier, 5 = Heal, 6 = Ignite, 7 = Exhaust, 8 = Cleanse
        if(spellNr==0){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                //txt_Spell.setText("Spell: " + "Flash");
                txt_Spell.setText("Flash");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Flash");
            }
        }
        if(spellNr==1){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Teleport");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Teleport");
            }
        }
        if(spellNr==2){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Smite");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Smite");
            }
        }
        if(spellNr==3){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Ghost");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Ghost");
            }
        }
        if(spellNr==4){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Barrier");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Barrier");
            }
        }
        if(spellNr==5){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Heal");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Heal");
            }
        }
        if(spellNr==6){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Ignite");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Ignite");
            }
        }
        if(spellNr==7){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Exhaust");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Exhaust");
            }
        }
        if(spellNr==8){
            if(spellID == R.id.txt_Spell1){
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Cleanse");
            }
            else{
                TextView txt_Spell = (TextView)findViewById(spellID);
                txt_Spell.setText("Cleanse");
            }
        }




    }
    private void showSpellImg(int spellNr, int[]spellArray, int spellID){
        ImageView img_spell = (ImageView)findViewById(spellID);
        img_spell.setImageResource(spellArray[spellNr]);
    }

    private void showLaneImg(int lanePosition, int[] imagesLanes){
        ImageView img_lane = (ImageView)findViewById(R.id.img_Lane);
        img_lane.setImageResource(imagesLanes[lanePosition]);
    }
    private void showLaneText(int lanePosition){
        //0 = Top, 1 = Jungle, 2 = Mid, 3 = ADC, 4 = Support
        if(lanePosition==0){
            TextView Lane = (TextView)findViewById(R.id.txt_Lane);
            Lane.setText("Lane: Top");
        }
        if(lanePosition==1){
            TextView Lane = (TextView)findViewById(R.id.txt_Lane);
            Lane.setText("Lane: Jungle");
        }
        if(lanePosition==2){
            TextView Lane = (TextView)findViewById(R.id.txt_Lane);
            Lane.setText("Lane: Mid");
        }
        if(lanePosition==3){
            TextView Lane = (TextView)findViewById(R.id.txt_Lane);
            Lane.setText("Lane: ADC");
        }
        if(lanePosition==4){
            TextView Lane = (TextView)findViewById(R.id.txt_Lane);
            Lane.setText("Lane: Support");
        }
    }

    private void showMasteryText(int[] spellsArray){
        TextView Masteries = (TextView)findViewById(R.id.txt_Mastery);
        Masteries.setText(spellsArray[0] + "  " + spellsArray[1] + "  " + spellsArray[2]);
    }
    private void showMasteryImg(){
        ImageView img_masteries = (ImageView)findViewById(R.id.img_Mastery);
        img_masteries.setImageResource(R.mipmap.masteries);
    }

    private void showAbilityImg(int[] abilitiesArray ){
        ImageView img_ability = (ImageView)findViewById(R.id.img_Ability);
        img_ability.setImageResource(abilitiesArray[0]);
    }
}

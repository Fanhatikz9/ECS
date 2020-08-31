package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PageHuitActivity extends AppCompatActivity {

    Button button_last;

    String name,nombre,nombre_occupants,diagnostique,prenom,adresse,commune,type,capacite,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture,marque,modele, puissance, classe_energetique,
            etat_fonctionnement,equipement_anterieur, date_pose,mode_pose,quantite,nb_capteur,surface_capteur,emplacement,
            orientation,commentaire_pose_et_dimensionnement,etat_calorifuge, etat_support,etat_fixation,materiaux_canalisation,
            etat_canalisation,presence_calorifuge,type_support,materiaux_support,
            etancheite_raccords,presence_limiteur,presence_securite,presence_pression,peinture,etat_capteur,
            commentaire_installations_et_canalisation,temperature,temps,meteo,heure,avis,commentaire_page_six_deux,latitude,longitude;
    EditText action;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_huit);

        button_last=(Button)findViewById(R.id.button_lastt);
        action=(EditText)findViewById(R.id.action);

        String[] actions = getResources().getStringArray(R.array.actions);
        final AutoCompleteTextView zed = findViewById(R.id.action);
        ArrayAdapter<String> actionss = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, actions);  // ICI
        zed.setAdapter(actionss);


        name=getIntent().getExtras().getString("Name");
        prenom=getIntent().getExtras().getString("Prenom");
        adresse=getIntent().getExtras().getString("Adresse");
        commune=getIntent().getExtras().getString("Commune");
        diagnostique=getIntent().getExtras().getString("Diagnostique");
        nombre=getIntent().getExtras().getString("Nombre_equipement");

        partenaire=getIntent().getExtras().getString("Partenaire");
        non_conformite=getIntent().getExtras().getString("Non_conformite");
        attestation_honneur=getIntent().getExtras().getString("Attestation_honneur");
        prime=getIntent().getExtras().getString("Prime");
        devis=getIntent().getExtras().getString("Devis");
        attestation_fin_travaux=getIntent().getExtras().getString("Attestation_fin_travaux");
        facture=getIntent().getExtras().getString("Facture");

        marque=getIntent().getExtras().getString("Marque");
        modele=getIntent().getExtras().getString("Modele");
        type=getIntent().getExtras().getString("Type");
        nombre_occupants=getIntent().getExtras().getString("Nombre_occupants");
        capacite=getIntent().getExtras().getString("Capacite");
        classe_energetique=getIntent().getExtras().getString("Classe_energetique");
        etat_fonctionnement=getIntent().getExtras().getString("Etat_fonctionnement");
        equipement_anterieur=getIntent().getExtras().getString("Equipement_anterieur");

        etat_calorifuge=getIntent().getExtras().getString("Etat_calorifuge");
        etat_support=getIntent().getExtras().getString("Etat_support");
        etat_fixation=getIntent().getExtras().getString("Etat_fixation");
        materiaux_canalisation=getIntent().getExtras().getString("Materiaux_canalisation");
        etat_canalisation=getIntent().getExtras().getString("Etat_canalisation");
        presence_calorifuge=getIntent().getExtras().getString("Presence_calorifuge");
        type_support=getIntent().getExtras().getString("Type_support");
        materiaux_support=getIntent().getExtras().getString("Materiaux_support");

        date_pose=getIntent().getExtras().getString("Date_pose");
        mode_pose=getIntent().getExtras().getString("Mode_pose");
        quantite=getIntent().getExtras().getString("Quantite");
        nb_capteur=getIntent().getExtras().getString("Nb_capteur");
        surface_capteur=getIntent().getExtras().getString("Surface_capteur");
        emplacement=getIntent().getExtras().getString("Emplacement");
        orientation=getIntent().getExtras().getString("Orientation");
        commentaire_pose_et_dimensionnement=getIntent().getExtras().getString("Commentaire_pose_et_dimensionnement");

        etancheite_raccords=getIntent().getExtras().getString("Etancheite_raccords");
        presence_limiteur=getIntent().getExtras().getString("Presence_limiteur");
        presence_securite=getIntent().getExtras().getString("Presence_securite");
        presence_pression=getIntent().getExtras().getString("Presence_pression");
        peinture=getIntent().getExtras().getString("Peinture");
        etat_capteur=getIntent().getExtras().getString("Etat_capteur");
        commentaire_installations_et_canalisation=getIntent().getExtras().getString("Commentaire_installations_et_canalisation");

        temperature=getIntent().getExtras().getString("Temperature");
        temps=getIntent().getExtras().getString("Temps");
        meteo=getIntent().getExtras().getString("Meteo");
        heure=getIntent().getExtras().getString("Heure");
        avis=getIntent().getExtras().getString("Avis");
        commentaire_page_six_deux=getIntent().getExtras().getString("Commentaire_page_six_deux");
        latitude=getIntent().getExtras().getString("Latitude");
        longitude=getIntent().getExtras().getString("Longitude");


        button_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ContextCompat.checkSelfPermission(PageHuitActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(PageHuitActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
                }
                else
                {

                    try {

                        String actions1=action.getText().toString();



                        File file=new File("/sdcard/Download/");
                        file.mkdirs();

                        String csv="/sdcard/Download/ecs.csv";
                        CSVWriter csvWriter = new CSVWriter(new FileWriter(csv, true));

                        String row[]=new String[]{nombre,"","","",name,prenom,adresse,commune,diagnostique,partenaire,"","",non_conformite,"","",
                                attestation_honneur,devis,attestation_fin_travaux,facture,"",prime,"NON CONFORME",date_pose,marque,modele,"","","INDIVIDUEL",type
                                ,capacite,quantite,nombre_occupants,"QUOTIDIEN","OUI","BON",equipement_anterieur,"",mode_pose,nb_capteur,surface_capteur,
                                emplacement,orientation,"SATISFAISANTE",latitude,longitude,"BON","COR",commentaire_pose_et_dimensionnement,etat_capteur,materiaux_canalisation,
                                etat_canalisation,presence_calorifuge,etat_calorifuge,type_support,materiaux_support,etat_support,etat_fixation,
                                etancheite_raccords,presence_limiteur,presence_securite,presence_pression,peinture,commentaire_installations_et_canalisation,
                                temperature,temps,"NON",meteo,heure,"RAS",commentaire_page_six_deux,avis,"","","",actions1};
                        csvWriter.writeNext(row);
                        csvWriter.close();
                        Toast.makeText(PageHuitActivity.this, "Ok", Toast.LENGTH_LONG).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

                Intent e=new Intent(PageHuitActivity.this,MainActivity.class);
                startActivity(e);
                finish();
            }
        });

    }
}
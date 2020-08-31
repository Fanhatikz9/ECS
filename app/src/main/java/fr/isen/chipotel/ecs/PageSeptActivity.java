package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageSeptActivity extends AppCompatActivity {

    Button button_last;

    String name,nombre,nombre_occupants,diagnostique,prenom,adresse,commune,type,capacite,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture,marque,modele, puissance, classe_energetique,
            etat_fonctionnement,equipement_anterieur, date_pose,mode_pose,quantite,nb_capteur,surface_capteur,emplacement,
            orientation,commentaire_pose_et_dimensionnement,etat_calorifuge, etat_support,etat_fixation,materiaux_canalisation,
            etat_canalisation,presence_calorifuge,type_support,materiaux_support,
            etancheite_raccords,presence_limiteur,presence_securite,presence_pression,peinture,etat_capteur,
            commentaire_installations_et_canalisation,temp,tempss,met,heur,avi,comm,lat,lon;

    EditText temperature,temps,meteo,heure,avis,commentaire_page_six_deux,latitude,longitude;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_sept);

        button_last=(Button)findViewById(R.id.button_last);


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

        temperature=(EditText)findViewById(R.id.temperature);
        temps=(EditText)findViewById(R.id.temps);
        meteo=(EditText)findViewById(R.id.meteo);
        heure=(EditText)findViewById(R.id.heure);
        avis=(EditText)findViewById(R.id.avis);
        commentaire_page_six_deux=(EditText)findViewById(R.id.commentaire_page_six_deux);
        latitude=(EditText)findViewById(R.id.latitude);
        longitude=(EditText)findViewById(R.id.longitude);

        button_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f=new Intent(PageSeptActivity.this,PageHuitActivity.class);

                temp=temperature.getText().toString();
                tempss=temps.getText().toString();
                met=meteo.getText().toString();
                heur=heure.getText().toString();
                avi=avis.getText().toString();
                comm=commentaire_page_six_deux.getText().toString();
                lat=latitude.getText().toString();
                lon=longitude.getText().toString();

                f.putExtra("Name",name);
                f.putExtra("Prenom",prenom);
                f.putExtra("Adresse",adresse);
                f.putExtra("Commune",commune);
                f.putExtra("Diagnostique",diagnostique);
                f.putExtra("Nombre_equipement",nombre);
                f.putExtra("Partenaire",partenaire);
                f.putExtra("Non_conformite",non_conformite );
                f.putExtra("Attestation_honneur",attestation_honneur);
                f.putExtra("Prime",prime);
                f.putExtra("Devis",devis);
                f.putExtra("Attestation_fin_travaux",attestation_fin_travaux);
                f.putExtra("Facture",facture);
                f.putExtra("Marque",marque);
                f.putExtra("Modele",modele);
                f.putExtra("Type",type);
                f.putExtra("Nombre_occupants",nombre_occupants);
                f.putExtra("Puissance",puissance);
                f.putExtra("Classe_energetique",classe_energetique);
                f.putExtra("Etat_fonctionnement",etat_fonctionnement);
                f.putExtra("Equipement_anterieur",equipement_anterieur);
                f.putExtra("Date_pose",date_pose);
                f.putExtra("Mode_pose",mode_pose);
                f.putExtra("Quantite",quantite);
                f.putExtra("Nb_capteur",nb_capteur);
                f.putExtra("Surface_capteur",surface_capteur);
                f.putExtra("Emplacement",emplacement);
                f.putExtra("Orientation",orientation);
                f.putExtra("Commentaire_pose_et_dimensionnement",commentaire_pose_et_dimensionnement);
                f.putExtra("Etat_calorifuge",etat_calorifuge);
                f.putExtra("Etat_support",etat_support);
                f.putExtra("Etat_fixation",etat_fixation);
                f.putExtra("Materiaux_canalisation",materiaux_canalisation);
                f.putExtra("Etat_canalisation",etat_canalisation);
                f.putExtra("Presence_calorifuge",presence_calorifuge);
                f.putExtra("Type_support",type_support);
                f.putExtra("Materiaux_support",materiaux_support);
                f.putExtra("Etancheite_raccords",etancheite_raccords);
                f.putExtra("Presence_limiteur",presence_limiteur);
                f.putExtra("Presence_securite",presence_securite);
                f.putExtra("Presence_pression",presence_pression);
                f.putExtra("Peinture",peinture);
                f.putExtra("Etat_capteur",etat_capteur);
                f.putExtra("Commentaire_installations_et_canalisation",commentaire_installations_et_canalisation);
                f.putExtra("Temps",tempss);
                f.putExtra("Temperature",temp);
                f.putExtra("Meteo",met);
                f.putExtra("Avis",avi);
                f.putExtra("Heure",heur);
                f.putExtra("Commentaire_page_six_deux",comm);
                f.putExtra("Longitude",lon);
                f.putExtra("Latitude",lat);

                startActivity(f);
                finish();
            }
        });


    }
}
package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageCinqActivity extends AppCompatActivity {


    Button gotopage5;
    String name,nombre_occupants,nombre,diagnostique,prenom,adresse,commune,type,capacite,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture,marque,modele, puissance, classe_energetique, etat_fonctionnement,equipement_anterieur,
            date_pose,mode_pose,quantite,nb_capteur,surface_capteur,emplacement,orientation,commentaire_pose_et_dimensionnement;
    String etacal,sup,fix,matcan,etacan,precal,typsup,matsup;

    EditText etat_calorifuge,etat_support,etat_fixation,materiaux_canalisation,etat_canalisation,presence_calorifuge,type_support,materiaux_support;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_cinq);

        gotopage5=(Button)findViewById(R.id.gotopage5);



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

        date_pose=getIntent().getExtras().getString("Date_pose");
        mode_pose=getIntent().getExtras().getString("Mode_pose");
        quantite=getIntent().getExtras().getString("Quantite");
        nb_capteur=getIntent().getExtras().getString("Nb_capteur");
        surface_capteur=getIntent().getExtras().getString("Surface_capteur");
        emplacement=getIntent().getExtras().getString("Emplacement");
        orientation=getIntent().getExtras().getString("Orientation");
        commentaire_pose_et_dimensionnement=getIntent().getExtras().getString("Commentaire_pose_et_dimensionnement");

        etat_calorifuge=(EditText)findViewById(R.id.etat_calorifuge);
        etat_support=(EditText)findViewById(R.id.etat_support);
        etat_fixation=(EditText)findViewById(R.id.etat_fixation);
        materiaux_canalisation=(EditText)findViewById(R.id.materiaux_canalisation);
        etat_canalisation=(EditText)findViewById(R.id.etat_canalisation);
        presence_calorifuge=(EditText)findViewById(R.id.presence_calorifuge);
        type_support=(EditText)findViewById(R.id.type_support);
        materiaux_support=(EditText)findViewById(R.id.materiaux_support);

        gotopage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent(PageCinqActivity.this,PageSixActivity.class);

                etacal=etat_calorifuge.getText().toString();
                sup=etat_support.getText().toString();
                fix=etat_fixation.getText().toString();
                matcan=materiaux_canalisation.getText().toString();
                etacan=etat_canalisation.getText().toString();
                precal=presence_calorifuge.getText().toString();
                typsup=type_support.getText().toString();
                matsup=materiaux_support.getText().toString();

                e.putExtra("Name",name);
                e.putExtra("Prenom",prenom);
                e.putExtra("Adresse",adresse);
                e.putExtra("Commune",commune);
                e.putExtra("Diagnostique",diagnostique);
                e.putExtra("Nombre_equipement",nombre);
                e.putExtra("Partenaire",partenaire);
                e.putExtra("Non_conformite",non_conformite );
                e.putExtra("Attestation_honneur",attestation_honneur);
                e.putExtra("Prime",prime);
                e.putExtra("Devis",devis);
                e.putExtra("Attestation_fin_travaux",attestation_fin_travaux);
                e.putExtra("Facture",facture);
                e.putExtra("Marque",marque);
                e.putExtra("Modele",modele);
                e.putExtra("Type",type);
                e.putExtra("Nombre_occupants",nombre_occupants);
                e.putExtra("Puissance",puissance);
                e.putExtra("Classe_energetique",classe_energetique);
                e.putExtra("Etat_fonctionnement",etat_fonctionnement);
                e.putExtra("Equipement_anterieur",equipement_anterieur);
                e.putExtra("Date_pose",date_pose);
                e.putExtra("Mode_pose",mode_pose);
                e.putExtra("Quantite",quantite);
                e.putExtra("Nb_capteur",nb_capteur);
                e.putExtra("Surface_capteur",surface_capteur);
                e.putExtra("Emplacement",emplacement);
                e.putExtra("Orientation",orientation);
                e.putExtra("Commentaire_pose_et_dimensionnement",commentaire_pose_et_dimensionnement);
                e.putExtra("Etat_calorifuge",etacal);
                e.putExtra("Etat_support",sup);
                e.putExtra("Etat_fixation",fix);
                e.putExtra("Materiaux_canalisation",matcan);
                e.putExtra("Etat_canalisation",etacan);
                e.putExtra("Presence_calorifuge",precal);
                e.putExtra("Type_support",typsup);
                e.putExtra("Materiaux_support",matsup);

                startActivity(e);
                finish();
            }
        });


    }


}
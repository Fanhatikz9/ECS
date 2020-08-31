package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageSixActivity extends AppCompatActivity {

    Button gotopage7;
    String name,nombre_occupants,nombre,diagnostique,prenom,adresse,commune,type,capacite,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture,marque,modele, puissance, classe_energetique, etat_fonctionnement,equipement_anterieur,
            date_pose,mode_pose,quantite,nb_capteur,surface_capteur,emplacement,orientation,commentaire_pose_et_dimensionnement,etat_calorifuge,
            etat_support,etat_fixation,materiaux_canalisation,etat_canalisation,presence_calorifuge,type_support,materiaux_support;

    String etan,prelim,presecu,prepre,pein,etacap,com;

    EditText etancheite_raccords,presence_limiteur,presence_securite,presence_pression,peinture,etat_capteur,commentaire_installations_et_canalisation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_six);

        gotopage7=(Button)findViewById(R.id.gotopage7);



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

        etancheite_raccords=(EditText)findViewById(R.id.etancheite_raccords);
        presence_limiteur=(EditText)findViewById(R.id.presence_limiteur);
        presence_securite=(EditText)findViewById(R.id.presence_securite);
        presence_pression=(EditText)findViewById(R.id.presence_pression);
        peinture=(EditText)findViewById(R.id.peinture);
        etat_capteur=(EditText)findViewById(R.id.etat_capteur);
        commentaire_installations_et_canalisation=(EditText)findViewById(R.id.commentaire_installations_et_canalisation);

        gotopage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(PageSixActivity.this,PageSeptActivity.class);

                etan=etancheite_raccords.getText().toString();
                prelim=presence_limiteur.getText().toString();
                presecu=presence_securite.getText().toString();
                prepre=presence_pression.getText().toString();
                pein=peinture.getText().toString();
                etacap=etat_capteur.getText().toString();
                com=commentaire_installations_et_canalisation.getText().toString();

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
                f.putExtra("Etancheite_raccords",etan);
                f.putExtra("Presence_limiteur",prelim);
                f.putExtra("Presence_securite",presecu);
                f.putExtra("Presence_pression",prepre);
                f.putExtra("Peinture",pein);
                f.putExtra("Etat_capteur",etacap);
                f.putExtra("Commentaire_installations_et_canalisation",com);

                startActivity(f);
                finish();
            }
        });


    }


}
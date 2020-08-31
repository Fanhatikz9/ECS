package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class PageQuatreActivity extends AppCompatActivity {

    private static final String[] mode = new String[]{
            "SURIMPOSITION"  // ICI
    };
    private static final String[] emplacements = new String[]{
            "TOITURE INCLINEE"  // ICI
    };

    Button gotopage5;
    String name,nombre,diagnostique,prenom,adresse,commune,capacite,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture,marque,modele,type, nombre_occupants, classe_energetique,
            etat_fonctionnement,equipement_anterieur;
    String dat,mod,qua,nb,sur,emp,orien,com;

    EditText date_pose,mode_pose,quantite,nb_capteur,surface_capteur,emplacement,orientation,commentaire_pose_et_dimensionnement;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_quatre);

        String[] modes = getResources().getStringArray(R.array.modes);
        final AutoCompleteTextView six = findViewById(R.id.mode_pose);
        ArrayAdapter<String> modess = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, modes);
        six.setAdapter(modess);

        String[] emplacements = getResources().getStringArray(R.array.emplacements);
        final AutoCompleteTextView sept = findViewById(R.id.emplacement);
        ArrayAdapter<String> emplacementss = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, emplacements);
        sept.setAdapter(emplacementss);

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

        date_pose=(EditText)findViewById(R.id.date_pose);
        mode_pose=(EditText)findViewById(R.id.mode_pose);
        quantite=(EditText)findViewById(R.id.quantite);
        nb_capteur=(EditText)findViewById(R.id.nb_capteur);
        surface_capteur=(EditText)findViewById(R.id.surface_capteur);
        emplacement=(EditText)findViewById(R.id.emplacement);
        orientation=(EditText)findViewById(R.id.orientation);
        commentaire_pose_et_dimensionnement=(EditText)findViewById(R.id.commentaire_pose_et_dimensionnement);

        gotopage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(PageQuatreActivity.this,PageCinqActivity.class);

                dat=date_pose.getText().toString();
                mod=mode_pose.getText().toString();
                qua=quantite.getText().toString();
                nb=nb_capteur.getText().toString();
                sur=surface_capteur.getText().toString();
                emp=emplacement.getText().toString();
                orien=orientation.getText().toString();
                com=commentaire_pose_et_dimensionnement.getText().toString();

                d.putExtra("Name",name);
                d.putExtra("Prenom",prenom);
                d.putExtra("Adresse",adresse);
                d.putExtra("Commune",commune);
                d.putExtra("Diagnostique",diagnostique);
                d.putExtra("Nombre_equipement",nombre);
                d.putExtra("Partenaire",partenaire);
                d.putExtra("Non_conformite",non_conformite );
                d.putExtra("Attestation_honneur",attestation_honneur);
                d.putExtra("Prime",prime);
                d.putExtra("Devis",devis);
                d.putExtra("Attestation_fin_travaux",attestation_fin_travaux);
                d.putExtra("Facture",facture);
                d.putExtra("Marque",marque);
                d.putExtra("Modele",modele);
                d.putExtra("Type",type);
                d.putExtra("Nombre_occupants",nombre_occupants);
                d.putExtra("Classe_energetique",classe_energetique);
                d.putExtra("Etat_fonctionnement",etat_fonctionnement);
                d.putExtra("Equipement_anterieur",equipement_anterieur);
                d.putExtra("Date_pose",dat);
                d.putExtra("Mode_pose",mod);
                d.putExtra("Quantite",qua);
                d.putExtra("Nb_capteur",nb);
                d.putExtra("Surface_capteur",sur);
                d.putExtra("Emplacement",emp);
                d.putExtra("Orientation",orien);
                d.putExtra("Commentaire_pose_et_dimensionnement",com);

                startActivity(d);
                finish();
            }
        });


    }


}
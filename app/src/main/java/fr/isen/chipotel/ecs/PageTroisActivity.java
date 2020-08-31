package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class PageTroisActivity extends AppCompatActivity {

    private static final String[] types = new String[]{
            "THERMOSIPHON", "AUTOSTOCKEUR", "AUTRES"
    };

    private static final String[] marques = new String[]{
            "SYRIUS","CALPAK","SOLIMPERK"
    };
    private static final String[] models = new String[]{
            "TS ECO 202","THERMO-200-1","ALS2110","TS ECO 202", "ZELIOS CF 2"
    };
    private static final String[] fonctionnements = new String[]{
            "NON VERIFIE", "BON"
    };
    private static final String[] anterieurs = new String[]{
            "INCONNU", "AUCUN", "CHAUFFE EAU SOLAIRE", "CHAUFFE EAU ELECTRIQUE"
    };

    String name,diagnostique,prenom,adresse,commune,nombre,partenaire,non_conformite,attestation_honneur,
            prime,devis,attestation_fin_travaux,facture;
    String mar,mod,typ,nbr,capa,eta,equi;

    EditText marque, modele, type, nombre_occupants, capacite, etat_fonctionnement, equipement_anterieur;
    Button gotopage4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_trois);

        String[] types = getResources().getStringArray(R.array.types);
        String[] models = getResources().getStringArray(R.array.models);
        String[] marques = getResources().getStringArray(R.array.marques);
        String[] fonctionnements = getResources().getStringArray(R.array.fonctionnements);
        String[] anterieurs = getResources().getStringArray(R.array.anterieurs);

        AutoCompleteTextView un = findViewById(R.id.type);
        ArrayAdapter<String> typee = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, types);
        un.setAdapter(typee);

        AutoCompleteTextView deux = findViewById(R.id.modele);
        ArrayAdapter<String> modelee = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, models);
        deux.setAdapter(modelee);

        AutoCompleteTextView trois = findViewById(R.id.marque);
        ArrayAdapter<String> marquee = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, marques);
        trois.setAdapter(marquee);

        AutoCompleteTextView quatre = findViewById(R.id.etat_fonctionnement);
        ArrayAdapter<String> fonctionementss = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, fonctionnements);
        quatre.setAdapter(fonctionementss);

        AutoCompleteTextView cinq = findViewById(R.id.equipement_anterieur);
        ArrayAdapter<String> anterieurss = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, anterieurs);
        cinq.setAdapter(anterieurss);


        gotopage4=(Button)findViewById(R.id.gotopage4);

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


        marque=(EditText)findViewById(R.id.marque);
        modele=(EditText)findViewById(R.id.modele);
        type=(EditText)findViewById(R.id.type);
        capacite=(EditText)findViewById(R.id.capacite);
        nombre_occupants=(EditText)findViewById(R.id.nombre_occupants);
        etat_fonctionnement=(EditText)findViewById(R.id.etat_fonctionnement);
        equipement_anterieur=(EditText)findViewById(R.id.equipement_anterieur);

        gotopage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(PageTroisActivity.this,PageQuatreActivity.class);
                mar=marque.getText().toString();
                mod=modele.getText().toString();
                typ=type.getText().toString();
                capa=capacite.getText().toString();
                nbr=nombre_occupants.getText().toString();
                eta=etat_fonctionnement.getText().toString();
                equi=equipement_anterieur.getText().toString();

                c.putExtra("Name",name);
                c.putExtra("Prenom",prenom);
                c.putExtra("Adresse",adresse);
                c.putExtra("Commune",commune);
                c.putExtra("Diagnostique",diagnostique);
                c.putExtra("Nombre_equipement",nombre);
                c.putExtra("Partenaire",partenaire);
                c.putExtra("Non_conformite",non_conformite );
                c.putExtra("Attestation_honneur",attestation_honneur);
                c.putExtra("Prime",prime);
                c.putExtra("Devis",devis);
                c.putExtra("Attestation_fin_travaux",attestation_fin_travaux);
                c.putExtra("Facture",facture);
                c.putExtra("Marque",mar);
                c.putExtra("Modele",mod);
                c.putExtra("Type",typ);
                c.putExtra("Capacite",capa);
                c.putExtra("Nombre_occupants",nbr);
                c.putExtra("Etat_fonctionnement",eta);
                c.putExtra("Equipement_anterieur",equi);

                startActivity(c);
                finish();
            }
        });

    }

}



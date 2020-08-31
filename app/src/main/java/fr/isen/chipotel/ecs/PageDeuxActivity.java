package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class PageDeuxActivity extends AppCompatActivity {

    private static final String[] partenaires = new String[]{
            "SYRIUS ENERGIE GUADELOUPE", "ECO SOLEY", "PRO SOLEY, SOLARGREEN"  // ICI
    };

    String name,diagnostique,prenom,adresse,commune,nombre;
    String part,con,hon,pri,dev,tra,fac;

    EditText partenaire, non_conformite, attestation_honneur , prime, devis, attestation_fin_travaux, facture;
    Button gotopage3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_deux);

        String[] partenaires = getResources().getStringArray(R.array.partenaires);
        final AutoCompleteTextView huit = findViewById(R.id.partenaire);
        ArrayAdapter<String> partenairess = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, partenaires);  // ICI
        huit.setAdapter(partenairess);

        gotopage3=(Button)findViewById(R.id.gotopage3);

        name=getIntent().getExtras().getString("Name");
        prenom=getIntent().getExtras().getString("Prenom");
        adresse=getIntent().getExtras().getString("Adresse");
        commune=getIntent().getExtras().getString("Commune");
        diagnostique=getIntent().getExtras().getString("Diagnostique");
        nombre=getIntent().getExtras().getString("Nombre_equipement");

        partenaire=(EditText)findViewById(R.id.partenaire);
        non_conformite=(EditText)findViewById(R.id.non_conformite);
        attestation_honneur=(EditText)findViewById(R.id.attestation_honneur);
        prime=(EditText)findViewById(R.id.prime);
        devis=(EditText)findViewById(R.id.devis);
        attestation_fin_travaux=(EditText)findViewById(R.id.attestation_fin_travaux);
        facture=(EditText)findViewById(R.id.facture);

        gotopage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(PageDeuxActivity.this,PageTroisActivity.class);
                part=partenaire.getText().toString();
                con=non_conformite.getText().toString();
                hon=attestation_honneur.getText().toString();
                pri=prime.getText().toString();
                dev=devis.getText().toString();
                tra=attestation_fin_travaux.getText().toString();
                fac=facture.getText().toString();

                b.putExtra("Name",name);
                b.putExtra("Prenom",prenom);
                b.putExtra("Adresse",adresse);
                b.putExtra("Commune",commune);
                b.putExtra("Diagnostique",diagnostique);
                b.putExtra("Nombre_equipement",nombre);
                b.putExtra("Partenaire",part);
                b.putExtra("Non_conformite",con);
                b.putExtra("Attestation_honneur",hon);
                b.putExtra("Prime",pri);
                b.putExtra("Devis",dev);
                b.putExtra("Attestation_fin_travaux",tra);
                b.putExtra("Facture",fac);


                startActivity(b);
                finish();
            }
        });

    }
}
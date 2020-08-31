package fr.isen.chipotel.ecs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String[] communes = new String[]{
            "97122 BAIE MAHAULT"   // ICI
    };

    private static final String[] sitexs = new String[]{
            "RESIDENTIEL"   // ICI
    };

    Button btn;


    EditText name,prenom,adresse,commune,diagnostique,nombre;
    String st,dt,pre,adr,com,nom;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] communes = getResources().getStringArray(R.array.communes);
        String[] sitex = getResources().getStringArray(R.array.sitex);

        final AutoCompleteTextView huit = findViewById(R.id.Commune);
        ArrayAdapter<String> communess = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, communes);  // ICI
        huit.setAdapter(communess);

        final AutoCompleteTextView neuf = findViewById(R.id.diagnostique);
        ArrayAdapter<String> sitexs = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, sitex);  // ICI
        neuf.setAdapter(sitexs);

        btn = (Button)findViewById(R.id.gotopage2);


        name=(EditText)findViewById(R.id.name);
        prenom=(EditText)findViewById(R.id.prenom);
        commune=(EditText)findViewById(R.id.Commune);
        adresse=(EditText)findViewById(R.id.adresse);
        diagnostique=(EditText)findViewById(R.id.diagnostique);
        nombre=(EditText)findViewById(R.id.nombre_equipement);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,PageDeuxActivity.class);
                st=name.getText().toString();
                dt=diagnostique.getText().toString();
                pre=prenom.getText().toString();
                adr=adresse.getText().toString();
                com=commune.getText().toString();
                nom=nombre.getText().toString();
                i.putExtra("Name",st);
                i.putExtra("Diagnostique",dt);
                i.putExtra("Prenom",pre);
                i.putExtra("Commune",com);
                i.putExtra("Adresse",adr);
                i.putExtra("Nombre_equipement",nom);

                startActivity(i);
                finish();
            }
        });

    }
}
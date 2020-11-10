package id.ac.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView keterangan;
    Button buttonPindah;
    EditText editinputan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keterangan = findViewById(R.id.judul);
        buttonPindah = findViewById(R.id.button);
        editinputan = findViewById(R.id.edit);

        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editinputan.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Inputan Tidak boleh Kosong",Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setMessage("Yakin ingin pindah?");
                    builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            startActivity(intent);
                        }
                    });
                    builder.setNegativeButton("Tidak",null);
                    builder.show();
                }
            }
        });
    }

}
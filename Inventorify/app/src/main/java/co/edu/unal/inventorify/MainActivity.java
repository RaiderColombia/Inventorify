package co.edu.unal.inventorify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.edu.unal.inventorify.activities.product.NewProductActivity;
import co.edu.unal.inventorify.barcodes.ZXingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newProduct(View view){
        startActivity(new Intent(this, NewProductActivity.class));
    }
}

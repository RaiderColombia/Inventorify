package co.edu.unal.inventorify.activities.product;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import co.edu.unal.inventorify.R;
import co.edu.unal.inventorify.models.Product;

public class NewProductActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void saveProduct(View view){
        String productKey = mDatabase.child("products").push().getKey();
        String productName = ((EditText)findViewById(R.id.productNameEditText)).getText().toString();
        Log.d("INVENTORIFY_PRODUCT", "Pkey: "+productKey);
        Product product = new Product(productKey);
        product.setName(productName);
        mDatabase.child("products").child(productKey).setValue(product);
        Log.i("INVENTORIFY_PRODUCT", productName + " was inserted!");
    }
}

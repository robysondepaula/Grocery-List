package MobileAppsFinalProject.course.PROG3210.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import MobileAppsFinalProject.course.PROG3210.R;

public class DetailActivity extends AppCompatActivity {

    private TextView itemName, quantity, dateAdded;
    private int groceryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        onCreateIDs();
        setInformation();

    }

    public void onCreateIDs(){
        itemName = findViewById(R.id.itemNameDetail);
        quantity = findViewById(R.id.itemQtyDetail);
        dateAdded = findViewById(R.id.itemDateAddedDetail);
    }

    public void setInformation(){
        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            itemName.setText(bundle.getString("name"));
            quantity.setText(bundle.getString("quantity"));
            dateAdded.setText(bundle.getString("date"));
            groceryId = bundle.getInt("id");
        }

    }

}
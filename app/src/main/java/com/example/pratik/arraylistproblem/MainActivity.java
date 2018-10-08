package com.example.pratik.arraylistproblem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Description mDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadJSONUsingRetrofit();
    }

    private void loadJSONUsingRetrofit() {

        try {
            ApiInterface apiInterfaceHome = ApiClient.getApiClient().create(ApiInterface.class);
            Call<PlaceDetails> call = apiInterfaceHome.getDescriptions();
            call.enqueue(new Callback<PlaceDetails>() {
                @Override
                public void onResponse(Call<PlaceDetails> call, Response<PlaceDetails> response) {
                    generateData(response.body());

                }

                @Override
                public void onFailure(Call<PlaceDetails> call, Throwable t) {
                    // JsonReader.setLenient(true);
                    Log.d("Error", t.getMessage());
                    Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

                    //      Toast.makeText(HomeActivity.this, "Error Fetching Data!   ", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.activity_no_internet);
                    TextView button = findViewById(R.id.textView);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);

                        }
                    });
                }
            });

        } catch (Exception e) {
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
    private void generateData(PlaceDetails categoryLists) {


    }
}

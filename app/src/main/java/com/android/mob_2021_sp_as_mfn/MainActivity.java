package com.android.mob_2021_sp_as_mfn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String [] mTitle = {"HD Liquis Coverage Foundation","Shine last & go! gel nail polish 66 Rock Your Body","Lippenstift Super Stay Ink Crayon 105 ON THE GRIND",
            "Shimmer Bomb \"Glimmer\" Lip Gloss","Color Queen Oil Shadow 43 Positive", "Color Queen Oil Shadow 45 Reacher","Kaviar Gauche Highlighter C01",
            "Lash Couture LuXtension Wimpernband Strip 02","The Perfect Purse Pal Mini Multitask Brush Ornament","Prime Vegan Candy"};
    String [] mDescription = {"Catrice","essence","Maybelline New York","Makeup Revolution",
            "L’Oréal Paris", "L’Oréal Paris", "Catrice", "KISS","Real Techniques", "Luvia Cosmetics"};
    int [] images = {R.drawable.foto1, R.drawable.foto2, R.drawable.foto3,R.drawable.foto4,R.drawable.foto5, R.drawable.foto6,R.drawable.foto7,
            R.drawable.foto8, R.drawable.foto9, R.drawable.foto1};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);
        //now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        //set item Click on list view

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 6) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 7) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 8) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 9) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }

                if (position == 10) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String [] rTitle;
        String [] rDescription;
        int [] rImgs;

        MyAdapter(Context c, String [] title, String [] description, int [] imgs) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            //set our resource on view
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);



            return row;
        }
    }
}
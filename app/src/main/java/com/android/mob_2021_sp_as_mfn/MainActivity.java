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
            "Lash Couture LuXtension Wimpernband Strip 02","The Perfect Purse Pal Mini Multitask Brush Ornament","Prime Vegan Candy", "Foundation Even Better Make-up",
            "Lidschatten Rose Gold Eyeshadow Palette Nude Rose Gold", "Fixierspray Make Up Setting Spray Matte Finish/Long Lasting 01", "Nagellack 24 - in stitches",
            "Colorburst™ Matte Balm", "Volum' Express The Colossal 100% Black Mascara", "Make-up Flawless Finish Foundation Light Ivory" , "Make-up Flawless Finish Foundation Pearl",
            "Make-up Flawless Finish Foundation Vanilla", "Nagellack peak show 389", "Diorskin Forever Foundation 0N", "Diorskin Forever Foundation 015", "Diorskin Forever Foundation 022",
            "Diorskin Forever Foundation 030", "Diorskin Forever Foundation 4W0", "Super Lustrous™ Lipstick 828 - Carnival Spirit", "Super Lustrous™ Lipstick 450 - Gentlemen prefer pink",
            "Super Lustrous™ Lipstick 477 - Black Cherry", "La Manicure L’Huile Cuticle Care Nourishing Argan",
            "Superstay 24h Lippenstift Coffee 900 MOCHA MOVES"};
    String [] mDescription = {"Catrice","essence","Maybelline New York","Makeup Revolution",
            "L’Oréal Paris", "L’Oréal Paris", "Catrice", "KISS","Real Techniques", "Luvia Cosmetics", "Clinique", "e.l.f", "NYX", "essie", "Revlon", "Maybelline New York",
            "e.l.f", "e.l.f", "e.l.f", "essie", "Dior", "Dior", "Dior", "Dior", "Dior", "Revlon", "Revlon", "Revlon","L’Oréal Paris", "Maybelline New York" };
    int [] images = {R.drawable.foto1, R.drawable.foto2, R.drawable.foto3,R.drawable.foto4,R.drawable.foto5, R.drawable.foto6,R.drawable.foto7,
            R.drawable.foto8, R.drawable.foto9, R.drawable.foto10, R.drawable.foto11, R.drawable.foto12, R.drawable.foto13, R.drawable.foto14, R.drawable.foto15,
            R.drawable.foto16, R.drawable.foto17, R.drawable.foto18, R.drawable.foto19, R.drawable.foto20, R.drawable.foto21, R.drawable.foto22,
            R.drawable.foto23, R.drawable.foto24, R.drawable.foto25,
            R.drawable.foto26, R.drawable.foto27, R.drawable.foto28, R.drawable.foto29, R.drawable.foto30 };




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
                if (position == 11) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 12) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 13) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 14) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 15) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 16) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 17) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 18) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 19) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 20) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 21) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 22) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 23) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 24) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 25) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 26) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 27) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 28) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 29) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 30) {
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
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
            "Superstay 24h Lippenstift Coffee 900 MOCHA MOVES", "POP MATTE", "Colour Correcting Powder", "Lippenstifte Addict Lip Tattoo Nr. 831 Natural Brown", "BE LEGENDARY MATTE LIPSTICK",
            "Lidschattenpalette", "Grundierung / Primer Make-up 14ml", "Autumn Make-up Nagellack 13.5 ml", "Sommer Kollektion Make-up Nagellack 13.5 ml","Concealer Make-up 6.8 ml","Heaven's Hue Highlighter",
            "Make-up Bronzer 9g","Lippenstifte Gel 3er Set ULTRA HD KISS ME","BLUSHING BLUSH","Blush Duo","Puder Make-up 8g","Bronzer Make-up 8.7 g","Lipgloss Make-up 2.7 ml","Make-up Set", "Smudge Pot",
            "L.A. COVER SHOT ","with Superfruits Extract Dewy Blush Elixir", "Liquid Liner", "Gel Liner", "Multi Purpose Powder - Blush & Eye", "No Filter Foundation", "Serum Foundation", "#NOFILTER Finishing Powder",
            "Define & Refine Powder Foundation", "Slide On Lip Pencil", "Lippie Stix", "Lipstick", "Mascara", "Volumising Mascara", "Muse Mascara", "Fly With Me Mascara", "Propel My Eyes Mascara", "Big & Loud Lash Primer",
             "Double Stacked Mascara", "Moov Cosmetics St. Tropez Collection", "Anna Sui Nail Colour", "L'Oreal Infallible Nail Polish in Always a Lady", "Moov Cosmetics Caribbean Wedding Collection",
            "L'Oreal Infallible Nail Polish in Iconic Indigo ", "Misa Nail Laquer", "L'Oreal Infallible Nail Polish in Petale Revival", "Salon Perfect Nail Lacquer ",
            "Moov Cosmetics Home Grown Canuck Collection", 	"L'Oreal Infallible Nail … in Irresistible Bonbon", "All About Shadow&trade; Quad", "Clinique + Jonathan Adler: Lid Pop", "Holiday Diorshow Pump n' Volume Set",
            "Couture Colour Wardrobe palette", "rejuva minerals", 	"Tango With Bronzing Powder", "Illuminator", "Dark Circle Concealer", "hello flawless! powder foundation", 	"24 Hour CC Spot Concealer",
            "Camera Ready BB Cream Eyes SPF 15", "Revlon New Complexion One-Step Makeup"
    };
    String [] mDescription = {"Catrice","essence","Maybelline New York","Makeup Revolution",
            "L’Oréal Paris", "L’Oréal Paris", "Catrice", "KISS","Real Techniques", "Luvia Cosmetics", "Clinique", "e.l.f", "NYX", "essie", "Revlon", "Maybelline New York",
            "e.l.f", "e.l.f", "e.l.f", "essie", "Dior", "Dior", "Dior", "Dior", "Dior", "Revlon", "Revlon", "Revlon","L’Oréal Paris", "Maybelline New York", "CLINIQUE","Dr. Hauschka ",
            "DIOR","SMASHBOX","NYX COSMETICS","E.L.F.","ESSIE","ESSIE", "MAYBELLINE","STILA","SANTE","REVLON","CLINIQUE","Dr. Hauschka ","NYX COSMETICS","PHYSICIANS FORMULA","E.L.F.",
            "MAYBELLINE", "STILA","SMASHBOX", "PHYSICIANS FORMULA", "zorah biocosmetiques", "marienatie", "rejuva minerals", "colourpop", "deciem", "nyx", "nyx", "nyx", "colourpop", "boosh",
            "lotus cosmetics usa", "green people","c'est moi", "nyx", "nyx", "nyx", "nyx", "moov", "anna sui", "l'oreal", "moov", "l'oreal", "misa","l'oreal" , "salon perfect", 	"moov", "l'oreal", "clinique", "clinique", "dior", "dior",
            "rejuva minerals", "nyx", "nyx", "nyx","benefit",  "smashbox", 	"smashbox", "revlon"
    };
    int [] images = {R.drawable.foto1, R.drawable.foto2, R.drawable.foto3,R.drawable.foto4,R.drawable.foto5, R.drawable.foto6,R.drawable.foto7,
            R.drawable.foto8, R.drawable.foto9, R.drawable.foto10, R.drawable.foto11, R.drawable.foto12, R.drawable.foto13, R.drawable.foto14, R.drawable.foto15,
            R.drawable.foto16, R.drawable.foto17, R.drawable.foto18, R.drawable.foto19, R.drawable.foto20, R.drawable.foto21, R.drawable.foto22, R.drawable.foto23,
            R.drawable.foto24, R.drawable.foto25, R.drawable.foto26, R.drawable.foto27, R.drawable.foto28, R.drawable.foto29, R.drawable.foto30, R.drawable.foto31,
            R.drawable.foto32,R.drawable.foto33,R.drawable.foto34,R.drawable.foto35,R.drawable.foto36,R.drawable.foto37,R.drawable.foto38,R.drawable.foto39,R.drawable.foto40,
            R.drawable.foto41,R.drawable.foto42,R.drawable.foto43,R.drawable.foto44,R.drawable.foto45,R.drawable.foto46,R.drawable.foto47,R.drawable.foto48,R.drawable.foto49,
            R.drawable.foto50,R.drawable.foto51, R.drawable.foto52, R.drawable.foto53, R.drawable.foto54,R.drawable.foto55,R.drawable.foto56,R.drawable.foto57,R.drawable.foto58,
            R.drawable.foto59, R.drawable.foto60, R.drawable.foto61, R.drawable.foto62, R.drawable.foto63, R.drawable.foto64, R.drawable.foto65, R.drawable.foto66, R.drawable.foto67,
            R.drawable.foto68, R.drawable.foto69, R.drawable.foto70, R.drawable.foto71, R.drawable.foto72, R.drawable.foto73,R.drawable.foto74, R.drawable.foto75, R.drawable.foto76,
            R.drawable.foto77,R.drawable.foto78,R.drawable.foto79,R.drawable.foto80,R.drawable.foto81, R.drawable.foto82, R.drawable.foto83, R.drawable.foto84, R.drawable.foto85, R.drawable.foto86,
            R.drawable.foto87, R.drawable.foto88, R.drawable.foto89, R.drawable.foto90


    };




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

                if (position == 31) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 32) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 33) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 34) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 35) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 36) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 37) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 38) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 39) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 40) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 41) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 42) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 43) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 44) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 45) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 46) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 47) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 48) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 49) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 50) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 51) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 52) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 53) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 54) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 55) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 56) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 57) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 58) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 59) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 60) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 61) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 62) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 63) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 64) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 65) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 66) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 67) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 68) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 69) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 70) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 71) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 72) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 73) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 74) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 75) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 76) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 77) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 78) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 79) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 80) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 81) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 82) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 83) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 84) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 85) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 86) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 87) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 88) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 89) {
                    Toast.makeText(MainActivity.this, "Product Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 90) {
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
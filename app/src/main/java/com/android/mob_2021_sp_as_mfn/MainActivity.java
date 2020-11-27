package com.android.mob_2021_sp_as_mfn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
    String mTitle[] = {"Facebook", "Whatsapp", "Twitter", "Instagram", "YouTube", "Telegram", "Line", "TikTok", "SnapChat", "LinkedIn",  "Tumblr", "WeChat","Tinder"};
    String mDescription[] = {"Facebook Description","Whatsapp Description","Twitter Description","Instagram Description",
            "Youtube Description", "Telegram Description", "Line Description", "TikTok Description","SnapChat Description",
            "LinkedIn Description","Tumblr Description","WeChat Description","Tinder Description"};
    int images[] = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.twitter,R.drawable.instagram,R.drawable.youtube, R.drawable.telegram,R.drawable.line,
            R.drawable.tiktok, R.drawable.snapchat, R.drawable.linkedin,  R.drawable.tumblr, R.drawable.wechat, R.drawable.tinder};




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
                    Toast.makeText(MainActivity.this, "Facebook Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(MainActivity.this, "Whatsapp Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(MainActivity.this, "Twitter Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(MainActivity.this, "Instagram Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(MainActivity.this, "YouTube Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Toast.makeText(MainActivity.this, "Telegram Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 6) {
                    Toast.makeText(MainActivity.this, "Line Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 7) {
                    Toast.makeText(MainActivity.this, "TikTok Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 8) {
                    Toast.makeText(MainActivity.this, "SnapChat Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 9) {
                    Toast.makeText(MainActivity.this, "LinkedIn Description", Toast.LENGTH_SHORT).show();
                }

                if (position == 10) {
                    Toast.makeText(MainActivity.this, "Tumblr Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 11) {
                    Toast.makeText(MainActivity.this, "WeChat Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 12) {
                    Toast.makeText(MainActivity.this, "Tinder Description", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
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
            View row = layoutInflater.inflate(R.layout.row, parent, false);
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
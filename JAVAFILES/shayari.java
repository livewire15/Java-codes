package com.example.intel.shayari;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String a[] = {"Bewafa Shayari", "Birthday Shayari", "Diwali Shayari", "Dosti Shayari", "Funny Shayari", "Love Shayari", "Patriotic Shayari", "Sharabi Shayari", "Romantic Shayari", "Mohabbat Shayari", "Prem Shayari", "Pyaar Shayari", "Ishq Shayari", "Gham Shayari"};
    int images[]={R.drawable.bewafa,R.drawable.cake,R.drawable.diwali,R.drawable.dosti,R.drawable.funny,R.drawable.love,R.drawable.patriotic,R.drawable.sharabi,R.drawable.romantic,R.drawable.mohabbat,R.drawable.prem,R.drawable.pyaar,R.drawable.ishq,R.drawable.sad};
	//String icons []={"http://affinitymagazine.us/wp-content/uploads/2017/02/Get-Over-Heartbreak-Step-08.jpg","https://cdn.nexternal.com/wttc/images/bday_cake.jpg","http://www.hindugodwallpaper.com/images/gods/zoom/1850_crackers-wallpaper-03.jpg","https://www.iaspaper.net/wp-content/uploads/2017/01/Friendship.jpg","http://www.readersdigest.ca/wp-content/uploads/2016/05/make-us-laugh.png","https://upload.wikimedia.org/wikipedia/en/a/ae/Love_TV_Logo.png","https://previews.123rf.com/images/blueringmedia/blueringmedia1408/blueringmedia140800099/30437021-Illustration-of-a-brave-soldier-doing-a-hand-salute-on-a-white-background-Stock-Vector.jpg","https://www.maxim.com/.image/c_limit%2Ccs_srgb%2Cq_80%2Cw_960/MTQ2ODUxNjY1ODIyMDk4OTgw/two-pints-beer-main.jpg","https://images.r.cruisecritic.com/features/generic-stock/romantic-cruising1.jpg","http://d3sk73qjanf67d.cloudfront.net/wp-content/uploads/2017/02/06080011/summer-love.jpg","http://www.loveimagesdownload.com/wp-content/uploads/2016/08/wallpaper-of-love-768x480.jpg","http://webneel.com/daily/sites/default/files/images/daily/01-2014/3-love-photography.jpg","http://images2.fanpop.com/image/photos/9000000/LOVE-SMILE-love-9049931-1024-768.jpg","http://www.rd.com/wp-content/uploads/sites/2/2016/09/01_Silent_signs_seasonal_depression_disorder_SAD_good_zzs_yanyong.jpg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter();
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i) {
                            case 0:
                                startActivity(new Intent(MainActivity.this, bewafa.class));
                                break;
                            case 1:
                                startActivity(new Intent(MainActivity.this, birthday.class));
                                break;
                            case 2:
                                startActivity(new Intent(MainActivity.this, diwali.class));
                                break;
                            case 3:
                                startActivity(new Intent(MainActivity.this, dosti.class));
                                break;
                            case 4:
                                startActivity(new Intent(MainActivity.this, funny.class));
                                break;
                            case 5:
                                startActivity(new Intent(MainActivity.this, love.class));
                                break;
                            case 6:
                                startActivity(new Intent(MainActivity.this, patriotic.class));
                                break;
                            case 7:
                                startActivity(new Intent(MainActivity.this, sharabi.class));
                                break;
                            case 8:
                                startActivity(new Intent(MainActivity.this, romantic.class));
                                break;
                            case 9:
                                startActivity(new Intent(MainActivity.this, mohabbat.class));
                                break;
                            case 10:
                                startActivity(new Intent(MainActivity.this, prem.class));
                                break;
                            case 11:
                                startActivity(new Intent(MainActivity.this, pyaar.class));
                                break;
                            case 12:
                                startActivity(new Intent(MainActivity.this, ishq.class));
                                break;
                            case 13:
                                startActivity(new Intent(MainActivity.this, gham.class));
                                break;
                        }
                    }
                }
        );
    }

        public class CustomAdapter extends BaseAdapter
        {
            @Override
            public int getCount() {
                return a.length;
            }

            @Override
            public Object getItem(int i) {
                return i;
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int position, View view1, ViewGroup viewGroup) {
                LayoutInflater lf=getLayoutInflater();
                view1=lf.inflate(R.layout.view,null);
                TextView t1=(TextView)view1.findViewById(R.id.textview1);
                TextView t2=(TextView)view1.findViewById(R.id.textview2);
                ImageView i1=(ImageView)view1.findViewById(R.id.imgview);
                t1.setText(a[position]);
                i1.setImageResource(images[position]);
                return view1;

            }
        }

        }

		
		//XML
		<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.intel.shayari.MainActivity">

    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_alignParentLeft="true"
        android:background="@drawable/graphics"
        android:divider="@android:color/black"
        android:dividerHeight="2.0sp"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true" />
</RelativeLayout>







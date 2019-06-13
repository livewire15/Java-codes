//MainActivity
package com.example.intel.shayari;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.BaseAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String a[] = {"Bewafa Shayari", "Birthday Shayari", "Diwali Shayari", "Dosti Shayari", "Funny Shayari", "Love Shayari", "Patriotic Shayari", "Sharabi Shayari", "Romantic Shayari", "Mohabbat Shayari", "Prem Shayari", "Pyaar Shayari", "Ishq Shayari", "Gham Shayari"};
   int icons[]={R.drawable.bewafa,R.drawable.cake,R.drawable.diwali,R.drawable.dosti,R.drawable.funny,R.drawable.love,R.drawable.patriotic,R.drawable.sharabi,R.drawable.romantic,R.drawable.mohabbat,R.drawable.prem,R.drawable.pyaar,R.drawable.ishq,R.drawable.sad};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(a,icons,MainActivity.this);
        layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setHasFixedSize(true);
        recyclerview.setAdapter(adapter);
    }
}

        /*switch (i) {
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
*/

//RecyclerAdapter.java

package com.example.intel.shayari;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by intel on 29/07/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    String categories[];
    int icons[];
    Context c;

    //Constructor
    public RecyclerAdapter(String categories[],int icons[],Context c)
    {
        this.categories=categories;
        this.icons=icons;
        this.c=c;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view,parent,false);
        //New view is created and its contents are inflated from view.xml
        RecyclerViewHolder rvh=new RecyclerViewHolder(view);
        //new view is passed to view holder to store
        return rvh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        //set the content on particular views
        Picasso.with(c)
                .load(icons[position])
                .resize(100,75)
                .into(holder.i1);
        //holder.i1.setImageResource(icons[0]);
        holder.t1.setText(categories[position]);
    }

    @Override
    public int getItemCount() {
        return categories.length;

    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView i1;
        TextView t1;
        public RecyclerViewHolder(View v)
        {
            super(v);
            i1=(ImageView)v.findViewById(R.id.imgview);
            //Now image view and text view is extracted from the passed view that is created in onCreateViewHolder method
            t1=(TextView)v.findViewById(R.id.textview1);
        }
    }
}

//Activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.intel.shayari.MainActivity">

    <android.support.v7.widget.RecyclerView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/recycler_view"
        android:background="@drawable/graphics"
        android:scrollbars="vertical"
        />
</LinearLayout>

//View.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="horizontal"
    android:maxHeight="80dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <ImageView
        android:layout_width="100dp"
        android:layout_height="75dp"
        android:id="@+id/imgview"
        android:contentDescription="@string/img"
        android:src="@drawable/bewafa"
        tools:ignore="RtlHardcoded" />
    <LinearLayout
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:orientation="vertical"
        >
    <TextView
        android:layout_width="175dp"
        android:layout_height="wrap_content"
        android:id="@+id/textview1"
        android:text="@string/bewafa_shayari"
        android:gravity="center"
        android:layout_gravity="center"
        tools:ignore="RtlHardcoded" />

        </LinearLayout>

</LinearLayout>






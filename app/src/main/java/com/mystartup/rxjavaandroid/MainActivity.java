package com.mystartup.rxjavaandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text;
    private RecViewAdapter mRecViewAdapter;
    RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        mRecyclerView = findViewById(R.id.recycler_view);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecViewAdapter = new RecViewAdapter();
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mRecViewAdapter);
        text.setText("Hello");
        mRecViewAdapter.addStringsToAdapter("Awesome");
        mRecViewAdapter.addStringsToAdapter("Kraton");

         }
}
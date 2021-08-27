package com.dimsed.newsapps2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SportFragment extends Fragment {

    String api = "b097826510794082b964af8d709acf99";

    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country="us";
    private RecyclerView recyclerViewofsport;
    private String category="sport";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate( R.layout.sportfragment, null  );

        recyclerViewofsport=v.findViewById( R.id.recyclerviewsport );
        modelClassArrayList=new ArrayList<>();
        recyclerViewofsport.setLayoutManager( new LinearLayoutManager( getContext() ) );
        adapter = new Adapter( getContext(), modelClassArrayList );
        recyclerViewofsport.setAdapter( adapter );


        return v;
    }

    private void findnews() {

        ApiUtilities.getApiInterface().getCategoryNews( country,category,100,api ).enqueue( new Callback<mainNew>() {
            @Override
            public void onResponse(Call<mainNew> call, Response<mainNew> response) {
                if(response.isSuccessful()){
                    modelClassArrayList.addAll( response.body().getArticles() );
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<mainNew> call, Throwable t) {

            }
        } );

    }
}

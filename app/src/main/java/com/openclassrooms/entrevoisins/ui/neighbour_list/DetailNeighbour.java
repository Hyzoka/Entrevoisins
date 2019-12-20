package com.openclassrooms.entrevoisins.ui.neighbour_list;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;


import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailNeighbour extends AppCompatActivity{

    @BindView(R.id.neighbourPic) ImageView mNeighbourPic;
    @BindView(R.id.neighbourName) TextView mneighbourName;
    @BindView(R.id.neighbourDetailName) TextView mneighbourDetailName;
    @BindView(R.id.neighbourPlace) TextView mneighbourPlace;
    @BindView(R.id.neighbourPhone) TextView mneighbourPhone;
    @BindView(R.id.neighbourFacebook) TextView mneighbourFacebook;
    @BindView(R.id.Aboutme) TextView mneighbourAbout;

    Integer neighbourId;
    String neighbourName;
    String neighbourPicture;
    String neighbourAddress;
    String neighbourPhone;
    String neighbourFacebook;
    String neighbourAbout;
    NeighbourApiService mApiService;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neighbour_detail);
        ButterKnife.bind(this);
        mApiService = DI.getNeighbourApiService();

        FloatingActionButton favoritefab = findViewById(R.id.favoritefab);


        //on recupère les données
        Intent intent = getIntent();
        int neighbourId = intent.getIntExtra("neighbourId",-1);
        Neighbour neighbour = mApiService.getNeighbourById(neighbourId);

        neighbourId = neighbour.getId();
        neighbourName = neighbour.getName();
        neighbourPicture = neighbour.getAvatarUrl();
        neighbourAddress = neighbour.getAddress();
        neighbourPhone = neighbour.getPhone();
        neighbourFacebook = neighbour.getFacebook();
        neighbourAbout = neighbour.getAbout();

        setNeighbourDetail(neighbourName, neighbourPicture, neighbourName, neighbourAddress, neighbourPhone, neighbourFacebook, neighbourAbout);

        if (!mApiService.getNeighbourFavorit().contains(neighbour)) {
            favoritefab.setImageResource(R.drawable.ic_star_border_yellorange_24dp);
        } else {
            favoritefab.setImageResource(R.drawable.ic_star_yellorange_24dp);
        }

        favoritefab.setOnClickListener(view -> {
            if (!mApiService.getNeighbourFavorit().contains(neighbour)) {
                favoritefab.setImageResource(R.drawable.ic_star_yellorange_24dp);
                mApiService.addNeighbourFavorite(neighbour);

               Toast.makeText(this, getString(R.string.added_to_favorite_list, neighbour.getName()), Toast.LENGTH_SHORT).show();
            } else {
                favoritefab.setImageResource(R.drawable.ic_star_border_yellorange_24dp);
                mApiService.deleteNeighbourfavortie(neighbour);

                Toast.makeText(this, getString(R.string.removed_from_favorite_list,neighbour.getName()), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setNeighbourDetail(String neighbourName, String neighbourPic, String neighbourDetailName, String neighbourPlace, String neighbourPhone, String neighbourFacebook, String neighbourAbout){

        mneighbourName.setText(neighbourName);

        Glide.with(mNeighbourPic.getContext())
                .load(neighbourPic)
                .into(mNeighbourPic);

        mneighbourDetailName.setText(neighbourDetailName);

        mneighbourPlace.setText(neighbourPlace);

        mneighbourPhone.setText(neighbourPhone);

        mneighbourFacebook.setText("www.facebook.fr/" + neighbourFacebook);

        mneighbourAbout.setText(neighbourAbout);
        mneighbourAbout.setMovementMethod(new ScrollingMovementMethod());
    }
}

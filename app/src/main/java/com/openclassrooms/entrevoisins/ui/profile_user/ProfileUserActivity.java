package com.openclassrooms.entrevoisins.ui.profile_user;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;
import com.openclassrooms.entrevoisins.ui.neighbour_list.NeighbourFragment;

import butterknife.BindView;

public class ProfileUserActivity extends AppCompatActivity {


    @BindView(R.id.back)
    ImageView imageBack;
    @BindView(R.id.name_user)
    TextView nameUser;
    @BindView(R.id.user_photo)
    LinearLayout userPhoto;
    @BindView(R.id.favorite)
    Button favorite;
    @BindView(R.id.user_details)
    ConstraintLayout userDetails;
    @BindView(R.id.user_name2)
    TextView userName2;
    @BindView(R.id.user_adress)
    TextView userAdress;
    @BindView(R.id.user_calls)
    TextView userCalls;
    @BindView(R.id.user_facebook)
    TextView userFacebook;
    @BindView(R.id.user_description)
    TextView userDescription;

    private Neighbour neighbour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);
        neighbour = getIntent().getParcelableExtra(NeighbourFragment.USER_PROFILE);

        nameUser.setText(neighbour.getName());
        userName2.setText(neighbour.getName());
        userAdress.setText(neighbour.getAddress());
        userCalls.setText(neighbour.getTelephoneNumber());
        userFacebook.setText(neighbour.getFacebook());
        userDescription.setText(neighbour.getExplanatoryText());
    }
}

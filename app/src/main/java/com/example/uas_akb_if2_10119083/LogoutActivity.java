package com.example.uas_akb_if2_10119083;
/**
 * Nama : Rafsan Zen M
 * Kelas : IF2
 * NIM :10119083
 * Email : rafsan.10119083@mahasiswa.unikom.ac.id
 * **/
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;

public class LogoutActivity extends Fragment {
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    private Button logout;

    public LogoutActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_logout, container, false);
        logout = view.findViewById(R.id.btnLogout);
        auth = FirebaseAuth.getInstance();
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }

}

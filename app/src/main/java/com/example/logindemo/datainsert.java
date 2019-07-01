package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Member;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class datainsert extends AppCompatActivity {
EditText txtname,txtrollno,txtfaculty,txtsemester;
Button btnsave;
DatabaseReference reff;
Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datainsert);
        txtname=(EditText)findViewById(R.id.txtname);
        txtrollno=(EditText)findViewById(R.id.txtrollno);
        txtfaculty=(EditText)findViewById(R.id.txtfaculty);
        txtsemester=(EditText)findViewById(R.id.txtsemester);
        btnsave=(Button)findViewById(R.id.inbtn);
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rn=Integer.parseInt(txtrollno.getText().toString().trim());
                int sem=Integer.parseInt(txtsemester.getText().toString().trim());
                member.setName(txtname.getText().toString().trim());
                member.setRollno(rn);
                member.setFaculty(txtfaculty.getText().toString().trim());
                member.setSemester(sem);
                reff.push().setValue(member);
                Toast.makeText(datainsert.this, "Data inserted successfully", Toast.LENGTH_LONG).show();

            }
        });
    }
}

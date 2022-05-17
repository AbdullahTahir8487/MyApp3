package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double costperTicket=80.0;
    double totalcost;
    int numTickets;
    String groupchoice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets = (EditText)findViewById(R.id.Ticket);
        final Spinner group=(Spinner)findViewById(R.id.txtGroup);
        Button cost  = (Button)findViewById(R.id.btnCost);
        final TextView result =(TextView)findViewById(R.id.displayTicket);
     cost.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {


             numTickets=Integer.parseInt(tickets.getText().toString());
             totalcost=costperTicket*numTickets;
             DecimalFormat currency=new DecimalFormat("$###,###.###");

            groupchoice=group.getSelectedItem().toString();

             result.setText("The Cost is "+groupchoice+ " is "+currency.format(totalcost) );
         }
     });


    }

}
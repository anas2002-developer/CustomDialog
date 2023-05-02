package com.anas.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlaceOrder=findViewById(R.id.btnPlaceOrder);

        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog_order=new Dialog(MainActivity.this);
                dialog_order.setContentView(R.layout.order_dialog);
                dialog_order.setCancelable(false);

                Button btnOkay=dialog_order.findViewById(R.id.btnOkay);

                btnOkay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,"Okay Clicked",Toast.LENGTH_SHORT).show();
                        dialog_order.dismiss();
                    }
                });
                dialog_order.show();
            }
        });
    }
}
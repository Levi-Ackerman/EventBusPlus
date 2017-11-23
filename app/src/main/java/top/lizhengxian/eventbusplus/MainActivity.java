package top.lizhengxian.eventbusplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {
    private Button mPrintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPrintButton = findViewById(R.id.btn);
        mPrintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post("Hello EventBusPlus!");
            }
        });
        EventBus.getDefault().register(this);
    }

    @Subscribe
    public void printMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Subscribe
    public void printMessage2(String message){

    }

    @Subscribe
    public void printMes(Object o){

    }
}

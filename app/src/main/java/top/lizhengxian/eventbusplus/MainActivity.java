package top.lizhengxian.eventbusplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
                EventBus.getDefault().post(1,"Hello EventBusPlus!");
//                EventBus.getDefault().post(2,"Hello EventBusPlus2!");
                EventBus.getDefault().post("Hello EventBusPlus!3");
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().register(MainActivity.this);
            }
        });
    }

    @Subscribe(id = 1)
    public void printMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.e("lee..",message);
    }

    @Subscribe(id = 2)
    public void printMessage2(String message){
        Log.e("lee..",message);

    }

    @Subscribe()
    public void printMes(Object o){
        Log.e("lee..",o.toString());
    }
}

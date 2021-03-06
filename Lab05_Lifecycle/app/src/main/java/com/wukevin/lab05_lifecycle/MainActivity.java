package com.wukevin.lab05_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView OnCreate;
    TextView OnStart;
    TextView OnResume;
    TextView OnPause;
    TextView OnStop;
    TextView OnRestart;
    TextView OnDestroy;

    Button ResetButton;

    TextView OnCreateTemp;
    TextView OnStartTemp;
    TextView OnResumeTemp;
    TextView OnPauseTemp;
    TextView OnStopTemp;
    TextView OnRestartTemp;
    TextView OnDestroyTemp;

    SharedPreferences prefObj;
    SharedPreferences.Editor prefEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefObj = getApplicationContext().getSharedPreferences("LifecycleAppPref", 0);
        prefEditor = prefObj.edit();

        OnCreate = findViewById(R.id.oncreate);
        OnStart = findViewById(R.id.onstart);
        OnResume = findViewById(R.id.onresume);
        OnPause = findViewById(R.id.onpause);
        OnStop = findViewById(R.id.onstop);
        OnRestart = findViewById(R.id.onrestart);
        OnDestroy = findViewById(R.id.ondestroy);
        OnCreateTemp = findViewById(R.id.oncreatetemp);
        OnStartTemp = findViewById(R.id.onstarttemp);
        OnResumeTemp = findViewById(R.id.onresumetemp);
        OnPauseTemp = findViewById(R.id.onpausetemp);
        OnStopTemp = findViewById(R.id.onstoptemp);
        OnRestartTemp = findViewById(R.id.onrestarttemp);
        OnDestroyTemp = findViewById(R.id.ondestroytemp);

        ResetButton = findViewById(R.id.ResetButton);
        String temp = prefObj.getString("onstart", null);
        if(temp != null)
        {
            String tempText = "onStart(): " + temp;
            OnStart.setText(tempText);
        }
        temp = prefObj.getString("oncreate", null);
        if(temp != null)
        {
            String tempText = "onCreate(): " + temp;
            OnCreate.setText(tempText);
        }
        temp = prefObj.getString("onresume", null);
        if(temp != null)
        {
            String tempText = "onResume(): " + temp;
            OnResume.setText(tempText);
        }
        temp = prefObj.getString("onpause", null);
        if(temp != null)
        {
            String tempText = "onPause(): " + temp;
            OnPause.setText(tempText);
        }
        temp = prefObj.getString("onstop", null);
        if(temp != null)
        {
            String tempText = "onStop(): " + temp;
            OnStop.setText(tempText);
        }
        temp = prefObj.getString("onrestart", null);
        if(temp != null)
        {
            String tempText = "onRestart(): " + temp;
            OnRestart.setText(tempText);
        }
        temp = prefObj.getString("ondestroy", null);
        if(temp != null)
        {
            String tempText = "onDestroy(): " + temp;
            OnDestroy.setText(tempText);
        }
        String yesString = OnCreate.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onCreate(): " + newNumber + "";
        OnCreate.setText(tempText);
        yesString = OnCreateTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onCreate(): " + newNumber + "";
        OnCreateTemp.setText(tempText);

        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnStart.setText("onStart(): 0");
                OnCreate.setText("onCreate(): 0");
                OnDestroy.setText("onDestroy(): 0");
                OnResume.setText("onResume(): 0");
                OnRestart.setText("onRestart(): 0");
                OnPause.setText("onPause(): 0");
                OnStop.setText("onStop(): 0");
                OnStartTemp.setText("onStart(): 0");
                OnCreateTemp.setText("onCreate(): 0");
                OnDestroyTemp.setText("onDestroy(): 0");
                OnResumeTemp.setText("onResume(): 0");
                OnRestartTemp.setText("onRestart(): 0");
                OnPauseTemp.setText("onPause(): 0");
                OnStopTemp.setText("onStop(): 0");

                prefEditor.putString("onstart", OnStart.getText().toString().split(" ")[1]);
                prefEditor.putString("oncreate", OnCreate.getText().toString().split(" ")[1]);
                prefEditor.putString("onresume", OnResume.getText().toString().split(" ")[1]);
                prefEditor.putString("onpause", OnPause.getText().toString().split(" ")[1]);
                prefEditor.putString("onstop", OnStop.getText().toString().split(" ")[1]);
                prefEditor.putString("onrestart", OnRestart.getText().toString().split(" ")[1]);
                prefEditor.putString("ondestroy", OnDestroy.getText().toString().split(" ")[1]);
                prefEditor.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        String yesString = OnStart.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onStart(): " + newNumber + "";
        OnStart.setText(tempText);
        yesString = OnStartTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onStart(): " + newNumber + "";
        OnStartTemp.setText(tempText);
        super.onStart();
    }

    @Override
    protected void onResume() {
        String yesString = OnResume.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onResume(): " + newNumber + "";
        OnResume.setText(tempText);
        yesString = OnResumeTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onResume(): " + newNumber + "";
        OnResumeTemp.setText(tempText);
        super.onResume();
    }

    @Override
    protected void onPause() {
        String yesString = OnPause.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onPause(): " + newNumber + "";
        OnPause.setText(tempText);
        yesString = OnPauseTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onPause(): " + newNumber + "";
        OnPauseTemp.setText(tempText);
        prefEditor.putString("onstart", OnStart.getText().toString().split(" ")[1]);
        prefEditor.putString("oncreate", OnCreate.getText().toString().split(" ")[1]);
        prefEditor.putString("onresume", OnResume.getText().toString().split(" ")[1]);
        prefEditor.putString("onpause", OnPause.getText().toString().split(" ")[1]);
        prefEditor.putString("onstop", OnStop.getText().toString().split(" ")[1]);
        prefEditor.putString("onrestart", OnRestart.getText().toString().split(" ")[1]);
        prefEditor.putString("ondestroy", OnDestroy.getText().toString().split(" ")[1]);
        prefEditor.commit();
        super.onPause();
    }

    @Override
    protected void onStop() {
        String yesString = OnStop.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onStop(): " + newNumber + "";
        OnStop.setText(tempText);
        yesString = OnStopTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onStop(): " + newNumber + "";
        OnStopTemp.setText(tempText);
        prefEditor.putString("onstart", OnStart.getText().toString().split(" ")[1]);
        prefEditor.putString("oncreate", OnCreate.getText().toString().split(" ")[1]);
        prefEditor.putString("onresume", OnResume.getText().toString().split(" ")[1]);
        prefEditor.putString("onpause", OnPause.getText().toString().split(" ")[1]);
        prefEditor.putString("onstop", OnStop.getText().toString().split(" ")[1]);
        prefEditor.putString("onrestart", OnRestart.getText().toString().split(" ")[1]);
        prefEditor.putString("ondestroy", OnDestroy.getText().toString().split(" ")[1]);
        prefEditor.commit();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        String yesString = OnRestart.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onRestart(): " + newNumber + "";
        OnRestart.setText(tempText);
        yesString = OnRestartTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onRestart(): " + newNumber + "";
        OnRestartTemp.setText(tempText);
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        String yesString = OnDestroy.getText().toString().split(" ")[1];
        int newNumber = Integer.parseInt(yesString) + 1;
        String tempText = "onDestroy() " + newNumber + "";
        OnDestroy.setText(tempText);
        yesString = OnDestroyTemp.getText().toString().split(" ")[1];
        newNumber = Integer.parseInt(yesString) + 1;
        tempText = "onDestroy() " + newNumber + "";
        OnDestroyTemp.setText(tempText);
        prefEditor.putString("onstart", OnStart.getText().toString().split(" ")[1]);
        prefEditor.putString("oncreate", OnCreate.getText().toString().split(" ")[1]);
        prefEditor.putString("onresume", OnResume.getText().toString().split(" ")[1]);
        prefEditor.putString("onpause", OnPause.getText().toString().split(" ")[1]);
        prefEditor.putString("onstop", OnStop.getText().toString().split(" ")[1]);
        prefEditor.putString("onrestart", OnRestart.getText().toString().split(" ")[1]);
        prefEditor.putString("ondestroy", OnDestroy.getText().toString().split(" ")[1]);
        prefEditor.commit();
        super.onDestroy();
    }
}

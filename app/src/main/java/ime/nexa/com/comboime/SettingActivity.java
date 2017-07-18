package ime.nexa.com.comboime;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {


    private Button btn1;
    private Button btn2;
    private Context m_Context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSkin(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetSkin(2);
            }
        });

        m_Context = this;
    }

    private void SetSkin(int index){
        SharedPreferences sp =m_Context.getSharedPreferences("SP",MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();
        Log.d("suntabu",index + "     ---> ");
        editor.putInt("SkinSet",index);
        editor.commit();
        Log.d("suntabu",sp.getInt("SkinSet",1) + "     <--- ");


//        Intent i = getBaseContext().getPackageManager()
//                .getLaunchIntentForPackage(getBaseContext().getPackageName());
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(i);
    }

}

package com.mehdi.tiktokbooster;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(15, 15, 20));

        TextView title = new TextView(this);
        title.setText("TikTok Booster X");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView info = new TextView(this);
        info.setText("أدوات تساعدك على تطوير حسابك");
        info.setTextColor(Color.LTGRAY);
        info.setTextSize(18);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, 30, 0, 30);

        Button hashtags = new Button(this);
        hashtags.setText("اقتراح هاشتاغات");

        Button ideas = new Button(this);
        ideas.setText("أفكار فيديوهات");

        Button stats = new Button(this);
        stats.setText("إحصائيات الحساب");

        layout.addView(title);
        layout.addView(info);
        layout.addView(hashtags);
        layout.addView(ideas);
        layout.addView(stats);

        setContentView(layout);
    }
          }

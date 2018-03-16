package com.example.xinhao_han.xh_line;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xhcharlib.XHData;
import com.example.xhcharlib.XHLineChar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private XHLineChar xhLineChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xhLineChar = findViewById(R.id.xhchar);
        xhLineChar.setMaxTable(10.5f);
        xhLineChar.setMinTable(1.0f);

        ArrayList<XHData> xhData = new ArrayList<>();

        /*xhData.add(new XHData(20,0));
        xhData.add(new XHData(50,80));
        xhData.add(new XHData(60,30));
        xhData.add(new XHData(80,26));
        xhData.add(new XHData(17,26));
        xhData.add(new XHData(80,65));
        xhData.add(new XHData(26,74));
        xhData.add(new XHData(20,86));*/


        xhData.add(new XHData(true,5.6f,"2018/12-12"));
        xhData.add(new XHData(true,9.5f,"2018/12-12"));
        xhData.add(new XHData(true,8.5f,"2018/12-12"));
        xhData.add(new XHData(true,10.5f,"2018/12-12"));
        xhData.add(new XHData(true,7.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,8.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,1.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,3.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,7.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,5.5f,"2018/12/15"));
        xhData.add(new XHData(true,3.6f,"2018/12/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,1.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,3.5f,"2018/3/15"));
        xhData.add(new XHData(true,8.5f,"2018/3/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/12-12"));
        xhData.add(new XHData(true,9.5f,"2018/12-12"));
        xhData.add(new XHData(true,8.5f,"2018/12-12"));
        xhData.add(new XHData(true,10.5f,"2018/12-12"));
        xhData.add(new XHData(true,7.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,8.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,1.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,3.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,7.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,5.5f,"2018/12/15"));
        xhData.add(new XHData(true,3.6f,"2018/12/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,1.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,3.5f,"2018/3/15"));
        xhData.add(new XHData(true,8.5f,"2018/3/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/12-12"));
        xhData.add(new XHData(true,9.5f,"2018/12-12"));
        xhData.add(new XHData(true,8.5f,"2018/12-12"));
        xhData.add(new XHData(true,10.5f,"2018/12-12"));
        xhData.add(new XHData(true,7.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,8.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,1.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,3.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,7.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,5.5f,"2018/12/15"));
        xhData.add(new XHData(true,3.6f,"2018/12/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,1.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,3.5f,"2018/3/15"));
        xhData.add(new XHData(true,8.5f,"2018/3/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/12-12"));
        xhData.add(new XHData(true,9.5f,"2018/12-12"));
        xhData.add(new XHData(true,8.5f,"2018/12-12"));
        xhData.add(new XHData(true,10.5f,"2018/12-12"));
        xhData.add(new XHData(true,7.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,8.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,1.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,3.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,7.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,5.5f,"2018/12/15"));
        xhData.add(new XHData(true,3.6f,"2018/12/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,1.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,3.5f,"2018/3/15"));
        xhData.add(new XHData(true,8.5f,"2018/3/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/12-12"));
        xhData.add(new XHData(true,9.5f,"2018/12-12"));
        xhData.add(new XHData(true,8.5f,"2018/12-12"));
        xhData.add(new XHData(true,10.5f,"2018/12-12"));
        xhData.add(new XHData(true,7.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12"));
        xhData.add(new XHData(true,6.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,8.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,1.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,3.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,7.5f,"2018/12-12/15"));
        xhData.add(new XHData(true,5.5f,"2018/12/15"));
        xhData.add(new XHData(true,3.6f,"2018/12/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,1.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
        xhData.add(new XHData(true,3.5f,"2018/3/15"));
        xhData.add(new XHData(true,8.5f,"2018/3/15"));
        xhData.add(new XHData(true,6.5f,"2018/3/15"));
        xhData.add(new XHData(true,7.5f,"2018/3/15"));
       /* xhData.add(new XHData(true,10.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));
        xhData.add(new XHData(true,70.5f,"2018/3/15"));
        xhData.add(new XHData(true,200.5f,"2018/3/15"));
        xhData.add(new XHData(true,180.5f,"2018/3/15"));
        xhData.add(new XHData(true,160.5f,"2018/3/15"));
        xhData.add(new XHData(true,140.5f,"2018/3/15"));
        xhData.add(new XHData(true,190.5f,"2018/3/15"));
        xhData.add(new XHData(true,10.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));
        xhData.add(new XHData(true,70.5f,"2018/3/15"));
        xhData.add(new XHData(true,200.5f,"2018/3/15"));
        xhData.add(new XHData(true,180.5f,"2018/3/15"));
        xhData.add(new XHData(true,160.5f,"2018/3/15"));
        xhData.add(new XHData(true,140.5f,"2018/3/15"));
        xhData.add(new XHData(true,190.5f,"2018/3/15"));
        xhData.add(new XHData(true,10.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));
        xhData.add(new XHData(true,70.5f,"2018/3/15"));
        xhData.add(new XHData(true,200.5f,"2018/3/15"));
        xhData.add(new XHData(true,180.5f,"2018/3/15"));
        xhData.add(new XHData(true,160.5f,"2018/3/15"));
        xhData.add(new XHData(true,140.5f,"2018/3/15"));
        xhData.add(new XHData(true,190.5f,"2018/3/15"));
        xhData.add(new XHData(true,10.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));
        xhData.add(new XHData(true,70.5f,"2018/3/15"));
        xhData.add(new XHData(true,200.5f,"2018/3/15"));
        xhData.add(new XHData(true,180.5f,"2018/3/15"));
        xhData.add(new XHData(true,160.5f,"2018/3/15"));
        xhData.add(new XHData(true,140.5f,"2018/3/15"));
        xhData.add(new XHData(true,190.5f,"2018/3/15"));
        xhData.add(new XHData(true,10.5f,"2018/3/15"));
        xhData.add(new XHData(true,30.5f,"2018/3/15"));
        xhData.add(new XHData(true,12.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.5f,"2018/3/15"));
        xhData.add(new XHData(true,5.6f,"2018/3/15"));
        xhData.add(new XHData(true,80.5f,"2018/3/15"));*/




        xhLineChar.setLineHOrLineW(2.0f,10.0f);
        xhLineChar.setDataArray(xhData);
    }
}

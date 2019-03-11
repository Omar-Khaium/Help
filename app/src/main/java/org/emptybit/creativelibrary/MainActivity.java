package org.emptybit.creativelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.emptybit.help.Format;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String address = AddressForMap("asdasd asdasd asdasd, 45646 asd" +
                "asdasdasd13 121");
        address.trim();
    }

    public static String AddressForMap(String address) {
        String mapAddress = "";
        mapAddress = address.replace(" ","+");
        mapAddress = address.replace("\n",",");
        mapAddress = address.replace("\r"," ");
        return address.replace(" ","+").replace("\n",",").replace("\r"," ");
    }
}

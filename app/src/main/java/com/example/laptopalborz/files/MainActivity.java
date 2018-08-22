package com.example.laptopalborz.files;

import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

    }

    @Override
    protected void onResume() {
        super.onResume();
        creatFolders();

    }

    public void makeFolder(View view) throws IOException {

            Calendar calendar = getDateFromString("2018-07-3 17:28:13");
        Toast.makeText(MainActivity.this,calendar.getTime()+ " " , Toast.LENGTH_SHORT).show();

//        File file = Environment.getExternalStorageDirectory();
//        File h = new File(file,"monshi");

//        if (!h.exists()) {
//            h.mkdir();
//            Toast.makeText(MainActivity.this, "sakhte shod", Toast.LENGTH_SHORT).show();
//
//        }else {
//            Toast.makeText(MainActivity.this, "in poshe qablan sakhte shode", Toast.LENGTH_SHORT).show();
//        }
//        File insidemosnhi = new File(h,"images");
//        File imageinside = new File(insidemosnhi,"image.jpg");
//        if (imageinside.createNewFile()) {
//            Toast.makeText(MainActivity.this, "sakhte shod", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(MainActivity.this, "khata dar sakht", Toast.LENGTH_SHORT).show();
//
//        }

//
//        File file = Environment.getExternalStorageDirectory();  // dastresi be hafeze dakheli
//        String secStore = System.getenv("SECONDARY_STORAGE");  // dastresi be sd card
//        String extStore = System.getenv("EXTERNAL_STORAGE");  // dastresi be hafeze dakheli ba string
//        // File file =  Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS); //sakhte yek file toye directorye be khosos
//        File file1 = new File(secStore, "Test");    //dastresi be poshe khas az hafeze dakheli
//        File file2 = new File(file1,"jingoismm");
//       // File file3 = new File(Environment.getExternalStorageDirectory()+"/mamad/masud","ahmad");
//       // dorost kardan chandta subfolder

//
//        if (file2.mkdirs()) {
//            Toast.makeText(MainActivity.this, "file is mde", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(MainActivity.this, "khata dar sakhte file", Toast.LENGTH_SHORT).show();
//        }



    }


    public Calendar getDateFromString(String timestamp) {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-M-d hh:mm");
        Calendar calendar = Calendar.getInstance() ;

        try {
            Date date = fmt.parse(timestamp);
            calendar.setTime(date);
        }
        catch(ParseException pe) {
        }
        return calendar;
    }

    public void makeTextFile(View view) throws IOException {

        File file1 = new File(Environment.getExternalStorageDirectory() + "/saiid", "hamid.txt");
        if (file1.createNewFile()) {
            Toast.makeText(MainActivity.this, "file is mde", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "khata dar sakhte file", Toast.LENGTH_SHORT).show();
        }
    }

    public void ListOfFiles(View view) {
        File file = Environment.getExternalStorageDirectory();
        String [] files = file.list();
       
        StringBuffer allFiles = new StringBuffer() ;
        for(String singlefile : files) {
            allFiles.append(singlefile+"\n");
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage(allFiles.toString());
        alert.show();


    }

    public void creatFolders() {
        File mainfoldrs = new File(Environment.getExternalStorageDirectory(),"Telegram");
        File images = new File(mainfoldrs,"Images");
        File autdios = new File(mainfoldrs,"Auidos");
        File videos = new File(mainfoldrs,"Videos");
        File doucmnets = new File(mainfoldrs,"Documnets");

        if (!mainfoldrs.exists()) {
            mainfoldrs.mkdir();
        }
        if (!images.exists()) {
            images.mkdir();
        }
        if (!autdios.exists()) {
            autdios.mkdir();
        }
        if (!videos.exists()) {
            videos.mkdir();
        }
        if (!doucmnets.exists()) {
            doucmnets.mkdir();
        }
    }

    public void telegramLike(View view) {
        File mainfoldrs = new File(Environment.getExternalStorageDirectory(),"Telegram");
        File images = new File(mainfoldrs,"Images");
        File autdios = new File(mainfoldrs,"Auidos");
        File videos = new File(mainfoldrs,"Videos");
        File doucmnets = new File(mainfoldrs,"Documnets");

        if (!mainfoldrs.exists()) {
            mainfoldrs.mkdir();
        }
        if (!images.exists()) {
            images.mkdir();
        }
          if (!autdios.exists()) {
              autdios.mkdir();
          }
          if (!videos.exists()) {
              videos.mkdir();
          }
        if (!doucmnets.exists()) {
            doucmnets.mkdir();
        }


        }


}

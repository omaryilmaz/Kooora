package com.example.kooora;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String DATE_FORMAT_2 = "dd-MMM-yyyy";
    EditText DTtime;
    EditText DTtime3;
    ImageView imarsenal1, imacmelan1, imbarclona1, imrealmadrid1;
    TextView lblInfo1,textView2;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      TimePicker DTtime = (TimePicker) findViewById(R.id.DTtime); // initiate a time picker
        TimePicker DTtime3 = (TimePicker) findViewById(R.id.DTtime3); // initiate a time picker

         imarsenal1 = (ImageView) findViewById(R.id.imarsenal); // imageView
         imacmelan1 = (ImageView) findViewById(R.id.imacmelan); // imageView
         imbarclona1 = (ImageView) findViewById(R.id.imbarclona); //imageView
         imrealmadrid1 = (ImageView) findViewById(R.id.imrealmadrid); // imageView
        lblInfo1 = (TextView) findViewById(R.id.lblInfo); //
        textView2 = (TextView) findViewById(R.id.textView2); //

      //  textView2.setBackgroundResource(context.getResources().getColor(android.R.color.holo_green_light));

        //set the value for current hours
        //  DTtime2.is24HourView();
        // DTtime2.setCurrentHour(12); // before api level 23
        DTtime3.setHour(13); // from api level 23
        DTtime3.setMinute(15);
        DTtime3.setIs24HourView(true);
        DTtime.setHour(20); // from api level 23
       DTtime.setMinute(00);
       DTtime.setIs24HourView(true);
//
       DTtime.setBackgroundColor(Color.YELLOW);
        DTtime3.setBackgroundColor(Color.YELLOW);

    }


    @Override
    public void onClick(View v) {
        int selectedID = v.getId();
        switch (selectedID) {
            case R.id.imarsenal:

                lblInfo1.setVisibility(View.VISIBLE);

                lblInfo1.setText("نادي أرسنال لكرة القدم (بالإنجليزية: Arsenal Football Club) هو نادي كرة قدم إنجليزي محترف يقع في هولوواي شمال لندن. يلعب في الدوري الإنجليزي الممتاز لكرة القدم ويعد أحد الأندية الأربعة الكبار في إنجلترا. حصل على لقب الدوري الإنجليزي 13 مرة وعلى كأس الاتحاد الإنجليزي 13 مرة، ومرة واحدة على كأس أوروبا لأبطال الكؤوس التي غُير اسمها فيما بعد إلى كأس الاتحاد الأوروبي.");
               // imarsenal1.setTop(100);
               // imarsenal1.setBottom(200);
               // imacmelan1.setRight(250);
              //  imacmelan1.setLeft(250);

                break;
            case R.id.imacmelan:
                lblInfo1.setVisibility(View.VISIBLE);

                lblInfo1.setText("رابطة ميلان المحدودة لكرة القدم (بالإيطالية: Associazione Calcio Milan SpA) ،[1] وغالباً ما يعرف اختصاراً باسم إيه سي ميلان (بالإنجليزية: A.C. Milan) أو الميلان فقط، هو نادي كرة قدم إيطالي محترف، تأسس بتاريخ 16 ديسمبر 1899[19] بمدينة ميلانو في إقليم لومبارديا في إيطاليا، على يد الإنجليزي هيربرت كيلبن. يعرف الفريق بلونيه الأسود الأحمر، ويشتهر في إيطاليا بلقب \"الروسونيري\" (بالإيطالية: Rossoneri) (بالعربية: الأحمر و الأسود). ويلعب الفريق حاليّاً في دوري الدرجة الأولى الإيطالي لكرة القدم.");
                break;
            case R.id.imbarclona:
                lblInfo1.setVisibility(View.VISIBLE);

                lblInfo1.setText("نادي برشلونة لكرة القدم (بالكتلانية: Futbol Club Barcelona)، وغالبًا ما يعرف اختصارًا باسم برشلونة (بالكتلانية: Barcelona) أو كما يسميه مشجعوه بارسا (بالكتلانية: Barça)،[a] هو ناد رياضي إسباني احترافي، من مدينة برشلونة، يلعب في الدوري الإسباني، وهو أحد ثلاثة أندية لم تهبط إلى الدرجة الثانية، بجانب كل من أتلتيك بيلباو وغريمه التقليدي ريال مدريد.");
                break;
            case R.id.imrealmadrid:
                lblInfo1.setVisibility(View.VISIBLE);

                lblInfo1.setText("ريال مدريد (بالإسبانية: Real Madrid Club de Fútbol، وتعني فريق مدريد الملكي لكرة القدم)[1] هو فريق كرة قدم محترف إسباني أُسس عام 1902، مقره العاصمة الإسبانية مدريد. يلعب الفريق في الدوري الإسباني واختير كأفضل فريق كرة قدم في القرن العشرين، وقد فاز بالدوري الإسباني 33 مرة (رقم قياسي)، وتسعة عشر مرة بكأس ملك إسبانيا وأحرز رقماً قياسياً بحيازته 13 بطولة في دوري أبطال أوروبا.[5][6] وهو أيضا أحد أعضاء جي–14 للأندية القيادية في أوروبا التي تم إلغاؤها حاليًا واستبدلت بـرابطة الأندية الأوروبية.[7]");

                break;


        }
    }


    public void mm(View v)
    {
        Intent intent =new Intent(Main2Activity.this,MainActivity.class);
        //Intent intent =new Intent(MainActivity.this,Today.class);
        startActivity(intent);
    }

    public void hidelblInfo(View view)
    {
        lblInfo1.setVisibility(View.INVISIBLE);
    }
}

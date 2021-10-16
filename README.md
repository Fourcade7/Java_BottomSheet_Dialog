# Java_BottomSheet_Dialog

![image](https://user-images.githubusercontent.com/60017090/137581077-22bbb83a-2dc8-46c3-8bc2-4e9e8d38beaa.png)


//MainActivity


    public class MainActivity extends AppCompatActivity {

    Button button;
    BottomSheetDialog bottomSheetDialog;
    LinearLayout linearLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);

        linearLayout1=findViewById(R.id.linearlay1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view1= LayoutInflater.from(getApplicationContext()).inflate(R.layout.layoutbottomsheet,linearLayout1);

                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.bottomsheettheme);
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();

            }
        });
     }
    }


//res/layout/layoutbottomsheet

        <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:gravity="center"
            android:id="@+id/linearlay1"
            android:background="@drawable/backgroundsheet"
            android:padding="15dp"
            android:layout_height="wrap_content">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Android Bottom Sheet is a component that slides up from the bottom of the screen having multiple options. Here are the examples of the Botto"
                ></TextView>

            <ImageView
                android:layout_marginTop="15dp"
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:src="@drawable/image"
                android:scaleType="centerCrop"
                ></ImageView>

        </LinearLayout>
        
        
//res/values/themes/theme

      <style name="bottomsheettheme" parent="Theme.MaterialComponents.Light.BottomSheetDialog">
          <item name="bottomSheetStyle">@style/bottomsheeetstyle</item>
      </style>
      <style name="bottomsheeetstyle" parent="Widget.Design.BottomSheet.Modal">
          <item name="android:background">@android:color/transparent</item>
      </style>
        

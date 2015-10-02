package edu.deanza.transfer.helper.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import edu.deanza.transfer.helper.R;
import edu.deanza.transfer.helper.parser.CourseParser;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.act_main);
    CourseParser p = new CourseParser();
    Log.i("Main", "p: " + p.parse(this));
  }
}

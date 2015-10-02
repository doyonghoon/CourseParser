package edu.deanza.transfer.helper.parser;

import android.content.Context;
import android.content.res.Resources;
import edu.deanza.transfer.helper.R;
import java.io.InputStream;

/**
 * Created by doyonghoon on 2015. 10. 2..
 */
public class CourseParser {

  public String parse(Context c) {
    String result = "";
    try {
      Resources res = c.getResources();
      InputStream in = res.openRawResource(R.raw.dump);
      byte[] b = new byte[in.available()];
      in.read(b);
      return new String(b);
    } catch (Exception e) {
       e.printStackTrace();
    }
    return result;
  }
}

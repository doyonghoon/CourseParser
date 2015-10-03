package edu.deanza.transfer.helper.parser;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.RawRes;
import android.util.Log;
import java.io.InputStream;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by doyonghoon on 2015. 10. 2..
 */
public class CourseParser {

  public String getRawHtml(Context c, @RawRes int rawResId) {
    String result = "";
    try {
      Resources res = c.getResources();
      InputStream in = res.openRawResource(rawResId);
      byte[] b = new byte[in.available()];
      in.read(b);
      result = new String(b);
    } catch (Exception e) {
       e.printStackTrace();
    }
    return result;
  }

  public void parse(String raw) {
    Elements elements = Jsoup.parse(raw).getAllElements();
    for (Element e : elements) {
      if (e.text().contains("(4)") || e.text().contains("(5)")) {
        Log.i("Parser", e.text());
      }
    }
  }
}

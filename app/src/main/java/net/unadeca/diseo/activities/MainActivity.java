package net.unadeca.diseo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.unadeca.diseo.R;
import net.unadeca.diseo.database.models.TestModel;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HtmlTextView htmlview = findViewById(R.id.html_text);

        TestModel t1= new TestModel();
        t1.name = "James";
        t1.last_name = "Carmelito";
        t1.save();

        htmlview.setHtml("<h2>Hello wold</h2><img src=\"http://www.example.com/cat_pic.png\"/>",
                new HtmlHttpImageGetter(htmlview));
    }
}

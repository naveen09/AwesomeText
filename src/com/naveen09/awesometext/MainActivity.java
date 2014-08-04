package com.naveen09.awesometext;

import com.naveen09.awesometext.AwesomeWidgetUtils.POSITION;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 
 * @author naveen09 Naveen Aechan
 * 
 */
public class MainActivity
    extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // programatically set icon and icon position.
        AwesomeText aweText = (AwesomeText) findViewById(R.id.awesomeText1);
        aweText.setIcon(R.string.fa_arrow_right, POSITION.LEFT);

        AwesomeButton aweButton = (AwesomeButton) findViewById(R.id.awesomeButton1);
        aweButton.setIcon(R.string.fa_sign_in, POSITION.LEFT);

        AwesomeText contact = (AwesomeText) findViewById(R.id.contact);
        contact.setText("Naveen Aechan");
        contact.setIcon(R.string.fa_google_plus, POSITION.LEFT);

        AwesomeText contact_git = (AwesomeText) findViewById(R.id.contactgit);
        contact_git.setText("naveen09, aechannaveen@gmail.com");
        contact_git.setIcon(R.string.fa_github, POSITION.LEFT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

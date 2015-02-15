package com.sembozdemir.semih3burcu;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import com.squareup.seismic.ShakeDetector;


public class MainActivity extends ActionBarActivity implements ShakeDetector.Listener {

    private TextView mTextGuzelSoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextGuzelSoz = (TextView) findViewById(R.id.textGuzelSoz);

        // ShakeDetector ayarla
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);
    }

    private void animateTextGuzelSoz() {
        AlphaAnimation fadeInAnimation = new AlphaAnimation(0, 1);
        fadeInAnimation.setDuration(1500);
        fadeInAnimation.setFillAfter(true);

        mTextGuzelSoz.setAnimation(fadeInAnimation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            sharePost();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void sharePost() {
        String post = "Aşkım bana şiir okuyor ki :) : '" + mTextGuzelSoz.getText() +"'";
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, post);
        startActivity(Intent.createChooser(shareIntent, getString(R.string.share_chooser_title)));
    }

    @Override
    public void hearShake() {
        GuzelSozGenerator generator = new GuzelSozGenerator();
        mTextGuzelSoz.setText((CharSequence) generator.getGuzelSoz());
        animateTextGuzelSoz();
        //Toast.makeText(this, "Muck", Toast.LENGTH_SHORT).show();
    }
}

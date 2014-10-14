package me.jaxbot.glass.leafcontrol;

import com.google.android.glass.media.Sounds;
import com.google.android.glass.widget.CardBuilder;
import com.google.android.glass.widget.CardScrollView;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

/**
 * An {@link Activity} showing a tuggable "Hello World!" card.
 * <p>
 * The main content view is composed of a one-card {@link CardScrollView} that provides tugging
 * feedback to the user when swipe gestures are detected.
 * If your Glassware intends to intercept swipe gestures, you should set the content view directly
 * and use a {@link com.google.android.glass.touchpad.GestureDetector}.
 * @see <a href="https://developers.google.com/glass/develop/gdk/touch">GDK Developer Guide</a>
 */
public class StopHVACActivity extends Activity {
    private View mView;

    String statusStr = "Stopping climate control";

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        buildView();
        setContentView(mView);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * Builds a Glass styled "Hello World!" view using the {@link CardBuilder} class.
     */
    private void buildView() {
        CardBuilder mcard = new CardBuilder(this, CardBuilder.Layout.CAPTION);

        mcard.setText(statusStr);
        mcard.addImage(R.drawable.nissan_leaf_1);

        mView = mcard.getView();
    }

}

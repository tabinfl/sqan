package org.sofwerx.sqan.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.sofwerx.sqan.SqAnService;
import org.sofwerx.sqan.ui.CoreSettingsFragment;

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new CoreSettingsFragment())
                .commit();
    }

    @Override
    protected void onStop() {
        /*if (Config.isRunInForegroundEnabled(this)) {
            Intent intent = new Intent(this, SqAnService.class);
            intent.setAction(SqAnService.ACTION_FOREGROUND_SERVICE);
            startService(intent);
        }*/
        super.onStop();
    }
}

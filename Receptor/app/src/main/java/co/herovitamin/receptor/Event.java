package co.herovitamin.receptor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kerry on 9/05/16.
 */
public class Event extends BroadcastReceiver {

    public static final String TAG = Event.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("co.herovitamin.action.CUSTOM_EVENT")){
            Toast.makeText(context, "Evento desde otra aplicacion!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Evento del sistema", Toast.LENGTH_SHORT).show();
        }
    }

}

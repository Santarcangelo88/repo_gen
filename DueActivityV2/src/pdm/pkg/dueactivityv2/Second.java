package pdm.pkg.dueactivityv2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        TextView label = (TextView) findViewById(R.id.textView1);
        String iltestoricevuto = getIntent().getExtras().getString("il testo nel box");
        label.setText(iltestoricevuto);
	}
	
	@Override
	protected void onStart() {
        super.onStart();
        String str = "ONSTART";
        Log.d("log xml",str);
    }
	@Override
	protected void onRestart() {
        super.onRestart();
        String str = "ONRESTART";
        Log.d("log xml",str);
        
    }
	@Override
	protected void onResume() {
        super.onResume();
        String str = "ONRESUME";
        Log.d("log xml",str);
    }
	@Override
	protected void onPause() {
        super.onPause();
        String str = "ONPAUSE";
        Log.d("log xml",str);
    }
	@Override
	protected void onStop() {
        super.onStop();
        String str = "ONSTOP";
        Log.d("log xml",str);
    }
	@Override
	protected void onDestroy() {
        super.onDestroy();
        String str = "ONDESTROY";
        Log.d("log xml",str);
    }
}

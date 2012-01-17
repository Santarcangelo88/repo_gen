package pkg.gennaro;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.second);
	        
	        TextView label = (TextView) findViewById(R.id.textView1);
	        String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
	        label.setText("iltestoricevuto");
	        
	 
	 }
	 
	 @Override 
	 protected void onStart() {
		 super.onStart(); 
		 String str = "onStart";
		 Log.d("LOG XML",str);
		 }
	 
	 @Override 
	 protected void onRestart() {
		 super.onRestart();
		 String str = "Restart";
		 Log.d("LOG XML",str);
		 }
	 @Override 
	 protected void onResume() {
		 super.onRestart();
		 String str = "onResume";
		 Log.d("LOG XML",str);
		 }
	 @Override 
	 protected void onPause() {
		 super.onPause();
		 String str = "onPause";
		 Log.d("LOG XML",str);
		 }
	 @Override 
	 protected void onStop() {
		 super.onStop();
		 String str = "onStop";
		 Log.d("LOG XML",str);	 
	 }
	 @Override 
	 protected void onDestroy() {
		 super.onDestroy();
		 String str = "onDestroy";
		 Log.d("LOG XML",str);	 
	 }
}



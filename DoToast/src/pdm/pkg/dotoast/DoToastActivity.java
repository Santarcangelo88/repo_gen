package pdm.pkg.dotoast;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DoToastActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    EditText edt;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //LinearLayout
        LinearLayout ll =new LinearLayout(DoToastActivity.this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT)); 
        
        //EditText
          edt=new EditText(this);
          edt.setText("Ciao a tutti");
          edt.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
          
          ll.addView(edt);
          setContentView(ll);
        //Button
        Button btn=new Button(this);
        btn.setText("Saluta");
        btn.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        
        ll.addView(btn);
        setContentView(ll);
      
    }
  
    public void onClick(View v){
    String iltesto = edt.getText().toString();	
    Toast.makeText(getApplicationContext(),iltesto,Toast.LENGTH_LONG).show();	
    }
}
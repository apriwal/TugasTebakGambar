package com.tugas.tebakgambar;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class KopiActivity extends Activity {
EditText jawabkopi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kopi);
		jawabkopi=(EditText)findViewById(R.id.isikopi );
		jawabkopi.setFilters(new InputFilter[] { new InputFilter.AllCaps()});
		
	}
	public void CekJawaban(View v){
		String jawabanbenar = "KOPI HITAM KUPU KUPU";
		String jawabanbenar2 = "KOPIHITAMKUPUKUPU";
		String jawabanuser=jawabkopi.getText().toString();
		if (jawabanuser.equals(jawabanbenar)){
			Toast.makeText(getApplicationContext(), "JAWABAN " + jawabanbenar + " BENAR", 
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(),SelamatActivity.class);
			startActivity(i);
			finish();
		}else if (jawabanuser.equals(jawabanbenar2)){
			Toast.makeText(getApplicationContext(), "JAWABAN " + jawabanbenar2 + " BENAR", 
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(),SelamatActivity.class);
			startActivity(i);
			finish();
		}else {
			Toast.makeText(getApplicationContext(), "Jawaban anda salah",
					Toast.LENGTH_LONG).show();
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kopi, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.activity_kopi, container,
					false);
			return rootView;
		}
	}

}

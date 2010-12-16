package com.tw.timemachine;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.tw.timemachine.domain.ActivityTemplate;
import com.tw.timemachine.domain.DefaultActivityTemplate;

public class TimeMachineHome extends Activity {
    private Spinner spinner;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        spinner = createActivityTemplateSpinner();
    }

	private Spinner createActivityTemplateSpinner() {
		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		
		ArrayList<ActivityTemplate> templates = new ArrayList<ActivityTemplate>();
		templates.add(new DefaultActivityTemplate("Office Task"));
		templates.add(new DefaultActivityTemplate("Moring walk"));
		templates.add(new DefaultActivityTemplate("Coding"));
		
	    ArrayAdapter<ActivityTemplate> adapter = new ArrayAdapter<ActivityTemplate>(this,android.R.layout.simple_spinner_item,templates);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner.setAdapter(adapter);
        
		return spinner;
	}
	
	public void onButtonClick(View view){
		ActivityTemplate selectedTemplate = (ActivityTemplate) spinner.getSelectedItem();
		com.tw.timemachine.domain.Activity activity = selectedTemplate.createActivity();
		
	}
}
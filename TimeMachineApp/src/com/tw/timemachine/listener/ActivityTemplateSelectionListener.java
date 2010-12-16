package com.tw.timemachine.listener;

import com.tw.timemachine.domain.ActivityTemplate;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class ActivityTemplateSelectionListener implements
		OnItemSelectedListener {

	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		Context context = parent.getContext();
        ActivityTemplate selectedTemplate = (ActivityTemplate) parent.getItemAtPosition(position);
	}

	public void onNothingSelected(AdapterView<?> parent) {
	
	}

}

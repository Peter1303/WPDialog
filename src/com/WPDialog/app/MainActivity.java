package com.WPDialog.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.widget.WPDialog.R;
import com.widget.WPDialog.WPDialog;
import android.view.LayoutInflater;

public class MainActivity extends Activity implements OnClickListener
{
	Button show,ok,neutral,cancel,light,view;
	EditText titleText,messageText,okText,neutralText,cancleText;
	CheckBox checkbox,checkboxOnTop;
	
	boolean cancelable=true,onTop=false,Light=false,showView=false;;
	
	String stringTitle,stringMessage,stringOK,stringNeutral,stringCancelable;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		setTheme(android.R.style.Theme_DeviceDefault_Light);
		
		titleText=(EditText)findViewById(R.id.text_title);
		messageText=(EditText)findViewById(R.id.text_message);
		okText=(EditText)findViewById(R.id.text_ok);
		neutralText=(EditText)findViewById(R.id.text_neutral);
		cancleText=(EditText)findViewById(R.id.text_cancle);
		
		show=(Button)findViewById(R.id.dialog_show);
		ok=(Button)findViewById(R.id.dialog_ok);
		neutral=(Button)findViewById(R.id.dialog_neutral);
		cancel=(Button)findViewById(R.id.dialog_cancel);
		light=(Button)findViewById(R.id.dialog_light);
		view=(Button)findViewById(R.id.dialog_view);
		checkbox=(CheckBox)findViewById(R.id.dialog_cancelable);
		checkboxOnTop=(CheckBox)findViewById(R.id.dialog_ontop);
		
		show.setOnClickListener(this);
		ok.setOnClickListener(this);
		neutral.setOnClickListener(this);
		cancel.setOnClickListener(this);
		light.setOnClickListener(this);
		view.setOnClickListener(this);
		
		checkbox.setChecked(cancelable);
		checkbox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(CompoundButton p1, boolean check)
				{
					if(check){
						cancelable=check;
					}
					else{
						cancelable=false;
					}
				}
			});
		checkboxOnTop.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

				@Override
				public void onCheckedChanged(CompoundButton p1, boolean check)
				{
					if(check){
						onTop=check;
					}
					else{
						onTop=false;
					}
				}
			});
			
			
			
    }
	
	@Override
	public void onClick(View v)
	{
		switch(v.getId()){
			case R.id.dialog_show:
				getText();
				Light=false;
				showView=false;
				Show(stringTitle,stringMessage,stringOK,stringNeutral,stringCancelable);
				break;
			case R.id.dialog_ok:
				getText();
				Light=false;
				showView=false;
				Show(stringTitle,stringMessage,stringOK,"","");
				break;
			case R.id.dialog_neutral:
				getText();
				Light=false;
				showView=false;
				Show(stringTitle,stringMessage,"",stringNeutral,"");
				break;
			case R.id.dialog_cancel:
				getText();
				Light=false;
				showView=false;
				Show(stringTitle,stringMessage,"","",stringCancelable);
				break;
			case R.id.dialog_light:
				getText();
				Light=true;
				showView=false;
				Show(stringTitle,stringMessage,stringOK,stringNeutral,stringCancelable);
				break;
			case R.id.dialog_view:
				getText();
				Light=false;
				showView=true;
				Show(stringTitle,stringMessage,stringOK,stringNeutral,stringCancelable);
				break;
				
		}
	}
	
	public void Show(String titlte,String message,String ok,String neutral,String cancel){
		LayoutInflater inflater = LayoutInflater.from(this);
		final View view = inflater.inflate(R.layout.dialog_view, null);
		final WPDialog wp=new WPDialog(this);
		if(Light==true){
			wp.setLightTheme();
		}
		if(showView==true){
			wp.setView(view);
		}
		wp.setTitle(titlte)
		.setMessage(message)
			.setPositiveButton(ok, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
			.setNeutralButton(neutral, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
			.setNegativeButton(cancel, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
		.setCancelable(cancelable)
		.setTopDialog(onTop)
		.show();
	}
	
	public void getText(){
		stringTitle=titleText.getText().toString();
		stringMessage=messageText.getText().toString();
		stringOK=okText.getText().toString();
		stringNeutral=neutralText.getText().toString();
		stringCancelable=cancleText.getText().toString();
	}
	
	
	
}

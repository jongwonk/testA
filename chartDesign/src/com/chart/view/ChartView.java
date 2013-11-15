package com.chart.view;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class ChartView extends View {

	private int width;
	private int height;
	
	public ChartView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		width = 0;
		height = 0;
		
	}

	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		this.setBackgroundColor(Color.BLACK);
		
		Rect rect = canvas.getClipBounds();
		Paint p = new Paint();
		p.setColor(Color.GRAY);
		p.setStrokeWidth(1.0f);
		

		p.setColor(Color.LTGRAY);
		
		for(int i = 20 ; i < 690;i += 60){
			canvas.drawLine(0, i, 480, i, p);			
		}

		for(int i = 20 ; i < 480;i += 60){
			canvas.drawLine(i, 0, i, 690, p);			
		}
		
		p.setColor(Color.BLUE);
		
		for(int i = 0 ; i  < 10 ; i++){
			
			canvas.drawRect(0, (i+1)*60, 250 , (i+1)*60 + 30, p);
		}
		
	}


	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
		
		width = w;
		height = h;
	}

	
	
}


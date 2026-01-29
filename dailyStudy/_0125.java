package dailyStudy;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
class _0125 extends JApplet
{
	public static final int FACE_DIAMETER = 50;
	public static final int X_FACEO = 50;
	public static final int Y_FACEO = 45;

	public static final int EYE_WIDTH = 5;
	public static final int EYE_HEIGHT =10;
	public static final int X_RIGHT_EYEO = 60;
	public static final int Y_RIGHT_EYEO = 55;
	public static final int X_LEFT_EYEO =85;
	public static final int Y_LEFT_EYEO = Y_RIGHT_EYEO;

	public static final int NOSE_DIAMETER = 45;
	public static final int X_NOSEO = 72;
	public static final int Y_NOSEO = 65;

	public static final int MOUTH_WIDTH = 30;
	public static int MOUTH_HEIGHTO = 6;
	public static final int X_MOUTHO = 60;
	public static final int Y_MOUTHO = 75;

	public static final int MOUTH_START_ANGLE = 0;
	public static final int MOUTH_DEGREES_SHOWN = -180;
   public  static final int MOUTH_DEGREES_SHOWN2 = 180;
	public void paint(Graphics canvas)
	{

		int i;
		for (i = 0; i<5; i++) //0~4까지 차례대로 출력시킨다
		{
			if (i == 0)
			{
				canvas.setColor(Color.WHITE);
				canvas.fillOval(X_FACEO + 120*i, Y_FACEO + 30,FACE_DIAMETER, FACE_DIAMETER);

			}
			if(i ==1)
			{
				canvas.setColor(Color.PINK);
				canvas.fillOval(X_FACEO + 120*i, Y_FACEO + 30,FACE_DIAMETER, FACE_DIAMETER);

			}
			if(i ==2)
			{
				canvas.setColor(Color.RED);
				canvas.fillOval(X_FACEO + 120*i, Y_FACEO + 30,FACE_DIAMETER, FACE_DIAMETER);
			}
			if(i ==3)
			{

				canvas.setColor(Color.YELLOW);
				canvas.fillOval(X_FACEO + 120*i, Y_FACEO + 30,FACE_DIAMETER, FACE_DIAMETER);


			}
			if(i ==4)
			{
				canvas.setColor(Color.GREEN);
				canvas.fillOval(X_FACEO + 120*i, Y_FACEO + 30,FACE_DIAMETER, FACE_DIAMETER);

			}
			canvas.setColor(Color.BLACK);
			canvas.drawOval(X_FACEO + 120*i, Y_FACEO + 30, FACE_DIAMETER, FACE_DIAMETER);

			canvas.setColor(Color.BLUE);
			canvas.fillOval(X_RIGHT_EYEO +120*i , Y_RIGHT_EYEO + 30, EYE_WIDTH, EYE_HEIGHT);
			canvas.fillOval(X_LEFT_EYEO + 120*i , Y_LEFT_EYEO + 30, EYE_WIDTH, EYE_HEIGHT);

			canvas.setColor(Color.BLACK);
			canvas.fillOval(X_NOSEO + 120*i , Y_NOSEO + 30, EYE_WIDTH, EYE_HEIGHT);

			canvas.setColor(Color.BLACK);
			if(i<3)
			canvas.drawArc(X_MOUTHO +120*i, Y_MOUTHO +30, MOUTH_WIDTH, MOUTH_HEIGHTO - 3*i,MOUTH_START_ANGLE, MOUTH_DEGREES_SHOWN); //표정
			else
			canvas.drawArc(X_MOUTHO +120*i, Y_MOUTHO +30, MOUTH_WIDTH, i*3-MOUTH_HEIGHTO ,MOUTH_START_ANGLE, MOUTH_DEGREES_SHOWN2); //표정


			canvas.setColor(Color.BLACK);    //몸통
			canvas.drawOval(58+120*i,125 ,30 ,50);

			canvas.setColor(Color.BLACK); 	 //오른팔
			canvas.drawOval(15+120*i, 130,50,10);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(15+120*i,100,10,40);

			canvas.setColor(Color.BLACK);   //왼팔
			canvas.drawOval(77 + 120*i ,130,50,10);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(120+120*i,130,10,40);

			canvas.setColor(Color.BLACK);  //오른다리
			canvas.drawOval(60+120*i,170,10,70);

			canvas.setColor(Color.BLACK); //왼다리
			canvas.drawOval(77+120*i,170,10,40);
		}
	}
}

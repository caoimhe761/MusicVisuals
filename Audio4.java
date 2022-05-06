package ie.tudublin;

import ddf.minim.AudioBuffer;
//import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;
//import processing.core.*;

public class Audio4 extends PApplet
{
      
    float n4;
    float n6;
    float off = 0;
   // int dim;
    Minim minim; 
    AudioPlayer mySound;
    AudioBuffer ab;
    int mode = 3;

    float[] lerpedBuffer;
    float y, smoothedY, smoothedAmplitude;

    public void keyPressed() {
		//taking input to change the graphics
        if (key >= '0' && key <= '9') {
            mode = key - '0';
        }

        
        
        if (keyCode == ' ') {
            if (mySound.isPlaying()) {
                mySound.pause();
            } else {
                mySound.rewind();
                mySound.play();
              //  ap.mute();
            }
        }
        
	}

    public void settings()
    {
        // fullScreen() won't run on mac so this solution works
       // fullScreen(P3D);
        size(1200,1000, P3D);
    }
    
    public void setup()
    {
        minim = new Minim(this);
        mySound = minim.loadFile("C:\\Users\\caoim\\OneDrive - Technological University Dublin\\College\\2nd year\\object orientated\\semester2\\git\\OOP-2021-2022\\data\\Amster.mp3", 1024);

        colorMode(HSB);
        smooth();
        background(0);
        y = height / 2;
        smoothedY = y;
        lerpedBuffer = new float[width];

        //AudioBuffer helps process the sound file
          
        mySound.play();
        ab = mySound.mix; 
    } // end setup


    public void draw()
    {
        background(0);

        float average = 0;
        float sum = 0;
        off += 1;
        // Calculate sum and average of the samples
        // Also lerp each element of buffer;
        for(int i = 0 ; i < ab.size() ; i ++)
        {
            sum += abs(ab.get(i));
            lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.05f);
        }
        average= sum / (float) ab.size();

        smoothedAmplitude = lerp(smoothedAmplitude, average, 0.1f);
        

        switch (mode) {
		
                    
        case 3:
        {   float halfH = height / 2;
            if(mySound.position() < 12000){
                
                //calls swirly background
                coolBackground(0.001f);
                    
                strokeWeight(0);
                beginShape(POINTS);

                //circle of circles
                for (int a = 0; a < 360; a+=20) 
                {
                    
                    circleCircle(a);
                } //end forloop
                endShape();
            }
            if (mySound.position()> 12000 & mySound.position()<45000)
            {
                background(0);
                boxes();
               // chorus2();
            }
        if (mySound.position()> 45000&&mySound.position()<69000)
            {
                eye();
            }
       if (mySound.position()> 69000&&mySound.position()<80000)
        {
            transition();

        } 
        if (mySound.position()> 80000&&mySound.position()<89000)
            {
                eye();
            }
        if (mySound.position()>89000&& mySound.position()<114000)
        {
            background(0);
            chorus2();
        }
        if (mySound.position()> 114000&&mySound.position()< 126000)
            { 
                movingBox(halfH /0.001f,  halfH /0.001f, -220,150);
                
                movingBox(halfH * 0.1f,-300,+20, 100);
                
                movingBox(halfH * 0.1f,200, -250,100);
                
                movingBox(halfH/ 0.1f,-220, -200,150);
                
                movingBox(halfH/100.0f,300, +300,1504);
                
                movingBox(halfH* 10000.0F,+300,+20,100);
            
                movingBox(1/10000.0f,0, 0,200);
            }
        if (mySound.position()> 126000&&mySound.position()<170000 )
            {
                eye();
            }
        if (mySound.position()>170000&&mySound.position()<192000)
            {
                coolBackground(0.001F);
                chorus2();
    
            } 
        if (mySound.position()>192000&&mySound.position()<209000)
        {
            boxes();

        } 
        if (mySound.position()>209000&&mySound.position()<240000)
        {
            eye();

        } 
        if (mySound.position()>240000)
        { 
            coolBackground(0.001f);
                
            strokeWeight(0);
            beginShape(POINTS);

            //circle of circles
            for (int a = 0; a < 360; a+=20) {
                
                circleCircle(a);
            } //end forloop
            endShape();
        }
        
            break;
    }
   
        } //end switch 
}

    
        private void boxes() {
            background(0);
            float halfH = height / 2;
            float offsetAdd =  halfH /0.001f;
                float locationX=-220;
                float locationY=300;
                float box = 150;
                movingBox(offsetAdd, locationX, locationY, box);
                
                float box1_1=halfH * 0.1f;
                float box1_2 = -300;
                float box1_3 = +20;
                float box1_4 = 100;
                movingBox(box1_1,box1_2, box1_3,box1_4);
                
                float box2_1=halfH * 0.1f;
                float box2_2 = 200;
                float box2_3 = -250;
                float box2_4 = 100;
                movingBox(box2_1,box2_2, box2_3,box2_4);
                
                float box3_1= halfH/ 0.1f;
                float box3_2 = -220;
                float box3_3 = -200;
                float box3_4 = 150;
                movingBox(box3_1,box3_2, box3_3,box3_4);
                
                float box4_1=halfH/100.0f;
                float box4_2 = 300;
                float box4_3 = +300;
                float box4_4 = 150;
                movingBox(box4_1,box4_2, box4_3,box4_4);
                
                float box5_1=halfH* 10000.0f;
                float box5_2 = +300;
                float box5_3 = +20;
                float box5_4 = 100;
                movingBox(box5_1,box5_2, box5_3,box5_4);
            
                float box6_1=1/10000.0f;
                float box6_2 = 0;
                float box6_3 = 0;
                float box6_4 = 200;
                movingBox(box6_1,box6_2, box6_3,box6_4);
    }

        private void eye() {
            fill(0,50); 
            //rect(0, 0, width, height);
            translate(width/2,height/2);
    
            for (int i = 0; i < ab.size(); i++) 
            {
                float c = map(i, 0, ab.size(), 0, 255);
                float angle = sin(i+n4)* 10; 
                float angle2 = sin(i+n6)* 300; 
            
                float x = sin(radians(i))*(angle2+30); 
                float y = cos(radians(i))*(angle2+30);
            
                float x3 = sin(radians(i))*(500/angle); 
                float y3 = cos(radians(i))*(500/angle);
            
                //yellow
                fill(60,50, 255, 90);
                ellipse(x, y, mySound.left.get(i)*10, mySound.left.get(i)*10);
            
                //white
                fill(255, 0, 255,60);
                rect(x3, y3, mySound.left.get(i)*20, mySound.left.get(i)*10);
                
                //green 
                fill(c,251,152, 90);
                rect(x, y, mySound.right.get(i)*10, mySound.left.get(i)*10);
            
                //white
                fill(255, 0, 255,70);
                rect(x3, y3, mySound.right.get(i)*10, mySound.right.get(i)*20);
            } //end for
    
                n4 += 0.008F;
    }

        private void chorus2() {
            //rect(0, 0, width, height);
            
            //coolBackground(0.001F);
            int n = 10;

            //centering the graphic
            translate(width/2,height/2);

            for(int i = 0; i < ab.size(); i++)  {
                rotateX((float) (n*-PI/6*0.05));
                rotateY((float) (n*-PI/6*0.05));
                rotateZ((float) (n*-PI/6*0.05));
                fill(random(255),random(255),random(255));
                rect(i,i,mySound.left.get(i)*50,mySound.left.get(i)*50);
            }//end for

            n++; 
    }

        private void transition() {
            int c = 0;
           //  rect(0, 0, width, height);
            coolBackground(0.001F);
            translate(width/2,height/2);

            for(int i = 0; i < mySound.bufferSize() - 1; i++)  {
            
                rotateX((float) (c*-PI/3*0.05));
                 //rotateY((float) (n*-PI/3*0.05));
                fill(300, 17,0);
                float leftLevel = mySound.left.level() * 30; 
                ellipse(i,i,leftLevel,leftLevel);
                rotateZ((float) (c*-PI/3*0.05));
                fill(255,0,255);
                float rightLevel = mySound.right.level() * 30; 
                rect(i,i,rightLevel,rightLevel);
            }//end for

            c++; 
    }

        

        public void coolBackground(float degree) {
            loadPixels();
            float A = map(smoothedAmplitude, 0, degree, 100, 20);
            float n = (A * 10.0F) / width;
            float w = 16.0F;         // 2D space width
            float h = 16.0F;         // 2D space height
            float dx = w / width;    // Increment x this amount per pixel
            float dy = h / height;   // Increment y this amount per pixel
            float x = -w/2;          // Start x at -1 * width / 2
            for (int i = 0; i < width; i++) {
                float y = -h/2;        // Start y at -1 * height / 2
                for (int j = 0; j < height; j++) {
                float r = sqrt((x*x) + (y*y));    // Convert cartesian to polar
                float theta = atan2(y,x);         // Convert cartesian to polar
                // Compute 2D polar coordinate function
                float val = sin(n*cos(r) + 5 * theta);           // Results in a value between -1 and 1
                float c = map(i, 0, ab.size(), 0, 255); 
                //float val = cos(r);                            // Another simple function
                //float val = sin(theta);                        // Another simple function
                // Map resulting vale to grayscale value
                pixels[i+j*width] = color((int) ((val + 1.0) * c));     // Scale to between 0 and 255
                y += dy;                // Increment y
            }
            x += dx;                  // Increment x
                updatePixels();
            }
    }
    private void movingBox(float offsetAdd, float x, float y, float size) 
        {
            int i=0;
            for( i = 0; i < ab.size(); i++) {
                float a=1;
                float offset = lerpedBuffer[i] * offsetAdd;
                float c = map(i, 0, ab.size(), 0, 255);
                pushMatrix();
                translate((width/2)+x, (height/2)+y); //position
                rotateY(a*2 / offset/i);
                rotateX(a*2 / offset/i);
                fill(c,255,255);
                box(size);
                popMatrix();
            }
            
        }

        public void circleCircle(int a)
        {
            float smallRadius = ( min(width, height) / 2) * 0.72f;
            float cx = width / 2;
            float cy = height / 2;
            float r = map(smoothedAmplitude, 0, 0.002f, 100, 20);
                float angle = radians(a);
                float cx2 = cx + cos(angle) * smallRadius;
                float y = cy + sin(angle) * smallRadius;
                float p = map(ab.get(a), -1, 1, 0, 360);
                //float c = map(a, 0, ab.size(), 0, 255);
                circle(cx2, y, r);
                fill(p, 255,255);   
        }
}
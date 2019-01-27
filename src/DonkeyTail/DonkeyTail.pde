import ddf.minim.*;
AudioSample woohooSound;
boolean playSound=true;


PImage donkey;
PImage tail;
int x;
int y;
boolean pressed= false;

void setup(){
  Minim minim= new Minim(this);
  woohooSound= minim.loadSample("30996__unclesigmund__woohoo-1.wav");
  donkey= loadImage("donkey.jpg");
  tail= loadImage("tail.jpg");
  tail.resize(150,110);
  size(600,440);
  donkey.resize(600,440);
 
  
}

void draw(){
  background(255,255,255); 
       rect(0,0,70,70);
   rect(517,122,70,70);

 
  if(dist(0,0,mouseX,mouseY)<30){
    
   background(donkey);
  }
  if(dist(517,122,mouseX,mouseY)<30){
     background(donkey); 
    
  }
   if(mousePressed){
      x=mouseX;
      y=mouseY;
      pressed=true;
       
   }
   if(pressed==true && (dist(517,122,mouseX,mouseY)<30 || dist(0,0,mouseX,mouseY)<30)){
     print("hjello");
     if (playSound) {
     woohooSound.trigger();
     playSound = false;
}

     
   }
   if(pressed==true){
     background(donkey);
     image(tail,x,y);

     
   }
   else{
   
     image(tail,mouseX,mouseY);
     
   }
    
  }
  

   

  
  
  
  
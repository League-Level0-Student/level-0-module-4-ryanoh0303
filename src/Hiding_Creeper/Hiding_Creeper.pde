PImage creeper;

PImage minecraft;
int x;
int y;
int creeperx=(int)random(400);
int creepery=(int)random(400);
boolean near=false;
boolean near2=false;
void setup(){
  size(800,800);
  minecraft= loadImage("minecraft.png");
  minecraft.resize(800,800);
  background(minecraft);
  creeper= loadImage("creeper.png");
  creeper.resize(200,200);
  image(creeper,creeperx,creepery);
  
}


void draw(){
  
  if(mousePressed==true){
    x=mouseX;
    y=mouseY;
    
    if(x<=50 && y<=200){
     fill(0,255,0); 
     }
    else{
      fill(255,0,0);
      
    }
    ellipse(x,y,49,49);
    if(abs(creeperx-x)<100){
    near=true;
    }
    else{
    near=false;
    }  
    if(abs(creepery-y)<100){
   near2=true; 
    
  }
    else{
    near2=false;
  }
    
  }
  
  if(near2==true && near==true){
    background(minecraft);
    image(creeper,(int)random(400),(int)random(400));
    near2=false;
    near=false;
    
    
    
  }

  
  
}
void setup(){
  
  PImage face= loadImage("Spongebob.png");
  size(800,800);
  face.resize(800,800);
  background(face);
  
  
}
void draw(){
  fill(255,255,255);
  ellipse(200,130,200,200);
  fill(0,0,0);
  ellipse(mouseX, mouseY,100,100);
  //left eye
  
  
  fill(255,255,255);
  ellipse(400,130,200,200);
  fill(0,0,0);
  ellipse(mouseX+190, mouseY, 100,100);
  
  if(mouseX<=150 || mouseX>=250 || mouseY<=80 || mouseY>=181){
    mouseX=207;
    mouseY=128;
  }
  
  System.out.println(mouseY);
}
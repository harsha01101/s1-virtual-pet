/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int x = 0;
    int wood = 0;
    int food = 0;

    public int hunger(){
        return this.hunger;
    }

    public int x(){
        return this.x;
    }

    public void increaseX(){
        x = x + 1;
    }

    public void resetX(){
        x = 0;
    }
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("happy");
        face.setMessage("Hello!");
        this.takeabeat(2000);
        face.setImage("normal");
        face.setMessage("...");
        this.takeabeat(2000);
        face.setMessage("I didn't think I would find anyone else out here.");
        this.takeabeat(2000);
        face.setImage("confused");
        this.takeabeat(1000);
        face.setMessage("Wait.. don't tell me...");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
        if (hunger >= 10){
            this.death();
        }
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
        if (hunger >= 10){
            this.death();
        }
    }

    public void takeabeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }
    }

    public void respondPositively(){
        face.setMessage("That's great!");
        face.setImage("happy");
    }

    public void agree(){
        face.setMessage("Okay.");
    }

    public void setMessage(String f){
        face.setMessage(f);
    }

    public void setFace(String m){
        face.setImage(m);
    }

    public void death(){
        face.setImage("sick");
        face.setMessage("I don't feel so...");
        try {
            Thread.sleep(2000); 
        } catch(Exception e){
        
        }
        face.setImage("dead");
        try {
            Thread.sleep(1000); 
        } catch(Exception e){
        
        }
        face.setImage("skeleton");
        try {
            Thread.sleep(1000); 
        } catch(Exception e){
        
        }
        face.setImage("pushingdaisies");
    }

    public void gatherMaterials(String c, String d){
        int f = Integer.valueOf(d);
        face.setImage("neutral");
        face.setMessage("I'll go gather " + c);
        try {
            Thread.sleep(2000); 
        } catch(Exception e){
        
        }
        face.setImage("blank");
         try {
            Thread.sleep(3000); 
        } catch(Exception e){
        
        }
        if (c.equalsIgnoreCase("wood")){
            face.setImage("wood");
            wood = wood + f;
        } else {
            face.setImage("food");
            food = food + f;
        }
        face.setMessage("I'm back with more " + c);
        try {
            Thread.sleep(3000); 
        } catch(Exception e){
        
        }
        face.setImage("normal");
        face.setMessage("you have " + this.wood + " wood and " + this.food + " food.");
    }

} // end Virtual Pet

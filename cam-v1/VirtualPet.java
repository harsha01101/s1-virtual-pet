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
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
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
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
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

    git config –global user.name “Harsha Ramesh”
git config –global user.email “harshar24@ausdk12.org”

} // end Virtual Pet

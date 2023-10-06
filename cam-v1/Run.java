public class Run {

    import javax.swing.*;

    public Run(){
            VirtualPet p = new VirtualPet();
            p.exercise();
            p.takeabeat(3000);
            p.feed();
        }

    public static void main(String[] args){
        new Run();
    }

}

/*String ans = getAnswer("How are you?");
            if(ans.equalsIgnoreCase("Good")){
                //p.respondPositively();
            }*/

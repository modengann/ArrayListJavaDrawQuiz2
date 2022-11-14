/**
 *  Task: Create a program that will:
 *     -Make rain constantly appear on the screen. 
 *         -Rain will be an oval where the height is a random value between 5 and 12 and the width is
 *          a random value between 4 and 8.  
 *     -It is a very windy day! The hail will fly from BOTTOM to TOP on the screen.
 *     -If the rain reaches the top of the screen, it should be removed from the screen 
 *         and any list it may be a part of.
 *     -There will be a frisbee bouncing around the screen, if the rain touches the frisbee the rain should disappear.
 * 
 *   Specifications:
 *   -You are NOT allowed to modify any code that I have written for you. 
 *   -Use appropriate loops! Not everything is a for-each loop, not everything should be a while loop.
 *   -Create methods, high level work will not have all of the code written in the start() method!
 * 
 *   A+ level work:
 *   -Add a creative twist of your own with explanatory comments. Any extra work should demonstrate mastery
 *   of both ArrayLists and their usage with JavaDraw. For example, play with what happens to the frisbee when hit by rain
 *   -Think about creating methods but without including any global variables
 */

import javadraw.*;
import java.util.*;

public class App extends Window{
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        Oval frisbee = new Oval(screen, 500, 300, 100, 20);
        frisbee.color(new Color(255,164,0));
        int frisbeeDirection = 1;

        while(true){
            frisbeeDirection = frisbeeMove(frisbee, frisbeeDirection);

            screen.update();
            screen.sleep(1/30.0);
        }
    }

    public int frisbeeMove(Oval o, int d){
        o.move(d*7,0);
        if(o.x() <= 0 || o.x() + o.width() >= screen.width()){
            d *= -1;
        }
        return d;
    }
}

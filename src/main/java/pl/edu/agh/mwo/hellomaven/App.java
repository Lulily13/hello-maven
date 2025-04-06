package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

public class App {

    public static final int WIDTH = 120;
    public static final int HEIGHT = 20;
    public static final int NUMBER = 4;

    public static void main(String[] args) {
        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(WIDTH).height(HEIGHT);
        builder.element(new PseudoText("Hello Maven"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return NUMBER;
    }
}

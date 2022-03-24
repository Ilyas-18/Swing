package ersteAnzeige;

import javax.swing.*;
import java.awt.*;

public class HalloWelt extends JFrame {

    public HalloWelt() {
        this.setPreferredSize(new Dimension(800,600));
        this.setContentPane(new Rechnung().getRootPanel());

        this.setTitle("Hallo Welt");
    }
}

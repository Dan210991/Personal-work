package task3;

import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class ViewRulesOption extends Main implements SwitchStrategy{

	public void run() 
	{
		String h4 = "Rules";
        String u4 = h4.replaceAll(".", "=");
        System.out.println(u4);
        System.out.println(h4);
        System.out.println(u4);
        System.out.println(h4);

        JFrame f = new JFrame("Rules by Daniel Pusey");

        f.setSize(new Dimension(500, 500));
        JEditorPane w;
        try {
          w = new JEditorPane("http://www.scit.wlv.ac.uk/~in6659/abominodo/");

        } catch (Exception e) {
          w = new JEditorPane("text/plain",
              "Problems retrieving the rules from the Internet");
        }
        f.setContentPane(new JScrollPane(w));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

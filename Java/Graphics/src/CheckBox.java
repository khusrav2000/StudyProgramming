/*
	Get Selected Radio Button Example
	This java example shows how to get selected radio button using
	Java AWT CheckboxGroup class.
*/

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/*
<applet code="GetSelectedRadioButtonExample" width=200 height=200>
</applet>
*/


public class CheckBox extends Applet implements ItemListener{

    CheckboxGroup lngGrp = null;

    public void init(){

        //create group
        lngGrp = new CheckboxGroup();

        //create checkboxes and add to group
        Checkbox java = new Checkbox("Java", lngGrp, true);
        Checkbox cpp = new Checkbox("C++", lngGrp, false);
        Checkbox vb = new Checkbox("VB", lngGrp, false);

        //add radio buttons
        add(java);
        add(cpp);
        add(vb);

        //add listeners
        java.addItemListener(this);
        cpp.addItemListener(this);
        vb.addItemListener(this);
    }


    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g){

        /*
         * To get selected radio button, use
         * Checkbox getSelectedCheckbox()
         * method of CheckboxGroup class.
         */

        Checkbox chk = lngGrp.getSelectedCheckbox();

        g.drawString(chk.getLabel() + " is selected", 10 ,70);
    }
}

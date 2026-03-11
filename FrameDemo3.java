
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class FrameDemo3{

    JFrame f;
    JPanel p;

    JLabel lblGender;
    JRadioButton rbMale, rbFemale, rbOther;
    ButtonGroup bg;
    JLabel lblMessage;

    JLabel lblDoc;
    JCheckBox chkAadhar, chkPan , chkLc, chkTc;

    JLabel lblItem ;
    JComboBox cmbitem;

    JList listItem;

    String[] item = {"Pen","Pencil","Book","Notebook"};

    public FrameDemo3(){

        f = new JFrame();
        p = new JPanel();
        lblGender = new JLabel("Select the Gender : ");
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbOther = new JRadioButton("Other");
        bg = new ButtonGroup();
        lblMessage = new  JLabel();

        lblDoc = new JLabel("Select the Document : ");
        chkAadhar = new JCheckBox("Aadhar");
        chkPan = new JCheckBox("Pan");
        chkLc = new JCheckBox("L.C");
        chkTc = new JCheckBox("T.C");

        lblItem = new JLabel("Select the Item :");
        cmbitem = new JComboBox();

        listItem = new JList(item);


        lblGender.setBounds(50,50,150,30);
        p.add(lblGender);

        rbMale.setBounds(50,80,100,30);
        p.add(rbMale);

        rbFemale.setBounds(160,80,100,30);
        p.add(rbFemale);

        rbOther.setBounds(270,80,100,30);
        p.add(rbOther);
        bg.add(rbMale);
        bg.add(rbFemale);
        bg.add(rbOther);

        lblMessage.setText("Status : DemoMessage ");
        lblMessage.setBounds(50,120,150,30);
        p.add(lblMessage);
        
        lblDoc.setBounds(50,160,150,30);
        p.add(lblDoc);

        chkAadhar.setBounds(50,200,100,30);
        p.add(chkAadhar);

        chkPan.setBounds(160,200,100,30);
        p.add(chkPan);

        chkLc.setBounds(50,240,100,30);
        p.add(chkLc);

        chkTc.setBounds(160,240,100,30);
        p.add(chkTc);

        lblItem.setBounds(50,300,150,30);
        p.add(lblItem);

        cmbitem.setBounds(160,300,100,30);
        cmbitem.addItem("Pen");
        cmbitem.addItem("Pencil");
        cmbitem.addItem("Book");
        cmbitem.addItem("Notebook");
        p.add(cmbitem);

        listItem.setBounds(270,300,100,100);
        p.add(listItem);

        p.setLayout(null);
        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame3 ");
        f.setLocation(450,50);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        
            new FrameDemo3();

    }

}
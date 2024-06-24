import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalcAwt extends Frame implements ActionListener{
    
    TextField display;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,clr,eql,add,sub,mul,div;

    CalcAwt()
    {
          display=new TextField("0");
          display.setBounds(50,50,382,40);
          add(display);

          btn0=new Button("0");
          btn0.setBounds(50,400,80,80);
          btn0.setBackground(Color.black);
          btn0.setForeground(Color.white);
          add(btn0);
          btn0.addActionListener(this);


          btn1=new Button("1");
          btn1.setBounds(50,300,80,80);
          btn1.setBackground(Color.black);
          btn1.setForeground(Color.white);
          add(btn1);
          btn1.addActionListener(this);

          btn2=new Button("2");
          btn2.setBounds(150,300,80,80);
          btn2.setBackground(Color.black);
          btn2.setForeground(Color.white);
          add(btn2);
          btn2.addActionListener(this);

          btn3=new Button("3");
          btn3.setBounds(250,300,80,80);
          btn3.setBackground(Color.black);
          btn3.setForeground(Color.white);
          add(btn3);
          btn3.addActionListener(this);

          btn4=new Button("4");
          btn4.setBackground(Color.black);
          btn4.setForeground(Color.white);
          btn4.setBounds(50,200,80,80);
          add(btn4);
          btn4.addActionListener(this);

          btn5=new Button("5");
          btn5.setBounds(150,200,80,80);
          btn5.setBackground(Color.black);
          btn5.setForeground(Color.white);
          add(btn5);
          btn5.addActionListener(this);

          btn6=new Button("6");
          btn6.setBounds(250,200,80,80);
          btn6.setBackground(Color.black);
          btn6.setForeground(Color.white);
          add(btn6);
          btn6.addActionListener(this);

          btn7=new Button("7");
          btn7.setBounds(50,100,80,80);
          btn7.setBackground(Color.black);
          btn7.setForeground(Color.white);
          add(btn7);
          btn7.addActionListener(this);

          btn8=new Button("8");
          btn8.setBounds(150,100,80,80);
          btn8.setBackground(Color.black);
          btn8.setForeground(Color.white);
          add(btn8);
          btn8.addActionListener(this);

          btn9=new Button("9");
          btn9.setBounds(250,100,80,80);
          btn9.setBackground(Color.black);
          btn9.setForeground(Color.white);
          add(btn9);
          btn9.addActionListener(this);

          add=new Button("+");
          add.setBounds(350,300,80,80);
          add.setBackground(Color.black);
          add.setForeground(Color.WHITE);
          add(add);
          add.addActionListener(this);

          sub=new Button("-");
          sub.setBounds(350,200,80,80);
          sub.setBackground(Color.BLACK);
          sub.setForeground(Color.white);
          add(sub);
          sub.addActionListener(this);

          mul=new Button("*");
          mul.setBounds(350,100,80,80);
          mul.setBackground(Color.BLACK);
          mul.setForeground(Color.WHITE);
          add(mul);
          mul.addActionListener(this);

          div=new Button("/");
          div.setBounds(350,400,80,80);
          div.setBackground(Color. BLACK);
          div.setForeground(Color.WHITE);
          add(div);
          div.addActionListener(this);

          eql=new Button("=");
          eql.setBounds(150,400,80,80);
          eql.setBackground(Color.green);
          eql.setForeground(Color.white);
          add(eql);
          eql.addActionListener(this);

          clr=new Button("C");
          clr.setForeground(Color.white);
          clr.setBounds(250,400,80,80);
          clr.setBackground(Color.red);
          add(clr);
          clr.addActionListener(this);

          setSize(500,500);
          setLayout(null);
          setTitle("Calculator AWT-JAVA");
          setVisible(true);
          setBackground(Color.BLACK);
          
    }

    public void actionPerformed(ActionEvent e)
    {
        
     if(e.getSource()==btn0)
     {
     String value= display.getText();
     value +="0";
     display.setText(value);

     }
     if(e.getSource()==btn1)
     {
     String value= display.getText();
     value +="1";
     display.setText(value);

     }
     if(e.getSource()==btn2)
     {
     String value= display.getText();
     value +="2";
     display.setText(value);

     }
     if(e.getSource()==btn3)
     {
     String value= display.getText();
     value +="3";
     display.setText(value);

     }
     if(e.getSource()==btn4)
     {
     String value= display.getText();
     value +="4";
     display.setText(value);

     }
     if(e.getSource()==btn5)
     {
     String value= display.getText();
     value +="5";
     display.setText(value);

     }
     if(e.getSource()==btn6)
     {
     String value= display.getText();
     value +="6";
     display.setText(value);

     }
     if(e.getSource()==btn7)
     {
     String value= display.getText();
     value +="7";
     display.setText(value);

     }
     if(e.getSource()==btn8)
     {
     String value= display.getText();
     value +="8";
     display.setText(value);

     }
     if(e.getSource()==btn9)
     {
     String value= display.getText();
     value +="9";
     display.setText(value);

     }
     if(e.getSource()==add)
     {
     String value= display.getText();
     value +="+";
     display.setText(value);

     }
     if(e.getSource()==sub)
     {
     String value= display.getText();
     value +="-";
     display.setText(value);

     }
     if(e.getSource()==mul)
     {
     String value= display.getText();
     value +="*";
     display.setText(value);

     }
     if(e.getSource()==div)
     {
     String value= display.getText();
     value +="/";
     display.setText(value);

     }
     if(e.getSource()==clr)
     {
        //String value="";
        display.setText("0");
     }

     if(e.getSource()==eql)
     {
        int a,b,i;
        char ch='+';
      
        String value=display.getText();
        String tempA="",tempB="";

        for(i=0;i<value.length();i++)
        {
            if(Character.isDigit(value.charAt(i)))
            {
                tempA += value.charAt(i);
            }
            else {
                ch=value.charAt(i);
                break;
            }
        }

        tempB=value.substring(i+1);
        a=Integer.parseInt(tempA);
        b=Integer.parseInt(tempB);
        int c=0;
        switch (ch) {
            case '+':
                c=a+b;
              
                break;
            case '-':
                c=a-b;
              
                break;
            case '*':
                c=a*b;
              
                break;
            case '/':
                c=a/b;
              
                break;
        
            default:
                break;
        }
        display.setText(String.valueOf(c));
     }
    }
    public static void main(String[] args) {
        new CalcAwt();
    }
}

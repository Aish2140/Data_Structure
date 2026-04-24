package myvote;


import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;

public class LoginFrame extends JFrame {
    private static final HashMap<String,String> USERS = new HashMap<>();
    private static final HashSet<String> LOGGED = new HashSet<>();
    static{ USERS.put("admin","admin"); USERS.put("user","123"); }

    public LoginFrame(){
        setTitle("Login");
        setSize(300,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField user = new JTextField(12);
        JPasswordField pass = new JPasswordField(12);
        JLabel status = new JLabel(" ");

        JButton login = new JButton("Login");
        login.addActionListener(e->{
            String u=user.getText(); String p=new String(pass.getPassword());
            if(!USERS.containsKey(u)||!USERS.get(u).equals(p))
                status.setText("Invalid!");
            else if(LOGGED.contains(u))
                status.setText("Already logged!");
            else{
                LOGGED.add(u);
                dispose();
                new VotingFrame().setVisible(true);
            }
        });

        JPanel gp=new JPanel(new GridBagLayout()); GridBagConstraints c=new GridBagConstraints();
        c.insets=new Insets(4,4,4,4); c.anchor=GridBagConstraints.WEST;
        c.gridx=0;c.gridy=0;gp.add(new JLabel("User:"),c);
        c.gridx=1;gp.add(user,c);
        c.gridx=0;c.gridy=1;gp.add(new JLabel("Pass:"),c);
        c.gridx=1;gp.add(pass,c);
        c.gridx=0;c.gridy=2;c.gridwidth=2;c.anchor=GridBagConstraints.CENTER;gp.add(login,c);
        c.gridy=3;gp.add(status,c);

        add(gp);
    }
}

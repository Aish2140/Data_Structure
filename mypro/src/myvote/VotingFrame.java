package myvote;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VotingFrame extends JFrame {
    private ArrayList<Candidate> candidates;
    private ButtonGroup group;
    private HashSet<String> votedUsers = new HashSet<>(); // To prevent double voting

    public VotingFrame() {
        candidates = new ArrayList<>();
        candidates.add(new Candidate("Alice"));
        candidates.add(new Candidate("Bob"));
        candidates.add(new Candidate("Charlie"));

        setTitle("Voting System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Choose your candidate:");
        add(label, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(0, 1));
        group = new ButtonGroup();

        for (Candidate c : candidates) {
            JRadioButton btn = new JRadioButton(c.getName());
            btn.setActionCommand(c.getName());
            group.add(btn);
            optionsPanel.add(btn);
        }

        add(optionsPanel, BorderLayout.CENTER);

        JButton submitBtn = new JButton("Submit Vote");
        submitBtn.addActionListener(e -> {
            String selected = group.getSelection() != null ? group.getSelection().getActionCommand() : null;
            if (selected == null) {
                JOptionPane.showMessageDialog(this, "Please select a candidate!");
                return;
            }

            // Simulate user ID check (you can prompt user to input ID)
            String userId = JOptionPane.showInputDialog(this, "Enter your Voter ID:");
            if (votedUsers.contains(userId)) {
                JOptionPane.showMessageDialog(this, "You have already voted!");
                return;
            }

            votedUsers.add(userId);

            for (Candidate c : candidates) {
                if (c.getName().equals(selected)) {
                    c.addVote();
                    JOptionPane.showMessageDialog(this, "Vote submitted successfully for " + selected + "!");
                    break;
                }
            }

            int confirm = JOptionPane.showConfirmDialog(this, "See Results?", "View Results", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                new ResultsFrame(candidates).setVisible(true);
            }
        });

        add(submitBtn, BorderLayout.SOUTH);
    }
}

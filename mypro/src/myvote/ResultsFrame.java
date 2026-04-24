package myvote;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class ResultsFrame extends JFrame {
    public ResultsFrame(ArrayList<Candidate> candidates) {
        setTitle("Voting Results");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        String[] columns = {"Candidate", "Votes"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        Candidate winner = null;
        for (Candidate c : candidates) {
            model.addRow(new Object[]{c.getName(), c.getVotes()});
            if (winner == null || c.getVotes() > winner.getVotes()) {
                winner = c;
            }
        }

        add(new JScrollPane(table), "Center");

        JLabel winnerLabel = new JLabel("Winner: " + (winner != null ? winner.getName() : "N/A"));
        add(winnerLabel, "South");
    }
}




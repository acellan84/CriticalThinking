package criticalthinkingwktwo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankBalance {
	// Initial balance
	private double balance = 500.00;

    private JLabel balanceLabel;
    private JTextField deposit;
    private JTextField withdraw;

    public BankBalance() {
        JFrame frame = new JFrame("Bank Balance Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        //labeling account balance
        balanceLabel = new JLabel("Account Balance: $" + balance);
        panel.add(balanceLabel);

        //adding text and button for deposit
        deposit = new JTextField(10);
        panel.add(deposit);

        JButton depositButton = new JButton("Deposit");
        panel.add(depositButton);

        //adding text and button for withdraw
        withdraw = new JTextField(10);
        panel.add(withdraw);

        JButton withdrawButton = new JButton("Withdraw");
        panel.add(withdrawButton);

        //adding submit button
        JButton exitButton = new JButton("Submit");
        panel.add(exitButton);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//get deposit amount and add to balance
                String depositText = deposit.getText();
                if (!depositText.isEmpty()) {
                    double depositAmount = Double.parseDouble(depositText);
                    balance += depositAmount;
                    updateBalanceLabel();
                    deposit.setText("");
                }
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//get withdraw amount and minus from balance
                String withdrawText = withdraw.getText();
                if (!withdrawText.isEmpty()) {
                    double withdrawAmount = Double.parseDouble(withdrawText);
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        updateBalanceLabel();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Insufficient Funds");
                    }
                    withdraw.setText("");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ending Balance: $" + balance);
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankBalance();
            }
        });
    }
}


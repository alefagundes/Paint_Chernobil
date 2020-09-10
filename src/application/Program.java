package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import entities.PainelPintura;

public class Program extends JFrame{
	    PainelPintura painelDesenho;
	    ActionListener ouvinteBotoes = new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent ae) {
	            JButton btTmp = (JButton) ae.getSource();
	            if(btTmp.getText().equalsIgnoreCase("azul")){
	                painelDesenho.setCorAtual(Color.BLUE);
	                return;
	            }
	            
	            if(btTmp.getText().equalsIgnoreCase("vermelho")){
	                painelDesenho.setCorAtual(Color.RED);
	                return;
	            }
	            
	            if(btTmp.getText().equalsIgnoreCase("amarelo")){
	                painelDesenho.setCorAtual(Color.YELLOW);
	                return;
	            }
	            
	            if(btTmp.getText().equalsIgnoreCase("apagar")){
	                painelDesenho.setCorAtual(Color.WHITE);
	                return;
	            }
	            
	            if(btTmp.getText().equalsIgnoreCase(">")){
	                painelDesenho.setTamanho(painelDesenho.getTamanho() + 5);
	                return;
	            }
	            
	            if(btTmp.getText().equalsIgnoreCase("<")){
	                painelDesenho.setTamanho(painelDesenho.getTamanho() - 5);
	                return;
	            }
	        }
	    };
	    
	    public void montarTela(){
	        setSize(600, 600);
	        setTitle("Paint Chernobil!");
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	        setLocationRelativeTo(null);
	        
	        JPanel painelBotoes = new JPanel();
	        painelBotoes.setLayout(new FlowLayout());
	        
	        JButton btTmp = new JButton("Azul");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        btTmp = new JButton("Vermelho");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        btTmp = new JButton("Amarelo");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        btTmp = new JButton("Apagar");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        btTmp = new JButton("<");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        btTmp = new JButton(">");
	        btTmp.addActionListener(ouvinteBotoes);
	        painelBotoes.add(btTmp);
	        
	        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
	        
	        painelDesenho = new PainelPintura();
	        painelDesenho.configurarPainel();
	        getContentPane().add(painelDesenho, BorderLayout.CENTER);
	    }

	public static void main(String[] args) {
		Program prog = new Program();
		prog.montarTela();
		prog.setVisible(true);
		
	}

}

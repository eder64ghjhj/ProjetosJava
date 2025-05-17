package mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EventoMouse {
    public static void main(String[] args) {
        // Criando a janela
        JFrame janela = new JFrame("Eventos com AWT e Swing");
        
        // Criando um painel
        JPanel painel = new JPanel();
        
        // Definindo o layout do painel
        painel.setLayout(new BorderLayout());
        
        // Criando um rótulo (JLabel) para exibir informações
        JLabel rotulo = new JLabel("Interaja com a janela!");
        rotulo.setHorizontalAlignment(JLabel.CENTER);
        
        // Adicionando o rótulo ao painel
        painel.add(rotulo, BorderLayout.CENTER);
        
        // Adicionando o painel à janela
        janela.add(painel);
        
        // Evento de clique do mouse
        painel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rotulo.setText("Você clicou no mouse!");
            }
        });
        
        // Evento de tecla pressionada
        janela.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char tecla = e.getKeyChar();
                rotulo.setText("Você pressionou a tecla: " + tecla);
            }
        });
        
        // Habilitando a janela para receber eventos de teclado
        janela.setFocusable(true);
        
        // Configurações finais da janela
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
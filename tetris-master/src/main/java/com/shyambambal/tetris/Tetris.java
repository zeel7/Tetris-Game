package com.shyambambal.tetris;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Shyam bambal
 */
public class Tetris {

    public static void main(String[] args) {
        SidePanel sidePanel = new SidePanel();        
        Board board = new Board(sidePanel);
        JFrame frame = new JFrame("Tetris: By Shyam bambal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(board);
        frame.getContentPane().add(sidePanel);
        frame.setLocation(700,50);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
    }
}

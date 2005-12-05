// AUTOMATICALLY GENERATED by FreeHEP JAVAGraphics2D

package org.freehep.graphicsio.java.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import org.freehep.graphics2d.VectorGraphics;
import org.freehep.graphicsio.test.TestingPanel;

public class TestImages extends TestingPanel {

    public TestImages(String[] args) throws Exception {
        super(args);
        setName("TestImages");
    } // contructor

    public void paint(Graphics g) {
        vg[0] = VectorGraphics.create(g);
        vg[0].setCreator("FreeHEP JAVAGraphics2D");
        Paint0s0.paint(vg);
    } // paint

    private static class Paint0s0 {
        public static void paint(VectorGraphics[] vg) {
            vg[0].setColor(new Color(0, 0, 0, 255));
            vg[0].setFont(new Font("Dialog", 0, 12));
            vg[1] = (VectorGraphics) vg[0].create();
            vg[1].setClip(0, 0, 600, 600);
            vg[1].setBackground(new Color(255, 200, 0, 255));
            vg[1].clearRect(0, 0, 600, 600);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 0, 0,
                    new Color(0, 0, 0, 255), null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 225, 150, 75, 150, new Color(
                    0, 0, 0, 255), null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 300, 0, 412, 225, 64, 64,
                    192, 192, new Color(0, 0, 0, 255), null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 450, 0, 525, 300, 256, 256,
                    0, 0, new Color(0, 0, 0, 255), null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 0, 300, null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 225, 450, 75, 150, null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 300, 300, 412, 525, 64, 64,
                    192, 192, null);
            vg[1].drawImage(new BufferedImage(256, 256,
                    BufferedImage.TYPE_INT_ARGB), 450, 300, 525, 600, 256, 256,
                    0, 0, null);
            vg[1].dispose();
        } // paint
    } // class Paint0s0

    private VectorGraphics vg[] = new VectorGraphics[2];

    public static void main(String[] args) throws Exception {
        new TestImages(args).runTest(600, 600);
    }
} // class

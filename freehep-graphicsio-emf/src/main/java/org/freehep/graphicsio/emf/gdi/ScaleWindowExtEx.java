// Copyright 2002, FreeHEP.
package org.freehep.graphicsio.emf.gdi;

import java.io.IOException;

import org.freehep.graphicsio.emf.EMFInputStream;
import org.freehep.graphicsio.emf.EMFOutputStream;
import org.freehep.graphicsio.emf.EMFTag;

/**
 * ScaleWindowExtEx TAG.
 * 
 * @author Mark Donszelmann
 * @version $Id: freehep-graphicsio-emf/src/main/java/org/freehep/graphicsio/emf/gdi/ScaleWindowExtEx.java c0f15e7696d3 2007/01/22 19:26:48 duns $
 */
public class ScaleWindowExtEx extends EMFTag {

    private int xNum, xDenom, yNum, yDenom;

    public ScaleWindowExtEx() {
        super(32, 1);
    }

    public ScaleWindowExtEx(int xNum, int xDenom, int yNum, int yDenom) {
        this();
        this.xNum = xNum;
        this.xDenom = xDenom;
        this.yNum = yNum;
        this.yDenom = yDenom;
    }

    public EMFTag read(int tagID, EMFInputStream emf, int len)
            throws IOException {

        return new ScaleWindowExtEx(
            emf.readLONG(),
            emf.readLONG(),
            emf.readLONG(),
            emf.readLONG());
    }

    public void write(int tagID, EMFOutputStream emf) throws IOException {
        emf.writeLONG(xNum);
        emf.writeLONG(xDenom);
        emf.writeLONG(yNum);
        emf.writeLONG(yDenom);
    }

    public String toString() {
        return super.toString() +
            "\n  xNum: " + xNum +
            "\n  xDenom: " + xDenom +
            "\n  yNum: " + yNum +
            "\n  yDenom: " + yDenom;
    }
}

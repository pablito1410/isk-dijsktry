package pl.pk.isk.dijkstry.ui;

import org.graphstream.ui.swingViewer.DefaultView;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    private Viewer viewer;
    private LayoutFrame layoutFrame;

    public UserInterface(Viewer viewer, LayoutFrame layoutFrame) {
        this.viewer = viewer;
        this.layoutFrame = layoutFrame;
//        this.layoutFrame.addViewer(viewer);
//        this.layoutFrame.addSlider();
//        this.layoutFrame.addButton();
    }

    public void addListener(ViewerListener listener) {
        ViewerPipe vp = viewer.newViewerPipe();
        vp.addViewerListener(listener);
    }

    public void display() {
        layoutFrame.display();
    }

    public void addSlider() {
        layoutFrame.addSlider();
    }

    public void addButton(JButton button) {
        layoutFrame.addButton(button);
    }
}

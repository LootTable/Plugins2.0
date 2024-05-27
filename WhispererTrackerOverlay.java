package com.yourname.whisperertracker;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

import javax.inject.Inject;
import java.awt.*;

public class WhispererTrackerOverlay extends Overlay {

    private final PanelComponent panelComponent = new PanelComponent();
    private boolean thresholdReached;

    @Inject
    public WhispererTrackerOverlay() {
        setPosition(OverlayPosition.TOP_LEFT);
        setLayer(OverlayLayer.ABOVE_WIDGETS);
        setPriority(OverlayPriority.HIGH);
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        panelComponent.getChildren().clear();

        if (thresholdReached) {
            panelComponent.getChildren().add(LineComponent.builder()
                    .left("Whisperer")
                    .right("Special Attack Soon!")
                    .build());
        }

        return panelComponent.render(graphics);
    }

    public void setThresholdReached(boolean thresholdReached) {
        this.thresholdReached = thresholdReached;
    }
}

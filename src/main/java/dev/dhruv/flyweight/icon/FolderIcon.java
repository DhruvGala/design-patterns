package dev.dhruv.flyweight.icon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FolderIcon implements Icon {
    private final Logger logger = LoggerFactory.getLogger(FolderIcon.class);

    private final String color;
    private final String imageName;

    public FolderIcon(String color, String imageName) {
        this.color = color;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        logger.info("drawing folder_{} of color:{} at coordinates({},{})", imageName, color, x, y);
    }
}

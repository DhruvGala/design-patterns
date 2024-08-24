package dev.dhruv.flyweight.icon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileIcon implements Icon {
    private final Logger logger = LoggerFactory.getLogger(FileIcon.class);

    private final String type;
    private final String imageName;

    public FileIcon(String type, String imageName) {
        this.type = type;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        logger.info("drawing image_{} of type:{} at coordinates({},{})", imageName, type, x, y);
    }
}

package dev.dhruv.flyweight.icon;

import org.junit.jupiter.api.Test;

public class IconFactoryTest {

    @Test
    public void testIconCache() throws IllegalAccessException {
        IconFactory iconFactory = new IconFactory();

        assert iconFactory.getIconCache().isEmpty();

        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100,200);

        assert iconFactory.getIconCache().size() == 1;
        assert iconFactory.getIconCache().containsKey("file");

        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(250, 300);

        assert iconFactory.getIconCache().size() == 2;
        assert iconFactory.getIconCache().containsKey("folder");

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(200, 50);

        assert iconFactory.getIconCache().size() == 2;

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(300, 250);

        assert iconFactory.getIconCache().size() == 2;
    }
}

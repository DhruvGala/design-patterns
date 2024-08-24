package dev.dhruv.flyweight.icon;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private final Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) throws IllegalAccessException {
        if (iconCache.containsKey(key)) {
            return  iconCache.get(key);
        } else {
            Icon icon;
            if (key.equals("file")) {
                icon = new FileIcon("document", "sunflower.png");
            } else if (key.equals("folder")) {
                icon = new FolderIcon("blue", "folder.png");
            } else {
                throw new IllegalAccessException("Unsupported icon type :" + key);
            }
            iconCache.put(key, icon);
            return icon;
        }
    }

    public Map<String, Icon> getIconCache() {
        return iconCache;
    }
}

package net.runelite.client.plugins.currentworld;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("currentworld")
public interface CurrentWorldConfig extends Config {
    @ConfigItem(
            position = 1,
            keyName = "showWorldType",
            name = "Show the current world type",
            description = "Toggle the display of the current world type"
    )
    default boolean showWorldType() {
        return false;
    }
}
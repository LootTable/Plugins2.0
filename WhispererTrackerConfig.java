package com.yourname.whisperertracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("whisperertracker")
public interface WhispererTrackerConfig extends Config {
    @ConfigItem(
        keyName = "notifyThresholds",
        name = "Notify Thresholds",
        description = "Notify when Whisperer is about to perform a special attack"
    )
    default boolean notifyThresholds() {
        return true;
    }
}

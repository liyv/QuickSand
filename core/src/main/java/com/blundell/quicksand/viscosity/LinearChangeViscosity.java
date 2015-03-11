package com.blundell.quicksand.viscosity;

/**
 * Speeds up over time until 0 duration
 */
public class LinearChangeViscosity implements Viscosity {
    private static final int DEFAULT_MAX_VIEWS = 10;

    private final int maxViews;

    public static Viscosity defaultInstance() {
        return new LinearChangeViscosity(DEFAULT_MAX_VIEWS);
    }

    public LinearChangeViscosity(int maxViews) {
        this.maxViews = maxViews;
    }

    @Override
    public long calculateDuration(long currentDuration, long viewCount) {
        if (viewCount >= maxViews) {
            return 0;
        }
        if (viewCount == 1) {
            return currentDuration;
        }

        double viewCountAsPercent = (double) maxViews / viewCount;
        return (long) (currentDuration - (currentDuration / viewCountAsPercent));
    }
}

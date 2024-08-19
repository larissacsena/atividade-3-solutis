package a55.services;

public class CallCalculator {

    private static final int INCLUDED_MINUTES = 100;
    private static final int BONUS_MINUTES_VAIVAI = 50;
    private static final double OVERAGE_COST_OTHER = 0.65;
    private static final double OVERAGE_COST_VAIVAI = 0.20;

    private int remainingMinutes = INCLUDED_MINUTES;
    private int remainingVaiVaiMinutes = BONUS_MINUTES_VAIVAI;
    private double totalOverageCost = 0.0;

    public void processCall(char callType, int minutes) {
        switch (callType) {
            case 'o':
                processOtherOperatorsCall(minutes);
                break;
            case 'v':
                processVaiVaiCall(minutes);
                break;
            case 'f':
                processLandlineCall(minutes);
                break;
        }
    }

    private void processOtherOperatorsCall(int minutes) {
        remainingMinutes -= minutes;
        if (remainingMinutes < 0) {
            totalOverageCost += Math.abs(remainingMinutes) * OVERAGE_COST_OTHER;
            remainingMinutes = 0;
        }
    }

    private void processVaiVaiCall(int minutes) {
        if (minutes <= remainingVaiVaiMinutes) {
            remainingVaiVaiMinutes -= minutes;
        } else {
            minutes -= remainingVaiVaiMinutes;
            remainingVaiVaiMinutes = 0;
            processOtherOperatorsCall(minutes);
        }
        if (remainingMinutes < 0) {
            totalOverageCost += Math.abs(remainingMinutes) * OVERAGE_COST_VAIVAI;
            remainingMinutes = 0;
        }
    }

    private void processLandlineCall(int minutes) {
        int adjustedMinutes = minutes / 2;
        remainingMinutes -= adjustedMinutes;
        if (remainingMinutes < 0) {
            totalOverageCost += Math.abs(remainingMinutes) * OVERAGE_COST_OTHER;
            remainingMinutes = 0;
        }
    }

    public int getRemainingMinutes() {
        return remainingMinutes;
    }

    public int getRemainingVaiVaiMinutes() {
        return remainingVaiVaiMinutes;
    }

    public int getTotalMinutes() {
        return remainingMinutes + remainingVaiVaiMinutes;
    }

    public double getTotalOverageCost() {
        return totalOverageCost;
    }
}

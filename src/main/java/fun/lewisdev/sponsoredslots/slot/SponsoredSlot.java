package fun.lewisdev.sponsoredslots.slot;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class SponsoredSlot {

    public boolean isClaimed() {
        return false;
    }

    public final long getExpiryTime() {
        return 0L;
    }

    public long getTimeLeft() {
        return 0L;
    }

    public UUID getOwner() {
        return null;
    }

    public String getCommand() {
        return null;
    }

    public double getPrice() {
        return 0.0;
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {

    }

    public boolean isCustomMessageSet() {
        return false;
    }

    public void setCustomMessageSet(boolean customMessageSet) {
    }

    public void setClaimed(boolean claimed) {

    }

    public void setTimeLeft(long timeLeft) {

    }

    public ItemStack getCachedHead() {
        return null;
    }

    public OfflinePlayer getOfflinePlayer() {
        return null;
    }

    public String getCurrencyProvider() {
        return null;
    }

}

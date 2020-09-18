package fun.lewisdev.sponsoredslots.event;

import fun.lewisdev.sponsoredslots.slot.SponsoredSlot;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SlotExpiredEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private OfflinePlayer player;
    private SponsoredSlot slot;

    public SlotExpiredEvent(OfflinePlayer player, SponsoredSlot slot) {
        this.player = player;
        this.slot = slot;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    public SponsoredSlot getSponsoredSlot() {
        return slot;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
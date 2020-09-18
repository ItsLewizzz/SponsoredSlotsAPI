package fun.lewisdev.sponsoredslots.event;

import fun.lewisdev.sponsoredslots.slot.SponsoredSlot;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SlotPurchaseEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private Player player;
    private double price;
    private SponsoredSlot slot;

    public SlotPurchaseEvent(Player player, double price, SponsoredSlot slot) {
        this.player = player;
        this.price = price;
        this.slot = slot;
    }

    public Player getPlayer() {
        return player;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
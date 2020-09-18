package fun.lewisdev.sponsoredslots;

import fun.lewisdev.sponsoredslots.currency.ICurrency;
import fun.lewisdev.sponsoredslots.slot.SlotManager;

public interface SponsoredSlotsAPI {

    void registerCurrency(ICurrency currency);

    SlotManager getSlotManager();

}

package fun.lewisdev.sponsoredslots.currency;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public interface ICurrency {

    String getPluginName();

    boolean onEnable(JavaPlugin plugin);

    double getBalance(Player player);

    void withdraw(Player player, double amount);

}

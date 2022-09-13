package ahaha.info.wnpctheanother;

import org.bukkit.Location;

public interface WNPC {


    NPCSignify getSignify();

    // location
    Location getLocation();

    void teleport(Location loc);

    // display name
    String getDisplayName();

    String setDisplayName();

    //
}

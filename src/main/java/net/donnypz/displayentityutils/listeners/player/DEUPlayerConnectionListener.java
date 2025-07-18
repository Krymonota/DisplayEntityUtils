package net.donnypz.displayentityutils.listeners.player;

import net.donnypz.displayentityutils.managers.DEUUser;
import net.donnypz.displayentityutils.managers.DisplayAnimationManager;
import net.donnypz.displayentityutils.managers.DisplayGroupManager;
import net.donnypz.displayentityutils.utils.DisplayEntities.particles.AnimationParticleBuilder;
import net.donnypz.displayentityutils.utils.command.DEUCommandUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class DEUPlayerConnectionListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();

        DEUUser user = DEUUser.getUser(player);
        if (user != null){
            user.remove();
        }
    }
}

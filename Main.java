package ExamplePlugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;

public class Main extends PluginBase implements Listener{
	@EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=false)
	public void onJoin(PlayerJoinEvent event){
		event.getPlayer().kick();
	}
}
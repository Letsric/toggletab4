package letsric.toggletab4.listener;

import net.labymod.api.Laby;
import net.labymod.api.client.options.MinecraftInputMapping;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;

public class gameTickListener {

  private final MinecraftInputMapping playerListButton;

  public gameTickListener() {
    this.playerListButton = Laby.labyAPI().minecraft().options().getInputMapping("key.playerlist");
  }

  @Subscribe
  public void onGameTick(GameTickEvent event) {
    if (keyListener.toggled) {
      if (!playerListButton.isActuallyDown()) {
        playerListButton.press();
      }
    }
  }

}

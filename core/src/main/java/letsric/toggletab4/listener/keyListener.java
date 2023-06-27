package letsric.toggletab4.listener;

import net.labymod.api.Laby;
import net.labymod.api.client.options.MinecraftInputMapping;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.input.KeyEvent;
import net.labymod.api.event.client.input.KeyEvent.State;

public class keyListener {

  private final MinecraftInputMapping playerListButton;

  public keyListener() {
    this.playerListButton = Laby.labyAPI().minecraft().options().getInputMapping("key.playerlist");
  }

  @Subscribe
  public void onKeyPress(KeyEvent event) {
    if (event.state().equals(State.PRESS)) {
      if (this.playerListButton.isActuallyDown()) {
        gameTickListener.toggled = !gameTickListener.toggled;
      }
    }
  }

}

package letsric.toggletab4;

import letsric.toggletab4.listener.gameTickListener;
import letsric.toggletab4.listener.keyListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class toggletab4 extends LabyAddon<toggletab4Config> {


  @Override
  protected void enable() {
    this.registerSettingCategory();
    this.registerListener(new keyListener());
    this.registerListener(new gameTickListener());
  }

  @Override
  protected Class<toggletab4Config> configurationClass() {
    return toggletab4Config.class;
  }
}

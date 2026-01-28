/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.brunixon_two.placer.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.brunixon_two.placer.client.gui.PlacerGuiScreen;

@EventBusSubscriber(Dist.CLIENT)
public class PlacerModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(PlacerModMenus.PLACER_GUI.get(), PlacerGuiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}
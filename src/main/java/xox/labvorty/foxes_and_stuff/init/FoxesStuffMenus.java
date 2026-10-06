package xox.labvorty.foxes_and_stuff.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xox.labvorty.foxes_and_stuff.FoxesStuffMod;
import xox.labvorty.foxes_and_stuff.inventory.FoxInventoryMenu;
import xox.labvorty.foxes_and_stuff.screen.FoxInventoryScreen;

@EventBusSubscriber
public class FoxesStuffMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, FoxesStuffMod.MOD_ID);
    public static final DeferredHolder<MenuType<?>, MenuType<FoxInventoryMenu>> FOX_INVENTORY = MENUS.register(
            "fox_inventory",
            () -> IMenuTypeExtension.create(FoxInventoryMenu::createClientMenu)
    );

    @SubscribeEvent
    public static void registerScreen(RegisterMenuScreensEvent event) {
        event.register(FOX_INVENTORY.get(), FoxInventoryScreen::new);
    }
}

package xox.labvorty.foxes_and_stuff;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;
import xox.labvorty.foxes_and_stuff.data.configs.ClientConfig;
import xox.labvorty.foxes_and_stuff.init.FoxesStuffItems;
import xox.labvorty.foxes_and_stuff.init.FoxesStuffMenus;

@Mod(FoxesStuffMod.MOD_ID)
public class FoxesStuffMod {
    public static final String MOD_ID = "foxesstuff";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FoxesStuffMod(IEventBus modEventBus, ModContainer modContainer) {
        FoxesStuffMenus.MENUS.register(modEventBus);
        FoxesStuffItems.ITEMS.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
    }

    public static ResourceLocation location(String string) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, string);
    }
}

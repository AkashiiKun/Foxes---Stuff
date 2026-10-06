package xox.labvorty.foxes_and_stuff.compat.vortylib;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import xox.labvorty.foxes_and_stuff.data.configs.ClientConfig;
import xox.labvorty.vortylib.data.config.ConfigHolder;
import xox.labvorty.vortylib.data.config.ModEntry;
import xox.labvorty.vortylib.data.config.ModRegistry;
import xox.labvorty.vortylib.data.config.SocialType;

import java.util.List;

public class VortyLibCompat {
    public static void init() {
        ModRegistry.register(
                ModEntry.builder("foxesstuff", Component.literal("Foxes & Stuff"))
                        .featuredItemsChosen(List.of(ResourceLocation.parse("minecraft:sweet_berries")))
                        .clientConfig(
                                ConfigHolder.builder(ClientConfig.SPEC)
                                        .addBoolean(Component.literal("Render Fluff"), Component.literal("Should foxes have additional fluff texture"), ClientConfig.RENDER_FLUFF, true)
                                        .build()
                        )
                        //.addSocial(SocialType.modrinth("https://modrinth.com/mod/"))
                        //.addSocial(SocialType.curseforge("https://www.curseforge.com/minecraft/mc-mods/"))
                        //.addSocial(SocialType.github("https://github.com/Vortianski/"))
                        .addSocial(SocialType.discord("https://discord.gg/ZesGqhGnAN"))
                        .addSocial(SocialType.kofi("https://ko-fi.com/vortianski"))
                        .build()
        );
    }
}

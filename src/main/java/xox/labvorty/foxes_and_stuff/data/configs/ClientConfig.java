package xox.labvorty.foxes_and_stuff.data.configs;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfig {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue RENDER_FLUFF = BUILDER
            .comment("Should foxes have additional fluff texture")
            .define("renderFluff", true);

    public static final ModConfigSpec SPEC = BUILDER.build();
}

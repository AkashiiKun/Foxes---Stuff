package xox.labvorty.foxes_and_stuff.mixins.client;

import net.minecraft.client.model.FoxModel;
import net.minecraft.client.model.geom.ModelPart;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import xox.labvorty.foxes_and_stuff.mixin_helpers.FoxModelAccessor;

@Mixin(FoxModel.class)
public class FoxModelMixin implements FoxModelAccessor {
    @Shadow
    @Final
    private ModelPart tail;

    @Shadow
    @Final
    private ModelPart body;

    @Override
    public ModelPart foxesstuff$getTail() {
        return tail;
    }

    @Override
    public ModelPart foxesstuff$getBody() {
        return body;
    }
}

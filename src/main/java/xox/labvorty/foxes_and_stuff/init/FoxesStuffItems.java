package xox.labvorty.foxes_and_stuff.init;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.DyedItemColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xox.labvorty.foxes_and_stuff.FoxesStuffMod;
import xox.labvorty.foxes_and_stuff.items.GoldenBerriesItem;
import xox.labvorty.foxes_and_stuff.items.armor.FoxArmorItem;

public class FoxesStuffItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(FoxesStuffMod.MOD_ID);
    public static final DeferredHolder<Item, Item> GOLDEN_BERRIES = ITEMS.register("golden_berries", GoldenBerriesItem::new);

    public static final DeferredHolder<Item, FoxArmorItem> LEATHER_FOX_ARMOR = ITEMS.register(
            "leather_fox_armor",
            () -> new FoxArmorItem(
                    ArmorMaterials.LEATHER,
                    new Item.Properties().durability(
                            ArmorItem.Type.BODY.getDurability(5)
                    ).component(
                            DataComponents.DYED_COLOR,
                            new DyedItemColor(DyedItemColor.LEATHER_COLOR, false)
                    )
            )
    );
    public static final DeferredHolder<Item, FoxArmorItem> IRON_FOX_ARMOR = ITEMS.register(
            "iron_fox_armor",
            () -> new FoxArmorItem(
                    ArmorMaterials.IRON,
                    new Item.Properties().durability(
                            ArmorItem.Type.BODY.getDurability(15)
                    )
            )
    );
    public static final DeferredHolder<Item, FoxArmorItem> GOLD_FOX_ARMOR = ITEMS.register(
            "gold_fox_armor",
            () -> new FoxArmorItem(
                    ArmorMaterials.GOLD,
                    new Item.Properties().durability(
                            ArmorItem.Type.BODY.getDurability(7)
                    )
            )
    );
    public static final DeferredHolder<Item, FoxArmorItem> DIAMOND_FOX_ARMOR = ITEMS.register(
            "diamond_fox_armor",
            () -> new FoxArmorItem(
                    ArmorMaterials.DIAMOND,
                    new Item.Properties().durability(
                            ArmorItem.Type.BODY.getDurability(33)
                    )
            )
    );
    public static final DeferredHolder<Item, FoxArmorItem> NETHERITE_FOX_ARMOR = ITEMS.register(
            "netherite_fox_armor",
            () -> new FoxArmorItem(
                    ArmorMaterials.NETHERITE,
                    new Item.Properties().durability(
                            ArmorItem.Type.BODY.getDurability(37)
                    ).fireResistant()
            )
    );
}

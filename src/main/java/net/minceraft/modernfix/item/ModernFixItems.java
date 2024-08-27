package net.minceraft.modernfix.item;

import net.minceraft.modernfix.ModernFix;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModernFixItems
{
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, ModernFix.MOD_ID);

    public static final RegistryObject<Item> SNIFFERITE = ITEMS.register("snifferite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SNIFFERITE_RAW = ITEMS.register("raw_snifferite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

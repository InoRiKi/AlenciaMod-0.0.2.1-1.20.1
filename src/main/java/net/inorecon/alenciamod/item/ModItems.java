package net.inorecon.alenciamod.item;

import net.inorecon.alenciamod.AlenciaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlenciaMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKARIUM_INGOT = ITEMS.register("skarium_ingot",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SKARIUM = ITEMS.register("raw_skarium",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

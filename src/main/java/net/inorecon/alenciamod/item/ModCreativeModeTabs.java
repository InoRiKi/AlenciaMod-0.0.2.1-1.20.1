package net.inorecon.alenciamod.item;

import net.inorecon.alenciamod.AlenciaMod;
import net.inorecon.alenciamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlenciaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALENCIA_TAB =CREATIVE_MODE_TABS.register("alencia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.alencia_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.SKARIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_SKARIUM.get());

                        pOutput.accept(ModBlocks.SKARIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.SKARIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SKARIUM_ORE.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

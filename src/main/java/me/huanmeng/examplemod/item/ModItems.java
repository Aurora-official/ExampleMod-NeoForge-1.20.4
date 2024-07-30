package me.huanmeng.examplemod.item;

import me.huanmeng.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MODID);

    // 方法一
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");

    public static void registryItem(IEventBus e) {
        ITEMS.register(e);
    }
}

package io.github.mooy1.infinityexpansion.commands;

import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.mooy1.infinityexpansion.items.storage.StorageUnit;
import io.github.mooy1.infinitylib.commands.SubCommand;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

public final class SetData extends SubCommand {

    public SetData() {
        super("setdata", "設定你所看的方塊的 slimefun 方塊資料", "infinityexpansion.setdata");
    }

    @Override
    protected void execute(@Nonnull CommandSender commandSender, @Nonnull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("只有玩家可以使用該指令!");
            return;
        }

        if (strings.length != 2) {
            commandSender.sendMessage(ChatColor.RED + "你必須指定鍵和值!");
            return;
        }

        Player p = (Player) commandSender;

        Block target = p.getTargetBlockExact(8, FluidCollisionMode.NEVER);

        if (target == null || target.getType() == Material.AIR) {
            p.sendMessage(ChatColor.RED + "你必須指著一個方塊才能執行該指令!");
            return;
        }

        String id = BlockStorage.getLocationInfo(target.getLocation(), "id");

        if (id == null) {
            p.sendMessage(ChatColor.RED + "你必須指著一個 Slimefun 方塊才能執行該指令!");
            return;
        }

        if (strings[0].equals("id")) {
            p.sendMessage(ChatColor.RED + "你不能更改方塊的 id，這可能會導致內部問題!");
            return;
        }

        if (strings[1].equals("\\remove")) {
            p.sendMessage(ChatColor.GREEN + "已移除 " + id + "中 '" + strings[1] + "' 的值");
            BlockStorage.addBlockInfo(target, strings[1], null);
        }
        else {
            p.sendMessage(ChatColor.GREEN + "已設置 " + id + "中 '" + strings[0] + "' 的值為 '" + strings[1] + "'");
            BlockStorage.addBlockInfo(target, strings[0], strings[1]);
        }

        SlimefunItem unit = SlimefunItem.getById(id);
        if (unit instanceof StorageUnit) {
            ((StorageUnit) unit).reloadCache(target);
        }
    }

    @Override
    protected void complete(@Nonnull CommandSender commandSender, @Nonnull String[] strings, @Nonnull List<String> list) {
        if (!(commandSender instanceof Player)) {
            return;
        }

        Player p = (Player) commandSender;

        Block target = p.getTargetBlockExact(8, FluidCollisionMode.NEVER);

        if (target == null || target.getType() == Material.AIR) {
            return;
        }

        if (strings.length == 1) {
            if (BlockStorage.hasBlockInfo(target)) {
                list.addAll(BlockStorage.getLocationInfo(target.getLocation()).getKeys());
                list.remove("id");
            }
        }
        else if (strings.length == 2 && !strings[1].equals("id")) {
            String current = BlockStorage.getLocationInfo(target.getLocation(), strings[1]);
            if (current != null) {
                list.add(current);
                list.add("\\remove");
            }
        }
    }

}

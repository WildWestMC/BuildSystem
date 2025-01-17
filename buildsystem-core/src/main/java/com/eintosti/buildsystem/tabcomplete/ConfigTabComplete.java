/*
 * Copyright (c) 2022, Thomas Meaney
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.eintosti.buildsystem.tabcomplete;

import com.eintosti.buildsystem.BuildSystem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author einTosti
 */
public class ConfigTabComplete implements TabCompleter {

    public ConfigTabComplete(BuildSystem plugin) {
        plugin.getCommand("config").setTabCompleter(this);
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        if (sender.hasPermission("buildsystem.config")) {
            arrayList.add("reload");
        }

        return arrayList;
    }
}
package com.jwebmp.plugins.materialdesignicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class MaterialDesignIconsExclusionsModule implements IGuiceScanModuleExclusions<MaterialDesignIconsExclusionsModule>, IGuiceScanJarExclusions<MaterialDesignIconsExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.materialdesignicons"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("material-design-icons.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("material-design-icons-" + digit + "*.jar");
        return jars;
    }
}

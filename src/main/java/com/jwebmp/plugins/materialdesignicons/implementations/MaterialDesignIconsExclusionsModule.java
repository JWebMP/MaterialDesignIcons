package com.jwebmp.plugins.materialdesignicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class MaterialDesignIconsExclusionsModule
		implements IGuiceScanModuleExclusions<MaterialDesignIconsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.materialdesignicons");
		return strings;
	}
}

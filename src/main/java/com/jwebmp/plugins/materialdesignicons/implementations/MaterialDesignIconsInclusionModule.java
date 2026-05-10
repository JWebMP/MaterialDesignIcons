package com.jwebmp.plugins.materialdesignicons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class MaterialDesignIconsInclusionModule implements IGuiceScanModuleInclusions<MaterialDesignIconsInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.materialdesignicons");
		return set;
	}
}


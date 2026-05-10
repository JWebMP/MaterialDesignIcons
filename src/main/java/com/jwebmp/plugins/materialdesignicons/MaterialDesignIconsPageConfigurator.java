package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Google Material Design Icons — registers material-icons CSS via npm.
 */
@PluginInformation(pluginName = "MaterialDesignIcons",
		pluginUniqueName = "material-design-icons",
		pluginDescription = "Google Material Design Icons — the official icon set from Google with 900+ icons across 5 themes (Filled, Outlined, Rounded, TwoTone, Sharp).",
		pluginVersion = "1.13.12",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "Official Google Material Design icon set for web applications",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://google.github.io/material-design-icons",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://google.github.io/material-design-icons/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/material-design-icons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "material-design-icons",
		pluginModuleName = "com.jwebmp.plugins.materialdesignicons",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "material-icons", version = "^1.13.12")
@NgStyleSheet("node_modules/material-icons/iconfont/material-icons.css")
public class MaterialDesignIconsPageConfigurator
		implements IPageConfigurator<MaterialDesignIconsPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}

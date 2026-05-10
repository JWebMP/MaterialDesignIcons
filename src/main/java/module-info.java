import com.jwebmp.plugins.materialdesignicons.implementations.MaterialDesignIconsInclusionModule;

module com.jwebmp.plugins.materialdesignicons {

	exports com.jwebmp.plugins.materialdesignicons;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.materialdesignicons.MaterialDesignIconsPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.materialdesignicons.implementations.MaterialDesignIconsExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with MaterialDesignIconsInclusionModule;

	opens com.jwebmp.plugins.materialdesignicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}

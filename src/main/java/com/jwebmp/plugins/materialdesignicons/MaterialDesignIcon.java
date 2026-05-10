package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public class MaterialDesignIcon<J extends MaterialDesignIcon<J>>
		extends Italic<J>
		implements IIcon<IComponentHierarchyBase<?,?>, J>
{
	private MaterialDesignIconThemes theme;
	private MaterialDesignIcons icon;
	private MaterialDesignIconSize size;
	private MaterialDesignIconColours colour;

	private boolean inactive;

	public MaterialDesignIcon()
	{
		this(null);
	}

	public MaterialDesignIcon(MaterialDesignIcons icon)
	{
		this(MaterialDesignIconThemes.Filled, icon);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon)
	{
		this(theme, icon, MaterialDesignIconSize.$24);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon, MaterialDesignIconSize size)
	{
		this(theme, icon, size, MaterialDesignIconColours.Light);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon, MaterialDesignIconSize size, MaterialDesignIconColours colour)
	{
		this.theme = theme;
		this.icon = icon;
		this.size = size;
		this.colour = colour;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass("material-icons");
			addClass(colour);
			addClass(size);
			addClass(theme);
			if (inactive)
			{
				addClass("md-inactive");
			}
			if (icon == null)
			{
				icon = MaterialDesignIcons.question_answer;
			}
			setText(icon.toString());
		}
		super.preConfigure();
	}

	public MaterialDesignIconThemes getTheme()
	{
		return theme;
	}

	@SuppressWarnings("unchecked")
	public J setTheme(MaterialDesignIconThemes theme)
	{
		this.theme = theme;
		return (J) this;
	}

	public MaterialDesignIcons getIcon()
	{
		return icon;
	}

	@SuppressWarnings("unchecked")
	public J setIcon(MaterialDesignIcons icon)
	{
		this.icon = icon;
		return (J) this;
	}

	public MaterialDesignIconSize getSize()
	{
		return size;
	}

	@SuppressWarnings("unchecked")
	public J setSize(MaterialDesignIconSize size)
	{
		this.size = size;
		return (J) this;
	}

	public MaterialDesignIconColours getColour()
	{
		return colour;
	}

	@SuppressWarnings("unchecked")
	public J setColour(MaterialDesignIconColours colour)
	{
		this.colour = colour;
		return (J) this;
	}

	public boolean isInactive()
	{
		return inactive;
	}

	@SuppressWarnings("unchecked")
	public J setInactive(boolean inactive)
	{
		this.inactive = inactive;
		return (J) this;
	}

	@Override
	public String getClassName()
	{
		return "material-icons " + colour + " " + size + " " + theme + (inactive ? "inactive" : "") + icon.toString();
	}

	@Override
	public IComponentHierarchyBase<?,?> getIconComponent()
	{
		return this;
	}
}

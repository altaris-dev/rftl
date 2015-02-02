package me.msanders.rftl;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable(){
		FurnaceRecipe rftl = new FurnaceRecipe(new ItemStack(Material.LEATHER), Material.ROTTEN_FLESH);
		Bukkit.getServer().addRecipe(rftl);
	}
	public void onDisable(){
		Bukkit.getServer().clearRecipes();
	}

}

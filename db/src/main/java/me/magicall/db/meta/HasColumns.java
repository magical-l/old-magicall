package me.magicall.db.meta;

/**
 * 在数据库中有"列"的东东.
 * 
 * @author MaGiCalL
 */
public interface HasColumns {

	DbColumn[] getColumnsArray();
}

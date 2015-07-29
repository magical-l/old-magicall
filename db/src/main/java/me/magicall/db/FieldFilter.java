package me.magicall.db;

import me.magicall.db.meta.DbColumn;
import me.magicall.db.meta.TableMeta;

public interface FieldFilter {

	boolean accept(final TableMeta tableMeta, final DbColumn column);
}

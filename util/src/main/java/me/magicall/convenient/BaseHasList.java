package me.magicall.convenient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import me.magicall.util.kit.Kits;

public class BaseHasList<E> {

	protected List<E> list;

	protected BaseHasList() {
	}

	protected BaseHasList(final List<E> list) {
		this.list = list;
	}

	protected void checkList() {
		if (list == null) {
			list = buildList();
		}
	}

	protected List<E> buildList() {
		return new ArrayList<>();
	}

	protected void forEach() {
		checkList();
		for (final E e : list) {
			if (!handleElement(e)) {
				break;
			}
		}
	}

	protected boolean handleElement(final E e) {
		return true;
	}

	public void add(final E element) {
		checkList();
		list.add(element);
	}

	public void add(final E... elements) {
		checkList();
		Kits.COLL.append(list, elements);
	}

	public void add(final Collection<? extends E> elements) {
		checkList();
		list.addAll(elements);
	}

	protected List<E> getList() {
		return list;
	}

	protected void setList(final List<E> list) {
		this.list = list;
	}
}

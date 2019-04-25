package ru.job4j.tracker;

/**
 * class Tracker.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 16.04.2019
 */

import java.lang.reflect.Array;
import java.util.*;

public class Tracker {
	private final Item[] items = new Item[100];
	private int position = 0;
	private static final Random RN = new Random();

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}

	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	protected Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}

	public boolean replace(String id, Item item) {
		boolean resReplace = false;
		for (int index = 0; index < this.position; index++) {
			if (this.items[index].getId().equals(id)) {
				this.items[index] = item;
				//item.setId(this.generateId());
				resReplace = true;
				break;
			}
		}
		return resReplace;
	}

	public boolean delete(String id) {
		boolean resDelete = false;
		for (int index = 0; index < this.position; index++) {
			if (this.items != null && this.items[index].getId().equals(id)) {
				System.arraycopy(this.items, index + 1, this.items, index, this.position - index - 1);
				this.items[this.position - 1] = null;
				resDelete = true;
				break;
			}
		}
		return resDelete;
	}

	public Item[] findAll() {
		return Arrays.copyOf(items, position);
	}

	public Item[] findByName(String key) {
		int count = 0;
		Item[] result = new Item[this.position];
		for (int index = 0; index < this.position; index++) {
			if (this.items != null && this.items[index].getName().equals(key)) {
				result[count++] = this.items[index];
			}
		}
		return Arrays.copyOf(result, count);
	}
}

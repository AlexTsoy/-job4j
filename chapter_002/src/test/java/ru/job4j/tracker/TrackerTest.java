package ru.job4j.tracker;

/**
 * Test.
 *
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 16.04.2019
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2","testDescription2",1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteElementForItems() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        Item next = new Item("test2","testDescription2",12345);
        tracker.add(previous);
        tracker.add(next);
        assertTrue(tracker.delete(previous.getId()));
    }

    @Test
    public void whenNewItemFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1","test1Description",123L);
        Item item2 = new Item("test2","test2Description",1234L);
        tracker.add(item1);
        tracker.add(item2);
        Item[] result = tracker.findAll();
        Item[] item = {item1, item2};
        assertThat(result, is(item));
    }

    @Test
    public void whenNewItemFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1","test1Description",123L);
        Item item2 = new Item("test1","test2Description",1234L);
        tracker.add(item1);
        tracker.add(item2);
        Item[] result = tracker.findByName("test1");
        assertThat(result, is(tracker.findAll()));
    }

    @Test
    public void whenNewItemfindByiD() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1","test1Description",123L);
        Item item2 = new Item("test1","test1Description",1234L);
        tracker.add(item1);
        tracker.add(item2);
        Item result = tracker.findById(item2.getId());
        assertThat(item2, is(result));
    }
}

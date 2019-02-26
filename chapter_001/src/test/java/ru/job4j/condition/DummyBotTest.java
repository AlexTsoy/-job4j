package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 27.02.2019
 */
public class DummyBotTest {
    @Test
    public void whenHiBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }

    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenAnyBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Ты почему такой грубый?"),
                is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}

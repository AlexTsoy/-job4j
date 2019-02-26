package ru.job4j.condition;

/**
 * @author Alexey Tsoy (alextsoy1984@mail.ru)
 * @version 1
 * @since 27.02.2019
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question){
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)){
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)){
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}

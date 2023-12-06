package org.example.api;

@FunctionalInterface
public interface Converter<T> {
    /**
     * Конвертация строки с данными разделенные сепаратором в объект
     *
     * @param info      Строка с данными
     * @param separator Разделитель данных
     * @return Объекст с данными из строки
     */
    T from(String info, String separator);
}

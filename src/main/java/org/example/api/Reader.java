package org.example.api;

import java.io.IOException;
import java.util.List;

@FunctionalInterface
public interface Reader<T> {
    /**
     * Чтение данных из файлов в список объеков
     *
     * @param filePath Путь до файла с даннами
     * @return Список объектов
     * @throws IOException Выбрасывается при отсутствии заданого файла
     */
    List<T> read(String filePath) throws IOException;
}

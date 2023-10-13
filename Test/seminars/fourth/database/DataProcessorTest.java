package seminars.fourth.database;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {
    @Test
    public void testProcessData() {
        // Создаем мок для Database
        Database database = mock(Database.class);
        // Настраиваем его поведение
        when(database.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));

        // Создаем объект класса, который мы хотим протестировать, передавая мок в качестве зависимости
        DataProcessor dataProcessor = new DataProcessor(database);

        // Вызываем метод, который хотим протестировать
        List<String> resultSize = dataProcessor.processData("SELECT * FROM table");

        // Проверяем результат
        assertEquals(3, resultSize.size());
    }
}
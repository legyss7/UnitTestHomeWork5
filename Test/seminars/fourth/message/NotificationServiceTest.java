package seminars.fourth.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class NotificationServiceTest {
    @Test
    public void testNotify() {
        // Создаем мок
        MessageService messageService = mock(MessageService.class);

        // Создаем объект класса, который мы хотим протестировать, передавая мок в качестве зависимости
        NotificationService notificationService = new NotificationService(messageService);

        // Вызываем метод, который хотим протестировать
        notificationService.sendNotification("Привет", "Анна");

        // Проверяем, был ли вызван метод sendMessage с правильными аргументами
        verify(messageService, times(1)).sendMessage("Привет", "Анна");
    }

}
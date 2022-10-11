package ru.queue;

import java.util.Random;

public class SendService {
    Random random = new Random();

    /**
     * Эмуляция ошибок сообщений
     *
     * @param message
     * @return
     */
    public boolean send(Message message) {

        if (random.nextInt(3) % 3 == 0) {
            System.out.println("Ошибка при отправке сообщения с темой " + message.getTheme());
            return false;
        }
        System.out.println(message);
        return true;
    }
}

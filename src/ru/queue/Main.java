package ru.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // For Message part
        // Queue<Message> queue = new PriorityQueue<>();
        Deque<Message> queue = new LinkedList<>();
        fillMessages(queue);
        sendMessages(queue);

    }

    private static void fillMessages(Queue<Message> queue) {
        queue.add(
                new Message("1", "Text 5", 5)
        );
        queue.offer(
                new Message("2", "Text 7", 7)
        );
        queue.offer(
                new Message("3", "Text 2", 2)
        );
        queue.offer(
                new Message("3", "Text 1", 1)
        );
    }

    // For Message part
//    private static void sendMessages(Queue<Message> queue) {
//       while (queue.peek() != null){
//           Message message = queue.poll();
//           System.out.println(message);
//       }
//    }
    private static void sendMessages(Deque<Message> queue) {
        SendService service = new SendService();
        while (queue.peek() != null) {
            Message message = queue.poll();
            if (!service.send(message)) {
                queue.addFirst(message);
            }
        }
    }
}

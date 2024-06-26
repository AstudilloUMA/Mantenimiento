package coladoble;

import java.util.Comparator;

/**
 * A double-ended queue or deque is a linear collection that supports element
 * insertion, retrieval and removal at both ends.
 *
 * @param <T> the type of elements held in this deque
 */
public interface DoubleLinkedQueue<T> {
    // Basic operations

    /**
     * Inserts the specified element at the front of this deque.
     *
     * @param value the value to be inserted
     */
    void prepend(T value);

    /**
     * Inserts the specified element at the end of this deque.
     *
     * @param value the value to be inserted
     */
    void append(T value);


    /**
     * Deletes the first element of this deque.
     *
     * @throws DoubleLinkedQueueException if the deque is empty
     */
    void deleteFirst();

    /**
     * Deletes the last element of this deque.
     *
     * @throws DoubleLinkedQueueException if the deque is empty
     */
    void deleteLast();

    /**
     * Returns the first element of this deque.
     *
     * @throws DoubleLinkedQueueException if the deque is empty
     */
    T first();

    /**
     * Returns the last element of this deque.
     *
     * @throws DoubleLinkedQueueException if the deque is empty
     */
    T last();

    /**
     * Returns the number of elements in this deque.
     *
     * @return the number of elements in this deque
     */
    int size();

    // Complex operations
    
}

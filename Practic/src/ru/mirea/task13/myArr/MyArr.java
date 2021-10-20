package Practic.src.ru.mirea.task13.myArr;

import java.util.Iterator;

public class MyArr<E> implements Arr<E>
{
    private E[] values;

    public MyArr()
    {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e)
    {
        E[] temp = values; //указатель на объект памяти
        values = (E[]) new Object[temp.length + 1]; //создание массива большего предыдущего на 1
        System.arraycopy(temp, 0, values, 0, temp.length); //копирование элементов из temp в values
        values[values.length - 1] = e; //присваивание нового элемента в конце нового массива
        return true;
    }

    @Override
    public void delete(int index)
    {
        E[] temp = values; //указатель на объект памяти
        values = (E[]) new Object[temp.length - 1]; //создание массива меньшего предыдущего на 1
        //копирование предудущего массива с учётом удалённого элемента
        System.arraycopy(temp, 0, values, 0, index);
        int amountElemAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
    }

    @Override
    public E get(int index)
    {
        return values[index];
    }

    @Override
    public int size()
    {
        return values.length;
    }

    @Override
    public void update(int index, E e)
    {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator()
    {
        return new MyIterator<>(values);
    }
}

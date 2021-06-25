/*
Exercise 27: (3) Modify the hashCode( ) in CountedString.java by removing the
combination with id, and demonstrate that CountedString still works as a key. What is the
problem with this approach?
 */
public class Runner {
/*
Проблема:
у нас будет много одинаковых хэшкодов
т.к. строки будут одинаковые а значит у них одинаковый хэшкод.
 и при добавлении в hashset например
Будет сначала запускаться проверка на совпадение по хэшкод
а потом изза одинакового хэшкода будут проверяться обьекты через equals

И это займет много времени.
 */
}

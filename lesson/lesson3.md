
# Третье занятие

## Разбор домашнего задания

**Коммиты:**
 - [`HW1`](https://github.com/JavaWebinar/basejava/tree/ec51b1158f07789b62dadf457c25b0864a126b1d/src)
 - [`Introduce package and encapsulation`](https://github.com/JavaWebinar/basejava/commit/68e4d8652320d487a0716179e7d01723fffc4b8d)
 - [`lesson03 HW02`](https://github.com/JavaWebinar/basejava/tree/08adbede7c25bc34807c3cebecb8b67921366793/src/ru/javawebinar/basejava)
 
 
## 1. Объектная модель в Java

**Коммиты:**
 - [`Lesson03 equals&hashCode, static`](https://github.com/JavaWebinar/basejava/tree/9d8464cc24be306b0dbce112607122149ec327d8/src/ru/javawebinar/basejava)
 - [`Lesson03 implements interface`](https://github.com/JavaWebinar/basejava/tree/ba20418d59dcc998c2cab218d84ca1f7099676c8/src/ru/javawebinar/basejava/storage)
 
**Patch**
 - [`Lesson03 equals&hashCode, static`](https://github.com/vladmeh/basejava/blob/master/patch/Lesson03_equals_hashCode_static.patch)
 - [`Lesson03 implements interface`](https://github.com/vladmeh/basejava/blob/master/patch/Lesson03_implements_interface.patch)

**Ресурсы:**
- [Модификатор static](http://www.intuit.ru/studies/courses/16/16/lecture/27119)
- [10 заметок о модификаторе static в Java](http://info.javarush.ru/translation/2014/04/15/10-заметок-о-модификаторе-Static-в-Java.html)
- [Класс Object. Контракт equals/hashCode](http://www.intuit.ru/studies/courses/16/16/lecture/27129?page=1)
- [Абстрактные классы](https://www.youtube.com/watch?v=ZjiFL2Yo2fw) (youtube)
- [Интерфейсы](http://www.intuit.ru/studies/courses/16/16/lecture/27119?page=3)
- [Полиморфизм](http://www.intuit.ru/studies/courses/16/16/lecture/27119?page=4)
- [Отличия абстрактного класса от интерфейса](https://ru.stackoverflow.com/questions/235352/Отличия-абстрактного-класса-от-интерфейса-abstract-class-and-interface)
- **Дополнительно:**
    - [Что такое полиморфизм?](https://github.com/ichimax/Core-Java-Interview-Questions/blob/master/Questions/1.%20OOP.md#%D0%A7%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BB%D0%B8%D0%BC%D0%BE%D1%80%D1%84%D0%B8%D0%B7%D0%BC)
    - [Ключевое слово static](https://www.youtube.com/watch?v=GZzVfeY7yEM) (youtube)
    - [Интерфейсы, абстрактные классы, полиморфизм](https://www.youtube.com/watch?v=7NMFk2oj1-c&index=4&list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW) (youtube)
    - [Разбираемся с hashCode() и equals()](https://habrahabr.ru/post/168195/)

## 2. Сложность алгоритмов
- [Временная сложность алгоритма](https://ru.wikipedia.org/wiki/Временная_сложность_алгоритма) (wiki)
- [Вычислительная сложность](https://ru.wikipedia.org/wiki/Вычислительная_сложность) (wiki)
- [Алгоритмы и структуры данных для начинающих: сложность алгоритмов](https://tproger.ru/translations/algorithms-and-data-structures)
- [Time complexity](https://drive.google.com/file/d/0B9Ye2auQ_NsFNEJWRFJkVDA3TkU/view)
- [Бинарное дерево поиска](https://www.youtube.com/watch?time_continue=447&v=HBMlhZAOhoI) (youtube)
- **Дополнительно**
  - Легко написанная книга по алгоритмам и их сложности [Грокаем алгоритмы](https://www.ozon.ru/context/detail/id/139296295/)

## 3. Паттерн проектирования Шаблонный метод

**Коммиты:**
 - [`Lesson03 abstract storage & sorted storage`](https://github.com/JavaWebinar/basejava/tree/0bf48cf81987ddb9d59880f10920f3994923f8c0/src/ru/javawebinar/basejava)
 
**Patch:**
 - [`Lesson03 abstract storage & sorted storage`](https://github.com/vladmeh/basejava/blob/master/patch/Lesson03_abstract_storage_sorted_storage.patch)
 
**Ресурсы:**
 - [Паттерн проектирования — Шаблонный метод](https://ru.wikipedia.org/wiki/Шаблонный_метод_(шаблон_проектирования)) (wiki)
 - [Шаблонный метод (Template Method)](https://youtu.be/mNcmp-Msi6U) (youtube)
 - [Шаблонный метод](https://refactoring.guru/ru/design-patterns/template-method/java/example)
 - **Дополнительно**
   - Книга из известной серии Head First — [Паттерны проектирования](https://www.ozon.ru/context/detail/id/20216992/)

## Домашнее задание HW3

- Перед тем, как приступить к ДЗ, приведите свой проект в соответствии с коммитами. Обратите внимание, что `packages` в видео и коммитах — отличаются
- Закончите реализацию `AbstractArrayStorage`, `ArrayStorage`, `SortedArrayStorage`, используя паттерн Шаблонный метод
- В `SortedArrayStorage` храните элементы отсортированными:
  - сортировать весь массив не надо
  - не используйте `Arrays.sort()`
  - обратите внимание на бинарный поиск (Arrays.binarySearch)

package FileSystem;
/*
Абстрактный класс File с полями name и абстрактным методом long getSize().
 */
public abstract class File {
    /**
     * размер файла
     * @return
     */
    public abstract long getSize();
}

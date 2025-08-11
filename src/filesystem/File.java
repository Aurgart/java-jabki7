package filesystem;

/*
Абстрактный класс File с полями name и абстрактным методом long getSize().
 */
public abstract class File {
    /**
     * размер файла
     *
     * @return размер файла
     */
    public abstract long getSize();
}

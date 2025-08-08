package filesystem;
/*
- TextFile с полем content (строка).
 */
public class TextFile extends File{
    String content;
    public TextFile(String content) {
        this.content = content;
    }

    /**
     * размер файла
     * @return
     */
    @Override
    public long getSize() {
        return content.length();
    }
}

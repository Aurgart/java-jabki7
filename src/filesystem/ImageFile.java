package filesystem;

/*
- ImageFile с полями width, height, bytesPerPixel.
 */
public class ImageFile extends File {
    int width;
    int height;
    int bytesPerPixel;

    public ImageFile(int width, int height, int bytesPerPixel){
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }
    /**
     * Размер файла
     * @return
     */
    @Override
    public long getSize() {
        return this.width * this.height * this.bytesPerPixel;
    }
}

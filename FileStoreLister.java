import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.util.logging.Logger;


class FileStoreLister {
    final static Logger logger = Logger.getLogger(String.valueOf(FileStoreLister.class));
    public static void main(String[] args) {
        var filestores = FileSystems.getDefault().getFileStores();
        int size = 0;
        for (FileStore filestore : filestores) {
            System.out.println(filestore);
            size += 1;
        }
        System.out.println("\n\nTotal filestores found: "+size);
        while(true){

        }
    }
}



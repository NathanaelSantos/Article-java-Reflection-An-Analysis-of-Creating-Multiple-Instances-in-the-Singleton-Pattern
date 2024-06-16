import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public enum LogManager {
    INSTANCE;

    private File file;
    private FileWriter fileWrite;

    LogManager() {
        try {
            this.file = new File("file.log");
            this.fileWrite = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static LogManager getInstance() {
        return INSTANCE;
    }

    public void writerLog(String log) throws IOException {
        fileWrite.write(log + "\n");
        fileWrite.flush();
    }

    private void close() throws IOException {
        fileWrite.close();
    }
}

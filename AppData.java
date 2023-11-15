import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class AppData {
    public static void main(String[] args) {
        AppDatavalue appDatavalue = new AppDatavalue();
        StringBuilder data1 = new StringBuilder();
        String[] header = appDatavalue.getHeader();
        int[][] data = appDatavalue.getData();
        for (String string : header) {
            data1.append(string).append(";   ");
        }
        for (int[] datum : data) {
            data1.append("\n");
            for (int i : datum) {
                data1.append(i).append(";        ");
            }
        }
        byte[] buf = new byte[255];
        byte[] outData = data1.toString().getBytes();
        try (FileOutputStream out = new FileOutputStream("C:\\test.scv")) {
            out.write(outData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream in = new FileInputStream("C:\\test.scv")) {
            int x;
            while ((x = in.read(buf)) > 0) {
                for (int i = 0; i < x; i++) {
                    System.out.print((char) buf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class AppDatavalue {
    private final String[] header;
    private final int[][] data;
    public AppDatavalue() {
        header = new String[]{"value 1", "value 2", "value 3"};
        data = new int[][]{{100, 200, 123}, {300, 400, 500}};
    }
    public int[][] getData() {
        return data;
    }
    public String[] getHeader() {
        return header;
    }
}

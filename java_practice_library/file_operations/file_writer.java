import java.io.*;

public class file_writer {
    public static void main(String[] args) {

        try {
            File f1 = new File("j1.txt");

            FileWriter fw = new FileWriter(f1, true);

            fw.write("jinal is okay");
            fw.close();

            FileReader fr = new FileReader(f1);
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File f1 = new File("j1.txt");

            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("jinal is okay");
            bw.close();

            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String character;
            while ((character = br.readLine()) != null) {
                System.out.print(character);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            File f1 = new File("j1.txt");
            FileInputStream fis = new FileInputStream(f1);
            BufferedInputStream bis = new BufferedInputStream(fis);

            byte[] b = new byte[1024];

            int character;
            while ((character = bis.read(b)) != -1) {
                String text1 = new String(b, 0, character, "UTF-8");
                System.out.println(text1);
            }
            fis.close();
            bis.close();

            String t = "hii hii";

            byte[] data = t.getBytes();
            FileOutputStream fos = new FileOutputStream(f1);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write(data);
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

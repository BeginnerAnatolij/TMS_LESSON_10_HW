package Lesson10.Task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> files = new ArrayList<>();
        HashSet<String> docs = new HashSet<String>();
        HashMap<String, String> mapa = new HashMap<>();
        String filePath = " ";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь к файлу или название файла: ");
            filePath = scanner.nextLine();
            if (filePath.equals("0")) {
                break;
            } else {
                files.add(filePath);
            }
        }
        System.out.println(files);
        try {
            for (String document : files) {
                BufferedWriter wb = new BufferedWriter(new FileWriter("AllDoc.txt"));
                BufferedReader br = new BufferedReader(new FileReader(document));
                String s;
                while ((s = br.readLine()) != null) {
                    //  System.out.println(s);
                    docs.add(s);
                    for (String mapDoc : docs) {
                        if (mapDoc.length() == 15 && mapDoc.matches("[a-zA-Z0-9]*") && (mapDoc.startsWith("kontract") || mapDoc.startsWith("docnum"))) {
                            mapa.put(mapDoc, " Valid");

                        } else {
                            if (!mapDoc.matches("[a-zA-Z0-9]*")) {
                                mapa.put(mapDoc, " invalid because contains special symbols");

                            }
                            if (mapDoc.length() != 15) {
                                mapa.put(mapDoc, " Invalid because of incorrect length ");

                            }
                            if (!(mapDoc.startsWith("kontract") || mapDoc.startsWith("docnum"))) {
                                mapa.put(mapDoc, " Invalid because of incorrect start ");
                            }
                        }
                    }
                }

                for (Map.Entry<String, String> forFile : mapa.entrySet()) {
                    wb.write(forFile.getKey() + forFile.getValue());
                    wb.newLine();
                    wb.flush();
                }
            }
            System.out.println(docs);
            System.out.println("--------------------");
            System.out.println(mapa);
            System.out.println("--------------------");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

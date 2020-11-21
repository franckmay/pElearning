/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrateur
 */
public class Properties {

    public static String addrewebservic = "127.0.0.1";
    public static String addresselocal = "127.0.0.1";
    public static String userlocal = "postgres";
    public static String motdepasslocal = "avompetit";
    public static int port = 5432;
    public static int portdistant = 8084;// d'ouverture distant port de connexion o web service
    public static int adm = 1;// s'il sagit de l'interface arintech 1 sinon 0
    public static String lang = "fr";
    public String fileName = "config.properties";

    public Properties() {
        readFile();
    }

    public static Properties getInstance() {
        return PropertiesHolder.INSTANCE;
    }

    private static class PropertiesHolder {

        private static final Properties INSTANCE = new Properties();
    }

    private void readFile() {
        try {
            // the slash '/' is required
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream("/" + fileName), "UTF-8"));
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    String[] tabl = line.split(":");
                    Properties.addrewebservic = tabl[1];
                } else {
                    if (i == 1) {
                        String[] tabl = line.split(":");
                        Properties.addresselocal = tabl[1];
                    } else {
                        if (i == 2) {
                            String[] tabl = line.split(":");
                            Properties.userlocal = tabl[1];
                        } else {
                            if (i == 3) {
                                String[] tabl = line.split(":");
                                Properties.motdepasslocal = tabl[1];
                            } else {
                                if (i == 4) {
                                    String[] tabl = line.split(":");
                                    Properties.port = Integer.valueOf(tabl[1]);
                                } else {
                                    if (i == 5) {
                                        String[] tabl = line.split(":");
                                        Properties.portdistant = Integer.valueOf(tabl[1]);
                                    } else {
                                        if (i == 6) {
                                            String[] tabl = line.split(":");
                                            Properties.adm = Integer.valueOf(tabl[1]);
                                        } else {
                                            if (i == 7) {
                                                String[] tabl = line.split(":");
                                                Properties.lang = tabl[1];
                                            } else {

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                i++;

            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addline(int position, String extraLine, File file) {
        /* List<String> lines;
        try {
            lines = Files.readAllLines(file.toPath());
            lines.add(position, extraLine);
            Files.write(file.toPath(), lines, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }

}

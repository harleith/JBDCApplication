package CourierApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAOcourier {
    
    public static List<Kota> kotaList(String namaKota){
        List<Kota> kotaList = new ArrayList<>();
        try{
            Scanner scan = new Scanner(new File("C:/JAVA_LATIHAN/CourierApp/kota.txt")); // memanggil sumber data
            while(scan.hasNextLine()){
            Kota k = new Kota();
            String line = scan.nextLine();
            String[] data = line.split(", "); // menentukan pemisah antar data
                k.setNamaKota(data[0]);
                k.setProvinsi(data[1]);
            } 
        } catch (FileNotFoundException fileErr) {
        
                }
        return kotaList;
        }
    } 


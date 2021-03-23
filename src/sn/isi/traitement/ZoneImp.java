package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ZoneImp implements IZone {
    @Override
    public Zone saisie() {
        Scanner scan = new Scanner(System.in);
        Zone z = new Zone();
        System.out.println("Entrer l'id");
        z.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom");
        z.setNom(scan.nextLine());
        System.out.println("Entrer la latitude");
        z.setLatitude(Double.parseDouble(scan.nextLine()));
        System.out.println("Entrer la longitude");
        z.setLongitude(Double.parseDouble(scan.nextLine()));
        return z;
    }

    @Override
    public void affichage(Zone zone) {
        System.out.println("ID: "+ zone.getId());
        System.out.println("NOM: "+zone.getNom());
        System.out.println("LATITUDE: "+zone.getLatitude());
        System.out.println("LONGITUDE: "+zone.getLongitude());
    }
}

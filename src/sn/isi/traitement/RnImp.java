package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp implements IRn{
    @Override
    public Rn saisie() {
        Scanner scan = new Scanner(System.in);
        Rn r = new Rn();
        String rep = null;
        System.out.println("Entrer l'id");
        r.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer la latitude");
        r.setLatitude(Double.parseDouble(scan.nextLine()));
        System.out.println("Entrer la longitude");
        r.setLongitude(Double.parseDouble(scan.nextLine()));
        List<Zone> listzone = new ArrayList<Zone>();
        do {
            Zone zone = new Zone();
            IZone iz = new ZoneImp();
            zone = iz.saisie();
            listzone.add(zone);
            System.out.println("Voulez vous entrer une nouvelle zone? [oui/non]");
            rep = scan.nextLine();
        }while (rep.equalsIgnoreCase("oui"));
        r.setZones(listzone);
        return r;
    }

    @Override
    public void affichage(Rn rn) {
        System.out.println("ID: "+rn.getId());
        System.out.println("LATITUDE: "+rn.getLatitude());
        System.out.println("LONGITUDE: "+rn.getLongitude());
        System.out.println("LISTES ZONES: ");
        for (Zone z : rn.getZones()){
            new ZoneImp().affichage(z);
        }

    }
}

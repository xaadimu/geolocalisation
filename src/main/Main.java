package main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.traitement.IRn;
import sn.isi.traitement.IZone;
import sn.isi.traitement.RnImp;
import sn.isi.traitement.ZoneImp;

public class Main {
    public static void main(String[] args) {
        IZone iz = new ZoneImp();
        Zone z = iz.saisie();
        iz.affichage(z);
        IRn ir = new RnImp();
        Rn rn = ir.saisie();
        ir.affichage(rn);
    }
}

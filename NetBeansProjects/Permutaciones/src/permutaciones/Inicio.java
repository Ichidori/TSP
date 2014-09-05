

package permutaciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Inicio {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args){
         
         long time_start, time_end, res;
         time_start = System.currentTimeMillis();
        
        List<Ciudad> lista = new ArrayList<Ciudad>();
     /*   Random rnd = new Random(111);
        for(int i=0; i<3; i++)
            lista.add(new Ciudad(i,rnd.nextInt(100),rnd.nextInt(100)));*/
        lista.add(new Ciudad(1,3600,2300));
        lista.add(new Ciudad(2,3100,3300));
        lista.add(new Ciudad(3,4700,5750));
        lista.add(new Ciudad(4,5400,5750));
        lista.add(new Ciudad(5,5608,7103));
        lista.add(new Ciudad(6,4493,7102));
        lista.add(new Ciudad(7,3600,6950));
        lista.add(new Ciudad(8,3100,7250));
        lista.add(new Ciudad(9,4700,8450));
        lista.add(new Ciudad(10,5400,8450));
        lista.add(new Ciudad(11,5610,10053));
        lista.add(new Ciudad(12,4492,10052));
        lista.add(new Ciudad(13,3600,10800));
        lista.add(new Ciudad(14,3100,10950));
        lista.add(new Ciudad(15,4700,11650));
        lista.add(new Ciudad(16,5400,11650));
        lista.add(new Ciudad(17,6650,10800));
        lista.add(new Ciudad(18,7300,10950));
        lista.add(new Ciudad(19,7300,7250));
        lista.add(new Ciudad(20,6650,6950));
        lista.add(new Ciudad(21,7300,3300));
        lista.add(new Ciudad(22,6650,2300));
        lista.add(new Ciudad(23,5400,1600));
        lista.add(new Ciudad(24,8350,2300));
        lista.add(new Ciudad(25,7850,3300));
        lista.add(new Ciudad(26,9450,5750));
        lista.add(new Ciudad(27,10150,5750));
        lista.add(new Ciudad(28,10358,7103));
        lista.add(new Ciudad(29,9243,7102));
        lista.add(new Ciudad(30,8350,6950));
        lista.add(new Ciudad(31,7850,7250));
        lista.add(new Ciudad(32,9450,8450));
        lista.add(new Ciudad(33,10150,8450));
        lista.add(new Ciudad(34,10360,10053));
        lista.add(new Ciudad(35,9242,10052));
        lista.add(new Ciudad(36,8350,10800));
        lista.add(new Ciudad(37,7850,10950));
        lista.add(new Ciudad(38,9450,11650));
        lista.add(new Ciudad(39,10150,11650));
        lista.add(new Ciudad(40,11400,10800));
        lista.add(new Ciudad(41,12050,10950));
        lista.add(new Ciudad(42,12050,7250));
        lista.add(new Ciudad(43,11400,6950));
        lista.add(new Ciudad(44,12050,3300));
        lista.add(new Ciudad(45,11400,2300));
        lista.add(new Ciudad(46,10150,1600));
        lista.add(new Ciudad(47,13100,2300));
        lista.add(new Ciudad(48,12600,3300));
        lista.add(new Ciudad(49,14200,5750));
        lista.add(new Ciudad(50,14900,5750));
        lista.add(new Ciudad(51,15108,7103));
        lista.add(new Ciudad(52,13993,7102));
        lista.add(new Ciudad(53,13100,6950));
        lista.add(new Ciudad(54,12600,7250));
        lista.add(new Ciudad(55,14200,8450));
        lista.add(new Ciudad(56,14900,8450));
        lista.add(new Ciudad(57,15110,10053));
        lista.add(new Ciudad(58,13992,10052));
        lista.add(new Ciudad(59,13100,10800));
        lista.add(new Ciudad(60,12600,10950));
        lista.add(new Ciudad(61,14200,11650));
        lista.add(new Ciudad(62,14900,11650));
        lista.add(new Ciudad(63,16150,10800));
        lista.add(new Ciudad(64,16800,10950));
        lista.add(new Ciudad(65,16800,7250));
        lista.add(new Ciudad(66,16150,6950));
        lista.add(new Ciudad(67,16800,3300));
        lista.add(new Ciudad(68,16150,2300));
        lista.add(new Ciudad(69,14900,1600));
        lista.add(new Ciudad(70,19800,800));
        lista.add(new Ciudad(71,19800,1000));
        lista.add(new Ciudad(72,19800,11900));
        lista.add(new Ciudad(73,19800,12200));
        lista.add(new Ciudad(74,200,12200));
        lista.add(new Ciudad(75,200,1100));
        lista.add(new Ciudad(76,200,800));
                 
       
        PermutacionesIterator iter = new PermutacionesIterator(lista);
        List<Double> Distancias = new ArrayList<Double>();
                
        int id = 0;
        while (iter.hasNext()){
            TSPSol sol = new TSPSol(id, iter.next());
            //System.out.println(sol);
            Distancias.add(sol.getFitness());
            id++;
            
        }
        Collections.sort(Distancias);
        Double obten = Distancias.get(0);
        Iterator it = Distancias.iterator();
        while (it.hasNext()){
            if(obten==it.next()) {
                System.out.println("Camino minimo "+it.next());
             }
         }
        
        time_end = System.currentTimeMillis();
        res = time_start - time_end;
        System.out.println("Se ha demorado "+ res/1000 +" segundos");
    }

}

import java.util.ArrayList;

/**
 * Created by Damian on 31.10.2017.
 */
public class Main {

    public static void main(String[] args){

        ArrayList<Mem> memy = new ArrayList<>();
        memy.add(new Mem("Mem jeden", "www.mem24.pl", "Pierwszy przykładowy mem", true));
        memy.add(new Mem("Drugi mem", "http://www.asdf.pl", "Drugi przykładowy mem", false));
        memy.add(new Mem("Mem try", "https://www.mem.pl", "Trzeci przykładowy mem", true));
        memy.add(new Mem("Mem cztery", "www.gron.pl", "Czwarty mem", true));
        memy.add(new Mem("Mem pięć", "http://www.memy.pl", "Piąty mem", true));

        for (Mem mems : memy){
            if (mems.isFavourite()){
                System.out.println(mems);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Number> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(-2);
        List<Number> num = new ArrayList<>();
        num.add(2.5F);
        num.add(2.5);
     //   Number nt = num.get(1);
        System.out.println(num.get(0).getClass());
        int x =  list.get(0).intValue();
        System.out.println(x);
      //  System.out.println(x);
       // int i = num.get(0);
      //  System.out.println(num.getClass());

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(2,5);
        hm.put(5, 3);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        System.out.println(hs.remove(2));




    }

    public static void sort(List<Integer> list, int start, int end)
    {

    }

    public static void merge()
    {

    }
}


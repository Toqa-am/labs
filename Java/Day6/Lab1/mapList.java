import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class mapList {
public void addd (Character c,List<String> l,Map <Character,List<String> > m){

      m.put(c,l);
    }

public void get (Character c,Map <Character,List<String> > m){
      List <String> words= new LinkedList<>(m.get(c)) ;
      System.out.println("Words for character '"+c+"' are as followed:");
      words.forEach((x)->System.out.println(x));
    }



  public static void main(String[] args) {
    Map <Character,List<String> > ml =new HashMap<>();
    //Adding words to a list

    List <String> names=new LinkedList<>();
    names.add("Amira");
    names.add("Abdel-sattar");
    names.add("Aya");

    //Adding words to another list
    List <String> b=new LinkedList<>();
    b.add("Bibi");
    b.add("Bobo");
    b.add("Baba");


    mapList mlist=new mapList();
    mlist.addd('A',names,ml);
    mlist.addd('B',b,ml);

    System.out.println("The Whole map:");
    ml.forEach((k,v)->System.out.println("Key: "+k+" Values: "+v));
    mlist.get('A', ml);
    mlist.get('B', ml);

  };

  }



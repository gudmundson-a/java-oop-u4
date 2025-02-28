import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO implements Queue {
    private int maxSize;
    private ArrayList<Object> elements;

    public FIFO(){
        elements = new ArrayList<>();
    }

    /*
    Här behöver man skriva en metod som lägger till
    ett nytt element i listan.
     */
    public void add(Object item){
        elements.add(item);
        if (elements.size() > maxSize){
            maxSize = elements.size();
        }
    }
    /*
    Ska ta bort det första objektet från elements,
    finns det inget element kvar i listan så ska
    NoSuchElementException kastas.
     */
    public void removeFirst() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException();
        }  elements.remove(0);
    }

    /*
    Ska returnera första elementet i Queue, finns
    inget element ska NoSuchElementException kastas.
     */
    public Object first(){
        if (elements.isEmpty()) {
            throw new NoSuchElementException();
        } return elements.getFirst();
    }

    /*
    Denna metod ska returnera den största storleken
    denna Queue har haft sedan den skapades.
     */
    public int maxSize(){
       return maxSize;
    }

    /*
    Ska returnera true om och endast om storleken på
    Queue just för tillfället är 0. Annars ska false
    returneras.
     */
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    /*
    Ska endast returnera antalet element i denna Queue.
     */
    public int size(){
        return elements.size();
    }

    /*
    Ska returnera en sträng som börjar med "Queue: ",
    följt av " (" + String.valueOf(elem) + ") ". Notera
    att elementen ska vara listade i ordning. Notera även
    att strängen ska sluta med ett whitespace.
     */
    public String toString(){
        String queueToString = "Queue: ";
        for (Object element : elements){
            queueToString = queueToString + "(" + String.valueOf(element) + ") ";
        }
        return queueToString;
    }


    /*
    Denna metod ska kasta "ClassCastException" om f
    ej är samma typ som denna klass.
      -> här man använder instanceOf?

    Metoden ska returnera true om och endast om
    dessa delar stämmer:
     - Detta Object och f har samma storlek.
     - Om det för varje position i på denna Queue stämmer att:

          -> Elementet på position i är null, och det motsvarande
             elementet på position i för f också är null.

          -> Elementet på position i istället är en referens till
             ett objekt obj1, och motsvarande element på position
             i för f också är en referens till ett Object obj2,
             och obj1.equals(obj2) är sant.

      Stämmer ej detta ska metoden endast returnera false, den
      ska inte kasta något undantag.
     */
    public boolean equals(Object f){
        FIFO F = (FIFO)f;
        if (F.size() != this.size()) {
            return false;
        }
        for (int i = 0; i < this.size(); i ++){
            Object thisElement = this.elements.get(i);
            Object fElement = F.elements.get(i);

            if (thisElement == null && fElement == null){
                continue;
            }

            if (thisElement == null || fElement == null){
                return false;
            }

            if (!thisElement.equals(fElement)){
                return false;
            }
        }
      return true;
    }
}
public class FIFO implements Queue {
    /*
    Här behöver man skriva en metod som lägger till
    ett nytt element i listan.
     */
    public void add(Object item){

    }
    /*
    Ska ta bort det första objektet från Queue,
    finns det inget element kvar i listan så ska
    NoSuchElementException kastas.
     */
    public void removeFirst(){

    }

    /*
    Ska returnera första elementet i Queue, finns
    inget element ska NoSuchElementException kastas.
     */
    public Object first(){
        Object o = new Object();
        return o;
    }

    /*
    Denna metod ska returnera den största storleken
    denna Queue har haft sedan den skapades.
     */
    public int maxSize(){
        int i = 1;
        return i;
    }

    /*
    Ska returnera true om och endast om storleken på
    Queue just för tillfället är 0. Annars ska false
    returneras.
     */
    public boolean isEmpty(){
        return true;
    }

    /*
    Ska endast returnera antalet element i denna Queue.
     */
    public int size(){
        int i = 0;
        return i;
    }

    /*
    Ska returnera en sträng som börjar med "Queue: ",
    följt av " (" + String.valueOf(elem) + ") ". Notera
    att elementen ska vara listade i ordning. Notera även
    att strängen ska sluta med ett whitespace.
     */
    public String toString(){
        String hw = ("hello world");
        return hw;
    }

    /*
    Denna metod ska kasta "ClassCastException" om f
    ej är samma typ som denna klass.

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
      return true;
    }

}
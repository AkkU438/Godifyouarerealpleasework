import Insects.*;
import Birds.*;
import Mammals.*;
import Reptiles.*;


public class Sample {
    public static void main(String[] args) {
    //Package2 DONE
    Package2 pack1 = new Package2();
    Package2 pack2 = new Package2("Super tough",4,300);
    pack1.Dive();
    pack2.Dive();
    swallow swall1 = new swallow();
    swallow swall2 = new swallow("Super tough",4,300);
    swall1.Dive();
    swall2.Dive();
    raptors rap1 = new raptors();
    raptors rap2 = new raptors("Super Super tough",4,302);
    rap1.Dive();
    rap2.Dive();
    Owls owl1 = new Owls();
    Owls owl2 = new Owls("Super SUper tough",4,330);
    owl1.Dive();
    owl2.Dive();

    //Insects Needs to be done 
    Package4 pack41 = new Package4();
    Package4 pack42 = new Package4("tough",100,2);
    pack42.lunge();
    pack41.lunge();
    ants ants1 = new ants();
    ants ants2 = new ants("tough",100,2);
    ants1.lunge();
    ants2.lunge();
    bumblebees bum1 = new bumblebees();
    bumblebees bum2 = new bumblebees("tough",100,2);
    bum1.lunge();
    bum2.lunge();
    wasps wasps1 = new wasps();
    wasps wasps2 = new wasps("tough",100,2);
    wasps1.lunge();
    wasps2.lunge();
    Dragon drag1 = new Dragon();
    Dragon drag2 = new Dragon("name","name");
    drag1.abstractMethod();
    drag2.abstractMethod("50");
    Snake snake1 = new Snake();
    Snake snake2 = new Snake("name","name");
    snake1.abstractMethod();
    snake2.abstractMethod(50);
    Human human1 = new Human();
    Human human2 = new Human("name","name","d");
    human1.liveBirth();
    human2.liveBirth("50");
    Humans humans1 = new Humans();
    Humans humans2 = new Humans("name","name","d");
    humans1.eccerineSweatGlands();
    humans2.eccerineSweatGlands("50");
}
}
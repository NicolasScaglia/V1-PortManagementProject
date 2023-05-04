import PaqI01.Container;
import PaqI01.Hub;
import PaqI01.Port;
//Nicolás Scaglia Acosta
public class Main {
    public static void main(String[] args) {
        Hub hub1 = new Hub();
        Hub hub2 = new Hub();
        Hub hub3 = new Hub();
        Port mainPort = new Port(hub1,hub2,hub3);
        int selectedHub = 0;
        Container lot = new Container();
        Container lot2 = new Container();
        lot.setInspected(false);
        lot.setCountryOfOrigin("Spain");
        lot.setID(13231);
        lot.setWeight(31);
        lot.setPriorityLevel(1);
        lot.setReceiverCompany("Aidaade");
        lot.setSenderCompany("GIA");
        lot.setContentDescription("It is to my knowledge it has tuna");
        lot2.setInspected(false);
        lot.setCountryOfOrigin("Andorra");
        lot2.setID(1231);
        lot2.setWeight(40);
        lot2.setPriorityLevel(2);
        lot2.setReceiverCompany("Mone");
        lot2.setSenderCompany("NSA");
        lot2.setContentDescription("Iron and steel");
        mainPort.completePort[selectedHub].addContainer(lot);
        mainPort.completePort[selectedHub].addContainer(lot2);
        System.out.println(mainPort.completePort[selectedHub].HubToString());
        System.out.println(mainPort.checkedCustoms(40,1));
    }
}
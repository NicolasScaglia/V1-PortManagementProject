package PaqI01;

//Nicolás Scaglia Acosta
public class Port {
    //A port with 3 different hubs
    public Hub[] completePort = new Hub[3];
    public Port(Hub hub1, Hub hub2, Hub hub3){
        // Given hubs to the port constructor
        completePort[0] = hub1;
        completePort[1] = hub2;
        completePort[2] = hub3;
    }
    public void checkAvailable(Container container){
        // Depending on the result of the addContainer function of each hub, it goes to the next
        if(completePort[0].addContainer(container) == -1){
            if(completePort[1].addContainer(container) == -1){
                if(completePort[2].addContainer(container) == -1){
                    System.out.println("Port is full");
                }
            }
        }
    }
    public int containerCount(String country){
        // It searches for all the containers with said country in all the Hubs and makes a count
        int count = 0;
        for(int t = 0; t < 3 ; t++){
            for(int i = 0; i < Hub.COLUMNS; i++){
                for(int j = 0; j < Hub.ROWS; j++){
                    if(completePort[t].dimensions[j][i] != null){
                        if(country.equals(completePort[t].dimensions[j][i].countryOfOrigin)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public String checkedCustoms(int weight, int hubNumber) {
        StringBuilder information = new StringBuilder();
        Container container;
        for(int i = 0; i < Hub.COLUMNS; i++){
            for(int j = 0; j < Hub.ROWS; j++){
                if(completePort[hubNumber].dimensions[j][i] != null){
                    if(completePort[hubNumber].dimensions[j][i].getWeight() <= weight){
                        container = completePort[hubNumber].dimensions[j][i];
                        container.inspected = true;
                        information.append(container.ID).append("\n").append(container.senderCompany).append("\n").append(container.weight).append("\nContainer has been inspected\n\n");
                    }
                }
            }
        }
        if(information.isEmpty()){
            return "No container below or equal that weight found in this hub";
        }
        return information.toString();
    }
}
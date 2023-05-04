package PaqI01;

//Nicolás Scaglia Acosta
public class Hub {
    static int ROWS = 10;
    static int COLUMNS = 12;
    Container[][] dimensions;
    public Hub(){
        this.dimensions = new Container[ROWS][COLUMNS];
        cleanPort(this.dimensions);
    }
    public static void cleanPort(Container[][] port){
        //Initializes the port
        for(int i = 0; i < COLUMNS; i++){
            for(int j = 0; j < ROWS; j++){
                port[j][i] = null;
            }
        }
    }
    public int addContainer(Container container){
        //Collocation of the container made from down to up and from left to right
        for(int i = 0; i < COLUMNS; i++){
            for(int j = ROWS - 1; j >= 0; j--){
                if(dimensions[j][0] == null && container.priorityLevel == 1){
                    dimensions[j][0] = container;
                    return 1;
                }
                if(dimensions[j][1] == null && container.priorityLevel == 2){
                    dimensions[j][1] = container;
                    return 1;
                }
                if(dimensions[j][i] == null && i != 0 && i != 1 && container.priorityLevel == 3){
                    dimensions[j][i] = container;
                    return 1;
                }
            }
        }
        return -1;
    }
    public void removeContainer(int column){
        // Removes the top container from a given column
        for(int i = 0; i < ROWS; i++){
            if(dimensions[i][column - 1] != null){
                dimensions[i][column - 1] = null;
                break;
            }
        }
    }
    public String HubToString(){
        // Prints the Hub
        StringBuilder stringHub = new StringBuilder();
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                if(dimensions[i][j] != null){
                    stringHub.append("0 ");
                }else{
                    stringHub.append("F ");
                }
            }
            stringHub.append("\n");
        }
        return stringHub.toString();
    }
    public String searchContainer(int ID){
        //It tries to find a container with a given ID in the Hub and return its description
        String foundContainer = "No container found";
        for(int i = 0; i < COLUMNS; i++){
            for(int j = 0; j < ROWS; j++){
                if(dimensions[j][i] != null){
                    if(dimensions[j][i].ID == ID){
                        if(dimensions[j][i].contentDescription != null){
                            foundContainer = dimensions[j][i].contentDescription;
                            break;
                        }
                    }
                }
            }
        }
        return foundContainer;
    }
}

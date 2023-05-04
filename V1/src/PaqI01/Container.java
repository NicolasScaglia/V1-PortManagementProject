package PaqI01;
//Nicolás Scaglia Acosta
public class Container {
    int ID;
    int weight;
    String countryOfOrigin;
    boolean inspected;
    int priorityLevel;
    String contentDescription;
    String senderCompany;
    String receiverCompany;
    public void setID(int n){
        ID = n;
    }
    public void setWeight(int w){
        weight = w;
    }
    public void setCountryOfOrigin(String country){
        countryOfOrigin = country;
    }
    public void setInspected(boolean inspected1){
        inspected = inspected1;
    }
    public void setPriorityLevel(int priority){
        priorityLevel = priority;
    }
    public void setContentDescription(String content){
        contentDescription = content;
    }
    public void setSenderCompany(String sender){
        senderCompany = sender;
    }
    public void setReceiverCompany(String receiver){
        receiverCompany = receiver;
    }
    public int getID(){
        return ID;
    }
    public int getWeight(){
        return weight;
    }
    public int getPriorityLevel(){
        return priorityLevel;
    }
    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }
    public String getContentDescription(){
        return contentDescription;
    }
    public String getSenderCompany(){
        return senderCompany;
    }
    public String getReceiverCompany(){
        return receiverCompany;
    }
    public boolean isInspected(){
        return inspected;
    }
}


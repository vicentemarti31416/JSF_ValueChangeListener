package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@Named(value = "indexBean")
@RequestScoped
public class IndexBean {

    private String color;
    private String message;
   
    public IndexBean() {
    }
    
    public void setMessage(ValueChangeEvent event){
        this.message = "El color elegido es el " + event.getNewValue();
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public String getMessage() {
        return message;
    }
    
}

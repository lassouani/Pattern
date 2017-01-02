//Client
public class GUIBuilder{
	
	
	
  public void buildWindow(AbstractWidgetFactory widgetFactory){
    Window window = widgetFactory.createWindow();
    window.setTitle("New Window");
    
    System.out.println(window.getClass().getName());
    
  }
  
  
}
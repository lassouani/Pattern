
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUIBuilder builder = new GUIBuilder();
	    AbstractWidgetFactory widgetFactory = null;
	    //check what platform we're on
	    if(System.getProperty("os.name").equals("Linux")){
	      widgetFactory  = new MacOSXWidgetFactory();
	    } else {
	      widgetFactory  = new MsWindowsWidgetFactory();
	    }
	    
	    builder.buildWindow(widgetFactory); 

	}

}

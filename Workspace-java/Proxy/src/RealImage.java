

public class RealImage implements Image
{
    private String filename;
    public RealImage(String filename)
    {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk()
    {
        System.out.println("Chargement de "+filename);
        // Op�ration potentiellement co�teuse en temps
    }

    public void displayImage()
    {
        System.out.println("Affichage de  "+filename);
    }
}

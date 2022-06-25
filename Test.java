import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test{
	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL("https://cdns-images.dzcdn.net/images/artist/d533b5e2549627f76536be238ad51ee6/500x500.jpg");
	JOptionPane.showMessageDialog(null, "Prince Of Darkness", "Ozzy Osbourne",
	JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}


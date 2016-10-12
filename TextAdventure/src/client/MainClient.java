package client;

import javax.swing.JPanel;

public class MainClient extends JPanel
{

	private static final long serialVersionUID = 5891591778948727500L;	
	private static MainClient mc;
	
	
	public MainClient()
	{
		setLayout(null);
		
	}
	
	public static MainClient getClient()
	{
		if(mc == null)
		{
			mc = new MainClient();
		}
		
		return mc;
	}

}

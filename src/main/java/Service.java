
public class Service implements ServiceInt{

	private final Metiers m;
	
	public Service(Metiers m)
	{
		this.m=m;
	}

	public void demarrerMetier()
	{
		m.metier();
	}

}

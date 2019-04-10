import java.util.*;

public class Dns
{
	private HashMap<AdresseIP, NomMachine> ipToMachine;
	private HashMap<NomMachine, AdresseIP> machineToIp;

	public Dns()
	{
		ipToMachine = new HashMap<AdresseIP, NomMachine>();
		machineToIp = new HashMap<NomMachine, AdresseIP>();
	}

	public void addItem(DnsItem item)
	{
		ipToMachine.put(item.getAdresse(), item.getNom());
		machineToIp.put(item.getNom(), item.getAdresse());
	}

	public DnsItem getItem(AdresseIP ip)
	{
		return new DnsItem(ip, ipToMachine.get(ip));
	}

	public DnsItem getItem(NomMachine nom)
	{
		return new DnsItem(machineToIp.get(nom), nom);
	}

	/*ipublic ArrayList<DnsItem> getItems(String nom)
	{
		ArrayList<DnsItem> liste = new ArrayList<DnsItem>();
		for (NomMachine nom : ipToMachine.values())
			if (nom.toString().equals(nom))
				liste.add(
	}*/
}

class DnsApp
{
	public static void main(String[] args)
	{
		Dns DNS = new Dns();
		AdresseIP ip = new AdresseIP("192.168.1.1");
		
		DNS.addItem(new DnsItem(ip, new NomMachine("localhost")));
		System.out.println(DNS.getItem(ip).toString());
	}
}

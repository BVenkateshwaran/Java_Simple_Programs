package Simple;

class Raja
{
	public void father()
	{
		System.out.println("I am the father of Surya and Pooja");
	}
}
class Surya extends Raja
{
	public void son()
	{
		System.out.println("I am the son of Raja");
	}
}
class Pooja extends Raja
{
	public void daughter()
	{
		System.out.println("I am the daughter of Raja");
	}
}
public class HeirarichalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surya s = new Surya();
		s.son();
		s.father();
		Pooja p = new Pooja();
		p.daughter();
		p.father();
		Raja r = new Raja();
		r.father();
	}

}
